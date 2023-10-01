package ProyectodeDesarrolloUdeA.Grupo7.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseControllers {
    @GetMapping("/enterprise")
    public String empresaPrueba(){
        return "Prueba empresa";
    }
}
