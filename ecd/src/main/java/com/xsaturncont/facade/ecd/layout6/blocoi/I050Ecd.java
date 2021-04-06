package com.xsaturncont.facade.ecd.layout6.blocoi;

public class I050Ecd {
	private int sk;
	private int ano;
	private int codigoempresa;
	private String cod_cta;
	private String cod_cta_sup;
	private String cod_nat;
	private String nivel;
	private String cod_cta_ref;
	private String cod_agl;

	public I050Ecd(int sk, int ano, int codigoempresa, String cod_cta, String cod_cta_sup, String cod_nat, String nivel,
			String cod_cta_ref, String cod_agl) {
		super();
		this.sk = sk;
		this.ano = ano;
		this.codigoempresa = codigoempresa;
		this.cod_cta = cod_cta;
		this.cod_cta_sup = cod_cta_sup;
		this.cod_nat = cod_nat;
		this.nivel = nivel;
		this.cod_cta_ref = cod_cta_ref;
		this.cod_agl = cod_agl;
	}

	public int getSk() {
		return sk;
	}

	public int getAno() {
		return ano;
	}

	public int getCodigoempresa() {
		return codigoempresa;
	}

	public String getCod_cta() {
		return cod_cta;
	}

	public String getCod_cta_sup() {
		return cod_cta_sup;
	}

	public String getCod_nat() {
		return cod_nat;
	}

	public String getNivel() {
		return nivel;
	}

	public String getCod_cta_ref() {
		return cod_cta_ref;
	}

	public String getCod_agl() {
		return cod_agl;
	}

}
