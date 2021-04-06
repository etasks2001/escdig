
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_g"
})
public class _G990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_g;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_g() {
        return qtd_lin_g;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_g(String qtd_lin_g) {
        this.qtd_lin_g = qtd_lin_g;
    }

}
