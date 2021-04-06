
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_aj_apur",
    "descr_compl_aj",
    "vl_aj_apur",
    "_1922",
    "_1923"
})
public class _1921 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_aj_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String descr_compl_aj;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String vl_aj_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_1922> _1922;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_1923> _1923;

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

    public java.util.List<_1922> get_1922() {
        return _1922;
    }

    public java.util.List<_1923> get_1923() {
        return _1923;
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

    public void set_1922(java.util.List<_1922> _1922) {
        this._1922 = _1922;
    }

    public void set_1923(java.util.List<_1923> _1923) {
        this._1923 = _1923;
    }

}
