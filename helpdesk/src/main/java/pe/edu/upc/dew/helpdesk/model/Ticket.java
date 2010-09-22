package pe.edu.upc.dew.helpdesk.model;

import java.util.ArrayList; 

public class Ticket {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.B3FBB535-4D99-EF57-CADF-5B098A3D49C8]
    // </editor-fold>
    private int idTicket;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.8C02553D-C776-0CED-6C0A-2163D8C07C14]
    // </editor-fold>
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.3BFFB84F-66B3-FA6D-62B5-7677892F77FE]
    // </editor-fold>
    private String categoria;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.962B53A6-B28E-5E39-D344-479009193A50]
    // </editor-fold>
    private String fechaCreacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.0F29A0A4-88FD-D0EF-0DCB-B0E6726CA40D]
    // </editor-fold>
    private String estado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.4B215523-F1F5-6153-3F7D-16E027128DA0]
    // </editor-fold>
    private String areaReportar;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.67A46972-38EC-B171-30A2-2C23546E078A]
    // </editor-fold>
    private String tipoSolicitud;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.698EB495-70B1-E43D-C324-98CA076D4BED]
    // </editor-fold>
    private String fechaCierre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.DFF7DC5E-AFEA-16A5-3B90-CF9036D394DE]
    // </editor-fold>
    private Encuesta encuesta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.B02D0B9F-2B41-FC74-2265-2437124FB7F5]
    // </editor-fold>
    private ArrayList<Comentario> comentarios;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.128DCDF5-2AF1-06D9-B6B9-D2DDA366648D]
    // </editor-fold>
    private Empleado tecnico;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.462F2FD3-B9ED-8707-033A-1CCCDB7B2712]
    // </editor-fold>
    public Ticket () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.9EB76F46-28AF-D53C-E252-D050BA16D9BE]
    // </editor-fold>
    public String getAreaReportar () {
        return areaReportar;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.2C71DE81-B1FD-CADC-0450-EEB7E5B47D23]
    // </editor-fold>
    public void setAreaReportar (String val) {
        this.areaReportar = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.2D81EFD2-1AC8-DBC8-27FE-413C575F59EF]
    // </editor-fold>
    public String getCategoria () {
        return categoria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.935E6A7D-A9CC-B5A5-310F-ED17B36D9E6F]
    // </editor-fold>
    public void setCategoria (String val) {
        this.categoria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.57D865E0-98BF-528D-FFF8-89CEF0EDBDE7]
    // </editor-fold>
    public ArrayList<Comentario> getComentarios () {
        return comentarios;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.5D4EFBF6-12BB-46AE-4802-CB7250836A9F]
    // </editor-fold>
    public void setComentarios (ArrayList<Comentario> val) {
        this.comentarios = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.6F57C733-6B69-07B1-4B82-802C5F57ECC8]
    // </editor-fold>
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.B8903FF6-B4AC-DF99-421A-815C5776ABEF]
    // </editor-fold>
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.DA8A4894-B928-7B48-C369-A3C244646C97]
    // </editor-fold>
    public Encuesta getEncuesta () {
        return encuesta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.B337F06D-E309-A274-DED5-B8CCB96213AE]
    // </editor-fold>
    public void setEncuesta (Encuesta val) {
        this.encuesta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.5A86B7D0-BAA4-410B-F329-1EF541F4C8F2]
    // </editor-fold>
    public String getEstado () {
        return estado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.C3A7BC41-72CB-6B43-0F64-BF9CC2A9AADE]
    // </editor-fold>
    public void setEstado (String val) {
        this.estado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.4CBE1B72-6327-EFFC-92BB-5CA22F02FA67]
    // </editor-fold>
    public String getFechaCierre () {
        return fechaCierre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.8A303A71-C9A8-B0CF-7CA7-88B4AB75D552]
    // </editor-fold>
    public void setFechaCierre (String val) {
        this.fechaCierre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.C3DAE32F-95D5-3B19-E02E-B79BF678CB9E]
    // </editor-fold>
    public String getFechaCreacion () {
        return fechaCreacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.BFE44120-69EB-CE66-3D3F-D5A7B4E59926]
    // </editor-fold>
    public void setFechaCreacion (String val) {
        this.fechaCreacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.42F703FF-E9A3-9B9E-14F0-F522A6CE481B]
    // </editor-fold>
    public int getIdTicket () {
        return idTicket;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.3034BD78-AA76-375F-CC34-22C4B09DA312]
    // </editor-fold>
    public void setIdTicket (int val) {
        this.idTicket = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.8166DF4E-863E-C63F-51B4-7F82C243976A]
    // </editor-fold>
    public Empleado getTecnico () {
        return tecnico;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.3BB525B4-1511-EE1E-A99D-44A53CA95B9A]
    // </editor-fold>
    public void setTecnico (Empleado val) {
        this.tecnico = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.865AE85E-E83E-3CF7-7BED-63B42CCDB203]
    // </editor-fold>
    public String getTipoSolicitud () {
        return tipoSolicitud;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.32EF30BE-1EBB-A406-CBA7-38482358EDA7]
    // </editor-fold>
    public void setTipoSolicitud (String val) {
        this.tipoSolicitud = val;
    }

}

