
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "lecd",
    "dt_ini",
    "dt_fin",
    "nome",
    "cnpj",
    "uf",
    "ie",
    "cod_mun",
    "im",
    "ind_sit_esp",
    "ind_sit_ini_per",
    "ind_nire",
    "ind_fin_esc",
    "cod_hash_sub",
    "nire_subst",
    "ind_grande_porte",
    "tip_ecd",
    "cod_scp",
    "ident_mf",
    "_0001",
    "_0990",
    "_I001",
    "_I990",
    "_J001",
    "_J990",
    "_9001",
    "_9990"
})
public class _0000 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String lecd;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String nome;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String uf;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String ie;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String cod_mun;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String im;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String ind_sit_esp;
    @com.xsaturncont.annotation.FieldDetail(number = 12, required = true)
    private String ind_sit_ini_per;
    @com.xsaturncont.annotation.FieldDetail(number = 13, required = true)
    private String ind_nire;
    @com.xsaturncont.annotation.FieldDetail(number = 14, required = true)
    private String ind_fin_esc;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String cod_hash_sub;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String nire_subst;
    @com.xsaturncont.annotation.FieldDetail(number = 17, required = true)
    private String ind_grande_porte;
    @com.xsaturncont.annotation.FieldDetail(number = 18, required = true)
    private String tip_ecd;
    @com.xsaturncont.annotation.FieldDetail(number = 19)
    private String cod_scp;
    @com.xsaturncont.annotation.FieldDetail(number = 20, required = true)
    private String ident_mf;
    @com.xsaturncont.annotation.FieldDetail(number = 21)
    private _0001 _0001;
    @com.xsaturncont.annotation.FieldDetail(number = 22)
    private _0990 _0990;
    @com.xsaturncont.annotation.FieldDetail(number = 23)
    private _I001 _I001;
    @com.xsaturncont.annotation.FieldDetail(number = 24)
    private _I990 _I990;
    @com.xsaturncont.annotation.FieldDetail(number = 25)
    private _J001 _J001;
    @com.xsaturncont.annotation.FieldDetail(number = 26)
    private _J990 _J990;
    @com.xsaturncont.annotation.FieldDetail(number = 27)
    private _9001 _9001;
    @com.xsaturncont.annotation.FieldDetail(number = 28)
    private _9990 _9990;

    public String getReg() {
        return reg;
    }

    public String getLecd() {
        return lecd;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getUf() {
        return uf;
    }

    public String getIe() {
        return ie;
    }

    public String getCod_mun() {
        return cod_mun;
    }

    public String getIm() {
        return im;
    }

    public String getInd_sit_esp() {
        return ind_sit_esp;
    }

    public String getInd_sit_ini_per() {
        return ind_sit_ini_per;
    }

    public String getInd_nire() {
        return ind_nire;
    }

    public String getInd_fin_esc() {
        return ind_fin_esc;
    }

    public String getCod_hash_sub() {
        return cod_hash_sub;
    }

    public String getNire_subst() {
        return nire_subst;
    }

    public String getInd_grande_porte() {
        return ind_grande_porte;
    }

    public String getTip_ecd() {
        return tip_ecd;
    }

    public String getCod_scp() {
        return cod_scp;
    }

    public String getIdent_mf() {
        return ident_mf;
    }

    public _0001 get_0001() {
        return _0001;
    }

    public _0990 get_0990() {
        return _0990;
    }

    public _I001 get_I001() {
        return _I001;
    }

    public _I990 get_I990() {
        return _I990;
    }

    public _J001 get_J001() {
        return _J001;
    }

    public _J990 get_J990() {
        return _J990;
    }

    public _9001 get_9001() {
        return _9001;
    }

    public _9990 get_9990() {
        return _9990;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setLecd(String lecd) {
        this.lecd = lecd;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public void setInd_sit_esp(String ind_sit_esp) {
        this.ind_sit_esp = ind_sit_esp;
    }

    public void setInd_sit_ini_per(String ind_sit_ini_per) {
        this.ind_sit_ini_per = ind_sit_ini_per;
    }

    public void setInd_nire(String ind_nire) {
        this.ind_nire = ind_nire;
    }

    public void setInd_fin_esc(String ind_fin_esc) {
        this.ind_fin_esc = ind_fin_esc;
    }

    public void setCod_hash_sub(String cod_hash_sub) {
        this.cod_hash_sub = cod_hash_sub;
    }

    public void setNire_subst(String nire_subst) {
        this.nire_subst = nire_subst;
    }

    public void setInd_grande_porte(String ind_grande_porte) {
        this.ind_grande_porte = ind_grande_porte;
    }

    public void setTip_ecd(String tip_ecd) {
        this.tip_ecd = tip_ecd;
    }

    public void setCod_scp(String cod_scp) {
        this.cod_scp = cod_scp;
    }

    public void setIdent_mf(String ident_mf) {
        this.ident_mf = ident_mf;
    }

    public void set_0001(_0001 _0001) {
        this._0001 = _0001;
    }

    public void set_0990(_0990 _0990) {
        this._0990 = _0990;
    }

    public void set_I001(_I001 _I001) {
        this._I001 = _I001;
    }

    public void set_I990(_I990 _I990) {
        this._I990 = _I990;
    }

    public void set_J001(_J001 _J001) {
        this._J001 = _J001;
    }

    public void set_J990(_J990 _J990) {
        this._J990 = _J990;
    }

    public void set_9001(_9001 _9001) {
        this._9001 = _9001;
    }

    public void set_9990(_9990 _9990) {
        this._9990 = _9990;
    }

}
