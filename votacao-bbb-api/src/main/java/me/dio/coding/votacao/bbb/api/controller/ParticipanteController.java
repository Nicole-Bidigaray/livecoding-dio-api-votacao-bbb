package me.dio.coding.votacao.bbb.api.controller;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParticipanteModel;
import me.dio.coding.votacao.bbb.api.repository.ParticipanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
@CrossOrigin
public class ParticipanteController {

    private final ParticipanteRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante) {
        ParticipanteModel entidade = repository.save(participante);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consulta")
    public ResponseEntity<ParticipanteModel> consulta(@RequestParam String id) {
        Optional<ParticipanteModel> opt = repository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(opt.get());
    }

    @GetMapping("/todos")
    public ResponseEntity<List<ParticipanteModel>> todos() {
        List<ParticipanteModel> list = repository.findAll();
        return ResponseEntity.ok(list);
    }
}
