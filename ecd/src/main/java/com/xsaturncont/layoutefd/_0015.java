
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "uf_st",
    "ie_st"
})
public class _0015 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String uf_st;
    @FieldDetail(number = 3)
    private String ie_st;

    public String getReg() {
        return reg;
    }

    public String getUf_st() {
        return uf_st;
    }

    public String getIe_st() {
        return ie_st;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setUf_st(String uf_st) {
        this.uf_st = uf_st;
    }

    public void setIe_st(String ie_st) {
        this.ie_st = ie_st;
    }

}
