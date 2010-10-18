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


           Ticket ticket=null;

        Empleado empleado=null;

        if (login.equals("yenny") == true) {
        
            empleado = new Empleado(1001, login, "Finanzas", "1234", "Secretaria de Gerencia", "", "1234", "Yenny Valenzuela Leguia", "yenny44@ayudate.com", "C", 0);
            empleado.getTickets().add(new Ticket("1001", "Instalacion de software", "Software", "15/10/2010 09:30", "Ninguno", "Soporte Tenologico", "Requerimiento", "", new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0)));
            empleado.getTickets().add(new Ticket("1002", "Instalacion de software", "Software", "15/10/2010 09:30", "Ninguno", "Soporte Tenologico", "Requerimiento", "", new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0)));

            //empleado.getTickets().add(new Ticket("1002", "Problema de acceso a la red", "Hardware", "17/10/2010 12:30", "En progreso", "Redes y Comunicaciones", "Incidencias/Averias", "", new Empleado(1, "cristina", "Marketing", "5678", "Creativa", "", "5454", "Cristina Gonzaga", "cgonzaga@ayudate.com", "C", 0)));
           
           //ticket = new Ticket("1001", "Instalacion de software", "Software", "15/10/2010 09:30", "Ninguno", "Soporte Tenologico", "Requerimiento", "", new Empleado(1001, login, "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0));
           // empleado.getTickets().add(new Ticket("1001", "Instalacion de software", "Software", "15/10/2010 09:30", "Ninguno", "Soporte Tenologico", "Requerimiento", "",""));
        }
        else {
            empleado = new Empleado(1002, login, "Marketing", "9876", "Creativa", "", "9876", "Cristina Gonzaga", "cgonzaga@ayudate.com", "C", 0);

        }

        return empleado;

    }

}
