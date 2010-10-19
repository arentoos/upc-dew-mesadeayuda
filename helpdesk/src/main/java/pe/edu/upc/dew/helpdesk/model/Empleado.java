package pe.edu.upc.dew.helpdesk.model;

import java.util.ArrayList;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DC867D14-5E81-8D3C-42A8-250625FC1BA8]
// </editor-fold> 
public class Empleado {

    private int idEmpleado;
    private String login;
    private String area;
    private String anexo;
    private String cargo;
    private String jefe;
    private String clave;
    private String nombre;
    private String email;
    private String tipoEmpleado;
    private int nivelSoporte;
    private ArrayList<Ticket> tickets;

    public Empleado(int idEmpleado, String login, String area, String anexo, String cargo, String jefe, String clave, String nombre, String email, String tipoEmpleado, int nivelSoporte) {

        this.idEmpleado = idEmpleado;
        this.login = login;
        this.area = area;
        this.anexo = anexo;
        this.cargo = cargo;
        this.jefe = jefe;
        this.clave = clave;
        this.nombre = nombre;
        this.email = email;
        this.tipoEmpleado = tipoEmpleado;
        this.nivelSoporte = nivelSoporte;

        this.tickets = new ArrayList<Ticket>();
    }

    public int getNivelSoporte() {
        return nivelSoporte;
    }

    public void setNivelSoporte(int nivelSoporte) {
        this.nivelSoporte = nivelSoporte;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5202543E-5A81-5BC8-7EBE-57C0BB46141A]
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6DC85107-9B28-65AC-7E30-C08EF8130BFD]
    // </editor-fold> 
    public Empleado() {
        this.tickets = new ArrayList<Ticket>();

    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E68C7E76-D383-AABE-7058-223AC2E65C72]
    // </editor-fold> 
    public String getAnexo() {
        return anexo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DEA53D81-9E4D-4F65-F77D-B04BEC9C29AA]
    // </editor-fold> 
    public void setAnexo(String val) {
        this.anexo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7EB04D2-62C1-6743-1DCD-BE097C0B8921]
    // </editor-fold> 
    public String getArea() {
        return area;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.11B6BAEF-2340-94F2-94D6-47F0F2F31E44]
    // </editor-fold> 
    public void setArea(String val) {
        this.area = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1A265C26-B232-CB63-89A5-79C5822B3B45]
    // </editor-fold> 
    public String getCargo() {
        return cargo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0DE18430-A6D0-3733-9B66-D400DFF78291]
    // </editor-fold> 
    public void setCargo(String val) {
        this.cargo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D3CA41E2-D53C-E561-F57D-988C84E56E2A]
    // </editor-fold> 
    public String getClave() {
        return clave;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.543E8B40-7ED8-8FC0-582E-E40D8E1076EC]
    // </editor-fold> 
    public void setClave(String clave) {
        this.clave = clave;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB13A0FB-1BFB-C5C3-4565-E79476A1EF40]
    // </editor-fold> 
    public String getEmail() {
        return email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB60AC5A-3B4A-CCE8-8F7B-ECAB596690FB]
    // </editor-fold> 
    public void setEmail(String val) {
        this.email = val;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9395BA68-39A5-E18C-11CB-E83B044BD1CE]
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E1492F11-6E1F-8533-4306-C162F8D2C0E2]
    // </editor-fold> 
    public void setIdEmpleado(int val) {

        this.idEmpleado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.04E7BA40-968E-3095-4D77-99EDCAF70892]
    // </editor-fold> 
    public String getJefe() {
        return jefe;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C6119B9C-AEE2-0916-D482-7B6E7640C02D]
    // </editor-fold> 
    public void setJefe(String val) {
        this.jefe = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.390B8E60-5C28-9B6C-4C33-AEA04C8EC31B]
    // </editor-fold> 
    public String getLogin() {
        return login;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D7AB6A02-0333-5995-5980-05CE4D0A5A7A]
    // </editor-fold> 
    public void setLogin(String login) {
        this.login = login;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DA9F2944-D51F-5FA6-15AA-3E0711252962]
    // </editor-fold> 
    public String getNombre() {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1650CE82-61AA-C923-6DF3-F364EFE115F9]
    // </editor-fold> 
    public void setNombre(String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5E576F03-6CE8-7151-82AF-CA77A7C6B1B8]
    // </editor-fold> 
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E7341BC4-6DB2-815A-E298-1DAC59496A53]
    // </editor-fold> 
    public void setTickets(ArrayList<Ticket> val) {
        this.tickets = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BCA9E7A2-D9BF-5373-B642-AEB3975D4728]
    // </editor-fold> 
    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.261F2495-570C-708E-0113-655D41A7163E]
    // </editor-fold> 
    public void setTipoEmpleado(String val) {
        this.tipoEmpleado = val;
    }
}
