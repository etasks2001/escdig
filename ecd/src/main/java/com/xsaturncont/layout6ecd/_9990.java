
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_9"
})
public class _9990 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String qtd_lin_9;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_9() {
        return qtd_lin_9;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_9(String qtd_lin_9) {
        this.qtd_lin_9 = qtd_lin_9;
    }

}
