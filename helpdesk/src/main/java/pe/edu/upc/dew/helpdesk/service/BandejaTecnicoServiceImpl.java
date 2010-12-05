/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author RaulNR
 */
public class BandejaTecnicoServiceImpl implements BandejaTecnicoService {

    public Ticket ObtenerTicket(String idTicket) {

        Ticket vTicket = null;

       // vTicket = new Ticket(idTicket, "Se cayo el aplicativo del sistema", "Software", "15/10/2010 09:30", "Sin Atencion", "Desarrollo de Software", "Requerimiento", "", new Empleado(1, "carlos", "Desarrollo de Software", "9876", "Desarrollador", "", "9876", "Carlos Zegarra", "czegarra@ayudate.com", "C", 0), new Empleado(1, "yenny", "Finanzas", "1234", "Secretaria", "", "1234", "Yenny Valenzuela Leguia", "yenny44b@ayudate.com", "C", 0));

        return vTicket;
    }
}
