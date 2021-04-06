package com.xsaturncont.facade.ecd.layout6.blocoi;

public class CreateI155IndicadorValor {

	private String valor;

	private String indicador;

	public CreateI155IndicadorValor(double value) {
		indicador = "D";
		if (value < 0) {
			indicador = "C";
		}

		if (value < 0) {
			value = value * -1;
		}
		this.valor = String.valueOf(value);

	}

	public String getIndicador() {
		return indicador;
	}

	public String getValor() {
		return valor;
	}
}