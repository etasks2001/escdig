package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = { "reg", "nu_ordem", "cod_agl", "ind_cod_agl", "nivel_agl",
		"cod_agl_sup", "descr_cod_agl", "vl_cta_ini", "ind_dc_cta_ini", "vl_cta_fin", "ind_dc_cta_fin", "ind_grp_dre",
		"nota_exp_ref" })
public class _J150 {

	@FieldDetail(number = 1, required = true)
	private String reg;

	@FieldDetail(number = 2, required = true)
	private String nu_ordem;

	@FieldDetail(number = 3)
	private String cod_agl;
	@FieldDetail(number = 4)
	private String ind_cod_agl;
	@FieldDetail(number = 5, required = true)
	private String nivel_agl;
	@FieldDetail(number = 6, required = true)
	private String cod_agl_sup;
	@FieldDetail(number = 7, required = true)
	private String descr_cod_agl;

	@FieldDetail(number = 8, required = true)
	private String vl_cta_ini;
	@FieldDetail(number = 9, required = true)
	private String ind_dc_cta_ini;
	@FieldDetail(number = 10, required = true)
	private String vl_cta_fin;
	@FieldDetail(number = 11, required = true)
	private String ind_dc_cta_fin;

	@FieldDetail(number = 12, required = true)
	private String ind_grp_dre;
	@FieldDetail(number = 13)
	private String nota_exp_ref;

	public void setInd_dc_cta_fin(String ind_dc_cta_fin) {
		this.ind_dc_cta_fin = ind_dc_cta_fin;
	}

	public void setInd_dc_cta_ini(String ind_dc_cta_ini) {
		this.ind_dc_cta_ini = ind_dc_cta_ini;
	}

	public void setVl_cta_fin(String vl_cta_fin) {
		this.vl_cta_fin = vl_cta_fin;
	}

	public void setVl_cta_ini(String vl_cta_ini) {
		this.vl_cta_ini = vl_cta_ini;
	}

	public String getInd_dc_cta_fin() {
		return ind_dc_cta_fin;
	}

	public String getInd_dc_cta_ini() {
		return ind_dc_cta_ini;
	}

	public String getVl_cta_fin() {
		return vl_cta_fin;
	}

	public String getVl_cta_ini() {
		return vl_cta_ini;
	}

	public String getNu_ordem() {
		return nu_ordem;
	}

	public void setNu_ordem(String nu_ordem) {
		this.nu_ordem = nu_ordem;
	}

	public String getCod_agl_sup() {
		return cod_agl_sup;
	}

	public String getInd_cod_agl() {
		return ind_cod_agl;
	}

//	public String getInd_dc_cta() {
//		return ind_dc_cta;
//	}

	public String getInd_grp_dre() {
		return ind_grp_dre;
	}

	public String getReg() {
		return reg;
	}

	public String getCod_agl() {
		return cod_agl;
	}

	public String getNivel_agl() {
		return nivel_agl;
	}

	public String getDescr_cod_agl() {
		return descr_cod_agl;
	}

//	public String getVl_cta() {
//		return vl_cta;
//	}

	public String getNota_exp_ref() {
		return nota_exp_ref;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public void setCod_agl(String cod_agl) {
		this.cod_agl = cod_agl;
	}

	public void setNivel_agl(String nivel_agl) {
		this.nivel_agl = nivel_agl;
	}

	public void setDescr_cod_agl(String descr_cod_agl) {
		this.descr_cod_agl = descr_cod_agl;
	}

//	public void setVl_cta(String vl_cta) {
//		this.vl_cta = vl_cta;
//	}

	public void setNota_exp_ref(String nota_exp_ref) {
		this.nota_exp_ref = nota_exp_ref;
	}

	public void setCod_agl_sup(String cod_agl_sup) {
		this.cod_agl_sup = cod_agl_sup;
	}

	public void setInd_cod_agl(String ind_cod_agl) {
		this.ind_cod_agl = ind_cod_agl;
	}

//	public void setInd_dc_cta(String ind_dc_cta) {
//		this.ind_dc_cta = ind_dc_cta;
//	}

	public void setInd_grp_dre(String ind_grp_dre) {
		this.ind_grp_dre = ind_grp_dre;
	}
}
