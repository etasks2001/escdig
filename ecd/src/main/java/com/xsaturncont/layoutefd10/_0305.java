
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_ccus",
    "func",
    "vida_util"
})
public class _0305 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_ccus;
    @FieldDetail(number = 3)
    private String func;
    @FieldDetail(number = 4)
    private String vida_util;

    public String getReg() {
        return reg;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getFunc() {
        return func;
    }

    public String getVida_util() {
        return vida_util;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public void setVida_util(String vida_util) {
        this.vida_util = vida_util;
    }

}
