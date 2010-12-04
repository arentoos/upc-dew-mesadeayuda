package pe.edu.upc.dew.helpdesk.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
//import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;


public class LoginServlet extends HttpServlet {

    private EmpleadoService pEmpleadoService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
        this.pEmpleadoService = (EmpleadoService) context.getBean("empleadoService");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Session
        HttpSession vSesion = req.getSession();

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

        }
        else if (empleado.getLogin().equals("cristina") == true) {

            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);

        } else if (empleado.getLogin().equals("raul") == true) {

            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);
        }

        else {
            PrintWriter out = resp.getWriter();

            out.println("El usuario " + login + " no esta registrado");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("logeo_empleado.jsp").forward(req, resp);
    }
}
