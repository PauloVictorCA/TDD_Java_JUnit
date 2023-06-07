package br.com.tdd.service;

import java.math.BigDecimal;

import br.com.tdd.enums.DesempenhoEnum;
import br.com.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, DesempenhoEnum desempenho) {
		BigDecimal percentualReajuste = desempenho.percentualReajuste();
		BigDecimal valorAtualReajustado = funcionario.getSalario().multiply(percentualReajuste);
		funcionario.reajustarSalario(valorAtualReajustado);
	}
}
