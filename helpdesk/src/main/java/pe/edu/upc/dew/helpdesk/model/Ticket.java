package pe.edu.upc.dew.helpdesk.model;

import java.util.ArrayList; 

public class Ticket {

    private String idTicket;

    private String descripcion;

    private String categoria;

    private String fechaCreacion;

    private String estado;

    private String areaReportar;

    private String tipoSolicitud;

    private String fechaCierre;

    private Encuesta encuesta;

    private ArrayList<Comentario> comentarios;

    private Empleado tecnico;

    public Ticket () {

    }

    public String getAreaReportar () {
        return areaReportar;
    }

    public void setAreaReportar (String areaReportar) {
        this.areaReportar = areaReportar;
    }

    public String getCategoria () {
        return categoria;
    }

    public void setCategoria (String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Comentario> getComentarios () {
        return comentarios;
    }

    public void setComentarios (ArrayList<Comentario> val) {
        this.comentarios = val;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.DA8A4894-B928-7B48-C369-A3C244646C97]
    // </editor-fold>
    public Encuesta getEncuesta () {
        return encuesta;
    }

    public void setEncuesta (Encuesta val) {
        this.encuesta = val;
    }
 
    public String getEstado () {
        return estado;
    }

    public void setEstado (String estado) {
        this.estado = estado;
    }

    public String getFechaCierre () {
        return fechaCierre;
    }

    public void setFechaCierre (String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getFechaCreacion () {
        return fechaCreacion;
    }

    public void setFechaCreacion (String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdTicket () {
        return idTicket;
    }

    public void setIdTicket (String idTicket) {
        this.idTicket = idTicket;
    }

    public Empleado getTecnico () {
        return tecnico;
    }

    public void setTecnico (Empleado tecnico) {
        this.tecnico = tecnico;
    }

    public String getTipoSolicitud () {
        return tipoSolicitud;
    }

    public void setTipoSolicitud (String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }



}

