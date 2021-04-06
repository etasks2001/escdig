
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_est",
    "cod_item",
    "qtd",
    "ind_est",
    "cod_part"
})
public class _K200 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_est;
    @FieldDetail(number = 3)
    private String cod_item;
    @FieldDetail(number = 4)
    private String qtd;
    @FieldDetail(number = 5)
    private String ind_est;
    @FieldDetail(number = 6)
    private String cod_part;

    public String getReg() {
        return reg;
    }

    public String getDt_est() {
        return dt_est;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd() {
        return qtd;
    }

    public String getInd_est() {
        return ind_est;
    }

    public String getCod_part() {
        return cod_part;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_est(String dt_est) {
        this.dt_est = dt_est;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void setInd_est(String ind_est) {
        this.ind_est = ind_est;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

}
