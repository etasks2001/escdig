
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_sld_ini",
    "ind_vl_sld_ini",
    "vl_deb",
    "vl_cred",
    "vl_sld_fin",
    "ind_vl_sld_fin"
})
public class _E155 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String vl_sld_ini;
    @FieldDetail(number = 5)
    private String ind_vl_sld_ini;
    @FieldDetail(number = 6, required = true)
    private String vl_deb;
    @FieldDetail(number = 7, required = true)
    private String vl_cred;
    @FieldDetail(number = 8, required = true)
    private String vl_sld_fin;
    @FieldDetail(number = 9)
    private String ind_vl_sld_fin;

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

    public String getInd_vl_sld_ini() {
        return ind_vl_sld_ini;
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

    public String getInd_vl_sld_fin() {
        return ind_vl_sld_fin;
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

    public void setInd_vl_sld_ini(String ind_vl_sld_ini) {
        this.ind_vl_sld_ini = ind_vl_sld_ini;
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

    public void setInd_vl_sld_fin(String ind_vl_sld_fin) {
        this.ind_vl_sld_fin = ind_vl_sld_fin;
    }

}
