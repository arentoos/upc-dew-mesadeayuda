package pe.edu.upc.dew.helpdesk.dao;

import pe.edu.upc.dew.helpdesk.model.Empleado;

public interface EmpleadoDao {

    public Empleado getEmpleadoPorLoginName(String loginName);
    public Empleado getEmpleadoXid(String idEmpleado);
}
