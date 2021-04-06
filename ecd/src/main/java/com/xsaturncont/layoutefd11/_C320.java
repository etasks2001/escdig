
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cst_icms",
    "cfop",
    "aliq_icms",
    "vl_opr",
    "vl_bc_icms",
    "vl_icms",
    "vl_red_bc",
    "cod_obs",
    "_C321"
})
public class _C320 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cst_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cfop;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String aliq_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String vl_opr;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_bc_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_red_bc;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String cod_obs;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private List<_C321> _C321;

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

    public String getVl_red_bc() {
        return vl_red_bc;
    }

    public String getCod_obs() {
        return cod_obs;
    }

    public List<_C321> get_C321() {
        return _C321;
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

    public void setVl_red_bc(String vl_red_bc) {
        this.vl_red_bc = vl_red_bc;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    public void set_C321(List<_C321> _C321) {
        this._C321 = _C321;
    }

}
