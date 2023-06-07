package br.com.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroComSalariosAltos() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("25000"))));

	}

	@Test
	void bonusExisteComSalarioIgualouMenorQueDezPorcento() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
