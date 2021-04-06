
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "unid",
    "descr"
})
public class _0190 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String unid;
    @FieldDetail(number = 3)
    private String descr;

    public String getReg() {
        return reg;
    }

    public String getUnid() {
        return unid;
    }

    public String getDescr() {
        return descr;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

}
