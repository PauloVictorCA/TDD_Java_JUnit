package br.com.tdd.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	//Ajuste salario de 3% que o desempenho for a desejar.
	//Ajuste salario de 15% que o desempenho for a bom.
	//Ajuste salario de 20% que o desempenho for a otimo.
	
	@Test
	public void reajusteDeTresPorcentoQuandoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Paulo", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	public void reajusteDeQuinzePorcentoQuandoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Paulo", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.Bom);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	public void reajusteDeVintePorcentoQuandoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Paulo", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.Otimo);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
