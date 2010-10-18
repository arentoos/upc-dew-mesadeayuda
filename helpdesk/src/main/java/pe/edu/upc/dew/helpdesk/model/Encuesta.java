package pe.edu.upc.dew.helpdesk.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AE09BF7C-94E6-C055-B64D-C3B0554D9C39]
// </editor-fold> 
public class Encuesta {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.D5CBD58C-3923-83AE-17FE-42FCE1803EE5]
    // </editor-fold>
    private String idEncuesta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.FEC90557-2389-F0B0-1F33-CA3636BE6080]
    // </editor-fold>
    private int servicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.29EA6E54-8EF0-58D8-3899-5CC41FDECDDC]
    // </editor-fold>
    private int tiempo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.696D650F-C987-AE21-72E1-ECFAE93A3C9D]
    // </editor-fold>
    private int trato;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.CE12E4E8-8C38-289D-1469-971CFA084618]
    // </editor-fold>
    private int conocimiento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.DF52C8CB-9711-D105-C300-0F19FF813063]
    // </editor-fold>
    private String comentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.10893A8A-31E5-57F4-9D84-53449485AE25]
    // </editor-fold>
    public Encuesta () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.CB911D79-9BA2-910B-6AA0-5687FBCE160E]
    // </editor-fold>
    public String getComentario () {
        return comentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.3768843D-2A40-9FF7-C208-2D23EBFB7416]
    // </editor-fold>
    public void setComentario (String val) {
        this.comentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.06A3519B-5C2E-7649-7603-0253585AF0BE]
    // </editor-fold>
    public int getConocimiento () {
        return conocimiento;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.1E917A93-2ED0-8794-B7D2-9C3B89AE9E00]
    // </editor-fold>
    public void setConocimiento (int val) {
        this.conocimiento = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.606F32B7-B812-6343-9D01-56D6780AC110]
    // </editor-fold>
    public String getIdEncuesta () {
        return idEncuesta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.119707DD-608D-2A2B-9D12-D62FE3632EF4]
    // </editor-fold>
    public void setIdEncuesta (String val) {
        this.idEncuesta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.46988D38-CD03-5F0B-DBF2-1DE88A7246F3]
    // </editor-fold>
    public int getServicio () {
        return servicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.2063B349-4F7A-6D7F-E77D-6917412615CC]
    // </editor-fold>
    public void setServicio (int val) {
        this.servicio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.122B4B1A-9C09-A7BC-9C8A-A40DA14EF33A]
    // </editor-fold>
    public int getTiempo () {
        return tiempo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.94882370-D563-3174-790C-50A23C267D7A]
    // </editor-fold>
    public void setTiempo (int val) {
        this.tiempo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.C3B649CD-C5E4-6697-5BA8-DAF343311F0E]
    // </editor-fold>
    public int getTrato () {
        return trato;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.F85C6619-34F8-A640-3A00-52DFEA5BAE86]
    // </editor-fold>
    public void setTrato (int val) {
        this.trato = val;
    }

}
