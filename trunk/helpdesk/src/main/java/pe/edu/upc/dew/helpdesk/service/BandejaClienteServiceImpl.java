/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author Carlos Zegarra
 */
public class BandejaClienteServiceImpl implements BandejaClienteService {

    public Ticket ObtenerTicket(String idTicket) {

        Ticket vTicket = null;

//        vTicket = new Ticket("1001", "Instalacion de software", "Software", "15/10/2010 09:30", "Ninguno", "Soporte Tenologico", "Requerimiento", "", new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0), new Empleado);

        vTicket = new Ticket(idTicket, "Problema de acceso a la red", "Hardware", "17/10/2010 12:30", "En progreso", "Redes y Comunicaciones", "Incidencias/Averias", "", new Empleado(1, "cristina", "Marketing", "5678", "Creativa", "", "5454", "Cristina Gonzaga", "cgonzaga@ayudate.com", "C", 0), new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0));

        return vTicket;
    }
}
