
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_k"
})
public class _K990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_k;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_k() {
        return qtd_lin_k;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_k(String qtd_lin_k) {
        this.qtd_lin_k = qtd_lin_k;
    }

}
