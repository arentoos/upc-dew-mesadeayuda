package pe.edu.upc.dew.helpdesk.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C96AC50A-1866-106F-69DB-F0156AD3525B]
// </editor-fold> 
public class Comentario {

        // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.41A423A2-1696-063E-37C6-77C66195C206]
    // </editor-fold>
    private int id_comentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.41A423A2-1696-063E-37C6-77C66195C206]
    // </editor-fold> 
    private String comentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BC92BFBF-4757-6B81-8F54-EC4A1640C333]
    // </editor-fold> 
    private String fechahora;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ADCE2D28-AB64-A5B7-AC97-0AD2C3A61EDC]
    // </editor-fold> 
    public Comentario () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D74570C1-7D32-4C71-D96C-EC034C9CE5F5]
    // </editor-fold> 
    public String getComentario () {
        return comentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8E9E3988-60C5-960A-1087-FA45E0144CD2]
    // </editor-fold> 
    public void setComentario (String val) {
        this.comentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E0DFF767-D54F-7200-29C1-924CC528CB19]
    // </editor-fold> 
    public String getFechahora () {
        return fechahora;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.95F6CC70-931E-2E8D-3C48-990A9B111F97]
    // </editor-fold> 
    public void setFechahora (String val) {
        this.fechahora = val;
    }

    /**
     * @return the id_comentario
     */
    public int getId_comentario() {
        return id_comentario;
    }

    /**
     * @param id_comentario the id_comentario to set
     */
    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

}

