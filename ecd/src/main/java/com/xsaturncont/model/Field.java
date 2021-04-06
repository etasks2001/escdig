package com.xsaturncont.model;

public class Field {
	private String campo;

	private int numero;

	private TipoDoCampo tipoDoCampo;

	private int tamanho;

	private int decimal;

	private String valorValido;

	private boolean obrigatorio;

	private String descricao;

	private boolean varios;

	public Field(int numero, String campo, String descricao, TipoDoCampo tipoDoCampo, int tamanho, int decimal, String valorValido, boolean obrigatorio, boolean varios) {
		this.numero = numero;
		this.campo = campo;
		this.descricao = descricao;
		this.tipoDoCampo = tipoDoCampo;
		this.tamanho = tamanho;
		this.decimal = decimal;
		this.valorValido = valorValido;
		this.obrigatorio = obrigatorio;
		this.varios = varios;
	}

	public String getCampo() {
		return campo;
	}

	public int getNumero() {
		return numero;
	}

	public TipoDoCampo getTipoDoCampo() {
		return tipoDoCampo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getDecimal() {
		return decimal;
	}

	public String _getValorValido() {
		return valorValido;
	}

	public boolean isObrigatorio() {
		return obrigatorio;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isVarios() {
		return varios;
	}
}