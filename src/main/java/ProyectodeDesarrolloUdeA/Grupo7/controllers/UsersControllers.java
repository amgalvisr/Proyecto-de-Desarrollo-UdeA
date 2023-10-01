package ProyectodeDesarrolloUdeA.Grupo7.controllers;
import ProyectodeDesarrolloUdeA.Grupo7.entity.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users/{id}")
@RestController
public class UsersControllers {

    // localhost:8082/

    @GetMapping
    public Empleado getEmpleado(@PathVariable Long id){
        Empleado empleado1 = new Empleado();
        empleado1.setId(id);
        empleado1.setNombreEmpleado("Ronald");
        empleado1.setEmail("ronald950garcia@gmail.com");
        empleado1.setEmpresaEmpleado("Beware");
        empleado1.setRole("Practicante");

        return empleado1;
    }
}
