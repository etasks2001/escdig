
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "per_apur",
    "_P100",
    "_P130",
    "_P150",
    "_P200",
    "_P230",
    "_P300",
    "_P400",
    "_P500"
})
public class _P030 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String per_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_P100> _P100;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_P130> _P130;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_P150> _P150;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_P200> _P200;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_P230> _P230;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private _P300 _P300;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private _P400 _P400;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private _P500 _P500;

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

    public java.util.List<_P100> get_P100() {
        return _P100;
    }

    public java.util.List<_P130> get_P130() {
        return _P130;
    }

    public java.util.List<_P150> get_P150() {
        return _P150;
    }

    public java.util.List<_P200> get_P200() {
        return _P200;
    }

    public java.util.List<_P230> get_P230() {
        return _P230;
    }

    public _P300 get_P300() {
        return _P300;
    }

    public _P400 get_P400() {
        return _P400;
    }

    public _P500 get_P500() {
        return _P500;
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

    public void set_P100(java.util.List<_P100> _P100) {
        this._P100 = _P100;
    }

    public void set_P130(java.util.List<_P130> _P130) {
        this._P130 = _P130;
    }

    public void set_P150(java.util.List<_P150> _P150) {
        this._P150 = _P150;
    }

    public void set_P200(java.util.List<_P200> _P200) {
        this._P200 = _P200;
    }

    public void set_P230(java.util.List<_P230> _P230) {
        this._P230 = _P230;
    }

    public void set_P300(_P300 _P300) {
        this._P300 = _P300;
    }

    public void set_P400(_P400 _P400) {
        this._P400 = _P400;
    }

    public void set_P500(_P500 _P500) {
        this._P500 = _P500;
    }

}
