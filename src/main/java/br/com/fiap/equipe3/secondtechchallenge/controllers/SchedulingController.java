package br.com.fiap.equipe3.secondtechchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.equipe3.secondtechchallenge.models.Scheduling;
import br.com.fiap.equipe3.secondtechchallenge.models.dtos.SchedulingStatusDTO;
import br.com.fiap.equipe3.secondtechchallenge.services.SchedulingService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(info = @Info(
        title = "Parquímetro API",
        description = "API desenvolvida com o objetivo de reescrever um sistema de " +
                "parquímetro visando otimização e alto desempenho durante o Tech Challenge " +
                "da Fase 2 na Pos Tech FIAP em Arquitetura e Desenvolvimento Java.",
        version = "1.0.0")
)
@Tag(
        name = "Agendamentos [SchedulingController]",
        description = "Controlador encarregado de fornecer requisições associadas ao" +
                " agendamento no sistema de parquímetro."
)
@RestController
@RequestMapping("/schedulings")
public class SchedulingController {

    @Autowired
    private SchedulingService schedulingService;

    @PostMapping
    @Operation(summary = "Endpoint para registrar o agendamento no parquimetro.")
    public ResponseEntity<Scheduling> save(@RequestBody Scheduling scheduling) {
        Scheduling savedScheduling = this.schedulingService.save(scheduling);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedScheduling);
    }

    @GetMapping
    @Operation(summary = "Listagem de todos os agendamentos no parquimetro.")
    public ResponseEntity<List<Scheduling>> findAll() {
        var schedulingList = this.schedulingService.findAll();

        return ResponseEntity.ok(schedulingList);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Listagem do agendamento no parquimetro por id.")
    public ResponseEntity<Scheduling> findBy(@PathVariable String id) {
        Scheduling foundedScheduling = this.schedulingService.findById(id);

        return ResponseEntity.ok(foundedScheduling);
    }

    @GetMapping("/{plate}/status")
    @Operation(summary = "Verificação de status baseado no último agendamento do parquimetro através da placa.")
    public ResponseEntity<SchedulingStatusDTO> checkSchedulingStatusByPlate(@PathVariable String plate) {
        SchedulingStatusDTO schedulingStatusDTO = this.schedulingService.findSchedulingStatusByPlate(plate);

        return ResponseEntity.ok(schedulingStatusDTO);
    }

    @PutMapping
    @Operation(summary = "Recurso para atualização de agendamentos.")
    public ResponseEntity<Scheduling> update(@RequestBody Scheduling scheduling) {
        return ResponseEntity.ok(this.schedulingService.update(scheduling));
    }
}
