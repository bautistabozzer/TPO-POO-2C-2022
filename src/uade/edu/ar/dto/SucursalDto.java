package uade.edu.ar.dto;

public class SucursalDto {

    private String SucursalIdSucursal;

    private String direccionSucursal;

    private String ResponsableTecnicoSucursal;


    public SucursalDto(String sucursalIdSucursal, String direccionSucursal, String responsableTecnicoSucursal) {
        this.SucursalIdSucursal = sucursalIdSucursal;
        this.direccionSucursal = direccionSucursal;
        this.ResponsableTecnicoSucursal = responsableTecnicoSucursal;
    }


    public String getSucursalIdSucursal() {
        return SucursalIdSucursal;
    }

    public void setSucursalIdSucursal(String sucursalIdSucursal) {
        SucursalIdSucursal = sucursalIdSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public String getResponsableTecnicoSucursal() {
        return ResponsableTecnicoSucursal;
    }

    public void setResponsableTecnicoSucursal(String responsableTecnicoSucursal) {
        ResponsableTecnicoSucursal = responsableTecnicoSucursal;
    }
}
