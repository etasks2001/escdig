
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "_I151",
    "_I155"
})
public class _I150 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_I151> _I151;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_I155> _I155;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public java.util.List<_I151> get_I151() {
        return _I151;
    }

    public java.util.List<_I155> get_I155() {
        return _I155;
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

    public void set_I151(java.util.List<_I151> _I151) {
        this._I151 = _I151;
    }

    public void set_I155(java.util.List<_I155> _I155) {
        this._I155 = _I155;
    }

}
