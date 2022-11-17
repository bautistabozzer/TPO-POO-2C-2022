package uade.edu.ar.model;
import java.time.LocalDate;
import javax.print.DocFlavor;

public class Pacientes {

    private int dni;

    private String nombre;

    private String domicilio;

    private String email;

    private Character sexo;

    private LocalDate fechaNacimiento;


    public Pacientes(int dni, String nombre, Character sexo, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.domicilio = "NOAsignado";
        this.fechaNacimiento = LocalDate.of(2003, 10, 10);
        this.email = "NOAsignado";
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return "Pacientes{" +
                "Pacientes dni='" + dni + '\'' +
                ", Nombre paciente='" + nombre + '\'' +
                ", Sexo paciente='" + sexo + '\'' +
                ", Domicilio='" + domicilio + '\'' +
                ", Fecha Nacimiento='" + fechaNacimiento + '\'' +
                ", Email paciente='" + email + '\'' +
                '}';

    }
}


