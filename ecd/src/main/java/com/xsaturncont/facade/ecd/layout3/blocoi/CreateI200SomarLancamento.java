package com.xsaturncont.facade.ecd.layout3.blocoi;

import java.math.BigDecimal;
import java.util.List;

public class CreateI200SomarLancamento {

	public String getSomar(List<I250Aux> partidas) {
		BigDecimal totalDebito = new BigDecimal("0");
		BigDecimal totalCredito = new BigDecimal("0");

		for (I250Aux i250Aux : partidas) {
			BigDecimal valor = new BigDecimal(i250Aux.getValor());
			if (i250Aux.getNatureza().equals("D")) {
				totalDebito = totalDebito.add(valor);
			} else if (i250Aux.getNatureza().equals("C")) {
				totalCredito = totalCredito.add(valor);
			}
		}
		BigDecimal diferenca = totalDebito.subtract(totalCredito);
		if (diferenca.doubleValue() != 0) {
			throw new RuntimeException("Partida dobrada com diferença");
		}
		return totalDebito.toPlainString();
	}
}