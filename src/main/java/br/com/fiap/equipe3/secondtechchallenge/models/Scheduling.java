package br.com.fiap.equipe3.secondtechchallenge.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "schedulings")
public class Scheduling {
    @Id
    private String id;

    private Integer contractedHours;

    private LocalDateTime startDate;

    @Indexed
    private String vehiclePlate;

    private Payment payment;

    @Version
    private Long version;
}
