package pe.edu.upc.dew.helpdesk.model;

import java.util.ArrayList; 


public class Cliente {


    private int id_cliente;

    private String codigo;

    private String clave;

    private String nombre;

    private String area;

    private String anexo;

    private String e_mail;

    private String cargo;

    private String jefe;

    private ArrayList<Ticket> tickets;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6DC85107-9B28-65AC-7E30-C08EF8130BFD]
    // </editor-fold> 
    public Cliente () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E68C7E76-D383-AABE-7058-223AC2E65C72]
    // </editor-fold> 
    public String getAnexo () {
        return anexo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DEA53D81-9E4D-4F65-F77D-B04BEC9C29AA]
    // </editor-fold> 
    public void setAnexo (String val) {
        this.anexo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7EB04D2-62C1-6743-1DCD-BE097C0B8921]
    // </editor-fold> 
    public String getArea () {
        return area;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.11B6BAEF-2340-94F2-94D6-47F0F2F31E44]
    // </editor-fold> 
    public void setArea (String val) {
        this.area = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1A265C26-B232-CB63-89A5-79C5822B3B45]
    // </editor-fold> 
    public String getCargo () {
        return cargo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0DE18430-A6D0-3733-9B66-D400DFF78291]
    // </editor-fold> 
    public void setCargo (String val) {
        this.cargo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9395BA68-39A5-E18C-11CB-E83B044BD1CE]
    // </editor-fold> 
    public String getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E1492F11-6E1F-8533-4306-C162F8D2C0E2]
    // </editor-fold> 
    public void setCodigo (String val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.04E7BA40-968E-3095-4D77-99EDCAF70892]
    // </editor-fold> 
    public String getJefe () {
        return jefe;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C6119B9C-AEE2-0916-D482-7B6E7640C02D]
    // </editor-fold> 
    public void setJefe (String val) {
        this.jefe = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.390B8E60-5C28-9B6C-4C33-AEA04C8EC31B]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D7AB6A02-0333-5995-5980-05CE4D0A5A7A]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5E576F03-6CE8-7151-82AF-CA77A7C6B1B8]
    // </editor-fold> 
    public ArrayList<Ticket> getTickets () {
        return tickets;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E7341BC4-6DB2-815A-E298-1DAC59496A53]
    // </editor-fold> 
    public void setTickets (ArrayList<Ticket> val) {
        this.tickets = val;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the e_mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * @param e_mail the e_mail to set
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

}

