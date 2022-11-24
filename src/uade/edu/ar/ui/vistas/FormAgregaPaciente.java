package uade.edu.ar.ui.vistas;

import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.dto.PacienteDto;
import uade.edu.ar.model.Paciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormAgregaPaciente extends JInternalFrame{
    private JPanel panelPrincipalPaciente;
    private JButton agregarPacienteButton;
    private JTextField dni;
    private JTextField nombre;
    private JTextField sexo;
    private JTextField domicilio;
    private JTextField fechaNacimiento;
    private JTextField email;
    private ControllerPaciente controllerPaciente;

    public FormAgregaPaciente()
    {

        super("paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        setContentPane(panelPrincipalPaciente);

        agregarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // FormAgregaPaciente pantalla = new FormAgregaPaciente()
                try {
                    controllerPaciente = ControllerPaciente.getInstances();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                PacienteDto pacienteDto= new PacienteDto(dni.getText(),nombre.getText(), domicilio.getText(), email.getText(), sexo.getText(), fechaNacimiento.getText());
                try {
                    controllerPaciente.addPaciente(pacienteDto);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                //pantalla.setVisible(true);

            }
        });

    }




}
