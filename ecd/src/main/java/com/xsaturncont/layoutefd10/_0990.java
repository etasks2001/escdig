
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_0"
})
public class _0990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_0;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_0() {
        return qtd_lin_0;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_0(String qtd_lin_0) {
        this.qtd_lin_0 = qtd_lin_0;
    }

}
