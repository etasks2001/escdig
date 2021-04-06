
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_oper",
    "ind_emit",
    "cod_part",
    "cod_mod",
    "cod_sit",
    "ser",
    "sub",
    "num_doc",
    "dt_doc",
    "dt_a_p",
    "vl_doc",
    "vl_desc",
    "vl_serv",
    "vl_serv_nt",
    "vl_terc",
    "vl_da",
    "vl_bc_icms",
    "vl_icms",
    "cod_inf",
    "vl_pis",
    "vl_cofins",
    "cod_cta",
    "tp_assinante",
    "_D510",
    "_D530",
    "_D590"
})
public class _D500 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_oper;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String ind_emit;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_part;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cod_sit;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String ser;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String sub;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String dt_a_p;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String vl_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_serv;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_serv_nt;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String vl_terc;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private String vl_da;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private String vl_bc_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 19)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 20)
    private String cod_inf;
    @com.xsaturncont.annotation.FieldDetail(number = 21)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 22)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 23)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 24)
    private String tp_assinante;
    @com.xsaturncont.annotation.FieldDetail(number = 25)
    private java.util.List<_D510> _D510;
    @com.xsaturncont.annotation.FieldDetail(number = 26)
    private java.util.List<_D530> _D530;
    @com.xsaturncont.annotation.FieldDetail(number = 27)
    private java.util.List<_D590> _D590;

    public String getReg() {
        return reg;
    }

    public String getInd_oper() {
        return ind_oper;
    }

    public String getInd_emit() {
        return ind_emit;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getCod_sit() {
        return cod_sit;
    }

    public String getSer() {
        return ser;
    }

    public String getSub() {
        return sub;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getDt_a_p() {
        return dt_a_p;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_serv() {
        return vl_serv;
    }

    public String getVl_serv_nt() {
        return vl_serv_nt;
    }

    public String getVl_terc() {
        return vl_terc;
    }

    public String getVl_da() {
        return vl_da;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public String getCod_inf() {
        return cod_inf;
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

    public String getTp_assinante() {
        return tp_assinante;
    }

    public java.util.List<_D510> get_D510() {
        return _D510;
    }

    public java.util.List<_D530> get_D530() {
        return _D530;
    }

    public java.util.List<_D590> get_D590() {
        return _D590;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setDt_a_p(String dt_a_p) {
        this.dt_a_p = dt_a_p;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    public void setVl_serv_nt(String vl_serv_nt) {
        this.vl_serv_nt = vl_serv_nt;
    }

    public void setVl_terc(String vl_terc) {
        this.vl_terc = vl_terc;
    }

    public void setVl_da(String vl_da) {
        this.vl_da = vl_da;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
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

    public void setTp_assinante(String tp_assinante) {
        this.tp_assinante = tp_assinante;
    }

    public void set_D510(java.util.List<_D510> _D510) {
        this._D510 = _D510;
    }

    public void set_D530(java.util.List<_D530> _D530) {
        this._D530 = _D530;
    }

    public void set_D590(java.util.List<_D590> _D590) {
        this._D590 = _D590;
    }

}
