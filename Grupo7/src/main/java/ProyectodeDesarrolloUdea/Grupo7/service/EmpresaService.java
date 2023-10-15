package ProyectodeDesarrolloUdea.Grupo7.service;

import ProyectodeDesarrolloUdea.Grupo7.entity.Empresa;
import ProyectodeDesarrolloUdea.Grupo7.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmpresaService {
        @Autowired
        EmpresaRepository empresaRepository;

        public List<Empresa> getEmpresas(){
            return empresaRepository.findAll();
        }

        public Optional<Empresa> getEmpresa(Long id){
            return empresaRepository.findById(id);
        }

        public void saveOrUpdate(Empresa empresa){
            empresaRepository.save(empresa);
        }

        public Empresa updateEmpresa(Empresa empresa){
            Empresa existingEmpresa = empresaRepository.findById(empresa.getId()).orElse(null);
            existingEmpresa.setNombre(empresa.getNombre());
            existingEmpresa.setDireccion(empresa.getDireccion());
            existingEmpresa.setTelefono(empresa.getTelefono());
            existingEmpresa.setNit(empresa.getNit());
            return empresaRepository.save(existingEmpresa);
        }


        public void delete(Long id){
            empresaRepository.deleteById(id);
        }

}

