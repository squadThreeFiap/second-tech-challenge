package br.com.fiap.equipe3.secondtechchallenge.controllers.exception;

public class InvalidContractingHoursException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidContractingHoursException(String message) {
        super(message);
    }
}
