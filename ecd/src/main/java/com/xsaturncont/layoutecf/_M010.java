
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta_b",
    "desc_cta_lal",
    "dt_ap_lal",
    "cod_lan_orig",
    "desc_lan_orig",
    "dt_lim_lal",
    "cod_tributo",
    "vl_saldo_ini",
    "ind_vl_saldo_ini",
    "cnpj_sit_esp"
})
public class _M010 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta_b;
    @FieldDetail(number = 3, required = true)
    private String desc_cta_lal;
    @FieldDetail(number = 4, required = true)
    private String dt_ap_lal;
    @FieldDetail(number = 5)
    private String cod_lan_orig;
    @FieldDetail(number = 6)
    private String desc_lan_orig;
    @FieldDetail(number = 7)
    private String dt_lim_lal;
    @FieldDetail(number = 8, required = true)
    private String cod_tributo;
    @FieldDetail(number = 9, required = true)
    private String vl_saldo_ini;
    @FieldDetail(number = 10, required = true)
    private String ind_vl_saldo_ini;
    @FieldDetail(number = 11)
    private String cnpj_sit_esp;

    public String getReg() {
        return reg;
    }

    public String getCod_cta_b() {
        return cod_cta_b;
    }

    public String getDesc_cta_lal() {
        return desc_cta_lal;
    }

    public String getDt_ap_lal() {
        return dt_ap_lal;
    }

    public String getCod_lan_orig() {
        return cod_lan_orig;
    }

    public String getDesc_lan_orig() {
        return desc_lan_orig;
    }

    public String getDt_lim_lal() {
        return dt_lim_lal;
    }

    public String getCod_tributo() {
        return cod_tributo;
    }

    public String getVl_saldo_ini() {
        return vl_saldo_ini;
    }

    public String getInd_vl_saldo_ini() {
        return ind_vl_saldo_ini;
    }

    public String getCnpj_sit_esp() {
        return cnpj_sit_esp;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta_b(String cod_cta_b) {
        this.cod_cta_b = cod_cta_b;
    }

    public void setDesc_cta_lal(String desc_cta_lal) {
        this.desc_cta_lal = desc_cta_lal;
    }

    public void setDt_ap_lal(String dt_ap_lal) {
        this.dt_ap_lal = dt_ap_lal;
    }

    public void setCod_lan_orig(String cod_lan_orig) {
        this.cod_lan_orig = cod_lan_orig;
    }

    public void setDesc_lan_orig(String desc_lan_orig) {
        this.desc_lan_orig = desc_lan_orig;
    }

    public void setDt_lim_lal(String dt_lim_lal) {
        this.dt_lim_lal = dt_lim_lal;
    }

    public void setCod_tributo(String cod_tributo) {
        this.cod_tributo = cod_tributo;
    }

    public void setVl_saldo_ini(String vl_saldo_ini) {
        this.vl_saldo_ini = vl_saldo_ini;
    }

    public void setInd_vl_saldo_ini(String ind_vl_saldo_ini) {
        this.ind_vl_saldo_ini = ind_vl_saldo_ini;
    }

    public void setCnpj_sit_esp(String cnpj_sit_esp) {
        this.cnpj_sit_esp = cnpj_sit_esp;
    }

}
