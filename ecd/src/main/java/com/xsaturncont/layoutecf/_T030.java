
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "per_apur",
    "_T120",
    "_T150",
    "_T170",
    "_T181"
})
public class _T030 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String per_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_T120> _T120;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_T150> _T150;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_T170> _T170;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_T181> _T181;

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

    public java.util.List<_T120> get_T120() {
        return _T120;
    }

    public java.util.List<_T150> get_T150() {
        return _T150;
    }

    public java.util.List<_T170> get_T170() {
        return _T170;
    }

    public java.util.List<_T181> get_T181() {
        return _T181;
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

    public void set_T120(java.util.List<_T120> _T120) {
        this._T120 = _T120;
    }

    public void set_T150(java.util.List<_T150> _T150) {
        this._T150 = _T150;
    }

    public void set_T170(java.util.List<_T170> _T170) {
        this._T170 = _T170;
    }

    public void set_T181(java.util.List<_T181> _T181) {
        this._T181 = _T181;
    }

}
