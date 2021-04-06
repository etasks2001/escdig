
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "per_apur",
    "_L100",
    "_L200",
    "_L210",
    "_L300"
})
public class _L030 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String per_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_L100> _L100;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_L200> _L200;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_L210> _L210;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_L300> _L300;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public String getPer_apur() {
        return per_apur;
    }

    public java.util.List<_L100> get_L100() {
        return _L100;
    }

    public java.util.List<_L200> get_L200() {
        return _L200;
    }

    public java.util.List<_L210> get_L210() {
        return _L210;
    }

    public java.util.List<_L300> get_L300() {
        return _L300;
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

    public void setPer_apur(String per_apur) {
        this.per_apur = per_apur;
    }

    public void set_L100(java.util.List<_L100> _L100) {
        this._L100 = _L100;
    }

    public void set_L200(java.util.List<_L200> _L200) {
        this._L200 = _L200;
    }

    public void set_L210(java.util.List<_L210> _L210) {
        this._L210 = _L210;
    }

    public void set_L300(java.util.List<_L300> _L300) {
        this._L300 = _L300;
    }

}
