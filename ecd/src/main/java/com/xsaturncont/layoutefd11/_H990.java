
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin_h"
})
public class _H990 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String qtd_lin_h;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin_h() {
        return qtd_lin_h;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin_h(String qtd_lin_h) {
        this.qtd_lin_h = qtd_lin_h;
    }

}
