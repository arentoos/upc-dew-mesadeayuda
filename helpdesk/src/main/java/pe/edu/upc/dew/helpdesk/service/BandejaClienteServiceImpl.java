/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.service;
import pe.edu.upc.dew.helpdesk.model.Empleado;
import pe.edu.upc.dew.helpdesk.model.Ticket;

/**
 *
 * @author Carlos Zegarra
 */
public class BandejaClienteServiceImpl implements BandejaClienteService {

    public Ticket ObtenerTicket(String idTicket) {

      //  Ticket vTicket = new Ticket();

     //   vTicket.setEstado("Pendiente");
   //     vTicket.setIdTicket(1001);

        //return vTicket;

           Ticket vTicket = null;

        if (idTicket.equals("1001") == true) {

            vTicket = new Ticket();


            vTicket.setCategoria("Hardware");
            vTicket.setDescripcion("login");
            vTicket.setEstado("Pendiente");
            vTicket.setFechaCreacion("15/09/2010");
            vTicket.setFechaCierre("19/09/2010");
            vTicket.setTipoSolicitud("Requerimientos");
         
        }
        else if (idTicket.equals("1002") == true){
            vTicket = new Ticket();


            vTicket.setCategoria("Hardware");
            vTicket.setDescripcion("Instalacion del Programa");
            vTicket.setEstado("Pendiente");
            vTicket.setFechaCreacion("07/09/2010");
            vTicket.setFechaCierre("--");
            vTicket.setTipoSolicitud("Incidencias");
            
        }

        //usuario.getRoles().add(new Rol("admin","Administrador"));
       // usuario.getRoles().add(new Rol("operador","Operador"));

        return vTicket;

    }
}
