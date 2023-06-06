package br.com.tdd.service;

import java.math.BigDecimal;

import br.com.tdd.enums.DesempenhoEnum;
import br.com.tdd.modelo.Funcionario;

public class ReajusteService {

	public BigDecimal concederReajuste(Funcionario funcionario, DesempenhoEnum desempenho) {
		BigDecimal valor = funcionario.getSalario();
		BigDecimal aumento = BigDecimal.ZERO;
		
		if(desempenho == DesempenhoEnum.A_DESEJAR) {
			aumento = valor.multiply(new BigDecimal("0.03"));
		}
		else if(desempenho == DesempenhoEnum.BOM) {
			aumento = valor.multiply(new BigDecimal("0.15"));
		}
		else {
			aumento = valor.multiply(new BigDecimal("0.20"));
		}
		funcionario.reajustarSalario(aumento);
		return valor;
	}
}
