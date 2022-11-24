package uade.edu.ar.ui.vistas;

import javax.swing.*;

public class FormAgregaPaciente extends JInternalFrame{
    private JPanel panelPrincipalPaciente;
    private JButton agregarPacienteButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;

    public FormAgregaPaciente()
    {
        super("paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setContentPane(panelPrincipalPaciente);

    }
}
