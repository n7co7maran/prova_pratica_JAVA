package prova.java.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prova.java.Estudante_JPA.Estudante;
import prova.java.Service.EstudanteService;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping
    public ResponseEntity<Estudante> criar(@RequestBody Estudante estudante) {
        Estudante salvo = estudanteService.salvar(estudante);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Estudante>> listar() {
        return ResponseEntity.ok(estudanteService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> buscarPorId(@PathVariable Long id) {
        return estudanteService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estudanteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}