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

            empleado = new Empleado(1001, login, "Finanzas", "1234", "Secretaria de Gerencia", "", "1234", "Yenny Valenzuela Leguia", "yenny44@ayudate.com", "C", 0);
        }
        else {
            empleado = new Empleado(1002, login, "Marketing", "9876", "Creativa", "", "9876", "Cristina Gonzaga", "cgonzaga@ayudate.com", "C", 0);
        }

        return empleado;
    }

}
