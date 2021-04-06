
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_ccus",
    "cod_agl"
})
public class _I052 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_ccus;
    @FieldDetail(number = 3, required = true)
    private String cod_agl;

    public String getReg() {
        return reg;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getCod_agl() {
        return cod_agl;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setCod_agl(String cod_agl) {
        this.cod_agl = cod_agl;
    }

}
