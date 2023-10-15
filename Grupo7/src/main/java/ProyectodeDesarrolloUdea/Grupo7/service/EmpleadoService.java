package ProyectodeDesarrolloUdea.Grupo7.service;


import ProyectodeDesarrolloUdea.Grupo7.entity.Empleado;
import ProyectodeDesarrolloUdea.Grupo7.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> getEmpleados(){
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> getEmpleado(Long id){
        return empleadoRepository.findById(id);
    }

    public void saveOrUpdate(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    public Empleado updateEmpleado(Empleado empleado){
        Empleado existingEmpleado = empleadoRepository.findById(empleado.getId()).orElse(null);
        existingEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        existingEmpleado.setEmail(empleado.getEmail());
        existingEmpleado.setEmpresaEmpleado(empleado.getEmpresaEmpleado());
        existingEmpleado.setRole(empleado.getRole());
        return empleadoRepository.save(existingEmpleado);
    }


    public void delete(Long id){
        empleadoRepository.deleteById(id);
    }

}
