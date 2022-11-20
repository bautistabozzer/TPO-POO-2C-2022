package uade.edu.ar.controller;

import uade.edu.ar.dao.PeticionDao;
import uade.edu.ar.dto.PeticionDto;
import uade.edu.ar.model.Peticion;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


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
        if(getBypeticionIdPeticion(String.valueOf(dto.getPeticionIdPeticion())) == null){
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


    public void deleteBypeticionIdPeticion(String peticionId){
        int index = getIndex(peticionId);
        if(index != -1){
            peticionList.remove(index);
        }
    }

    private int getIndex(String peticionId){
        for (int i=0;i<peticionList.size();i++){
            if(peticionList.get(i).getPeticionId().equals(peticionId)){
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
        String dir = "D:\\Bautista Bozzer\\Desktop\\Educación\\#UADE\\Segundo Año\\2C2022\\Jue - Paradigma orientado a objetos\\TPs\\TPO-POO-2C-22";
        return  new File(dir+name+".json").getPath();
    }

    public static Peticion toPeticion(PeticionDto dto){
        return new Peticion(dto.getPeticionIdPeticion(), dto.getPacientePeticion(), dto.getPracticasAsociadasPeticion());
    }

    public static PeticionDto toDto(Peticion peticion){
        return new PeticionDto(peticion.getPeticionId(),peticion.getPacienteId(), peticion.getPracticasAsociadas(), peticion.getFechaEntrega(), peticion.getObraSocial(), peticion.getCantPracticas());
    }
}
