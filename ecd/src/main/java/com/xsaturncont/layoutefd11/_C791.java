
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "uf",
    "vl_bc_icms_st",
    "vl_icms_st"
})
public class _C791 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String uf;
    @FieldDetail(number = 3)
    private String vl_bc_icms_st;
    @FieldDetail(number = 4)
    private String vl_icms_st;

    public String getReg() {
        return reg;
    }

    public String getUf() {
        return uf;
    }

    public String getVl_bc_icms_st() {
        return vl_bc_icms_st;
    }

    public String getVl_icms_st() {
        return vl_icms_st;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setVl_bc_icms_st(String vl_bc_icms_st) {
        this.vl_bc_icms_st = vl_bc_icms_st;
    }

    public void setVl_icms_st(String vl_icms_st) {
        this.vl_icms_st = vl_icms_st;
    }

}
