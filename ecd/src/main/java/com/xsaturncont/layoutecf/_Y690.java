
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "mes",
    "vl_rec_bru"
})
public class _Y690 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String mes;
    @FieldDetail(number = 3, required = true)
    private String vl_rec_bru;

    public String getReg() {
        return reg;
    }

    public String getMes() {
        return mes;
    }

    public String getVl_rec_bru() {
        return vl_rec_bru;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setVl_rec_bru(String vl_rec_bru) {
        this.vl_rec_bru = vl_rec_bru;
    }

}
