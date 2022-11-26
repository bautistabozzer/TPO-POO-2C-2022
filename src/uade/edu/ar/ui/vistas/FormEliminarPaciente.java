package uade.edu.ar.ui.vistas;

import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.controller.ControllerPeticion;
import uade.edu.ar.dto.PeticionDto;
import uade.edu.ar.ui.table.TablePacientes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FormEliminarPaciente extends JInternalFrame {
    private JPanel panelPrincipal;
    private JTextField pacienteDni;
    private JButton eliminarPacienteButton;

    private ControllerPaciente controllerPaciente;
    private ControllerPeticion controllerPeticion;


    public FormEliminarPaciente(){

        super("EliminarPaciente");
        setBorder(null);

        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        setContentPane(panelPrincipal);

        eliminarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    controllerPaciente = ControllerPaciente.getInstances();
                    //controllerPeticion = ControllerPeticion.getInstances();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                try {
                controllerPaciente.deleteBydniPaciente(String.valueOf(pacienteDni));
                controllerPaciente.close();

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                //pantalla.setVisible(true);

            }
        });
    }
}
