
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "uf",
    "dt_ini",
    "dt_fin",
    "_E210"
})
public class _E200 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String uf;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private _E210 _E210;

    public String getReg() {
        return reg;
    }

    public String getUf() {
        return uf;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public _E210 get_E210() {
        return _E210;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void set_E210(_E210 _E210) {
        this._E210 = _E210;
    }

}
