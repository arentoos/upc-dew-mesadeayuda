package pe.edu.upc.dew.helpdesk.model;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C96AC50A-1866-106F-69DB-F0156AD3525B]
// </editor-fold> 
public class Comentario {

    private String texto;
    private String fechaHora;
    private int idComentario;
    private Empleado idEmpleado;
    private Ticket idTicket;

//    public Comentario() {
//    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.E0DFF767-D54F-7200-29C1-924CC528CB19]
    // </editor-fold>
    public String getFechaHora() {
        return fechaHora;
    }

    public Comentario(String texto, String fechaHora, int idComentario,Empleado idEmpleado,Ticket idTicket) {
        this.texto = texto;
        this.fechaHora = fechaHora;
        this.idComentario = idComentario;
        this.idEmpleado=idEmpleado;
        this.idTicket=idTicket;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.95F6CC70-931E-2E8D-3C48-990A9B111F97]
    // </editor-fold>
    public void setFechaHora(String val) {
        this.fechaHora = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.16C09DFD-43E6-D8F3-0DEC-74139EB2EB15]
    // </editor-fold>
    public int getIdComentario() {
        return idComentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.2E57A8F0-A5A8-8549-1A5D-14D96150B42E]
    // </editor-fold>
    public void setIdComentario(int val) {
        this.idComentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.D74570C1-7D32-4C71-D96C-EC034C9CE5F5]
    // </editor-fold>
    public String getTexto() {
        return texto;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Ticket getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Ticket idTicket) {
        this.idTicket = idTicket;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.8E9E3988-60C5-960A-1087-FA45E0144CD2]
    // </editor-fold>
    public void setTexto(String val) {
        this.texto = val;
    }

}
