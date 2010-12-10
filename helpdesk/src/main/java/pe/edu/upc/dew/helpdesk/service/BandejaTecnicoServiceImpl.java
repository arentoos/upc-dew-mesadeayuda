package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.dao.TicketDao;
import pe.edu.upc.dew.helpdesk.dao.TicketDaoJdbc;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;

public class BandejaTecnicoServiceImpl implements BandejaTecnicoService {

    public Ticket ObtenerTicket(String idTicket) {

        TicketDao ticketDao = new TicketDaoJdbc();

        Ticket ticket = ticketDao.detalleTicket(idTicket);

        return ticket;

    }
}
