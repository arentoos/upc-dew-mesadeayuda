package pe.edu.upc.dew.helpdesk.dao;

import org.junit.Assert;
import org.junit.Test;
import pe.edu.upc.dew.helpdesk.model.Empleado;

public class EmpleadoDaoTest {

    @Test
    public void elLoginNameYennyTieneNombreYennyValenzuela() {

        EmpleadoDao empleadoDao = new EmpleadoDaoJdbc();
        Empleado empleado = empleadoDao.getEmpleadoPorLoginName("yenny");
        Assert.assertEquals("Yenny Valenzuela Leguia", empleado.getNombre());

    }

    @Test
    public void devuelveClaveevnviandoNombreCarlos() {

        EmpleadoDao empleadoDao = new EmpleadoDaoJdbc();
        Empleado empleado = empleadoDao.getEmpleadoPorLoginName("carlos");
        Assert.assertEquals("123", empleado.getClave());

    }
}
