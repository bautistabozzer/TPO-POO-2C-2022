package uade.edu.ar.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uade.edu.ar.controller.ControllerPeticion;
import uade.edu.ar.dto.PeticionDto;
import uade.edu.ar.model.Paciente;
import uade.edu.ar.model.Peticion;

import java.time.LocalDate;
import java.util.Collections;
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

        Peticion peticion = new Peticion("165474874651", new Paciente("22.333.888", "bautista", 'M', LocalDate.of(2022, 07, 15)), Collections.singletonList("Hemograma, Analisis de orina"));
        controllerPeticion.addPeticion(ControllerPeticion.toDto(peticion));
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
    void deleteBypeticionIdPeticion() {
    }
}
