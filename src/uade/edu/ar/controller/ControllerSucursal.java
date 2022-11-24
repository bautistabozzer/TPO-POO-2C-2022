package uade.edu.ar.controller;

import uade.edu.ar.dao.SucursalDao;
import uade.edu.ar.dto.SucursalDto;
import uade.edu.ar.model.Sucursal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ControllerSucursal {
    private static ControllerSucursal CONTROLLER = null;

    private static SucursalDao sucursalDao;

    private static List<Sucursal> sucursalList;


    private ControllerSucursal(){}

    public static synchronized ControllerSucursal getInstances() throws Exception {
        if(CONTROLLER == null) {
            CONTROLLER = new ControllerSucursal();
            sucursalDao = new SucursalDao(Sucursal.class, getPathOutSucursal(Sucursal.class.getSimpleName()));
            sucursalList = sucursalDao.getAll(Sucursal.class);
        }
        return CONTROLLER;
    }


    public void addSucursal(SucursalDto dto) throws Exception {
        if(getBysucursalIdSucursal(String.valueOf(dto.getsucursalIdSucursal())) == null){
            sucursalDao.save(toSucursal(dto));
        }
    }

    public SucursalDto getBysucursalIdSucursal(String sucursalId) throws Exception {
        for (Sucursal sucursal: sucursalList) {
            if (sucursal.getSucursalId().equals(sucursalId)){
                return toDto(sucursal);
            }
        }
        return  null;
    }


    public void deleteBysucursalIdSucursal(String sucursalId){
        int index = getIndex(sucursalId);
        if(index != -1){
            sucursalList.remove(index);
        }
    }

    private int getIndex(String dni){
        for (int i=0;i<sucursalList.size();i++){
            if(sucursalList.get(i).getSucursalId().equals(dni)){
                return i;
            }
        }
        return -1;
    }

    public List<SucursalDto> getAll() throws Exception {
        List<SucursalDto> dtoList = new ArrayList<>();
        for (Sucursal sucursal : sucursalDao.getAll(Sucursal.class)) {
            dtoList.add(toDto(sucursal));
        }
        return dtoList;
    }

    private static String getPathOutSucursal(String name){
        String dir = "D:\\Bautista Bozzer\\Desktop\\Educación\\#UADE\\Segundo Año\\2C2022\\Jue - Paradigma orientado a objetos\\TPs\\";
        return  new File(dir+name+".json").getPath();
    }

    public static Sucursal toSucursal(SucursalDto dto){
        return new Sucursal(dto.getsucursalIdSucursal(), dto.getDireccionSucursal(),dto.getResponsableTecnicoSucursal());
    }

    public static SucursalDto toDto(Sucursal sucursal){
        return new SucursalDto(sucursal.getSucursalId(), sucursal.getDireccion(), sucursal.getResponsableTecnico());
    }

}
