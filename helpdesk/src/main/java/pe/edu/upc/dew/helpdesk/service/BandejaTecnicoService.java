/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author RaulNR
 */
public interface BandejaTecnicoService {

    public Ticket ObtenerTicket(String idTicket);

}
