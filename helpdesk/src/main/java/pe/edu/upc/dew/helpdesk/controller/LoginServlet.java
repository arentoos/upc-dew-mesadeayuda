package pe.edu.upc.dew.helpdesk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;
import pe.edu.upc.dew.helpdesk.service.ComentarioService;
import pe.edu.upc.dew.helpdesk.service.EmpleadoService;
import pe.edu.upc.dew.helpdesk.service.TicketService;
import pe.edu.upc.dew.helpdesk.service.TicketServiceImpl;
//import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;

public class LoginServlet extends HttpServlet {

    private EmpleadoService pEmpleadoService;
    private TicketService pTicketService;
    private ComentarioService pComentarioService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());

        this.pComentarioService = (ComentarioService) context.getBean("comentarioService");
        this.pEmpleadoService = (EmpleadoService) context.getBean("empleadoService");
        this.pTicketService = (TicketService) context.getBean("ticketService");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Session
        HttpSession vSesion = req.getSession();

        // obtengo el parametro operacion
        String operacion = req.getParameter("operacion");

        // si el post se invoca desde la ceracion del ticket
        if (operacion.equals("crearTicket") == true) {

            CrearTicket(req);
        }
        if (operacion.equals("crearComentario") == true) {

            CrearComentario(req);
        }

        // Recuperamos datos del view
        String login = req.getParameter("login");
        String clave = req.getParameter("clave");

        // Llamar al model
        Empleado empleado = pEmpleadoService.logeo(login, clave);

        if (empleado == null) {
            
            req.setAttribute("mensaje", "El nombre de usuario no existe");
            req.getRequestDispatcher("logeo_empleado.jsp").forward(req, resp);
            return;
        }

        // Setear el model para el view
        vSesion.setAttribute("empleado", empleado);

        // SE DEBE REDIRIGIR mirando el tipo de empleado
        if (empleado.getTipoEmpleado().equals("C")) {
            
            req.getRequestDispatcher("BandejaCliente.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("logeo_empleado.jsp").forward(req, resp);
    }

    private void CrearTicket(HttpServletRequest req) {

        // obtengo la sesion
        HttpSession session = req.getSession();

        StringBuilder builder = new StringBuilder();

        // siempre ser� SIN ATENCION
        String idEstado = "1";
        String idAnalista = null;

        // por ahora simplemente le asignare el ticket a un empleado X
        // AQUI HAY QUE HACER LA DISTRIBUCION INTELIGENTE DEL TICKET!!!
        if (req.getParameter("listArea").equals("12")) {

            idAnalista = "4";
        } else if (req.getParameter("listArea").equals("11")) {

            idAnalista = "1";
        } else if (req.getParameter("listArea").equals("13")) {

            idAnalista = "5";
        }
        // obtengo el id del cliente de la sesion
        Empleado cliente = (Empleado) session.getAttribute("empleado");

        String idCliente = "2"; // Por default siempre es Roberto (uno que aumente)
        if (cliente != null) {
            idCliente = String.valueOf(cliente.getIdEmpleado());
        }

        //(descripcion, idCategoria, fechaCreacion, idEstado, idAnalista, idCliente, idAreaAReportar, idTipoSolicitud, fechaCierre)
        builder = builder.append("'").append(req.getParameter("txtdescripcion")).append("', ");
        builder = builder.append(req.getParameter("listCategoria")).append(", ");
        builder = builder.append("'").append(getDateTime()).append("', ");
        builder = builder.append(idEstado).append(", ");
        builder = builder.append(idAnalista).append(", ");
        builder = builder.append(idCliente).append(", ");
        builder = builder.append(req.getParameter("listArea")).append(", ");
        builder = builder.append(req.getParameter("listSolicitud"));

        this.pTicketService.insertaTicket(builder.toString());
    }

    private void CrearComentario(HttpServletRequest req) {
        // obtengo la sesion
        HttpSession session = req.getSession();

        StringBuilder builder = new StringBuilder();

        // obtengo el id del cliente de la sesion
        Empleado empleado = (Empleado) session.getAttribute("empleado");

        // obtenemos es ticket
        Ticket ticket = (Ticket) session.getAttribute("ticket");

        if (empleado.getTipoEmpleado().equals("C")) {

            if (ticket.getEstado().equals("Resuelto")) {

                if (req.getParameter("cmdConfirmar") == null || String.valueOf(req.getParameter("cmdConfirmar")).equals("Aceptar")) {

                    this.pTicketService.updateEstadoTicket(String.valueOf(ticket.getIdTicket()), "6");
                } else {
                    this.pTicketService.updateEstadoTicket(String.valueOf(ticket.getIdTicket()), "2");
                }
            } else if (ticket.getEstado().equals("Esperando Respuesta")) {

                this.pTicketService.updateEstadoTicket(String.valueOf(ticket.getIdTicket()), "2");
            }
        } else if (empleado.getTipoEmpleado().equals("A")) {

            String estadoPantalla = "";

            // en el caso del tecnico el estado es el que esta en la pantalla
            // se toma el vale del option: un numero q representa el estado
            if (req.getParameter("cmdEstado") == null) {
                estadoPantalla = ticket.getEstado();
            } else {
                estadoPantalla = req.getParameter("cmdEstado");
            }

            if (estadoPantalla.equals("1") || estadoPantalla.equals("Sin Atencion")) {

                this.pTicketService.updateEstadoTicket(String.valueOf(ticket.getIdTicket()), "2");

            } else if (estadoPantalla.equals("4")) {

                this.pTicketService.updateEstadoTicket(String.valueOf(ticket.getIdTicket()), "4");

            } else if (estadoPantalla.equals("5")) {

                this.pTicketService.updateEstadoTicket(String.valueOf(ticket.getIdTicket()), "5");
            }
        }

        int idCliente = empleado.getIdEmpleado();

        //( fechaCreacion, descripcion, idCliente, idTIcket)
        builder = builder.append("'").append(getDateTime()).append("', ");
        builder = builder.append("'").append(req.getParameter("txtDescrip")).append("', ");
        builder = builder.append(idCliente).append(", ");
        //builder = builder.append(idTicket);
        builder = builder.append("'").append(req.getParameter("txtidTicket")).append("' ");

        this.pComentarioService.insertaComentario(builder.toString());
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
