
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_e"
})
public class _E990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_e;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_e() {
        return qtd_lin_e;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_e(String qtd_lin_e) {
        this.qtd_lin_e = qtd_lin_e;
    }

}
