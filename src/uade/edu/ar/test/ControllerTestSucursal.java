package uade.edu.ar.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uade.edu.ar.controller.ControllerSucursal;
import uade.edu.ar.dto.PacienteDto;
import uade.edu.ar.dto.SucursalDto;
import uade.edu.ar.model.Sucursal;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ControllerTestSucursal {
    ControllerSucursal controllerSucursal;



    @BeforeEach
    public void init() throws Exception {
        controllerSucursal = ControllerSucursal.getInstances();
    }

    @Test
    void getInstances() throws Exception {
        assertNotNull(controllerSucursal);
    }

    @Test
    void addSucursal() throws Exception {

        Sucursal sucursal = new Sucursal("132654", "Callao 956", "recepcionista");
        controllerSucursal.addSucursal(controllerSucursal.toDto(sucursal));

    }

    @Test
    void getBysucursalIdSucursal() throws Exception {
            }

    @Test
    void getAllSucursal() throws Exception {
        List<SucursalDto> list = controllerSucursal.getAll();
        assertNotEquals(0,list.size());
    }

    @Test
    void deleteBysucursalIdSucursal() {
    }

}
