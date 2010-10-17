/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.model.Empleado;

/**
 *
 * @author XP
 */
public class EmpleadoServiceImpl implements EmpleadoService {

    public Empleado logeo(String login, String clave) {

        Empleado empleado;

        if (login.equals("yenny") == true) {

            empleado = new Empleado();

            empleado.setNombre("Yenny Valenzuela");
            empleado.setLogin(login);
            empleado.setAnexo("1234");
            empleado.setCargo("Secretaria de Gerencia");
            empleado.setEmail("yenny44@ayudate.com");
        }
        else {
            empleado = new Empleado();

            empleado.setNombre("Carlos Zegarra");
            empleado.setLogin(login);
            empleado.setAnexo("9876");
            empleado.setCargo("Desarrollador");
            empleado.setEmail("czegarra@ayudate.com");
        }

        //usuario.getRoles().add(new Rol("admin","Administrador"));
       // usuario.getRoles().add(new Rol("operador","Operador"));

        return empleado;
    }

}
