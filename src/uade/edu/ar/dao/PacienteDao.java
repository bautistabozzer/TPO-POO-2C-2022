package uade.edu.ar.dao;

import uade.edu.ar.model.Paciente;
import uade.edu.ar.util.GenericDAO;

public class PacienteDao extends GenericDAO<Paciente> {

    public PacienteDao(Class<Paciente> clase, String file) throws Exception {
        super(clase, file);

    }
}
