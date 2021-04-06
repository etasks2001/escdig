
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_esc",
    "cod_ver_lc",
    "_I012",
    "_I020",
    "_I030",
    "_I050",
    "_I075",
    "_I100",
    "_I150",
    "_I200",
    "_I300",
    "_I350",
    "_I500",
    "_I510",
    "_I550"
})
public class _I010 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_esc;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String cod_ver_lc;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_I012> _I012;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_I020> _I020;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private _I030 _I030;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_I050> _I050;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_I075> _I075;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_I100> _I100;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_I150> _I150;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private java.util.List<_I200> _I200;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private java.util.List<_I300> _I300;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private java.util.List<_I350> _I350;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private _I500 _I500;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private java.util.List<_I510> _I510;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private java.util.List<_I550> _I550;

    public String getReg() {
        return reg;
    }

    public String getInd_esc() {
        return ind_esc;
    }

    public String getCod_ver_lc() {
        return cod_ver_lc;
    }

    public java.util.List<_I012> get_I012() {
        return _I012;
    }

    public java.util.List<_I020> get_I020() {
        return _I020;
    }

    public _I030 get_I030() {
        return _I030;
    }

    public java.util.List<_I050> get_I050() {
        return _I050;
    }

    public java.util.List<_I075> get_I075() {
        return _I075;
    }

    public java.util.List<_I100> get_I100() {
        return _I100;
    }

    public java.util.List<_I150> get_I150() {
        return _I150;
    }

    public java.util.List<_I200> get_I200() {
        return _I200;
    }

    public java.util.List<_I300> get_I300() {
        return _I300;
    }

    public java.util.List<_I350> get_I350() {
        return _I350;
    }

    public _I500 get_I500() {
        return _I500;
    }

    public java.util.List<_I510> get_I510() {
        return _I510;
    }

    public java.util.List<_I550> get_I550() {
        return _I550;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_esc(String ind_esc) {
        this.ind_esc = ind_esc;
    }

    public void setCod_ver_lc(String cod_ver_lc) {
        this.cod_ver_lc = cod_ver_lc;
    }

    public void set_I012(java.util.List<_I012> _I012) {
        this._I012 = _I012;
    }

    public void set_I020(java.util.List<_I020> _I020) {
        this._I020 = _I020;
    }

    public void set_I030(_I030 _I030) {
        this._I030 = _I030;
    }

    public void set_I050(java.util.List<_I050> _I050) {
        this._I050 = _I050;
    }

    public void set_I075(java.util.List<_I075> _I075) {
        this._I075 = _I075;
    }

    public void set_I100(java.util.List<_I100> _I100) {
        this._I100 = _I100;
    }

    public void set_I150(java.util.List<_I150> _I150) {
        this._I150 = _I150;
    }

    public void set_I200(java.util.List<_I200> _I200) {
        this._I200 = _I200;
    }

    public void set_I300(java.util.List<_I300> _I300) {
        this._I300 = _I300;
    }

    public void set_I350(java.util.List<_I350> _I350) {
        this._I350 = _I350;
    }

    public void set_I500(_I500 _I500) {
        this._I500 = _I500;
    }

    public void set_I510(java.util.List<_I510> _I510) {
        this._I510 = _I510;
    }

    public void set_I550(java.util.List<_I550> _I550) {
        this._I550 = _I550;
    }

}
