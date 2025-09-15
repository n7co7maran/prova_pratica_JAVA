package prova.java.Service;

import org.springframework.stereotype.Service;
import prova.java.Estudante_JPA.Estudante;
import prova.java.Estudante_Repository.EstudanteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    private final EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public Estudante salvar(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> listarTodos() {
        return estudanteRepository.findAll();
    }

    public Optional<Estudante> buscarPorId(Long id) {
        return estudanteRepository.findById(id);
    }

    public void deletar(Long id) {
        estudanteRepository.deleteById(id);
    }

}