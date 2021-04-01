package ecd.model;

public class ContaEcd {
    private int sk;
    private String cod_nat;
    private String nivel;
    private String cod_cta;
    private String cod_cta_sup;
    private String cod_cta_ref;
    private String cod_agl;

    public ContaEcd(int sk, String cod_nat, String nivel, String cod_cta, String cod_cta_sup, String cod_cta_ref, String cod_agl) {
	this.sk = sk;
	this.cod_nat = cod_nat;
	this.nivel = nivel;
	this.cod_cta = cod_cta;
	this.cod_cta_sup = cod_cta_sup;
	this.cod_cta_ref = cod_cta_ref;
	this.cod_agl = cod_agl;
    }

    public int getSk() {
	return sk;
    }

    public String getCod_nat() {
	return cod_nat;
    }

    public String getNivel() {
	return nivel;
    }

    public String getCod_cta() {
	return cod_cta;
    }

    public String getCod_cta_sup() {
	return cod_cta_sup;
    }

    public String getCod_cta_ref() {
	return cod_cta_ref;
    }

    public String getCod_agl() {
	return cod_agl;
    }

}
