
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_carga",
    "vl_pass",
    "vl_fat",
    "ind_rat",
    "vl_icms_ant",
    "vl_bc_icms",
    "vl_icms_apur",
    "vl_bc_icms_apur",
    "vl_dif"
})
public class _1800 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String vl_carga;
    @FieldDetail(number = 3)
    private String vl_pass;
    @FieldDetail(number = 4)
    private String vl_fat;
    @FieldDetail(number = 5)
    private String ind_rat;
    @FieldDetail(number = 6)
    private String vl_icms_ant;
    @FieldDetail(number = 7)
    private String vl_bc_icms;
    @FieldDetail(number = 8)
    private String vl_icms_apur;
    @FieldDetail(number = 9)
    private String vl_bc_icms_apur;
    @FieldDetail(number = 10)
    private String vl_dif;

    public String getReg() {
        return reg;
    }

    public String getVl_carga() {
        return vl_carga;
    }

    public String getVl_pass() {
        return vl_pass;
    }

    public String getVl_fat() {
        return vl_fat;
    }

    public String getInd_rat() {
        return ind_rat;
    }

    public String getVl_icms_ant() {
        return vl_icms_ant;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms_apur() {
        return vl_icms_apur;
    }

    public String getVl_bc_icms_apur() {
        return vl_bc_icms_apur;
    }

    public String getVl_dif() {
        return vl_dif;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_carga(String vl_carga) {
        this.vl_carga = vl_carga;
    }

    public void setVl_pass(String vl_pass) {
        this.vl_pass = vl_pass;
    }

    public void setVl_fat(String vl_fat) {
        this.vl_fat = vl_fat;
    }

    public void setInd_rat(String ind_rat) {
        this.ind_rat = ind_rat;
    }

    public void setVl_icms_ant(String vl_icms_ant) {
        this.vl_icms_ant = vl_icms_ant;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms_apur(String vl_icms_apur) {
        this.vl_icms_apur = vl_icms_apur;
    }

    public void setVl_bc_icms_apur(String vl_bc_icms_apur) {
        this.vl_bc_icms_apur = vl_bc_icms_apur;
    }

    public void setVl_dif(String vl_dif) {
        this.vl_dif = vl_dif;
    }

}
