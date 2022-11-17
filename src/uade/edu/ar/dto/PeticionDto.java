package uade.edu.ar.dto;

import java.time.LocalDate;
import java.util.List;

public class PeticionDto {
    private int peticionIdPeticion;
    private Paciente pacientePeticion;

    private String obraSocialPeticion;

    private LocalDate fechaCreacionPeticion;
    private LocalDate fechaEntregaPeticion;
    private List<Practicas> practicasAsociadasPeticion;
    private int cantPracticasPeticion;

    public PeticionDto(int peticionIdPeticion, Paciente pacientePeticion, List<Practicas> practicasAsociadasPeticon) {
        this.peticionIdPeticion = peticionIdPeticion;
        this.pacientePeticion = pacientePeticion;
        this.practicasAsociadasPeticion = practicasAsociadasPeticon;
        this.cantPracticasPeticion = practicasAsociadasPeticon.size(); //Este tamaño esta definido por las practicas asociadas.
        this.fechaCreacionPeticion = LocalDate.now();
        this.fechaEntregaPeticion= fechaCreacionPeticion.plusDays(8); //Esto hace que la fecha de entrega se fije 8 dias luego de solicitarla.
        this.obraSocialPeticion = "NoAsignado";
    }

    public void setCantPracticasPeticion(int cantPracticasPeticion) {
        this.cantPracticasPeticion = cantPracticasPeticion;
    }

    public int getPeticionIdPeticion() {
        return peticionIdPeticion;
    }

    public void setPeticionIdPeticion(int peticionIdPeticion) {
        this.peticionIdPeticion = peticionIdPeticion;
    }

    public Paciente getPacientePeticion() {
        return pacientePeticion;
    }

    public void setPacientePeticion(Paciente pacientePeticion) {
        this.pacientePeticion = pacientePeticion;
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

    public List<Practicas> getPracticasAsociadasPeticion() {
        return practicasAsociadasPeticion;
    }

    public void setPracticasAsociadasPeticion(List<Practicas> practicasAsociadasPeticion) {
        this.practicasAsociadasPeticion = practicasAsociadasPeticion;
    }
}
