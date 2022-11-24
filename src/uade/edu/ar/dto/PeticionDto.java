package uade.edu.ar.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PeticionDto {
    private String peticionIdPeticion;

    private String pacienteIdPeticion;

    private String obraSocialPeticion;

    private String fechaCreacionPeticion;
    private String fechaEntregaPeticion;
    private List<String> practicasAsociadasPeticion;
    private int cantPracticasPeticion;

    public PeticionDto(String peticionIdPeticion, String pacienteIdPeticion, List<String> practicasAsociadasPeticion) {
        this.peticionIdPeticion = peticionIdPeticion;
        this.pacienteIdPeticion = pacienteIdPeticion;
        this.practicasAsociadasPeticion = practicasAsociadasPeticion;
        this.cantPracticasPeticion = practicasAsociadasPeticion.size(); //Este tamaño esta definido por las practicas asociadas.
        this.fechaCreacionPeticion = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
        this.fechaEntregaPeticion= setFechaEntregaPeticion();
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

    public String getFechaEntregaPeticion() {
        return fechaEntregaPeticion;
    }

    public String setFechaEntregaPeticion() {
        LocalDate fechaCreacionPeticion = LocalDate.now();
        fechaCreacionPeticion.plusDays(8); //Esto hace que la fecha de entrega se fije 8 dias luego de solicitarla.
        String fechaEntregaPeticion= fechaCreacionPeticion.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fechaEntregaPeticion;


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
