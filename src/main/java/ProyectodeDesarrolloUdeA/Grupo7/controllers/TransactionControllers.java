package ProyectodeDesarrolloUdeA.Grupo7.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionControllers {
    @GetMapping("/transaction")
    public String transactionPrueba(){
        return "Prueba Transaccion";
    }
}
