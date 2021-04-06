
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_hist",
    "descr_hist"
})
public class _I075 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_hist;
    @FieldDetail(number = 3, required = true)
    private String descr_hist;

    public String getReg() {
        return reg;
    }

    public String getCod_hist() {
        return cod_hist;
    }

    public String getDescr_hist() {
        return descr_hist;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_hist(String cod_hist) {
        this.cod_hist = cod_hist;
    }

    public void setDescr_hist(String descr_hist) {
        this.descr_hist = descr_hist;
    }

}
