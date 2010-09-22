package pe.edu.upc.dew.helpdesk.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C96AC50A-1866-106F-69DB-F0156AD3525B]
// </editor-fold> 
public class Comentario {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.41A423A2-1696-063E-37C6-77C66195C206]
    // </editor-fold>
    private String texto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.BC92BFBF-4757-6B81-8F54-EC4A1640C333]
    // </editor-fold>
    private String fechaHora;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.0B01B931-2AEF-4058-AAF8-19CBD9E174E5]
    // </editor-fold>
    private int idComentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.ADCE2D28-AB64-A5B7-AC97-0AD2C3A61EDC]
    // </editor-fold>
    public Comentario () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.E0DFF767-D54F-7200-29C1-924CC528CB19]
    // </editor-fold>
    public String getFechaHora () {
        return fechaHora;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.95F6CC70-931E-2E8D-3C48-990A9B111F97]
    // </editor-fold>
    public void setFechaHora (String val) {
        this.fechaHora = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.16C09DFD-43E6-D8F3-0DEC-74139EB2EB15]
    // </editor-fold>
    public int getIdComentario () {
        return idComentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.2E57A8F0-A5A8-8549-1A5D-14D96150B42E]
    // </editor-fold>
    public void setIdComentario (int val) {
        this.idComentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.D74570C1-7D32-4C71-D96C-EC034C9CE5F5]
    // </editor-fold>
    public String getTexto () {
        return texto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.8E9E3988-60C5-960A-1087-FA45E0144CD2]
    // </editor-fold>
    public void setTexto (String val) {
        this.texto = val;
    }

}
