package uade.edu.ar.dto;

import java.time.LocalDate;
import java.util.List;

public class PeticionDto {
    private String peticionIdPeticion;

    private String pacienteIdPeticion;

    private String obraSocialPeticion;

    private LocalDate fechaCreacionPeticion;
    private LocalDate fechaEntregaPeticion;
    private List<String> practicasAsociadasPeticion;
    private int cantPracticasPeticion;

    public PeticionDto(String peticionIdPeticion, String pacienteIdPeticion, List<String> practicasAsociadasPeticion) {
        this.peticionIdPeticion = peticionIdPeticion;
        this.pacienteIdPeticion = pacienteIdPeticion;
        this.practicasAsociadasPeticion = practicasAsociadasPeticion;
        this.cantPracticasPeticion = practicasAsociadasPeticion.size(); //Este tamaño esta definido por las practicas asociadas.
        this.fechaCreacionPeticion = LocalDate.now();
        this.fechaEntregaPeticion= fechaCreacionPeticion.plusDays(8); //Esto hace que la fecha de entrega se fije 8 dias luego de solicitarla.
        this.obraSocialPeticion = "NoAsignado";
    }

    public void setCantPracticasPeticion(int cantPracticasPeticion) {
        this.cantPracticasPeticion = cantPracticasPeticion;
    }

    public String getPeticionIdPeticion() {
        return peticionIdPeticion;
    }

    public void setPeticionIdPeticion(String peticionIdPeticion) {
        this.peticionIdPeticion = peticionIdPeticion;
    }

    public String getPacientePeticion() {
        return pacienteIdPeticion;
    }

    public void setPacientePeticion(String pacienteIdPeticion) {
        this.pacienteIdPeticion = pacienteIdPeticion;
    }

    public String getObraSocialPeticion() {
        return obraSocialPeticion;
    }

    public void setObraSocialPeticion(String obraSocialPeticion) {
        this.obraSocialPeticion = obraSocialPeticion;
    }

    public LocalDate getFechaEntregaPeticion() {
        return fechaEntregaPeticion;
    }

    public void setFechaEntregaPeticion(LocalDate fechaEntregaPeticion) {
        this.fechaEntregaPeticion = fechaEntregaPeticion;
    }

    public List<String> getPracticasAsociadasPeticion() {
        return practicasAsociadasPeticion;
    }

    public void setPracticasAsociadasPeticion(List<String> practicasAsociadasPeticion) {
        this.practicasAsociadasPeticion = practicasAsociadasPeticion;
    }

    public int getCantPracticasPeticion() {
        return cantPracticasPeticion;
    }
}
