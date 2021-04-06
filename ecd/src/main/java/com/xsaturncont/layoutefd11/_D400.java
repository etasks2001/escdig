
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "cod_mod",
    "cod_sit",
    "ser",
    "sub",
    "num_doc",
    "dt_doc",
    "vl_doc",
    "vl_desc",
    "vl_serv",
    "vl_bc_icms",
    "vl_icms",
    "vl_pis",
    "vl_cofins",
    "cod_cta",
    "_D410",
    "_D420"
})
public class _D400 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_part;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_sit;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String ser;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String sub;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String vl_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_serv;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String vl_bc_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private java.util.List<_D410> _D410;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private java.util.List<_D420> _D420;

    public String getReg() {
        return reg;
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

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_serv() {
        return vl_serv;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
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

    public java.util.List<_D410> get_D410() {
        return _D410;
    }

    public java.util.List<_D420> get_D420() {
        return _D420;
    }

    public void setReg(String reg) {
        this.reg = reg;
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

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
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

    public void set_D410(java.util.List<_D410> _D410) {
        this._D410 = _D410;
    }

    public void set_D420(java.util.List<_D420> _D420) {
        this._D420 = _D420;
    }

}
