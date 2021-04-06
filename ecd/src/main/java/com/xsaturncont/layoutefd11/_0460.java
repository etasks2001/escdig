
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_obs",
    "txt"
})
public class _0460 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_obs;
    @FieldDetail(number = 3)
    private String txt;

    public String getReg() {
        return reg;
    }

    public String getCod_obs() {
        return cod_obs;
    }

    public String getTxt() {
        return txt;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

}
