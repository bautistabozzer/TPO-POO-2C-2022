package uade.edu.ar.dto;

public class SucursalDto {

    private String sucursalIdSucursal;

    private String direccionSucursal;

    private String responsableTecnicoSucursal;


    public SucursalDto(String sucursalIdSucursal, String direccionSucursal, String responsableTecnicoSucursal) {
        this.sucursalIdSucursal = sucursalIdSucursal;
        this.direccionSucursal = direccionSucursal;
        this.responsableTecnicoSucursal = responsableTecnicoSucursal;
    }


    public String getsucursalIdSucursal() {
        return sucursalIdSucursal;
    }

    public void setSucursalIdSucursal(String sucursalIdSucursal) {
        this.sucursalIdSucursal = sucursalIdSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public String getResponsableTecnicoSucursal() {
        return responsableTecnicoSucursal;
    }

    public void setResponsableTecnicoSucursal(String responsableTecnicoSucursal) {
        this.responsableTecnicoSucursal = responsableTecnicoSucursal;
    }
}
