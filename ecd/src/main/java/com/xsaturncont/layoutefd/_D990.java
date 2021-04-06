
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_d"
})
public class _D990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_d;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_d() {
        return qtd_lin_d;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_d(String qtd_lin_d) {
        this.qtd_lin_d = qtd_lin_d;
    }

}
