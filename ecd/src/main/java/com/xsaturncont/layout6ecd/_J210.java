
package com.xsaturncont.layout6ecd;

import java.util.List;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = { "reg", "ind_tip", "cod_agl", "descr_cod_agl", "vl_cta_ini",
		"ind_dc_cta_ini", "vl_cta_fin", "ind_dc_cta_fin", "notas_exp_ref", "_J215" })
public class _J210 {

	@com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
	private String reg;
	@com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
	private String ind_tip;
	@com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
	private String cod_agl;
	@com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
	private String descr_cod_agl;
	@com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
	private String vl_cta_ini;
	@com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
	private String ind_dc_cta_ini;
	@com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
	private String vl_cta_fin;
	@com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
	private String ind_dc_cta_fin;
	@com.xsaturncont.annotation.FieldDetail(number = 9)
	private String notas_exp_ref;
	@com.xsaturncont.annotation.FieldDetail(number = 10)
	private List<_J215> _J215;

	public String getInd_dc_cta_fin() {
		return ind_dc_cta_fin;
	}

	public String getVl_cta_fin() {
		return vl_cta_fin;
	}

	public String getReg() {
		return reg;
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

	public String getVl_cta_ini() {
		return vl_cta_ini;
	}

	public String getInd_dc_cta_ini() {
		return ind_dc_cta_ini;
	}

	public String getNotas_exp_ref() {
		return notas_exp_ref;
	}

	public List<_J215> get_J215() {
		return _J215;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public void setInd_tip(String ind_tip) {
		this.ind_tip = ind_tip;
	}

	public void setCod_agl(String cod_agl) {
		this.cod_agl = cod_agl;
	}

	public void setDescr_cod_agl(String descr_cod_agl) {
		this.descr_cod_agl = descr_cod_agl;
	}

	public void setVl_cta_ini(String vl_cta_ini) {
		this.vl_cta_ini = vl_cta_ini;
	}

	public void setInd_dc_cta_ini(String ind_dc_cta_ini) {
		this.ind_dc_cta_ini = ind_dc_cta_ini;
	}

	public void setNotas_exp_ref(String notas_exp_ref) {
		this.notas_exp_ref = notas_exp_ref;
	}

	public void set_J215(List<_J215> _J215) {
		this._J215 = _J215;
	}

	public void setInd_dc_cta_fin(String ind_dc_cta_fin) {
		this.ind_dc_cta_fin = ind_dc_cta_fin;
	}

	public void setVl_cta_fin(String vl_cta_fin) {
		this.vl_cta_fin = vl_cta_fin;
	}
}
