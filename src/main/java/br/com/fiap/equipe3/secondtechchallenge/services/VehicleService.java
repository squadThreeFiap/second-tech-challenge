package br.com.fiap.equipe3.secondtechchallenge.services;

import br.com.fiap.equipe3.secondtechchallenge.models.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle conductor);

    List<Vehicle> findAll();

    Vehicle findById(String plate);

    Vehicle update(Vehicle vehicle);

}
