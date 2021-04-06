
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item_des",
    "qtd_des"
})
public class _K215 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_item_des;
    @FieldDetail(number = 3)
    private String qtd_des;

    public String getReg() {
        return reg;
    }

    public String getCod_item_des() {
        return cod_item_des;
    }

    public String getQtd_des() {
        return qtd_des;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item_des(String cod_item_des) {
        this.cod_item_des = cod_item_des;
    }

    public void setQtd_des(String qtd_des) {
        this.qtd_des = qtd_des;
    }

}
