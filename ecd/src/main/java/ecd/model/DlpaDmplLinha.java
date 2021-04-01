package ecd.model;

public class DlpaDmplLinha {
    private int sk;
    private int ano;
    private int codigoempresa;
    private int nu_ordem;
    private String ind_tip;
    private String cod_agl;
    private String descr_cod_agl;
    private double vl_cta_ini;
    private String ind_dc_cta_ini;
    private double vl_cta_fin;
    private String ind_dc_cta_fin;

    public DlpaDmplLinha(int sk, int ano, int codigoempresa, int nu_ordem, String ind_tip, String cod_agl, String descr_cod_agl, double vl_cta_ini, String ind_dc_cta_ini, double vl_cta_fin,
	    String ind_dc_cta_fin) {
	super();
	this.sk = sk;
	this.ano = ano;
	this.codigoempresa = codigoempresa;
	this.nu_ordem = nu_ordem;
	this.ind_tip = ind_tip;
	this.cod_agl = cod_agl;
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

    public String getInd_tip() {
	return ind_tip;
    }

    public String getCod_agl() {
	return cod_agl;
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
