/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.helpdesk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.helpdesk.model.Ticket;
import pe.edu.upc.dew.helpdesk.service.BandejaClienteService;
import pe.edu.upc.dew.helpdesk.service.BandejaClienteServiceImpl;

/**
 *
 * @author Carlos Zegarra
 */
public class BandejaClienteServlet extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        // aqui deberia obtener el numero de ticket

        // Llamar al model
        BandejaClienteService vBandejaService = new BandejaClienteServiceImpl();

        Ticket vTicket = vBandejaService.ObtenerTicket(1001);

        // Setear el model para el view
        request.setAttribute("ticket", vTicket);

        request.getRequestDispatcher("DetalleTicket_cliente.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

        } finally {
            out.close();
        }
    }

}
