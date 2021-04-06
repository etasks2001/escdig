
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "oper",
    "uf"
})
public class _C105 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String oper;
    @FieldDetail(number = 3)
    private String uf;

    public String getReg() {
        return reg;
    }

    public String getOper() {
        return oper;
    }

    public String getUf() {
        return uf;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
