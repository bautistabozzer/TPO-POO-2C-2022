package uade.edu.ar.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Peticion {

    private String peticionId;

    private String pacienteId;

    private String obraSocial;

    private String fechaCreacion;
    private String fechaEntrega;
    private List<String> practicasAsociadas;

    private int cantPracticas;

    public Peticion(String peticionId, String pacienteId, List<String> practicasAsociadas) {
        this.peticionId = peticionId;
        this.pacienteId = pacienteId;
        this.practicasAsociadas = practicasAsociadas;
        this.cantPracticas = practicasAsociadas.size(); //Este tamaño esta definido por las practicas asociadas.
        this.fechaCreacion = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.fechaEntrega = setFechaEntrega();
        this.obraSocial = "NoAsignado";
    }


    public int getCantPracticas() {
        return cantPracticas;
    }

    public String getPeticionId() {
        return peticionId;
    }

    public void setPeticionID(String peticionId) {
        this.peticionId = peticionId;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String setFechaEntrega() {
        LocalDate fechaCreacion = LocalDate.now(); //Esto hace que la fecha de entrega se fije 8 dias luego de solicitarla.
        String fechaEntrega= fechaCreacion.plusDays(8).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fechaEntrega;
    }


    public List<String> getPracticasAsociadas() {
        return practicasAsociadas;
    }

    public void setPracticasAsociadas(List<String> practicasAsociadas) {
        this.practicasAsociadas = practicasAsociadas;
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "Id='" + peticionId + '\'' +
                ", Paciente='" + pacienteId + '\'' +
                ", Obra social='" + obraSocial + '\'' +
                ", Fecha entrega='" + fechaEntrega + '\'' +
                ", Practicas Asociadas='" + practicasAsociadas + '\'' +
                ", Cantidad de practicas='" + cantPracticas + '\'' +
                '}';
    }


}
