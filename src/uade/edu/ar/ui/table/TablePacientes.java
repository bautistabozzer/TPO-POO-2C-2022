package uade.edu.ar.ui.table;

import uade.edu.ar.controller.Controller;
import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.dto.ModelDto;
import uade.edu.ar.dto.PacienteDto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TablePacientes extends JInternalFrame implements ActionListener {
    private Object[][] data;
    private String[] columnNames = {"Dni","Nombre", "Domicilio", "Email", "Sexo", "Fecha de naciemiento"};
    private DefaultTableModel tablePaciente;
    private JTable table;
    private ControllerPaciente controllerPaciente;

    public TablePacientes(String title) throws Exception {
        super(title);
        setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controllerPaciente = ControllerPaciente.getInstances();
        data = convertDtoToData(controllerPaciente.getAll());
        tablePaciente = new DefaultTableModel(data, columnNames);
        table = new JTable(tablePaciente);
        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(380, 380));
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel,BorderLayout.CENTER);
    }


    public Object[][] convertDtoToData(List<PacienteDto> list) {
        Object[][] data = new Object[list.size()][6];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getDniPaciente();
            data[i][1] = list.get(i).getNombrePaciente();
            data[i][2] = list.get(i).getDomicilioPaciente();
            data[i][3] = list.get(i).getEmailPaciente();
            data[i][4] = list.get(i).getSexoPaciente();
            data[i][5] = list.get(i).getFechaNacimientoPaciente();
        }
        return data;
    }

    public void actionPerformed(ActionEvent ae) {

    }
    public void main(String[] args) throws Exception {
        TablePacientes myApp = new TablePacientes("Table Paciente");
        myApp.setVisible(true);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        setContentPane(myApp);
    }
}

