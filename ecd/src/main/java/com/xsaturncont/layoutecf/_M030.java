
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "per_apur",
    "_M300",
    "_M350",
    "_M410",
    "_M500"
})
public class _M030 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String per_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_M300> _M300;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_M350> _M350;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_M410> _M410;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_M500> _M500;

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

    public java.util.List<_M300> get_M300() {
        return _M300;
    }

    public java.util.List<_M350> get_M350() {
        return _M350;
    }

    public java.util.List<_M410> get_M410() {
        return _M410;
    }

    public java.util.List<_M500> get_M500() {
        return _M500;
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

    public void set_M300(java.util.List<_M300> _M300) {
        this._M300 = _M300;
    }

    public void set_M350(java.util.List<_M350> _M350) {
        this._M350 = _M350;
    }

    public void set_M410(java.util.List<_M410> _M410) {
        this._M410 = _M410;
    }

    public void set_M500(java.util.List<_M500> _M500) {
        this._M500 = _M500;
    }

}
