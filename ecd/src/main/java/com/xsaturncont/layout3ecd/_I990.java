
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_i"
})
public class _I990 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String qtd_lin_i;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_i() {
        return qtd_lin_i;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_i(String qtd_lin_i) {
        this.qtd_lin_i = qtd_lin_i;
    }

}
