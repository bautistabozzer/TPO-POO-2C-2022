package uade.edu.ar.model;

import java.time.LocalDate;
import java.util.List;

public class Peticion {

    private String peticionId;
    private Paciente paciente;

    private String obraSocial;

    private LocalDate fechaCreacion;
    private LocalDate fechaEntrega;
    private List<String> practicasAsociadas;

    private int cantPracticas;

    public Peticion(String peticionId, Paciente paciente, List<String> practicasAsociadas) {
        this.peticionId = peticionId;
        this.paciente = paciente;
        this.practicasAsociadas = practicasAsociadas;
        this.cantPracticas = practicasAsociadas.size(); //Este tamaño esta definido por las practicas asociadas.
        this.fechaCreacion = LocalDate.now();
        this.fechaEntrega= fechaCreacion.plusDays(8); //Esto hace que la fecha de entrega se fije 8 dias luego de solicitarla.
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
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
                "Peticion Id='" + peticionId + '\'' +
                ", Paciente='" + paciente + '\'' +
                ", Obra social='" + obraSocial + '\'' +
                ", Fecha entrega='" + fechaEntrega + '\'' +
                ", Practicas Asociadas='" +  + '\'' +
                ", Cantidad de practicas='" + cantPracticas + '\'' +
                '}';
    }


}
