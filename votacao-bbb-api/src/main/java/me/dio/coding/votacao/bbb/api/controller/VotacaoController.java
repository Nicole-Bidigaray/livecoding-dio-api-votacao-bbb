package me.dio.coding.votacao.bbb.api.controller;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParticipanteModel;
import me.dio.coding.votacao.bbb.api.service.VotacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votacao")
@AllArgsConstructor
@CrossOrigin
public class VotacaoController {

    private final VotacaoService servico;

    @PostMapping
    public ResponseEntity<String> votar(@RequestBody ParticipanteModel participante) {
        servico.adicionarEvento(participante);
        return ResponseEntity.ok("voto computado");
    }
}
