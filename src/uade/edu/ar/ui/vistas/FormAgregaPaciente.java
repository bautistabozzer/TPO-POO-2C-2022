package uade.edu.ar.ui.vistas;

import javax.swing.*;

public class FormAgregaPaciente extends JInternalFrame{
    private JPanel panelPrincipalPaciente;
    private JButton button1;

    public FormAgregaPaciente()
    {
        super("paciente");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setContentPane(panelPrincipalPaciente);
    }
}
