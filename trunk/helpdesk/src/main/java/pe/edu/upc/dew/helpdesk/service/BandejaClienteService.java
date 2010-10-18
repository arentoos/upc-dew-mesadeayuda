/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author Carlos Zegarra
 */
public interface BandejaClienteService {

    public Ticket ObtenerTicket(int idTicket);

}
