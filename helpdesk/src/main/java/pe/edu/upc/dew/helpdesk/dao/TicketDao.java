package pe.edu.upc.dew.helpdesk.dao;

import java.util.ArrayList;
import pe.edu.upc.dew.helpdesk.model.Ticket;

public interface TicketDao {

    public void insertTicket(String string);
    public ArrayList<Ticket> getTicketsPorIdCliente(String idCliente);
    public ArrayList<Ticket> getTicketsPorIdAnalista(String idAnalista);
    public Ticket detalleTicket(String idTicket);

}
