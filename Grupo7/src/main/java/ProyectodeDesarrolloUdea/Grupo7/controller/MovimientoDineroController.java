package ProyectodeDesarrolloUdea.Grupo7.controller;


import ProyectodeDesarrolloUdea.Grupo7.entity.MovimientoDinero;
import ProyectodeDesarrolloUdea.Grupo7.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/movimientoDinero")
public class MovimientoDineroController {


    @Autowired
    private MovimientoDineroService movimientoDineroService;


    @GetMapping
    public List<MovimientoDinero> getAll(){
        return movimientoDineroService.getMovimientosDinero();
    }

    @GetMapping("/{id}")
    public Optional<MovimientoDinero> getById(@PathVariable("id") Long id){
        return movimientoDineroService.getMovimientoDinero(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody MovimientoDinero movimientoDinero){
        movimientoDineroService.saveOrUpdate(movimientoDinero);
    }

    @PutMapping("/updateMovimientoDinero")
    public MovimientoDinero updateMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){

        return movimientoDineroService.updateMovimientoDinero(movimientoDinero);
    }




    @DeleteMapping("/{id}")
    public void saveUpdate(@PathVariable("id") Long id){
        movimientoDineroService.delete(id);
    }
}

