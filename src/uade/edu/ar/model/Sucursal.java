package uade.edu.ar.model;

public class Sucursal {

private String SucursalId;

private String direccion;

private String ResponsableTecnico;


    public Sucursal(String sucursalId, String direccion, String responsableTecnico) {
        this.SucursalId = sucursalId;
        this.direccion = direccion;
        this.ResponsableTecnico = responsableTecnico;
    }


    public String getSucursalId() {
        return SucursalId;
    }

    public void setSucursalId(String sucursalId) {
        SucursalId = sucursalId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getResponsableTecnico() {
        return ResponsableTecnico;
    }

    public void setResponsableTecnico(String responsableTecnico) {
        ResponsableTecnico = responsableTecnico;
    }

    public String toString() {
        return "Sucursal{" +
                "Sucursal Id='" + SucursalId + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Responsable Tecnico='" + ResponsableTecnico + '\'' +
                '}';
    }

}
