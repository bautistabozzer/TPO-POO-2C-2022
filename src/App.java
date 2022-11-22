import uade.edu.ar.controller.Controller;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Controller controller = Controller.getInstances();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}