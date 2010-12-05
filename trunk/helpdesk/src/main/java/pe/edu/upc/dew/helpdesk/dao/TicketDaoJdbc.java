package pe.edu.upc.dew.helpdesk.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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

     public void llenarTicket(String loginName) {


        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select idTicket,descripcion,idCategoria,fechaCreacion,idEstado,idAnalista,idCliente,idAreaAReportar,idTipoSolicitud,fechaCierre from ticket where idAnalista='" + loginName + "' or idCliente='" + loginName + "'");

            //ResultSet rs2= st.executeQuery("Select tipoEmpleado,idEmpleado from empleado");

            if (rs.next()) {
                Empleado empleado = new Empleado();
                Ticket ticket = new Ticket();

                // nombre de la columna
                ticket.setIdTicket(Integer.parseInt(rs.getString("idTicket")));
                ticket.setDescripcion(rs.getString("descripcion"));
                ticket.setCategoria(rs.getString("idCategoria"));
                ticket.setFechaCreacion(rs.getString("fechaCreacion"));
                ticket.setEstado(rs.getString("idEstado"));
               // ticket.setTecnico(rs.getString("idTecnico"));
               // ticket.setCliente(rs.getString("idCliente"));
                ticket.setAreaReportar(rs.getString("idAreaAReportar"));
                ticket.setTipoSolicitud(rs.getString("idTipoSolicitud"));
                ticket.setFechaCierre(rs.getString("fechaCierre"));

                ticket.setCliente(empleado);
                ticket.setTecnico(empleado);

                return ticket;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

}
