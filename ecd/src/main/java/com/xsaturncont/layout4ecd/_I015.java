
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta_res"
})
public class _I015 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta_res;

    public String getReg() {
        return reg;
    }

    public String getCod_cta_res() {
        return cod_cta_res;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta_res(String cod_cta_res) {
        this.cod_cta_res = cod_cta_res;
    }

}
