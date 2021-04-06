
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "_E110"
})
public class _E100 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private _E110 _E110;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public _E110 get_E110() {
        return _E110;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void set_E110(_E110 _E110) {
        this._E110 = _E110;
    }

}
