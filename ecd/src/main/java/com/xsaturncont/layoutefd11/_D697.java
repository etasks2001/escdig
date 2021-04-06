
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "uf",
    "vl_bc_icms",
    "vl_icms"
})
public class _D697 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String uf;
    @FieldDetail(number = 3)
    private String vl_bc_icms;
    @FieldDetail(number = 4)
    private String vl_icms;

    public String getReg() {
        return reg;
    }

    public String getUf() {
        return uf;
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

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

}
