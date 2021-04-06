
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cst_icms",
    "cfop",
    "aliq_icms",
    "vl_opr",
    "vl_bc_icms",
    "vl_icms",
    "cod_obs"
})
public class _C850 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cst_icms;
    @FieldDetail(number = 3)
    private String cfop;
    @FieldDetail(number = 4)
    private String aliq_icms;
    @FieldDetail(number = 5)
    private String vl_opr;
    @FieldDetail(number = 6)
    private String vl_bc_icms;
    @FieldDetail(number = 7)
    private String vl_icms;
    @FieldDetail(number = 8)
    private String cod_obs;

    public String getReg() {
        return reg;
    }

    public String getCst_icms() {
        return cst_icms;
    }

    public String getCfop() {
        return cfop;
    }

    public String getAliq_icms() {
        return aliq_icms;
    }

    public String getVl_opr() {
        return vl_opr;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public String getCod_obs() {
        return cod_obs;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    public void setVl_opr(String vl_opr) {
        this.vl_opr = vl_opr;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

}
