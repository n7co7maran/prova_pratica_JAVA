package prova.java.Estudante_Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prova.java.Estudante_JPA.Estudante;

@Repository
public interface EstudanteRepository  extends JpaRepository<Estudante, Long> {

}
