package com.xsaturncont.facade.ecd.layout4.blocoi;

public class I250Aux implements Comparable<I250Aux> {
	private String conta;

	private String dia;

	private String lote;

	private String documento;

	private String valor;

	private String natureza;

	private String historico;

	public I250Aux(String conta, String dia, String lote, String documento, String valor, String natureza, String historico) {
		this.conta = conta;
		this.dia = dia;
		this.lote = lote;
		this.documento = documento;
		this.valor = valor;
		this.natureza = natureza;
		this.historico = historico;
	}

	public String getConta() {
		return conta;
	}

	public String getDia() {
		return dia;
	}

	public String getLote() {
		return lote;
	}

	public String getDocumento() {
		return documento;
	}

	public String getValor() {
		return valor;
	}

	public String getNatureza() {
		return natureza;
	}

	public String getHistorico() {
		return historico;
	}

	@Override
	public int compareTo(I250Aux o) {
		return this.getDia().compareTo(o.getDia());
	}
}