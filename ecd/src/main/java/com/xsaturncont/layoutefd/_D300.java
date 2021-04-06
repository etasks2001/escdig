
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ser",
    "sub",
    "num_doc_ini",
    "num_doc_fin",
    "cst_icms",
    "cfop",
    "aliq_icms",
    "dt_doc",
    "vl_opr",
    "vl_desc",
    "vl_serv",
    "vl_seg",
    "vl_out_desp",
    "vl_bc_icms",
    "vl_icms",
    "vl_red_bc",
    "cod_obs",
    "cod_cta",
    "_D301",
    "_D310"
})
public class _D300 {

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
    private String cst_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String cfop;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String aliq_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_opr;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_serv;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_seg;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_out_desp;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String vl_bc_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private String vl_red_bc;
    @com.xsaturncont.annotation.FieldDetail(number = 19)
    private String cod_obs;
    @com.xsaturncont.annotation.FieldDetail(number = 20)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 21)
    private java.util.List<_D301> _D301;
    @com.xsaturncont.annotation.FieldDetail(number = 22)
    private java.util.List<_D310> _D310;

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

    public String getCst_icms() {
        return cst_icms;
    }

    public String getCfop() {
        return cfop;
    }

    public String getAliq_icms() {
        return aliq_icms;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getVl_opr() {
        return vl_opr;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_serv() {
        return vl_serv;
    }

    public String getVl_seg() {
        return vl_seg;
    }

    public String getVl_out_desp() {
        return vl_out_desp;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public String getVl_red_bc() {
        return vl_red_bc;
    }

    public String getCod_obs() {
        return cod_obs;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public java.util.List<_D301> get_D301() {
        return _D301;
    }

    public java.util.List<_D310> get_D310() {
        return _D310;
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

    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setVl_opr(String vl_opr) {
        this.vl_opr = vl_opr;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    public void setVl_seg(String vl_seg) {
        this.vl_seg = vl_seg;
    }

    public void setVl_out_desp(String vl_out_desp) {
        this.vl_out_desp = vl_out_desp;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void setVl_red_bc(String vl_red_bc) {
        this.vl_red_bc = vl_red_bc;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void set_D301(java.util.List<_D301> _D301) {
        this._D301 = _D301;
    }

    public void set_D310(java.util.List<_D310> _D310) {
        this._D310 = _D310;
    }

}
