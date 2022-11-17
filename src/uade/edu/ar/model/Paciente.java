package uade.edu.ar.model;
import java.time.LocalDate;

public class Paciente {

    private String dni;

    private String nombre;

    private String domicilio;

    private String email;

    private Character sexo;

    private LocalDate fechaNacimiento;


    public Paciente(String dni, String nombre, Character sexo, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.domicilio = "NOAsignado";
        this.fechaNacimiento = LocalDate.of(2003, 10, 10);
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int day, int month, int year) {
        this.fechaNacimiento = LocalDate.of(day, month, year);
    }


    @Override
    public String toString() {
        return "Paciente{" +
                "Paciente dni='" + dni + '\'' +
                ", Nombre paciente='" + nombre + '\'' +
                ", Sexo paciente='" + sexo + '\'' +
                ", Domicilio='" + domicilio + '\'' +
                ", Fecha Nacimiento='" + fechaNacimiento + '\'' +
                ", Email paciente='" + email + '\'' +
                '}';

    }
}


