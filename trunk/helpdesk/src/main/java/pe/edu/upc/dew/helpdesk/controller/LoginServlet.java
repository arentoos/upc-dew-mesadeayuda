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
import pe.edu.upc.dew.helpdesk.service.EmpleadoService;
import pe.edu.upc.dew.helpdesk.service.TicketService;
//import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;

public class LoginServlet extends HttpServlet {

    private EmpleadoService pEmpleadoService;
    private TicketService pTicketService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
        
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

        // Recuperamos datos del view
        String login = req.getParameter("login");
        String clave = req.getParameter("clave");

        // Llamar al model
        Empleado empleado = pEmpleadoService.logeo(login, clave);

        // Setear el model para el view
        vSesion.setAttribute("empleado", empleado);



        // SE DEBE REDIRIGIR mirando el tipo de empleado
        if (empleado.getLogin().equals("yenny") == true) {

            // Seleccionar la siguiente vista, flujo de navegacion
            req.getRequestDispatcher("BandejaCliente.jsp").forward(req, resp);

        } else if (empleado.getLogin().equals("carlos") == true) {

            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);

        } else if (empleado.getLogin().equals("cristina") == true) {

            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);

        } else if (empleado.getLogin().equals("raul") == true) {

            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);
        } else {
            PrintWriter out = resp.getWriter();

            out.println("El usuario " + login + " no esta registrado");
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

        // por ahora simplemente le asignare el ticket a un empleado X
        // AQUI HAY QUE HACER LA DISTRIBUCION INTELIGENTE DEL TICKET!!!
        String idAnalista = "1"; // CZ

        // obtengo el id del cliente de la sesion
        Empleado cliente = (Empleado) session.getAttribute("empleado");

        String idCliente = "2"; // Por default siempre es Roberto (uno que aumente)
        if (cliente != null) {
            idCliente = String.valueOf(cliente.getIdEmpleado());
        }

        //(descripcion, idCategoria, fechaCreacion, idEstado, idAnalista, idCliente, idAreaAReportar, idTipoSolicitud, fechaCierre)

        builder = builder.append("'").append(req.getParameter("txtdescripcion")).append("', ");
        builder = builder.append(req.getParameter("listArea")).append(", ");
        builder = builder.append("'").append(getDateTime()).append("', ");
        builder = builder.append(idEstado).append(", ");
        builder = builder.append(idAnalista).append(", ");
        builder = builder.append(idCliente).append(", ");
        builder = builder.append(req.getParameter("listCategoria")).append(", ");
        builder = builder.append(req.getParameter("listCategoria2"));

        this.pTicketService.insertaTicket(builder.toString());
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}