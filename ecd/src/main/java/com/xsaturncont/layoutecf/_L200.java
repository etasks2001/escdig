
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_aval_estoq"
})
public class _L200 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String ind_aval_estoq;

    public String getReg() {
        return reg;
    }

    public String getInd_aval_estoq() {
        return ind_aval_estoq;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_aval_estoq(String ind_aval_estoq) {
        this.ind_aval_estoq = ind_aval_estoq;
    }

}
