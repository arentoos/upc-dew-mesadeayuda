/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.helpdesk.service;

import pe.edu.upc.dew.helpdesk.dao.ComentarioDao;
import pe.edu.upc.dew.helpdesk.dao.ComentarioDaoJdbc;

/**
 *
 * @author cgonzagah
 */
public class ComentarioServiceImpl implements ComentarioService{

     public void insertaComentario(String string) {

        ComentarioDao td = new ComentarioDaoJdbc();

        td.insertComentario(string);
    }

}
