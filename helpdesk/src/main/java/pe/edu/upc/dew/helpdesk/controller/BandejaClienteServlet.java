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

/**
 *
 * @author Carlos Zegarra
 */
public class BandejaClienteServlet extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        // Llamar al model
//        EmpleadoService empleadoService = new EmpleadoServiceImpl();
//
//        Empleado empleado = empleadoService.logeo(login, clave);
//
//        // Setear el model para el view
//        req.setAttribute("empleado", empleado);
//        req.setAttribute("idSession", vSesion.getId());
//
//        if (empleado.getLogin().equals("yenny") == true) {
//            // Seleccionar la siguiente vista, flujo de navegacion
//            req.getRequestDispatcher("BandejaCliente.jsp").forward(req, resp);
//
//            vSesion.setAttribute("objCliente", empleado);
//        }
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
