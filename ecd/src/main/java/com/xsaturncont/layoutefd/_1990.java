
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_1"
})
public class _1990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_1;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_1() {
        return qtd_lin_1;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_1(String qtd_lin_1) {
        this.qtd_lin_1 = qtd_lin_1;
    }

}
