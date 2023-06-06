package br.com.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroComSalariosAltos() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("25000")));
		
		assertEquals(BigDecimal.ZERO, bonus);
	}

}
