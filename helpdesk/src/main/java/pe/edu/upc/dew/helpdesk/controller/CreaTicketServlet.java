package pe.edu.upc.dew.helpdesk.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.service.EmpleadoService;
import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;

public class CreaTicketServlet extends HttpServlet {

    private EmpleadoService pEmpleadoService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
        this.pEmpleadoService = (EmpleadoService) context.getBean("empleadoService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Recuperamos datos del view
//        String login = req.getParameter("login");

        // Llamar al model
        //EmpleadoService empleadoService = new EmpleadoServiceImpl();

//        Empleado empleado = pEmpleadoService.logeo(login, "");

        // Setear el model para el view
//        req.setAttribute("empleado", empleado);

        req.getRequestDispatcher("creaTicket.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    }
}
