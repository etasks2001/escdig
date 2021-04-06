
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ser",
    "sub",
    "num_doc_ini",
    "num_doc_fin",
    "dt_doc",
    "cst_icms",
    "cfop",
    "aliq_icms",
    "vl_opr",
    "vl_desc",
    "vl_serv",
    "vl_bc_icms",
    "vl_icms",
    "_D411"
})
public class _D410 {

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
    private String cst_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String cfop;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String aliq_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_opr;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_serv;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_bc_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private List<_D411> _D411;

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

    public String getCst_icms() {
        return cst_icms;
    }

    public String getCfop() {
        return cfop;
    }

    public String getAliq_icms() {
        return aliq_icms;
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

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public List<_D411> get_D411() {
        return _D411;
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

    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
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

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void set_D411(List<_D411> _D411) {
        this._D411 = _D411;
    }

}
