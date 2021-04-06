
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_rel",
    "dt_ini_rel",
    "dt_fin_rel"
})
public class _0180 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_rel;
    @FieldDetail(number = 3, required = true)
    private String dt_ini_rel;
    @FieldDetail(number = 4)
    private String dt_fin_rel;

    public String getReg() {
        return reg;
    }

    public String getCod_rel() {
        return cod_rel;
    }

    public String getDt_ini_rel() {
        return dt_ini_rel;
    }

    public String getDt_fin_rel() {
        return dt_fin_rel;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_rel(String cod_rel) {
        this.cod_rel = cod_rel;
    }

    public void setDt_ini_rel(String dt_ini_rel) {
        this.dt_ini_rel = dt_ini_rel;
    }

    public void setDt_fin_rel(String dt_fin_rel) {
        this.dt_fin_rel = dt_fin_rel;
    }

}
