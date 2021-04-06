
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "mes",
    "acres_patr"
})
public class _Y682 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String mes;
    @FieldDetail(number = 3, required = true)
    private String acres_patr;

    public String getReg() {
        return reg;
    }

    public String getMes() {
        return mes;
    }

    public String getAcres_patr() {
        return acres_patr;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAcres_patr(String acres_patr) {
        this.acres_patr = acres_patr;
    }

}
