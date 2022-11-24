package uade.edu.ar.ui.vistas;

import uade.edu.ar.ui.table.TablePacientes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLogin extends JFrame {

    private JPanel panelPrincipal;
    private JPanel botonera;
    private JPanel panelcentralizado;
    private JButton agregarPacienteButton;
    private JButton verDatosButton;
    private JDesktopPane desktopPaneEmbebido;

    public MenuLogin()
    {
        super("Menu principal app swing");
        setSize(800,800);
        //centrar la pantalla
        setLocationRelativeTo(null);
        setContentPane(panelPrincipal);

        //esto hace que cuando toque agregar paciente, lo agregue
        agregarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormAgregaPaciente pantalla = new FormAgregaPaciente();
                desktopPaneEmbebido.add(pantalla);
                pantalla.setVisible(true);

            }
        });
        verDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TablePacientes pantalla = null;
                try {
                    pantalla = new TablePacientes("Pacientes");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                desktopPaneEmbebido.add(pantalla);
                pantalla.setVisible(true);

            }
        });
    }


    public static void main(String[]args){
        MenuLogin win= new MenuLogin();
        win.setVisible(true);



    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
