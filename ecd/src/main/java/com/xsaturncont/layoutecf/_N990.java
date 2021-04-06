
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "qtd_lin"
})
public class _N990 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String qtd_lin;

    public String getReg() {
        return reg;
    }

    public String getQtd_lin() {
        return qtd_lin;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setQtd_lin(String qtd_lin) {
        this.qtd_lin = qtd_lin;
    }

}
