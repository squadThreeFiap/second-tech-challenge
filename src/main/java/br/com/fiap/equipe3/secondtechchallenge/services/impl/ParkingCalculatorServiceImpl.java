package br.com.fiap.equipe3.secondtechchallenge.services.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import br.com.fiap.equipe3.secondtechchallenge.controllers.exception.InvalidContractingHoursException;
import br.com.fiap.equipe3.secondtechchallenge.services.ParkingCalculatorService;

@Component
public class ParkingCalculatorServiceImpl implements ParkingCalculatorService {

	private final Environment env = null;
	
    @Override
    public BigDecimal calculate(Integer hours) {
        int DECIMAL_PLACES = 2;

        if (hours > Integer.parseInt(env.getProperty("gov.parking.max.hours"))) {
            throw new InvalidContractingHoursException("Contrato de horas excede limite máximo permitido.");
        }

        BigDecimal parkingTaxesValue = new BigDecimal(env.getProperty("gov.parking.taxas"));
        BigDecimal hourValue = new BigDecimal(env.getProperty("gov.parking.each.hour"));
        BigDecimal liquidValue = hourValue.multiply(BigDecimal.valueOf(hours));

        BigDecimal totalValue = liquidValue.multiply(parkingTaxesValue);

        return totalValue.setScale(DECIMAL_PLACES, RoundingMode.UP);
    }
}
