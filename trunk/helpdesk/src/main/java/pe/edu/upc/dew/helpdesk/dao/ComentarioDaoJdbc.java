package pe.edu.upc.dew.helpdesk.dao;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.util.JdbcUtils;

/**
 *
 * @author cgonzagah
 */


public class ComentarioDaoJdbc implements ComentarioDao {

    public void insertComentario(String string) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            String query = "INSERT INTO Comentario (fecha, comentario, idTicket, idEmpleado)" + "VALUES (" + string + ")";

            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ComentarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
