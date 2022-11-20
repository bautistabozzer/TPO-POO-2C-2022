package uade.edu.ar.model;

public class Sucursal {

private String sucursalId;

private String direccion;

private String responsableTecnico;


    public Sucursal(String sucursalId, String direccion, String responsableTecnico) {
        this.sucursalId = sucursalId;
        this.direccion = direccion;
        this.responsableTecnico = responsableTecnico;
    }


    public String getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(String sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getResponsableTecnico() {
        return responsableTecnico;
    }

    public void setResponsableTecnico(String responsableTecnico) {
        this.responsableTecnico = responsableTecnico;
    }

    public String toString() {
        return "Sucursal{" +
                "Sucursal Id='" + sucursalId + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Responsable Tecnico='" + responsableTecnico + '\'' +
                '}';
    }

}
