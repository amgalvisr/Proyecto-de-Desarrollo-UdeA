package ProyectodeDesarrolloUdea.Grupo7.controller;


import ProyectodeDesarrolloUdea.Grupo7.entity.Empleado;
import ProyectodeDesarrolloUdea.Grupo7.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/empleado")
public class EmpleadoController {


    @Autowired
    private EmpleadoService empleadoService;


    @GetMapping
    public List<Empleado> getAll(){

        return empleadoService.getEmpleados();
    }

    @GetMapping("/{id}")
    public Optional<Empleado> getById(@PathVariable("id") Long id){

        return empleadoService.getEmpleado(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Empleado empleado){
        empleadoService.saveOrUpdate(empleado);
    }

    @PutMapping("/updateEmpleado")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){

        return empleadoService.updateEmpleado(empleado);
    }




    @DeleteMapping("/{id}")
    public void saveUpdate(@PathVariable("id") Long id){
        empleadoService.delete(id);
    }
}
