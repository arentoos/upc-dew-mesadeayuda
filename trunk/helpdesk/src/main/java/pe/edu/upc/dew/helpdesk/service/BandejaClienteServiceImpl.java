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
public class BandejaClienteServiceImpl implements BandejaClienteService {

    public Ticket ObtenerTicket(int idTicket) {

        Ticket vTicket = new Ticket();

        vTicket.setEstado("Pendiente");
        vTicket.setIdTicket(1001);

        return vTicket;
    }
}
