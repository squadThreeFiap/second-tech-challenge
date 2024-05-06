package br.com.fiap.equipe3.secondtechchallenge.controllers.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidateMessage {
    private String field;
    private String message;
}
