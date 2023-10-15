package ProyectodeDesarrolloUdea.Grupo7.service;

import ProyectodeDesarrolloUdea.Grupo7.entity.MovimientoDinero;
import ProyectodeDesarrolloUdea.Grupo7.repository.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovimientoDineroService {
        @Autowired
        MovimientoDineroRepository movimientoDineroRepository;

        public List<MovimientoDinero> getMovimientosDinero(){
            return movimientoDineroRepository.findAll();
        }

        public Optional<MovimientoDinero> getMovimientoDinero(Long id){
            return movimientoDineroRepository.findById(id);
        }

        public void saveOrUpdate(MovimientoDinero movimientoDinero){
            movimientoDineroRepository.save(movimientoDinero);
        }

        public MovimientoDinero updateMovimientoDinero(MovimientoDinero movimientoDinero){
            MovimientoDinero existingMovimientoDinero = movimientoDineroRepository.findById(movimientoDinero.getId()).orElse(null);
            existingMovimientoDinero.setMontoDinero(movimientoDinero.getMontoDinero());
            existingMovimientoDinero.setTipoOperacion(movimientoDinero.getTipoOperacion());
            existingMovimientoDinero.setConceptoDinero(movimientoDinero.getConceptoDinero());
            existingMovimientoDinero.setResponsableMovimiento(movimientoDinero.getResponsableMovimiento());
            return movimientoDineroRepository.save(existingMovimientoDinero);
        }


        public void delete(Long id){
            movimientoDineroRepository.deleteById(id);
        }
}
