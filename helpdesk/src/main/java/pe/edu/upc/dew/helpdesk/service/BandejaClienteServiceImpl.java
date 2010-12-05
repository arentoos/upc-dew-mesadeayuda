/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.dao.TicketDao;
import pe.edu.upc.dew.helpdesk.dao.TicketDaoJdbc;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author Carlos Zegarra
 */
public class BandejaClienteServiceImpl implements BandejaClienteService {

    public Ticket ObtenerTicket(String idTicket) {


        TicketDao ticketDao = new TicketDaoJdbc();

        Ticket ticket = ticketDao.detalleTicket(idTicket);

        return ticket;

    }
}
