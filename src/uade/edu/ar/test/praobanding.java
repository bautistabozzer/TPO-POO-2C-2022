package uade.edu.ar.test;

import uade.edu.ar.controller.Controller;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class praobanding {

    private static String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));








    public static void main(String[] args) throws FileNotFoundException {


        System.out.println(fecha);



    }


}
