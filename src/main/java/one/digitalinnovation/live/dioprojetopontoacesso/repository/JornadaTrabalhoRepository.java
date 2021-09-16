package one.digitalinnovation.live.dioprojetopontoacesso.repository;

import one.digitalinnovation.live.dioprojetopontoacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

}
