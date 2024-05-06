package br.com.fiap.equipe3.secondtechchallenge.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "conductors")
public class Conductor {
    @Id
    private String id;

    private String name;
    private String cpf;
    private String email;
    private String cellphone;
}
