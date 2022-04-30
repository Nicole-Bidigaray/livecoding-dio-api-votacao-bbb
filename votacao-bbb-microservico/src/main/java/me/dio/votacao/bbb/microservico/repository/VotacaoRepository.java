package me.dio.votacao.bbb.microservico.repository;

import me.dio.votacao.bbb.microservico.model.VotacaoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VotacaoRepository extends MongoRepository<VotacaoModel, String> {
}
