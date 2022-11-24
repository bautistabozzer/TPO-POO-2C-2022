package uade.edu.ar.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {

    private String dni;

    private String nombre;

    private String domicilio;

    private String email;

    private Character sexo;

    private String fechaNacimiento;


    public Paciente(String dni, String nombre, Character sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.domicilio = "NOAsignado";
        this.fechaNacimiento = "NoAsignado";
        this.email = "NOAsignado";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int dia, int mes, int anio) {
        this.fechaNacimiento = LocalDate.of(dia, mes, anio).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
    }


    @Override
    public String toString() {
        return "Paciente{" +
                "Id='" + dni + '\'' +
                ", Nombre paciente='" + nombre + '\'' +
                ", Sexo paciente='" + sexo + '\'' +
                ", Domicilio='" + domicilio + '\'' +
                ", Fecha Nacimiento='" + fechaNacimiento + '\'' +
                ", Email paciente='" + email + '\'' +
                '}';

    }

}


