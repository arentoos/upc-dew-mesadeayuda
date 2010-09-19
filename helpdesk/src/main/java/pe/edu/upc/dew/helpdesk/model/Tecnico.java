package pe.edu.upc.dew.helpdesk.model;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E132C172-F98B-96B9-5764-DB1A87D873FB]
// </editor-fold> 
public class Tecnico {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FD79B05E-410D-2EC7-B218-453C2450FC16]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CDEE2160-CB08-1ACC-9DE8-EA29627079CB]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.46805937-D709-A820-E083-636AFABC8295]
    // </editor-fold> 
    private String area;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CEACA93C-663B-A324-D4C3-336C258CEA0B]
    // </editor-fold> 
    private ArrayList<Ticket> ticketsAsignados;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6AFA70B3-16A3-738C-2D52-C8C61D544034]
    // </editor-fold> 
    public Tecnico () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4BA199E2-E510-D798-E99C-10AF75155C41]
    // </editor-fold> 
    public String getArea () {
        return area;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5E3FFD48-670A-B7F4-93EB-1CCE006C85D6]
    // </editor-fold> 
    public void setArea (String val) {
        this.area = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2105FC1D-EC69-1D51-5F1C-B151404757C1]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AC69D656-12AF-7C50-656F-28BD26BB676C]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.54E66BF2-DFCB-1E33-F7FA-B3791DB28B73]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1C965656-D515-156B-501B-3CF086974246]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.742E94A2-488E-221C-F5B6-7AC6B7316181]
    // </editor-fold> 
    public ArrayList<Ticket> getTicketsAsignados () {
        return ticketsAsignados;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7179976D-EDFF-D9B0-A12B-E322AE2FBCE4]
    // </editor-fold> 
    public void setTicketsAsignados (ArrayList<Ticket> val) {
        this.ticketsAsignados = val;
    }

}

