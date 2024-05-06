package br.com.fiap.equipe3.secondtechchallenge.models.dtos;

import br.com.fiap.equipe3.secondtechchallenge.models.enums.SchedulingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class SchedulingStatusDTO {
    private SchedulingStatus status;
    private LocalDateTime endsAt = null;

    SchedulingStatusDTO(SchedulingStatus status) {
        this.status = status;
    }
}
