
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_sd_ant_ipi",
    "vl_deb_ipi",
    "vl_cred_ipi",
    "vl_od_ipi",
    "vl_oc_ipi",
    "vl_sc_ipi",
    "vl_sd_ipi",
    "_E530"
})
public class _E520 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String vl_sd_ant_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String vl_deb_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String vl_cred_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String vl_od_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_oc_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_sc_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_sd_ipi;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private List<_E530> _E530;

    public String getReg() {
        return reg;
    }

    public String getVl_sd_ant_ipi() {
        return vl_sd_ant_ipi;
    }

    public String getVl_deb_ipi() {
        return vl_deb_ipi;
    }

    public String getVl_cred_ipi() {
        return vl_cred_ipi;
    }

    public String getVl_od_ipi() {
        return vl_od_ipi;
    }

    public String getVl_oc_ipi() {
        return vl_oc_ipi;
    }

    public String getVl_sc_ipi() {
        return vl_sc_ipi;
    }

    public String getVl_sd_ipi() {
        return vl_sd_ipi;
    }

    public List<_E530> get_E530() {
        return _E530;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_sd_ant_ipi(String vl_sd_ant_ipi) {
        this.vl_sd_ant_ipi = vl_sd_ant_ipi;
    }

    public void setVl_deb_ipi(String vl_deb_ipi) {
        this.vl_deb_ipi = vl_deb_ipi;
    }

    public void setVl_cred_ipi(String vl_cred_ipi) {
        this.vl_cred_ipi = vl_cred_ipi;
    }

    public void setVl_od_ipi(String vl_od_ipi) {
        this.vl_od_ipi = vl_od_ipi;
    }

    public void setVl_oc_ipi(String vl_oc_ipi) {
        this.vl_oc_ipi = vl_oc_ipi;
    }

    public void setVl_sc_ipi(String vl_sc_ipi) {
        this.vl_sc_ipi = vl_sc_ipi;
    }

    public void setVl_sd_ipi(String vl_sd_ipi) {
        this.vl_sd_ipi = vl_sd_ipi;
    }

    public void set_E530(List<_E530> _E530) {
        this._E530 = _E530;
    }

}
