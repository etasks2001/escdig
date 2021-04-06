
package com.xsaturncont.layout6ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_sld_ini",
    "ind_dc_ini",
    "vl_deb",
    "vl_cred",
    "vl_sld_fin",
    "ind_dc_fin",
    "_I157"
})
public class _I155 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_ccus;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String vl_sld_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String ind_dc_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String vl_deb;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String vl_cred;
    @com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
    private String vl_sld_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String ind_dc_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private List<_I157> _I157;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getVl_sld_ini() {
        return vl_sld_ini;
    }

    public String getInd_dc_ini() {
        return ind_dc_ini;
    }

    public String getVl_deb() {
        return vl_deb;
    }

    public String getVl_cred() {
        return vl_cred;
    }

    public String getVl_sld_fin() {
        return vl_sld_fin;
    }

    public String getInd_dc_fin() {
        return ind_dc_fin;
    }

    public List<_I157> get_I157() {
        return _I157;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setVl_sld_ini(String vl_sld_ini) {
        this.vl_sld_ini = vl_sld_ini;
    }

    public void setInd_dc_ini(String ind_dc_ini) {
        this.ind_dc_ini = ind_dc_ini;
    }

    public void setVl_deb(String vl_deb) {
        this.vl_deb = vl_deb;
    }

    public void setVl_cred(String vl_cred) {
        this.vl_cred = vl_cred;
    }

    public void setVl_sld_fin(String vl_sld_fin) {
        this.vl_sld_fin = vl_sld_fin;
    }

    public void setInd_dc_fin(String ind_dc_fin) {
        this.ind_dc_fin = ind_dc_fin;
    }

    public void set_I157(List<_I157> _I157) {
        this._I157 = _I157;
    }

}
