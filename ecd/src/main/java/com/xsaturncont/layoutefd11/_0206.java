
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_comb"
})
public class _0206 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_comb;

    public String getReg() {
        return reg;
    }

    public String getCod_comb() {
        return cod_comb;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_comb(String cod_comb) {
        this.cod_comb = cod_comb;
    }

}
