
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item_ipm",
    "mun",
    "valor"
})
public class _1400 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_item_ipm;
    @FieldDetail(number = 3)
    private String mun;
    @FieldDetail(number = 4)
    private String valor;

    public String getReg() {
        return reg;
    }

    public String getCod_item_ipm() {
        return cod_item_ipm;
    }

    public String getMun() {
        return mun;
    }

    public String getValor() {
        return valor;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item_ipm(String cod_item_ipm) {
        this.cod_item_ipm = cod_item_ipm;
    }

    public void setMun(String mun) {
        this.mun = mun;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
