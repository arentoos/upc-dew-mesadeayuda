package pe.edu.upc.dew.helpdesk.service;

public interface TicketService {

    public void insertaTicket(String string);

    public void updateEstadoTicket(String idTicket, String estado);
}
