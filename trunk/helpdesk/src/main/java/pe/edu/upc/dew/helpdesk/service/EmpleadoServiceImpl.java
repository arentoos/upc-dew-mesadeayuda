package pe.edu.upc.dew.helpdesk.service;

//import java.io.PrintWriter;
import pe.edu.upc.dew.helpdesk.dao.EmpleadoDao;
import pe.edu.upc.dew.helpdesk.dao.EmpleadoDaoJdbc;
import pe.edu.upc.dew.helpdesk.model.Empleado;
//import pe.edu.upc.dew.helpdesk.model.Ticket;

public class EmpleadoServiceImpl implements EmpleadoService {

    public Empleado logeo(String login, String clave) {

        EmpleadoDao empleadoDao = new EmpleadoDaoJdbc();

        // BANDEJA: se deben cargar los tickets que tenga asignado el empleado!
        Empleado empleado = empleadoDao.getEmpleadoPorLoginName(login);

        return empleado;
    }
}
