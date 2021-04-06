
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "saldo_in_icms",
    "som_parc",
    "vl_trib_exp",
    "vl_total",
    "ind_per_sai",
    "icms_aprop",
    "som_icms_oc",
    "_G125"
})
public class _G110 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String saldo_in_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String som_parc;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_trib_exp;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_total;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String ind_per_sai;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String icms_aprop;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String som_icms_oc;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private List<_G125> _G125;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public String getSaldo_in_icms() {
        return saldo_in_icms;
    }

    public String getSom_parc() {
        return som_parc;
    }

    public String getVl_trib_exp() {
        return vl_trib_exp;
    }

    public String getVl_total() {
        return vl_total;
    }

    public String getInd_per_sai() {
        return ind_per_sai;
    }

    public String getIcms_aprop() {
        return icms_aprop;
    }

    public String getSom_icms_oc() {
        return som_icms_oc;
    }

    public List<_G125> get_G125() {
        return _G125;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void setSaldo_in_icms(String saldo_in_icms) {
        this.saldo_in_icms = saldo_in_icms;
    }

    public void setSom_parc(String som_parc) {
        this.som_parc = som_parc;
    }

    public void setVl_trib_exp(String vl_trib_exp) {
        this.vl_trib_exp = vl_trib_exp;
    }

    public void setVl_total(String vl_total) {
        this.vl_total = vl_total;
    }

    public void setInd_per_sai(String ind_per_sai) {
        this.ind_per_sai = ind_per_sai;
    }

    public void setIcms_aprop(String icms_aprop) {
        this.icms_aprop = icms_aprop;
    }

    public void setSom_icms_oc(String som_icms_oc) {
        this.som_icms_oc = som_icms_oc;
    }

    public void set_G125(List<_G125> _G125) {
        this._G125 = _G125;
    }

}
