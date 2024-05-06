package br.com.fiap.equipe3.secondtechchallenge.controllers.exception;

public class InvalidPaymentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidPaymentException(String message) {
        super(message);
    }
}
