package pe.edu.upc.dew.helpdesk.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import pe.edu.upc.dew.helpdesk.model.Comentario;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;
import pe.edu.upc.dew.helpdesk.util.JdbcUtils;

public class TicketDaoJdbc implements TicketDao {

    public void insertTicket(String string) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            String query = "INSERT INTO Ticket (descripcion, idCategoria, fechaCreacion, idEstado, idAnalista, idCliente, idAreaAReportar, idTipoSolicitud)" + "VALUES (" + string + ")";
            
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Ticket detalleTicket(String idTicket) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select idTicket,descripcion,idCategoria,fechaCreacion,idEstado,idAnalista,idCliente,idAreaAReportar,idTipoSolicitud,fechaCierre from Ticket where idTicket='" + idTicket + "'");

           if (rs.next()){

               EmpleadoDao empleadodao= new EmpleadoDaoJdbc();
               Ticket ticket = new Ticket(Integer.parseInt(rs.getString("idTicket")),
                                            rs.getString("descripcion"),
                                            rs.getString("idCategoria"),
                                            rs.getString("fechaCreacion"),
                                            rs.getString("idEstado"),
                                            rs.getString("idAreaAReportar"),
                                            rs.getString("idTipoSolicitud"),
                                            rs.getString("fechaCierre"),
                                            empleadodao.getEmpleadoXid(rs.getString("idAnalista")),
                                            empleadodao.getEmpleadoXid(rs.getString("idCliente")));

                 return ticket;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

     public ArrayList<Ticket> getTicketsPorIdCliente(String idCliente) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select idTicket,descripcion,idCategoria,fechaCreacion,idEstado,idAnalista,idCliente,idAreaAReportar,idTipoSolicitud,fechaCierre from Ticket where idCliente='" + idCliente + "'");

            ArrayList<Ticket> listaTickets = new ArrayList<Ticket>();

            while (rs.next()) {

                EmpleadoDao empleadodao= new EmpleadoDaoJdbc();

                Ticket ticket = new Ticket(Integer.parseInt(rs.getString("idTicket")),
                                            rs.getString("descripcion"),
                                            rs.getString("idCategoria"),
                                            rs.getString("fechaCreacion"),
                                            rs.getString("idEstado"),
                                            rs.getString("idAreaAReportar"),
                                            rs.getString("idTipoSolicitud"),
                                            rs.getString("fechaCierre"),
                                            empleadodao.getEmpleadoXid(rs.getString("idAnalista")),
                                            empleadodao.getEmpleadoXid(rs.getString("idCliente")));

                listaTickets.add(ticket);
            }
            return listaTickets;

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

     public ArrayList<Ticket> getTicketsPorIdAnalista(String idAnalista) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select idTicket,descripcion,idCategoria,fechaCreacion,idEstado,idAnalista,idCliente,idAreaAReportar,idTipoSolicitud,fechaCierre from Ticket where idAnalista='" + idAnalista + "'");

            ArrayList<Ticket> listaTickets = new ArrayList<Ticket>();

            while (rs.next()) {

                EmpleadoDao empleadodao= new EmpleadoDaoJdbc();

                Ticket ticket = new Ticket(Integer.parseInt(rs.getString("idTicket")),
                                            rs.getString("descripcion"),
                                            rs.getString("idCategoria"),
                                            rs.getString("fechaCreacion"),
                                            rs.getString("idEstado"),
                                            rs.getString("idAreaAReportar"),
                                            rs.getString("idTipoSolicitud"),
                                            rs.getString("fechaCierre"),
                                            empleadodao.getEmpleadoXid(rs.getString("idAnalista")),
                                            empleadodao.getEmpleadoXid(rs.getString("idCliente")));

                listaTickets.add(ticket);
            }
            return listaTickets;

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }




}
