
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_aj_apur",
    "descr_compl_aj",
    "vl_aj_apur",
    "_E312",
    "_E313"
})
public class _E311 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_aj_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String descr_compl_aj;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String vl_aj_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_E312> _E312;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_E313> _E313;

    public String getReg() {
        return reg;
    }

    public String getCod_aj_apur() {
        return cod_aj_apur;
    }

    public String getDescr_compl_aj() {
        return descr_compl_aj;
    }

    public String getVl_aj_apur() {
        return vl_aj_apur;
    }

    public java.util.List<_E312> get_E312() {
        return _E312;
    }

    public java.util.List<_E313> get_E313() {
        return _E313;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_aj_apur(String cod_aj_apur) {
        this.cod_aj_apur = cod_aj_apur;
    }

    public void setDescr_compl_aj(String descr_compl_aj) {
        this.descr_compl_aj = descr_compl_aj;
    }

    public void setVl_aj_apur(String vl_aj_apur) {
        this.vl_aj_apur = vl_aj_apur;
    }

    public void set_E312(java.util.List<_E312> _E312) {
        this._E312 = _E312;
    }

    public void set_E313(java.util.List<_E313> _E313) {
        this._E313 = _E313;
    }

}
