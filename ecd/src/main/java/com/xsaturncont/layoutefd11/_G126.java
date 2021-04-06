
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fim",
    "num_parc",
    "vl_parc_pass",
    "vl_trib_oc",
    "vl_total",
    "ind_per_sai",
    "vl_parc_aprop"
})
public class _G126 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_ini;
    @FieldDetail(number = 3)
    private String dt_fim;
    @FieldDetail(number = 4)
    private String num_parc;
    @FieldDetail(number = 5)
    private String vl_parc_pass;
    @FieldDetail(number = 6)
    private String vl_trib_oc;
    @FieldDetail(number = 7)
    private String vl_total;
    @FieldDetail(number = 8)
    private String ind_per_sai;
    @FieldDetail(number = 9)
    private String vl_parc_aprop;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fim() {
        return dt_fim;
    }

    public String getNum_parc() {
        return num_parc;
    }

    public String getVl_parc_pass() {
        return vl_parc_pass;
    }

    public String getVl_trib_oc() {
        return vl_trib_oc;
    }

    public String getVl_total() {
        return vl_total;
    }

    public String getInd_per_sai() {
        return ind_per_sai;
    }

    public String getVl_parc_aprop() {
        return vl_parc_aprop;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fim(String dt_fim) {
        this.dt_fim = dt_fim;
    }

    public void setNum_parc(String num_parc) {
        this.num_parc = num_parc;
    }

    public void setVl_parc_pass(String vl_parc_pass) {
        this.vl_parc_pass = vl_parc_pass;
    }

    public void setVl_trib_oc(String vl_trib_oc) {
        this.vl_trib_oc = vl_trib_oc;
    }

    public void setVl_total(String vl_total) {
        this.vl_total = vl_total;
    }

    public void setInd_per_sai(String ind_per_sai) {
        this.ind_per_sai = ind_per_sai;
    }

    public void setVl_parc_aprop(String vl_parc_aprop) {
        this.vl_parc_aprop = vl_parc_aprop;
    }

}
