package ecd.model;

public class BalancoLinha {
    private int sk;
    private int ano;
    private int codigoempresa;
    private int nu_ordem;
    private String cod_agl;
    private String ind_cod_agl;
    private int nivel_agl;
    private String cod_agl_sup;
    private String ind_grp_bal;
    private String descr_cod_agl;
    private double vl_cta_ini;
    private String ind_dc_cta_ini;
    private double vl_cta_fin;
    private String ind_dc_cta_fin;

    public BalancoLinha(int sk, int ano, int codigoempresa, int nu_ordem, String cod_agl, String ind_cod_agl, int nivel_agl, String cod_agl_sup, String ind_grp_bal, String descr_cod_agl, double vl_cta_ini,
	    String ind_dc_cta_ini, double vl_cta_fin, String ind_dc_cta_fin) {
	this.sk = sk;
	this.ano = ano;
	this.codigoempresa = codigoempresa;
	this.nu_ordem = nu_ordem;
	this.cod_agl = cod_agl;
	this.ind_cod_agl = ind_cod_agl;
	this.nivel_agl = nivel_agl;
	this.cod_agl_sup = cod_agl_sup;
	this.ind_grp_bal = ind_grp_bal;
	this.descr_cod_agl = descr_cod_agl;
	this.vl_cta_ini = vl_cta_ini;
	this.ind_dc_cta_ini = ind_dc_cta_ini;
	this.vl_cta_fin = vl_cta_fin;
	this.ind_dc_cta_fin = ind_dc_cta_fin;
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

    public int getNu_ordem() {
	return nu_ordem;
    }

    public String getCod_agl() {
	return cod_agl;
    }

    public String getInd_cod_agl() {
	return ind_cod_agl;
    }

    public int getNivel_agl() {
	return nivel_agl;
    }

    public String getCod_agl_sup() {
	return cod_agl_sup;
    }

    public String getInd_grp_bal() {
	return ind_grp_bal;
    }

    public String getDescr_cod_agl() {
	return descr_cod_agl;
    }

    public double getVl_cta_ini() {
	return vl_cta_ini;
    }

    public String getInd_dc_cta_ini() {
	return ind_dc_cta_ini;
    }

    public double getVl_cta_fin() {
	return vl_cta_fin;
    }

    public String getInd_dc_cta_fin() {
	return ind_dc_cta_fin;
    }

}
