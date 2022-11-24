package uade.edu.ar.ui.vistas;

import uade.edu.ar.ui.table.TablePacientes;

import javax.swing.*;

public class FormVerDatosPaciente extends JInternalFrame {

    private JPanel panelPrincipalDatos;
    private JButton button;

    public FormVerDatosPaciente() throws Exception {
        super("datos");
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setContentPane(panelPrincipalDatos);
    }
 }
