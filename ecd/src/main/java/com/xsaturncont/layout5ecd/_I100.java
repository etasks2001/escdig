
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_alt",
    "cod_ccus",
    "ccus"
})
public class _I100 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String dt_alt;
    @FieldDetail(number = 3, required = true)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String ccus;

    public String getReg() {
        return reg;
    }

    public String getDt_alt() {
        return dt_alt;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getCcus() {
        return ccus;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_alt(String dt_alt) {
        this.dt_alt = dt_alt;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
    }

}
