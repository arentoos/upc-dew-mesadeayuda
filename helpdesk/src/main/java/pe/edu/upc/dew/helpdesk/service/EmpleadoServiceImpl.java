/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author XP
 */
public class EmpleadoServiceImpl implements EmpleadoService {

    public Empleado logeo(String login, String clave) {


        Ticket ticket = null;

        Empleado empleado = null;

        if (login.equals("yenny") == true) {

            empleado = new Empleado(1001, login, "Finanzas", "1234", "Secretaria de Gerencia", "", "1234", "Yenny Valenzuela Leguia", "yenny44@ayudate.com", "C", 0);

            empleado.getTickets().add(new Ticket("1001", "Instalacion de software", "Software", "15/10/2010 09:30", "Ninguno", "Soporte Tenologico", "Requerimiento", "", new Empleado(1, "carlos", "Desarrollo de Software", "1234", "Desarrollador", "", "1234", "Carlos Zegarra", "czegarra@ayudate.com", "T", 2), new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0)));

            empleado.getTickets().add(new Ticket("1002", "Mantenimiento de PC", "Hardware", "16/10/2010 09:30", "Pendiente", "Soporte Tenologico", "Consultas", "", new Empleado(1, "raul", "Soporte Tecnologico", "1234", "Analista", "", "1234", "Raul Neyra", "rneyra@ayudate.com", "T", 1), new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0)));

        } else if (login.equals("carlos") == true) {

            empleado = new Empleado(1, login, "Desarrollo de Software", "9876", "Desarrollador", "", "9876", "Carlos Zegarra", "czegarra@ayudate.com", "C", 0);

            empleado.getTickets().add(new Ticket("1004", "Se cayo el aplicativo del sistema", "Aplicativo Web", "15/10/2010 09:30", "En progreso", "Desarrollo de Software", "Requerimiento", "", new Empleado(1, "carlos", "Desarrollo de Software", "1234", "Desarrollador", "", "1234", "Carlos Zegarra", "czegarra@ayudate.com", "T", 2), new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0)));

            empleado.getTickets().add(new Ticket("1005", "Programa de Contabilidad no conecta con el servidor", "Aplicativo Cliente", "16/10/2010 09:30", "Pendiente", "Desarrollo de Software", "Consultas", "", new Empleado(1, "carlos", "Desarrollo de Software", "1234", "Desarrollador", "", "1234", "Carlos Zegarra", "czegarra@ayudate.com", "T", 2), new Empleado(1, "cristina", "Marketing", "1234", "Publicista", "", "1234", "Cristina Gonzaga Huertas", "cGonzaga@ayudate.com", "C", 0)));
        }

        return empleado;

    }
}
