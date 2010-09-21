package pe.edu.upc.dew.helpdesk.model;

import java.util.ArrayList; 


public class Ticket {

    
    private int id_ticket;

    private int tipo_solicitud;

    private String categoria;


    private String descripcion;

    private java.sql.Timestamp fechahora_a;

   
    private java.sql.Timestamp  fechahora_c;

    private String estado;


    private int area_reportar;

 
    private Encuesta encuesta;

   
    private ArrayList<Comentario> comentarios;

    public Ticket () {
    }

   
    

    
    public String getCategoria () {
        return categoria;
    }

    
    public void setCategoria (String val) {
        this.categoria = val;
    }

    public int getId_ticket () {
        return id_ticket;
    }

    
    public void setId_ticket (int val) {
        this.id_ticket = val;
    }

    public ArrayList<Comentario> getComentarios () {
        return comentarios;
    }

    
    public void setComentarios (ArrayList<Comentario> val) {
        this.comentarios = val;
    }

    
    public Encuesta getEncuesta () {
        return encuesta;
    }

     
    public void setEncuesta (Encuesta val) {
        this.encuesta = val;
    }

    
    public String getEstado () {
        return estado;
    }

    
    public void setEstado (String val) {
        this.estado = val;
    }


    /**
     * @return the fechahora_a
     */
    public java.sql.Timestamp getFechahora_a() {
        return fechahora_a;
    }

    /**
     * @param fechahora_a the fechahora_a to set
     */
    public void setFechahora_a(java.sql.Timestamp fechahora_a) {
        this.fechahora_a = fechahora_a;
    }

    /**
     * @return the fechahora_c
     */
    public java.sql.Timestamp getFechahora_c() {
        return fechahora_c;
    }

    /**
     * @param fechahora_c the fechahora_c to set
     */
    public void setFechahora_c(java.sql.Timestamp fechahora_c) {
        this.fechahora_c = fechahora_c;
    }

    /**
     * @return the tipo_solicitud
     */
    public int getTipo_solicitud() {
        return tipo_solicitud;
    }

    /**
     * @param tipo_solicitud the tipo_solicitud to set
     */
    public void setTipo_solicitud(int tipo_solicitud) {
        this.tipo_solicitud = tipo_solicitud;
    }

    /**
     * @return the area_reportar
     */
    public int getArea_reportar() {
        return area_reportar;
    }

    /**
     * @param area_reportar the area_reportar to set
     */
    public void setArea_reportar(int area_reportar) {
        this.area_reportar = area_reportar;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   

}

