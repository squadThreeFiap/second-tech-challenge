package br.com.fiap.equipe3.secondtechchallenge.repository;

import br.com.fiap.equipe3.secondtechchallenge.models.Conductor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorsRepository extends MongoRepository<Conductor, String> {
}
