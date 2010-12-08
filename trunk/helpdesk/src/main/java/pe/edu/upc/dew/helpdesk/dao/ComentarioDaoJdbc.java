package pe.edu.upc.dew.helpdesk.dao;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Comentario;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;
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

            String query = "INSERT INTO Comentario (fecha, comentario, idEmpleado, idTicket)" + " VALUES (" + string + ")";

            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ComentarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public ArrayList<Comentario> getComentarios(String idTicket) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            String query = "select idComentario, fecha, comentario, idTicket, idEmpleado from Comentario where idTicket = " + idTicket;

            ResultSet rs = st.executeQuery(query);

            ArrayList<Comentario> array = new ArrayList<Comentario>();

            EmpleadoDao edao = new EmpleadoDaoJdbc();

            while (rs.next()) {
                array.add(new Comentario(rs.getString("comentario"), rs.getString("fecha"), Integer.parseInt(rs.getString("idTicket")), edao.getEmpleadoXid(rs.getString("idEmpleado")), null));
            }
            return array;

        } catch (SQLException ex) {
            Logger.getLogger(ComentarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateEstadoTicket(String idTicket, String estado) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            String query = "update Ticket set idEstado = " + estado + " where idTicket = " + idTicket;

            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ComentarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
