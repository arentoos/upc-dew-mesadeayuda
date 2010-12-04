package pe.edu.upc.dew.helpdesk.dao;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import pe.edu.upc.dew.helpdesk.model.Empleado;
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

}
