package uade.edu.ar.dto;

import java.time.LocalDate;

public class PacienteDto {

    private int dniPaciente;

    private String nombrePaciente;

    private Character sexoPaciente;

    private String domicilioPaciente;

    private LocalDate fechaNacimientoPaciente;

    private String emailPaciente;


    public PacienteDto(int dniPaciente, String nombrePaciente, String domicilioPaciente, String emailPaciente, Character sexoPaciente, LocalDate fechaNacimientoPaciente) {
        this.dniPaciente = dniPaciente;
        this.nombrePaciente = nombrePaciente;
        this.sexoPaciente = sexoPaciente;
        this.domicilioPaciente = "NOAsignado";
        this.fechaNacimientoPaciente = LocalDate.of(2003, 10, 10);
        this.emailPaciente ="NOAsignado";

    }


    public int getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Character getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(Character sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getDomicilioPaciente() {
        return domicilioPaciente;
    }

    public void setDomicilioPaciente(String domicilioPaciente) {
        this.domicilioPaciente = domicilioPaciente;
    }

    public LocalDate getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(LocalDate fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }
}
