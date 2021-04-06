
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini",
    "dt_fin",
    "id_dem",
    "cab_dem",
    "_J100",
    "_J150",
    "_J200",
    "_J210",
    "_J800"
})
public class _J005 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String id_dem;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cab_dem;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_J100> _J100;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_J150> _J150;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_J200> _J200;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_J210> _J210;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_J800> _J800;

    public String getReg() {
        return reg;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public String getId_dem() {
        return id_dem;
    }

    public String getCab_dem() {
        return cab_dem;
    }

    public java.util.List<_J100> get_J100() {
        return _J100;
    }

    public java.util.List<_J150> get_J150() {
        return _J150;
    }

    public java.util.List<_J200> get_J200() {
        return _J200;
    }

    public java.util.List<_J210> get_J210() {
        return _J210;
    }

    public java.util.List<_J800> get_J800() {
        return _J800;
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

    public void setId_dem(String id_dem) {
        this.id_dem = id_dem;
    }

    public void setCab_dem(String cab_dem) {
        this.cab_dem = cab_dem;
    }

    public void set_J100(java.util.List<_J100> _J100) {
        this._J100 = _J100;
    }

    public void set_J150(java.util.List<_J150> _J150) {
        this._J150 = _J150;
    }

    public void set_J200(java.util.List<_J200> _J200) {
        this._J200 = _J200;
    }

    public void set_J210(java.util.List<_J210> _J210) {
        this._J210 = _J210;
    }

    public void set_J800(java.util.List<_J800> _J800) {
        this._J800 = _J800;
    }

}
