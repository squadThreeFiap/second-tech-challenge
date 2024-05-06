package br.com.fiap.equipe3.secondtechchallenge.repository;

import br.com.fiap.equipe3.secondtechchallenge.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    boolean existsByPlate(String plate);
}
