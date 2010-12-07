/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.helpdesk.controller;


import java.io.PrintWriter;
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
import pe.edu.upc.dew.helpdesk.service.ComentarioService;
import pe.edu.upc.dew.helpdesk.service.EmpleadoService;
import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;
import pe.edu.upc.dew.helpdesk.service.TicketService;
/**
 *
 * @author LEONIC
 */
public class ComentarioServlet extends HttpServlet {
   
     private ComentarioService pComentarioService;
     private EmpleadoService pEmpleadoService;
     private TicketService pTicketService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
        this.pComentarioService= (ComentarioService) context.getBean("comentarioService");
        this.pEmpleadoService = (EmpleadoService) context.getBean("empleadoService");
        this.pTicketService = (TicketService) context.getBean("ticketService");
    }

     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // No es necesario obtener al empleado porque ya se encuentra en la sesión
        req.getRequestDispatcher("DetalleTicket_cliente.jsp").forward(req, resp);
    }
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


    }
 
   }
