
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_alt",
    "cod_nat",
    "ind_cta",
    "n\u00edvel",
    "cod_cta",
    "cod_cta_sup",
    "cta",
    "_C051",
    "_C053"
})
public class _C050 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_alt;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String cod_nat;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String ind_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String nível;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String cod_cta_sup;
    @com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
    private String cta;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_C051> _C051;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_C053> _C053;

    public String getReg() {
        return reg;
    }

    public String getDt_alt() {
        return dt_alt;
    }

    public String getCod_nat() {
        return cod_nat;
    }

    public String getInd_cta() {
        return ind_cta;
    }

    public String getNível() {
        return nível;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_cta_sup() {
        return cod_cta_sup;
    }

    public String getCta() {
        return cta;
    }

    public java.util.List<_C051> get_C051() {
        return _C051;
    }

    public java.util.List<_C053> get_C053() {
        return _C053;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_alt(String dt_alt) {
        this.dt_alt = dt_alt;
    }

    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
    }

    public void setInd_cta(String ind_cta) {
        this.ind_cta = ind_cta;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setCod_cta_sup(String cod_cta_sup) {
        this.cod_cta_sup = cod_cta_sup;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public void set_C051(java.util.List<_C051> _C051) {
        this._C051 = _C051;
    }

    public void set_C053(java.util.List<_C053> _C053) {
        this._C053 = _C053;
    }

}
