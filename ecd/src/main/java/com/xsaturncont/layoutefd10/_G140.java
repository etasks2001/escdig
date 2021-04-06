
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_item",
    "cod_item"
})
public class _G140 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_item;
    @FieldDetail(number = 3)
    private String cod_item;

    public String getReg() {
        return reg;
    }

    public String getNum_item() {
        return num_item;
    }

    public String getCod_item() {
        return cod_item;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_item(String num_item) {
        this.num_item = num_item;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

}
