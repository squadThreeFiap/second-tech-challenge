package br.com.fiap.equipe3.secondtechchallenge.controllers;

import br.com.fiap.equipe3.secondtechchallenge.services.ParkingCalculatorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Tag(
        name = "Parquímetro [ParkingController]",
        description = "Controlador responsavel por gerenciar informações gerais do sistema de parquímetro."
)
@RestController
@RequestMapping("/parkings")
public class ParkingController {

    @Autowired
    private ParkingCalculatorService parkingCalculatorService;

    @GetMapping("/calculate")
    @Operation(summary = "Retona o calculo do valor total a pagar pelas horas reservadas.")
    public ResponseEntity<BigDecimal> calculateParkingByHour(@RequestParam("hours") Integer hour) {
        return ResponseEntity.ok(this.parkingCalculatorService.calculate(hour));
    }
}
