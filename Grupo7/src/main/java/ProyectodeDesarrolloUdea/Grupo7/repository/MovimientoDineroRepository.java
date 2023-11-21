package ProyectodeDesarrolloUdea.Grupo7.repository;


import ProyectodeDesarrolloUdea.Grupo7.entity.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
}
