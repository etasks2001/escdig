
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ser",
    "sub",
    "num_doc_ini",
    "num_doc_fin",
    "dt_doc",
    "vl_doc",
    "vl_pis",
    "vl_cofins",
    "cod_cta",
    "_C310",
    "_C320"
})
public class _C300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String ser;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String sub;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String num_doc_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String num_doc_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private java.util.List<_C310> _C310;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private java.util.List<_C320> _C320;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getSer() {
        return ser;
    }

    public String getSub() {
        return sub;
    }

    public String getNum_doc_ini() {
        return num_doc_ini;
    }

    public String getNum_doc_fin() {
        return num_doc_fin;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public java.util.List<_C310> get_C310() {
        return _C310;
    }

    public java.util.List<_C320> get_C320() {
        return _C320;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setNum_doc_ini(String num_doc_ini) {
        this.num_doc_ini = num_doc_ini;
    }

    public void setNum_doc_fin(String num_doc_fin) {
        this.num_doc_fin = num_doc_fin;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void set_C310(java.util.List<_C310> _C310) {
        this._C310 = _C310;
    }

    public void set_C320(java.util.List<_C320> _C320) {
        this._C320 = _C320;
    }

}
