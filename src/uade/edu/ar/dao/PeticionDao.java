package uade.edu.ar.dao;

import uade.edu.ar.model.Model;
import uade.edu.ar.model.Peticion;
import uade.edu.ar.util.GenericDAO;

public class PeticionDao extends GenericDAO<Peticion> {
    public PeticionDao(Class<Peticion> clase, String file) throws Exception {
        super(clase, file);
    }
}
