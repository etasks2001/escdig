
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cst_icms",
    "bc_icms",
    "vl_icms"
})
public class _H020 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cst_icms;
    @FieldDetail(number = 3)
    private String bc_icms;
    @FieldDetail(number = 4)
    private String vl_icms;

    public String getReg() {
        return reg;
    }

    public String getCst_icms() {
        return cst_icms;
    }

    public String getBc_icms() {
        return bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    public void setBc_icms(String bc_icms) {
        this.bc_icms = bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

}
