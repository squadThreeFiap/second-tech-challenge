package br.com.fiap.equipe3.secondtechchallenge.controllers.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class ValidateError extends StandardError {
    private final List<ValidateMessage> messages = new ArrayList<>();

    public ValidateError(Instant timestamp, Integer status, String error, String message, String path) {
        super(timestamp, status, error, message, path);
    }

    public void addMessages(String field, String message) {
        this.messages.add(new ValidateMessage(field, message));
    }
}
