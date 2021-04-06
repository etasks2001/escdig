
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "hash_ecd",
    "dt_ini",
    "dt_fin",
    "ind_sit_esp",
    "cnpj",
    "num_ord",
    "nire",
    "nat_livr",
    "cod_ver_lc",
    "ind_esc",
    "_C050",
    "_C100",
    "_C150",
    "_C350"
})
public class _C040 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String hash_ecd;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String ind_sit_esp;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String num_ord;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String nire;
    @com.xsaturncont.annotation.FieldDetail(number = 9, required = true)
    private String nat_livr;
    @com.xsaturncont.annotation.FieldDetail(number = 10, required = true)
    private String cod_ver_lc;
    @com.xsaturncont.annotation.FieldDetail(number = 11, required = true)
    private String ind_esc;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private java.util.List<_C050> _C050;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private java.util.List<_C100> _C100;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private java.util.List<_C150> _C150;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private java.util.List<_C350> _C350;

    public String getReg() {
        return reg;
    }

    public String getHash_ecd() {
        return hash_ecd;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public String getInd_sit_esp() {
        return ind_sit_esp;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNum_ord() {
        return num_ord;
    }

    public String getNire() {
        return nire;
    }

    public String getNat_livr() {
        return nat_livr;
    }

    public String getCod_ver_lc() {
        return cod_ver_lc;
    }

    public String getInd_esc() {
        return ind_esc;
    }

    public java.util.List<_C050> get_C050() {
        return _C050;
    }

    public java.util.List<_C100> get_C100() {
        return _C100;
    }

    public java.util.List<_C150> get_C150() {
        return _C150;
    }

    public java.util.List<_C350> get_C350() {
        return _C350;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setHash_ecd(String hash_ecd) {
        this.hash_ecd = hash_ecd;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void setInd_sit_esp(String ind_sit_esp) {
        this.ind_sit_esp = ind_sit_esp;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNum_ord(String num_ord) {
        this.num_ord = num_ord;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    public void setNat_livr(String nat_livr) {
        this.nat_livr = nat_livr;
    }

    public void setCod_ver_lc(String cod_ver_lc) {
        this.cod_ver_lc = cod_ver_lc;
    }

    public void setInd_esc(String ind_esc) {
        this.ind_esc = ind_esc;
    }

    public void set_C050(java.util.List<_C050> _C050) {
        this._C050 = _C050;
    }

    public void set_C100(java.util.List<_C100> _C100) {
        this._C100 = _C100;
    }

    public void set_C150(java.util.List<_C150> _C150) {
        this._C150 = _C150;
    }

    public void set_C350(java.util.List<_C350> _C350) {
        this._C350 = _C350;
    }

}
