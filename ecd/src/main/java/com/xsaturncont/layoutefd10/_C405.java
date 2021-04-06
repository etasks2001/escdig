
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_doc",
    "cro",
    "crz",
    "num_coo_fin",
    "gt_fin",
    "vl_brt",
    "_C410",
    "_C420",
    "_C460",
    "_C490"
})
public class _C405 {

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
    private _C410 _C410;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_C420> _C420;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_C460> _C460;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private java.util.List<_C490> _C490;

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

    public _C410 get_C410() {
        return _C410;
    }

    public java.util.List<_C420> get_C420() {
        return _C420;
    }

    public java.util.List<_C460> get_C460() {
        return _C460;
    }

    public java.util.List<_C490> get_C490() {
        return _C490;
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

    public void set_C410(_C410 _C410) {
        this._C410 = _C410;
    }

    public void set_C420(java.util.List<_C420> _C420) {
        this._C420 = _C420;
    }

    public void set_C460(java.util.List<_C460> _C460) {
        this._C460 = _C460;
    }

    public void set_C490(java.util.List<_C490> _C490) {
        this._C490 = _C490;
    }

}
