package uade.edu.ar.ui.vistas;

import javax.swing.*;

public class MenuLogin extends JFrame {

    private JPanel panelPrincipal;
    private JPanel botonera;
    private JPanel panelcentralizado;

    public MenuLogin()
    {
        super("Menu principal app swing");
        setSize(800,800);
        //centrar la pantalla
        setLocationRelativeTo(null);
        setContentPane(panelPrincipal);

    }


    public static void main(String[]args){
        MenuLogin win= new MenuLogin();
        win.setVisible(true);



    }



}
