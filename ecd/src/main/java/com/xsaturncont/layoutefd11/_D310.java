
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mun_orig",
    "vl_serv",
    "vl_bc_icms",
    "vl_icms"
})
public class _D310 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mun_orig;
    @FieldDetail(number = 3)
    private String vl_serv;
    @FieldDetail(number = 4)
    private String vl_bc_icms;
    @FieldDetail(number = 5)
    private String vl_icms;

    public String getReg() {
        return reg;
    }

    public String getCod_mun_orig() {
        return cod_mun_orig;
    }

    public String getVl_serv() {
        return vl_serv;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mun_orig(String cod_mun_orig) {
        this.cod_mun_orig = cod_mun_orig;
    }

    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

}
