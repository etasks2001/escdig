package com.xsaturncont.model;

public enum TipoDoCampo {
	C("C"), N("N"), CLASS("CLASS");
	private String tipo;

	private TipoDoCampo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public static TipoDoCampo fromValue(String value) {
		for (TipoDoCampo t : TipoDoCampo.values()) {
			if (t.getTipo().equals(value)) {
				return t;
			}
		}
		return null;
	}
}
