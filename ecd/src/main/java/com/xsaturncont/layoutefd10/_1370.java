
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_bico",
    "cod_item",
    "num_tanque"
})
public class _1370 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_bico;
    @FieldDetail(number = 3)
    private String cod_item;
    @FieldDetail(number = 4)
    private String num_tanque;

    public String getReg() {
        return reg;
    }

    public String getNum_bico() {
        return num_bico;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getNum_tanque() {
        return num_tanque;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_bico(String num_bico) {
        this.num_bico = num_bico;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setNum_tanque(String num_tanque) {
        this.num_tanque = num_tanque;
    }

}
