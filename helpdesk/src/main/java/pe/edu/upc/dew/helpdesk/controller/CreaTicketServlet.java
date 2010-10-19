/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.service.EmpleadoService;
import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;

/**
 *
 * @author XP
 */
public class CreaTicketServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Recuperamos datos del view
        String login = req.getParameter("login");

        // Llamar al model
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        Empleado empleado = empleadoService.logeo(login, "");

        // Setear el model para el view
        req.setAttribute("empleado", empleado);

        req.getRequestDispatcher("creaTicket.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    }
}
