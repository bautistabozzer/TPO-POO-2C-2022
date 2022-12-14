package uade.edu.ar.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uade.edu.ar.controller.ControllerPeticion;
import uade.edu.ar.dto.PeticionDto;
import uade.edu.ar.model.Peticion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ControllerTestPeticion {
    ControllerPeticion controllerPeticion;

    @BeforeEach
    public void init() throws Exception {
        controllerPeticion = ControllerPeticion.getInstances();
    }

    @Test
    void getInstances() throws Exception {
        assertNotNull(controllerPeticion);
    }

    @Test
    void addPeticion() throws Exception {
        String pacienteId= "12.321.147";
        List<String> practicasAsociadas= new ArrayList<>();
        practicasAsociadas.add("Hemograma");
        practicasAsociadas.add("Analisis de orina");
        //practicasAsociadas.toArray();

        Peticion peticion = new Peticion("1471749", pacienteId, practicasAsociadas );
        controllerPeticion.addPeticion(controllerPeticion.toDto(peticion));
    }

    @Test
    void getBypeticionIdPeticion() {

    }

    @Test
    void getAllPeticion() throws Exception {
        List<PeticionDto> list = controllerPeticion.getAll();
        assertNotEquals(0,list.size());
    }

    @Test
    void deleteBypeticionIdPeticion() throws Exception {
        controllerPeticion.deleteBypeticionIdPeticion("147489");
    }
}
