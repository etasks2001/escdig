
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_c"
})
public class _C990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_c;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_c() {
        return qtd_lin_c;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_c(String qtd_lin_c) {
        this.qtd_lin_c = qtd_lin_c;
    }

}
