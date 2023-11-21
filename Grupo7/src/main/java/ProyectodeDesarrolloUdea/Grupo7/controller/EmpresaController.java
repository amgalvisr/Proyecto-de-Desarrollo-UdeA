package ProyectodeDesarrolloUdea.Grupo7.controller;


import ProyectodeDesarrolloUdea.Grupo7.entity.Empresa;
import ProyectodeDesarrolloUdea.Grupo7.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/empresa")
public class EmpresaController {


    @Autowired
    private EmpresaService empresaService;



    @GetMapping
    public List<Empresa> getAll(){

        return empresaService.getEmpresas();
    }

    @GetMapping("/{id}")
    public Optional<Empresa> getById(@PathVariable("id") Long id){
        return empresaService.getEmpresa(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Empresa empresa){
        empresaService.saveOrUpdate(empresa);
    }

    @PutMapping("/updateEmpresa")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){

        return empresaService.updateEmpresa(empresa);
    }




    @DeleteMapping("/{id}")
    public void saveUpdate(@PathVariable("id") Long id){
        empresaService.delete(id);
    }
}
