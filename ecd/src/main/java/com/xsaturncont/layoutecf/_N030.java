
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "per_apur",
    "_N500",
    "_N600",
    "_N610",
    "_N615",
    "_N620",
    "_N630",
    "_N650",
    "_N660",
    "_N670"
})
public class _N030 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String per_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_N500> _N500;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_N600> _N600;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_N610> _N610;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_N615> _N615;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_N620> _N620;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_N630> _N630;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private java.util.List<_N650> _N650;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private java.util.List<_N660> _N660;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private java.util.List<_N670> _N670;

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

    public java.util.List<_N500> get_N500() {
        return _N500;
    }

    public java.util.List<_N600> get_N600() {
        return _N600;
    }

    public java.util.List<_N610> get_N610() {
        return _N610;
    }

    public java.util.List<_N615> get_N615() {
        return _N615;
    }

    public java.util.List<_N620> get_N620() {
        return _N620;
    }

    public java.util.List<_N630> get_N630() {
        return _N630;
    }

    public java.util.List<_N650> get_N650() {
        return _N650;
    }

    public java.util.List<_N660> get_N660() {
        return _N660;
    }

    public java.util.List<_N670> get_N670() {
        return _N670;
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

    public void set_N500(java.util.List<_N500> _N500) {
        this._N500 = _N500;
    }

    public void set_N600(java.util.List<_N600> _N600) {
        this._N600 = _N600;
    }

    public void set_N610(java.util.List<_N610> _N610) {
        this._N610 = _N610;
    }

    public void set_N615(java.util.List<_N615> _N615) {
        this._N615 = _N615;
    }

    public void set_N620(java.util.List<_N620> _N620) {
        this._N620 = _N620;
    }

    public void set_N630(java.util.List<_N630> _N630) {
        this._N630 = _N630;
    }

    public void set_N650(java.util.List<_N650> _N650) {
        this._N650 = _N650;
    }

    public void set_N660(java.util.List<_N660> _N660) {
        this._N660 = _N660;
    }

    public void set_N670(java.util.List<_N670> _N670) {
        this._N670 = _N670;
    }

}
