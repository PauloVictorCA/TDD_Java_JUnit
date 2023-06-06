package br.com.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
    public void bonusExisteComSalarioIgualouMenorQueDezPorcento() {
    	 BonusService service = new BonusService();
    	 BigDecimal bonus = service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("10000")));

         assertEquals(new BigDecimal("1000.0"), bonus);
    }

}
