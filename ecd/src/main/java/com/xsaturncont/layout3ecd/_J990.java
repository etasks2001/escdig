
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_j"
})
public class _J990 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String qtd_lin_j;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_j() {
        return qtd_lin_j;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_j(String qtd_lin_j) {
        this.qtd_lin_j = qtd_lin_j;
    }

}
