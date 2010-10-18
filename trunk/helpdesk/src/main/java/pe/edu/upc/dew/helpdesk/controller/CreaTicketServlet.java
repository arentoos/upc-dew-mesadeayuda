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
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.service.EmpleadoService;
import pe.edu.upc.dew.helpdesk.service.EmpleadoServiceImpl;
/**
 *
 * @author XP
 */
public class CreaTicketServlet extends HttpServlet {
   
   
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {


         // Recuperamos datos del view
        String login = req.getParameter("login");
        String clave = req.getParameter("clave");

        // Llamar al model
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        Empleado empleado = empleadoService.logeo(login, clave);

        // Setear el model para el view
        req.setAttribute("empleado", empleado);

        if (empleado.getLogin().equals("yenny") == true) {
            // Seleccionar la siguiente vista, flujo de navegacion
            req.getRequestDispatcher("BandejaCliente.jsp").forward(req, resp);

        }
        else if (empleado.getLogin().equals("carlos") == true) {

            req.getRequestDispatcher("BandejaSoporte.jsp").forward(req, resp);

        }
        else {
            PrintWriter out = resp.getWriter();

            out.println("El usuario " + login + "no esta registrado");
        }




    }

   

}
