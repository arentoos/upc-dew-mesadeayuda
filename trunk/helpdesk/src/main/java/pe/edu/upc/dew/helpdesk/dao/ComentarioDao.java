/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.helpdesk.dao;

import java.util.ArrayList;
import pe.edu.upc.dew.helpdesk.model.Comentario;

/**
 *
 * @author cgonzagah
 */
public interface ComentarioDao {

    public void insertComentario(String string);
    public ArrayList<Comentario> getComentarios(String idTicket);

    public void updateEstadoTicket(String idTicket, String estado);

}
