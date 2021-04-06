
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_agl",
    "nivel_agl",
    "ind_grp_bal",
    "descr_cod_agl",
    "vl_cta",
    "ind_dc_bal",
    "vl_cta_ini",
    "ind_dc_bal_ini"
})
public class _J100 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_agl;
    @FieldDetail(number = 3, required = true)
    private String nivel_agl;
    @FieldDetail(number = 4, required = true)
    private String ind_grp_bal;
    @FieldDetail(number = 5, required = true)
    private String descr_cod_agl;
    @FieldDetail(number = 6, required = true)
    private String vl_cta;
    @FieldDetail(number = 7, required = true)
    private String ind_dc_bal;
    @FieldDetail(number = 8, required = true)
    private String vl_cta_ini;
    @FieldDetail(number = 9, required = true)
    private String ind_dc_bal_ini;

    public String getReg() {
        return reg;
    }

    public String getCod_agl() {
        return cod_agl;
    }

    public String getNivel_agl() {
        return nivel_agl;
    }

    public String getInd_grp_bal() {
        return ind_grp_bal;
    }

    public String getDescr_cod_agl() {
        return descr_cod_agl;
    }

    public String getVl_cta() {
        return vl_cta;
    }

    public String getInd_dc_bal() {
        return ind_dc_bal;
    }

    public String getVl_cta_ini() {
        return vl_cta_ini;
    }

    public String getInd_dc_bal_ini() {
        return ind_dc_bal_ini;
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

    public void setInd_grp_bal(String ind_grp_bal) {
        this.ind_grp_bal = ind_grp_bal;
    }

    public void setDescr_cod_agl(String descr_cod_agl) {
        this.descr_cod_agl = descr_cod_agl;
    }

    public void setVl_cta(String vl_cta) {
        this.vl_cta = vl_cta;
    }

    public void setInd_dc_bal(String ind_dc_bal) {
        this.ind_dc_bal = ind_dc_bal;
    }

    public void setVl_cta_ini(String vl_cta_ini) {
        this.vl_cta_ini = vl_cta_ini;
    }

    public void setInd_dc_bal_ini(String ind_dc_bal_ini) {
        this.ind_dc_bal_ini = ind_dc_bal_ini;
    }

}
