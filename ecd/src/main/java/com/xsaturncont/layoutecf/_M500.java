
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta_b",
    "cod_tributo",
    "sd_ini_lal",
    "ind_sd_ini_lal",
    "vl_lcto_parte_a",
    "ind_vl_lcto_parte_a",
    "vl_lcto_parte_b",
    "ind_vl_lcto_parte_b",
    "sd_fim_lal",
    "ind_sd_fim_lal"
})
public class _M500 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta_b;
    @FieldDetail(number = 3, required = true)
    private String cod_tributo;
    @FieldDetail(number = 4, required = true)
    private String sd_ini_lal;
    @FieldDetail(number = 5, required = true)
    private String ind_sd_ini_lal;
    @FieldDetail(number = 6, required = true)
    private String vl_lcto_parte_a;
    @FieldDetail(number = 7, required = true)
    private String ind_vl_lcto_parte_a;
    @FieldDetail(number = 8, required = true)
    private String vl_lcto_parte_b;
    @FieldDetail(number = 9, required = true)
    private String ind_vl_lcto_parte_b;
    @FieldDetail(number = 10, required = true)
    private String sd_fim_lal;
    @FieldDetail(number = 11, required = true)
    private String ind_sd_fim_lal;

    public String getReg() {
        return reg;
    }

    public String getCod_cta_b() {
        return cod_cta_b;
    }

    public String getCod_tributo() {
        return cod_tributo;
    }

    public String getSd_ini_lal() {
        return sd_ini_lal;
    }

    public String getInd_sd_ini_lal() {
        return ind_sd_ini_lal;
    }

    public String getVl_lcto_parte_a() {
        return vl_lcto_parte_a;
    }

    public String getInd_vl_lcto_parte_a() {
        return ind_vl_lcto_parte_a;
    }

    public String getVl_lcto_parte_b() {
        return vl_lcto_parte_b;
    }

    public String getInd_vl_lcto_parte_b() {
        return ind_vl_lcto_parte_b;
    }

    public String getSd_fim_lal() {
        return sd_fim_lal;
    }

    public String getInd_sd_fim_lal() {
        return ind_sd_fim_lal;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta_b(String cod_cta_b) {
        this.cod_cta_b = cod_cta_b;
    }

    public void setCod_tributo(String cod_tributo) {
        this.cod_tributo = cod_tributo;
    }

    public void setSd_ini_lal(String sd_ini_lal) {
        this.sd_ini_lal = sd_ini_lal;
    }

    public void setInd_sd_ini_lal(String ind_sd_ini_lal) {
        this.ind_sd_ini_lal = ind_sd_ini_lal;
    }

    public void setVl_lcto_parte_a(String vl_lcto_parte_a) {
        this.vl_lcto_parte_a = vl_lcto_parte_a;
    }

    public void setInd_vl_lcto_parte_a(String ind_vl_lcto_parte_a) {
        this.ind_vl_lcto_parte_a = ind_vl_lcto_parte_a;
    }

    public void setVl_lcto_parte_b(String vl_lcto_parte_b) {
        this.vl_lcto_parte_b = vl_lcto_parte_b;
    }

    public void setInd_vl_lcto_parte_b(String ind_vl_lcto_parte_b) {
        this.ind_vl_lcto_parte_b = ind_vl_lcto_parte_b;
    }

    public void setSd_fim_lal(String sd_fim_lal) {
        this.sd_fim_lal = sd_fim_lal;
    }

    public void setInd_sd_fim_lal(String ind_sd_fim_lal) {
        this.ind_sd_fim_lal = ind_sd_fim_lal;
    }

}
