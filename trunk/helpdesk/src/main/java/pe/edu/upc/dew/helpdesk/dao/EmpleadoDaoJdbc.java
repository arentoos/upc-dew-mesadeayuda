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

            ResultSet rs = st.executeQuery("select  login, nombre,area,cargo,email,anexo,tipoEmpleado,jefe,nivelSoporte, clave from Empleado where login ='" + loginName + "'");

            if (rs.next()) {
                Empleado empleado = new Empleado();
                // nombre de la columna
                empleado.setLogin(rs.getString("login"));
                empleado.setClave(rs.getString("clave"));
                empleado.setNombre(rs.getString("nombre"));
                return empleado;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


}
