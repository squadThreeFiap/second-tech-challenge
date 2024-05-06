package br.com.fiap.equipe3.secondtechchallenge.services;

import java.util.List;

import br.com.fiap.equipe3.secondtechchallenge.models.Scheduling;
import br.com.fiap.equipe3.secondtechchallenge.models.dtos.SchedulingStatusDTO;

public interface SchedulingService {
    Scheduling save(Scheduling scheduling);

    List<Scheduling> findAll();

    Scheduling findById(String id);

    Scheduling update(Scheduling scheduling);

    SchedulingStatusDTO findSchedulingStatusByPlate(String plate);
}
