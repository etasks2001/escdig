
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "per_apur",
    "_U100",
    "_U150",
    "_U180",
    "_U182"
})
public class _U030 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String per_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_U100> _U100;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_U150> _U150;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_U180> _U180;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_U182> _U182;

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

    public java.util.List<_U100> get_U100() {
        return _U100;
    }

    public java.util.List<_U150> get_U150() {
        return _U150;
    }

    public java.util.List<_U180> get_U180() {
        return _U180;
    }

    public java.util.List<_U182> get_U182() {
        return _U182;
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

    public void set_U100(java.util.List<_U100> _U100) {
        this._U100 = _U100;
    }

    public void set_U150(java.util.List<_U150> _U150) {
        this._U150 = _U150;
    }

    public void set_U180(java.util.List<_U180> _U180) {
        this._U180 = _U180;
    }

    public void set_U182(java.util.List<_U182> _U182) {
        this._U182 = _U182;
    }

}
