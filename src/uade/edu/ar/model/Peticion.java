package uade.edu.ar.model;

import java.time.LocalDate;
import java.util.List;

public class Peticion {

    private int peticionId;
    private Paciente paciente;

    private String obraSocial;

    private LocalDate fechaCreacion;
    private LocalDate fechaEntrega;
    private List<Practicas> practicasAsociadas;
    private int cantPracticas;


    public Peticion(){
    }

    public Peticion(int peticionId, Paciente paciente, List<Practicas> practicasAsociadas) {
        this.peticionID = peticionId;
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

    public int getPeticionId() {
        return peticionId;
    }

    public void setPeticionID(int peticionId) {
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

    public List<Practicas> getPracticasAsociadas() {
        return practicasAsociadas;
    }

    public void setPracticasAsociadas(List<Practicas> practicasAsociadas) {
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
