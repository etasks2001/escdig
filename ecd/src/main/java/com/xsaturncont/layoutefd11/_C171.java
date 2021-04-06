
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_tanque",
    "qtde"
})
public class _C171 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_tanque;
    @FieldDetail(number = 3)
    private String qtde;

    public String getReg() {
        return reg;
    }

    public String getNum_tanque() {
        return num_tanque;
    }

    public String getQtde() {
        return qtde;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_tanque(String num_tanque) {
        this.num_tanque = num_tanque;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

}
