
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item",
    "qtd_cons",
    "qtd_ret"
})
public class _K265 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_item;
    @FieldDetail(number = 3)
    private String qtd_cons;
    @FieldDetail(number = 4)
    private String qtd_ret;

    public String getReg() {
        return reg;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd_cons() {
        return qtd_cons;
    }

    public String getQtd_ret() {
        return qtd_ret;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd_cons(String qtd_cons) {
        this.qtd_cons = qtd_cons;
    }

    public void setQtd_ret(String qtd_ret) {
        this.qtd_ret = qtd_ret;
    }

}
