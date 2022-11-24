package uade.edu.ar.ui.vistas;

import javax.swing.*;

public class FormVerDatosPaciente extends JInternalFrame {

    private JPanel panelPrincipalDatos;
    private JButton button1;

    public FormVerDatosPaciente()
    {
        super("datos");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setContentPane(panelPrincipalDatos);
    }
}
