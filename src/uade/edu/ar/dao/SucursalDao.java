package uade.edu.ar.dao;

import uade.edu.ar.model.Sucursal;
import uade.edu.ar.util.GenericDAO;

public class SucursalDao extends GenericDAO<Sucursal> {
    public SucursalDao(Class<Sucursal> clase, String file) throws Exception {
        super(clase, file);
    }
}


