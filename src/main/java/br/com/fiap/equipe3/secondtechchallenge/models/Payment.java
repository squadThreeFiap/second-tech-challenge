package br.com.fiap.equipe3.secondtechchallenge.models;

import br.com.fiap.equipe3.secondtechchallenge.models.enums.PaymentStatus;
import br.com.fiap.equipe3.secondtechchallenge.models.enums.PaymentType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Payment {
    private BigDecimal value;

    private PaymentType type;
    
    private LocalDateTime realizationDate;

    private PaymentStatus status;
}
