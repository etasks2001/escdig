
package com.xsaturncont.layoutefd10;

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
    "cod_cons",
    "num_doc",
    "dt_doc",
    "dt_e_s",
    "vl_doc",
    "vl_desc",
    "vl_forn",
    "vl_serv_nt",
    "vl_terc",
    "vl_da",
    "vl_bc_icms",
    "vl_icms",
    "vl_bc_icms_st",
    "vl_icms_st",
    "cod_inf",
    "vl_pis",
    "vl_cofins",
    "tp_ligacao",
    "cod_grupo_tensao",
    "_C510",
    "_C590"
})
public class _C500 {

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
    private String cod_cons;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String dt_e_s;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_forn;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String vl_serv_nt;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private String vl_terc;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private String vl_da;
    @com.xsaturncont.annotation.FieldDetail(number = 19)
    private String vl_bc_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 20)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 21)
    private String vl_bc_icms_st;
    @com.xsaturncont.annotation.FieldDetail(number = 22)
    private String vl_icms_st;
    @com.xsaturncont.annotation.FieldDetail(number = 23)
    private String cod_inf;
    @com.xsaturncont.annotation.FieldDetail(number = 24)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 25)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 26)
    private String tp_ligacao;
    @com.xsaturncont.annotation.FieldDetail(number = 27)
    private String cod_grupo_tensao;
    @com.xsaturncont.annotation.FieldDetail(number = 28)
    private java.util.List<_C510> _C510;
    @com.xsaturncont.annotation.FieldDetail(number = 29)
    private java.util.List<_C590> _C590;

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

    public String getCod_cons() {
        return cod_cons;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getDt_e_s() {
        return dt_e_s;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_forn() {
        return vl_forn;
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

    public String getVl_bc_icms_st() {
        return vl_bc_icms_st;
    }

    public String getVl_icms_st() {
        return vl_icms_st;
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

    public String getTp_ligacao() {
        return tp_ligacao;
    }

    public String getCod_grupo_tensao() {
        return cod_grupo_tensao;
    }

    public java.util.List<_C510> get_C510() {
        return _C510;
    }

    public java.util.List<_C590> get_C590() {
        return _C590;
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

    public void setCod_cons(String cod_cons) {
        this.cod_cons = cod_cons;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setDt_e_s(String dt_e_s) {
        this.dt_e_s = dt_e_s;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_forn(String vl_forn) {
        this.vl_forn = vl_forn;
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

    public void setVl_bc_icms_st(String vl_bc_icms_st) {
        this.vl_bc_icms_st = vl_bc_icms_st;
    }

    public void setVl_icms_st(String vl_icms_st) {
        this.vl_icms_st = vl_icms_st;
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

    public void setTp_ligacao(String tp_ligacao) {
        this.tp_ligacao = tp_ligacao;
    }

    public void setCod_grupo_tensao(String cod_grupo_tensao) {
        this.cod_grupo_tensao = cod_grupo_tensao;
    }

    public void set_C510(java.util.List<_C510> _C510) {
        this._C510 = _C510;
    }

    public void set_C590(java.util.List<_C590> _C590) {
        this._C590 = _C590;
    }

}
