import uade.edu.ar.controller.Controller;
import uade.edu.ar.controller.ControllerPeticion;

import java.io.FileNotFoundException;

import static uade.edu.ar.controller.ControllerPeticion.getInstances;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Controller controller = Controller.getInstances();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}