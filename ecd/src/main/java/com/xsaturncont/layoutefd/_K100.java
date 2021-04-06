
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "_K200",
    "_K220",
    "_K230",
    "_K250"
})
public class _K100 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_K200> _K200;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_K220> _K220;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_K230> _K230;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_K250> _K250;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public java.util.List<_K200> get_K200() {
        return _K200;
    }

    public java.util.List<_K220> get_K220() {
        return _K220;
    }

    public java.util.List<_K230> get_K230() {
        return _K230;
    }

    public java.util.List<_K250> get_K250() {
        return _K250;
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

    public void set_K200(java.util.List<_K200> _K200) {
        this._K200 = _K200;
    }

    public void set_K220(java.util.List<_K220> _K220) {
        this._K220 = _K220;
    }

    public void set_K230(java.util.List<_K230> _K230) {
        this._K230 = _K230;
    }

    public void set_K250(java.util.List<_K250> _K250) {
        this._K250 = _K250;
    }

}
