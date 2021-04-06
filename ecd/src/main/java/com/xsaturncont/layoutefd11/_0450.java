
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_inf",
    "txt"
})
public class _0450 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_inf;
    @FieldDetail(number = 3)
    private String txt;

    public String getReg() {
        return reg;
    }

    public String getCod_inf() {
        return cod_inf;
    }

    public String getTxt() {
        return txt;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

}
