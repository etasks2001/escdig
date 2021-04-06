package com.xsaturncont.facade.ecd.layout3.blocoi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.xsaturncont.util.Util;

public class CreateI150CalcularSaldoMensal {
	public Map<String, Double[]> calcularSaldoMensal(Map<String, Double> saldoInicial, Map<String, Double[]> valorMovimentoMensal) {
		Map<String, Double[]> saldoMensal = new HashMap<String, Double[]>();
		// System.out.println("----------------------------------------------------------------------------------");
		for (Map.Entry<String, Double> si : saldoInicial.entrySet()) {
			String conta = si.getKey();
			// if (conta.equals("4.1.04.01.0007")) {
			// System.out.println("fdas");
			// }
			Double valorInicial = si.getValue();

			Double[] movimentoMensal = valorMovimentoMensal.get(conta);
			Double[] saldosIniciais = new Double[] { 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d };

			saldosIniciais[0] = valorInicial;

			if (movimentoMensal == null) {
				Arrays.fill(saldosIniciais, valorInicial);
			} else {
				int i = 1;
				for (int k = 0; k < 12; k++) {
					// saldosIniciais[i] = valorInicial + movimentoMensal[k];
					saldosIniciais[i] = Util.soma(saldosIniciais[i - 1], movimentoMensal[k]);
					// valorInicial = new
					// BigDecimal(saldosIniciais[i]).doubleValue();
					i++;
				}
			}
			// System.out.println(conta + " : " +
			// Arrays.toString(saldosIniciais));
			saldoMensal.put(conta, saldosIniciais);
		}
		// System.out.println("----------------------------------------------------------------------------------");
		return saldoMensal;
	}
}