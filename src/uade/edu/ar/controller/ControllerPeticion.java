package uade.edu.ar.controller;

import uade.edu.ar.dao.PeticionDao;
import uade.edu.ar.dto.PeticionDto;
import uade.edu.ar.model.Peticion;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class ControllerPeticion {
    private static ControllerPeticion CONTROLLER = null;

    private static PeticionDao peticionDao;

    private static List<Peticion> peticionList;


    private ControllerPeticion(){}

    public static synchronized ControllerPeticion getInstances() throws Exception {
        if(CONTROLLER == null) {
            CONTROLLER = new ControllerPeticion();
            peticionDao = new PeticionDao(Peticion.class, getPathOutPeticion(Peticion.class.getSimpleName()));
            peticionList = peticionDao.getAll(Peticion.class);
        }
        return CONTROLLER;
    }


    public void addPeticion(PeticionDto dto) throws Exception {
        if(getBypeticionIdPeticion(dto.getPeticionIdPeticion()) == null){
            peticionDao.save(toPeticion(dto));
        }
    }

    public PeticionDto getBypeticionIdPeticion(String peticionId) throws Exception {
        for (Peticion peticion: peticionList) {
            if (peticion.getPeticionId().equals(peticionId)){
                return toDto(peticion);
            }
        }
        return  null;
    }


    public void deleteBypeticionIdPeticion(String peticionId) throws Exception {
        int index = getIndex(peticionId);
        if(index != -1) {
            peticionList.remove(index);
           // peticionDao.update(toPeticion());
        }
    }

    private int getIndex(String peticionId){
        for (int i=0;i<=peticionList.size();i++){
            if(Objects.equals(peticionList.get(i).getPeticionId(), peticionId)){
                return i;
            }
        }
        return -1;
    }

    public List<PeticionDto> getAll() throws Exception {
        List<PeticionDto> dtoList = new ArrayList<>();
        for (Peticion peticion : peticionDao.getAll(Peticion.class)) {
            dtoList.add(toDto(peticion));
        }
        return dtoList;
    }

    private static String getPathOutPeticion(String name){
        String dir = "E:\\UADE\\Segundo cuatrimestre 2022\\Paradigma orientado a objetos\\Trabajo practico";
        return  new File(dir+name+".json").getPath();
    }

    public static Peticion toPeticion(PeticionDto dto){
        return new Peticion(dto.getPeticionIdPeticion(), dto.getPacientePeticion(), dto.getPracticasAsociadasPeticion());
    }

    public static PeticionDto toDto(Peticion peticion){
        return new PeticionDto(peticion.getPeticionId(),peticion.getPacienteId(), peticion.getPracticasAsociadas());
    }
    public void close() throws Exception {
        peticionDao.saveAll(peticionList);
    }
}
