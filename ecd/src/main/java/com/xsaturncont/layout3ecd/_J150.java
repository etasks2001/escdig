
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_agl",
    "nivel_agl",
    "descr_cod_agl",
    "vl_cta",
    "ind_vl"
})
public class _J150 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_agl;
    @FieldDetail(number = 3, required = true)
    private String nivel_agl;
    @FieldDetail(number = 4, required = true)
    private String descr_cod_agl;
    @FieldDetail(number = 5, required = true)
    private String vl_cta;
    @FieldDetail(number = 6, required = true)
    private String ind_vl;

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

    public String getVl_cta() {
        return vl_cta;
    }

    public String getInd_vl() {
        return ind_vl;
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

    public void setVl_cta(String vl_cta) {
        this.vl_cta = vl_cta;
    }

    public void setInd_vl(String ind_vl) {
        this.ind_vl = ind_vl;
    }

}
