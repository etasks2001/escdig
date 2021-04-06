
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_doc",
    "cro",
    "crz",
    "num_coo_fin",
    "gt_fin",
    "vl_brt",
    "_D360",
    "_D365",
    "_D390"
})
public class _D355 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cro;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String crz;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String num_coo_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String gt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_brt;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private _D360 _D360;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_D365> _D365;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_D390> _D390;

    public String getReg() {
        return reg;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getCro() {
        return cro;
    }

    public String getCrz() {
        return crz;
    }

    public String getNum_coo_fin() {
        return num_coo_fin;
    }

    public String getGt_fin() {
        return gt_fin;
    }

    public String getVl_brt() {
        return vl_brt;
    }

    public _D360 get_D360() {
        return _D360;
    }

    public java.util.List<_D365> get_D365() {
        return _D365;
    }

    public java.util.List<_D390> get_D390() {
        return _D390;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public void setCrz(String crz) {
        this.crz = crz;
    }

    public void setNum_coo_fin(String num_coo_fin) {
        this.num_coo_fin = num_coo_fin;
    }

    public void setGt_fin(String gt_fin) {
        this.gt_fin = gt_fin;
    }

    public void setVl_brt(String vl_brt) {
        this.vl_brt = vl_brt;
    }

    public void set_D360(_D360 _D360) {
        this._D360 = _D360;
    }

    public void set_D365(java.util.List<_D365> _D365) {
        this._D365 = _D365;
    }

    public void set_D390(java.util.List<_D390> _D390) {
        this._D390 = _D390;
    }

}
