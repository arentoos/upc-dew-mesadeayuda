package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.dao.TicketDao;
import pe.edu.upc.dew.helpdesk.dao.TicketDaoJdbc;

public class TicketServiceImpl implements TicketService {

    public void insertaTicket(String string) {

        TicketDao td = new TicketDaoJdbc();

        td.insertTicket(string);
    }

}
