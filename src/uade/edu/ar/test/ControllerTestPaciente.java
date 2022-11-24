package uade.edu.ar.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.controller.ControllerPeticion;
import uade.edu.ar.dto.PacienteDto;
import uade.edu.ar.dto.PeticionDto;
import uade.edu.ar.model.Paciente;
import uade.edu.ar.model.Peticion;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ControllerTestPaciente {
    ControllerPaciente controllerPaciente;



    @BeforeEach
    public void init() throws Exception {
        controllerPaciente = ControllerPaciente.getInstances();
    }

    @Test
    void getInstances() throws Exception {
        assertNotNull(controllerPaciente);
    }

    @Test
    void addPaciente() throws Exception {

        Paciente paciente= new Paciente("789456312", "Juana", 'F');
        //paciente.setFechaNacimiento(4,7,7);
        controllerPaciente.addPaciente(controllerPaciente.toDto(paciente));

    }

    @Test
    void getBydniPaciente() throws Exception {
        controllerPaciente.getBydniPaciente("158");

    }

    @Test
    void getAllPaciente() throws Exception {
        List<PacienteDto> list = controllerPaciente.getAll();
        assertNotEquals(0,list.size());
    }

    @Test
    void deleteBydniPaciente() {
        controllerPaciente.deleteBydniPaciente("117478");
    }



}