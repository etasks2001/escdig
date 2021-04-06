
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_nat",
    "ind_cta",
    "nivel",
    "cod_cta",
    "cod_cta_sup",
    "cta",
    "_K210",
    "_K300"
})
public class _K200 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_nat;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String ind_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String nivel;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cod_cta_sup;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String cta;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_K210> _K210;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_K300> _K300;

    public String getReg() {
        return reg;
    }

    public String getCod_nat() {
        return cod_nat;
    }

    public String getInd_cta() {
        return ind_cta;
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

    public String getCta() {
        return cta;
    }

    public java.util.List<_K210> get_K210() {
        return _K210;
    }

    public java.util.List<_K300> get_K300() {
        return _K300;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
    }

    public void setInd_cta(String ind_cta) {
        this.ind_cta = ind_cta;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public void set_K210(java.util.List<_K210> _K210) {
        this._K210 = _K210;
    }

    public void set_K300(java.util.List<_K300> _K300) {
        this._K300 = _K300;
    }

}
