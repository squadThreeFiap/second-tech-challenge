package br.com.fiap.equipe3.secondtechchallenge.controllers;

import br.com.fiap.equipe3.secondtechchallenge.models.Vehicle;
import br.com.fiap.equipe3.secondtechchallenge.services.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Veículos [VehicleController]",
        description = "Controlador que administra dados dos veículos no sistema de parquímetro."
)
@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    @Operation(summary = "Recurso para registrar veículos no sistema.")
    public ResponseEntity<Vehicle> save(@Valid @RequestBody Vehicle vehicle) {
        Vehicle savedVehicle = this.vehicleService.save(vehicle);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedVehicle);
    }

    @GetMapping
    @Operation(summary = "Enpoint para listar veículos cadastrados.")
    public ResponseEntity<List<Vehicle>> findAll() {
        var vehicleList = this.vehicleService.findAll();

        return ResponseEntity.ok(vehicleList);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Funcionalidade para regatar um veículos cadastrados pela placa.")
    public ResponseEntity<Vehicle> findBy(@PathVariable String plate) {
        Vehicle foundedVehicle = this.vehicleService.findById(plate);

        return ResponseEntity.ok(foundedVehicle);
    }

    @PutMapping
    @Operation(summary = "Enpoint para atualizar informações de um veículos cadastrados anteriormente.")
    public ResponseEntity<Vehicle> update(@RequestBody Vehicle vehicle) {
        return ResponseEntity.ok(this.vehicleService.update(vehicle));
    }
}
