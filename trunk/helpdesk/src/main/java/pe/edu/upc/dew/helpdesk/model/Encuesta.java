package pe.edu.upc.dew.helpdesk.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AE09BF7C-94E6-C055-B64D-C3B0554D9C39]
// </editor-fold> 
public class Encuesta {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D5CBD58C-3923-83AE-17FE-42FCE1803EE5]
    // </editor-fold> 
    private int id_encuesta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FEC90557-2389-F0B0-1F33-CA3636BE6080]
    // </editor-fold> 
    private int resultado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.29EA6E54-8EF0-58D8-3899-5CC41FDECDDC]
    // </editor-fold> 
    private String comentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.10893A8A-31E5-57F4-9D84-53449485AE25]
    // </editor-fold> 
    public Encuesta () {
    }

   
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.122B4B1A-9C09-A7BC-9C8A-A40DA14EF33A]
    // </editor-fold> 
    public String getComentario () {
        return comentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.94882370-D563-3174-790C-50A23C267D7A]
    // </editor-fold> 
    public void setComentario (String val) {
        this.comentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.46988D38-CD03-5F0B-DBF2-1DE88A7246F3]
    // </editor-fold> 
    public int getResultado () {
        return resultado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2063B349-4F7A-6D7F-E77D-6917412615CC]
    // </editor-fold> 
    public void setResultado (int val) {
        this.resultado = val;
    }

    /**
     * @return the id_encuesta
     */
    public int getId_encuesta() {
        return id_encuesta;
    }

    /**
     * @param id_encuesta the id_encuesta to set
     */
    public void setId_encuesta(int id_encuesta) {
        this.id_encuesta = id_encuesta;
    }

}

