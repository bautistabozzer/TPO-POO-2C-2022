package uade.edu.ar.controller;

import uade.edu.ar.dao.PacienteDao;
import uade.edu.ar.dto.PacienteDto;
import uade.edu.ar.model.Paciente;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControllerPaciente {
    private static ControllerPaciente CONTROLLER = null;

    private static PacienteDao pacienteDao;

    private static List<Paciente> pacienteList;


    private ControllerPaciente(){}

    public static synchronized ControllerPaciente getInstances() throws Exception {
        if(CONTROLLER == null) {
            CONTROLLER = new ControllerPaciente();
            pacienteDao = new PacienteDao(Paciente.class, getPathOutPaciente(Paciente.class.getSimpleName()));
            pacienteList = pacienteDao.getAll(Paciente.class);
        }
        return CONTROLLER;
    }


    public void addPaciente(PacienteDto dto) throws Exception {
        if(getBydniPaciente(String.valueOf(dto.getDniPaciente())) == null){
            pacienteDao.save(toPaciente(dto));
        }
    }

    public PacienteDto getBydniPaciente(String dni) throws Exception {
        for (Paciente paciente: pacienteList) {
            if (Objects.equals(paciente.getDni(), dni)){
                return toDto(paciente);
            }
        }
        return  null;
    }


    public void deleteBydniPaciente(String dni){
        int index = getIndex(dni);
        if(index != -1){
            pacienteList.remove(index);
        }
    }

    private int getIndex(String dni){
        for (int i=0;i<pacienteList.size();i++){
            if(Objects.equals(pacienteList.get(i).getDni(), dni)){
                return i;
            }
        }
        return -1;
    }

    public List<PacienteDto> getAll() throws Exception {
        List<PacienteDto> dtoList = new ArrayList<>();
        for (Paciente paciente : pacienteDao.getAll(Paciente.class)) {
            dtoList.add(toDto(paciente));
        }
        return dtoList;
    }

    private static String getPathOutPaciente(String name){
        String dir = "D:\\Bautista Bozzer\\Desktop\\Educación\\#UADE\\Segundo Año\\2C2022\\Jue - Paradigma orientado a objetos\\TPs\\";
        return  new File(dir+name+".json").getPath();
    }

    public static Paciente toPaciente(PacienteDto dto){
        return new Paciente(dto.getDniPaciente(), dto.getNombrePaciente(), dto.getSexoPaciente(),dto.getDomicilioPaciente(), dto.getFechaNacimientoPaciente(),dto.getEmailPaciente());
    }

    public static PacienteDto toDto(Paciente paciente){
        return new PacienteDto(paciente.getDni(), paciente.getNombre(), paciente.getDomicilio(), paciente.getEmail(), paciente.getSexo(), paciente.getFechaNacimiento());
    }

    public void close() throws Exception{
        pacienteDao.saveAll(pacienteList);
    }


}
