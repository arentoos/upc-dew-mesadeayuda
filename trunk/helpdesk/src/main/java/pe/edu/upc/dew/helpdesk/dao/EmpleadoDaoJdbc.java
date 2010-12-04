package pe.edu.upc.dew.helpdesk.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.util.JdbcUtils;

public class EmpleadoDaoJdbc implements EmpleadoDao {

    public Empleado getEmpleadoPorLoginName(String loginName) {

        Connection conn = JdbcUtils.getConnection();

        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select idEmpleado, login, nombre, area, cargo, email, anexo, tipoEmpleado, jefe, nivelSoporte, clave from Empleado where login ='" + loginName + "'");

            if (rs.next()) {

                Empleado empleado = new Empleado();

                // nombre de la columna
                empleado.setIdEmpleado(Integer.parseInt(rs.getString("idEmpleado")));
                empleado.setLogin(rs.getString("login"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setArea(rs.getString("area"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setEmail(rs.getString("email"));
                empleado.setAnexo(rs.getString("anexo"));
                empleado.setTipoEmpleado(rs.getString("tipoEmpleado"));
                empleado.setJefe(rs.getString("jefe"));
                empleado.setClave(rs.getString("clave"));
                
                return empleado;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


}
