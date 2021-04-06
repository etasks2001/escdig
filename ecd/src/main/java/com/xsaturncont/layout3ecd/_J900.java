
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dnrc_encer",
    "num_ord",
    "nat_livro",
    "nome",
    "qtd_lin",
    "dt_ini_escr",
    "dt_fin_escr",
    "_J930",
    "_J935"
})
public class _J900 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dnrc_encer;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String num_ord;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String nat_livro;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String nome;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String qtd_lin;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String dt_ini_escr;
    @com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
    private String dt_fin_escr;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_J930> _J930;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_J935> _J935;

    public String getReg() {
        return reg;
    }

    public String getDnrc_encer() {
        return dnrc_encer;
    }

    public String getNum_ord() {
        return num_ord;
    }

    public String getNat_livro() {
        return nat_livro;
    }

    public String getNome() {
        return nome;
    }

    public String getQtd_lin() {
        return qtd_lin;
    }

    public String getDt_ini_escr() {
        return dt_ini_escr;
    }

    public String getDt_fin_escr() {
        return dt_fin_escr;
    }

    public java.util.List<_J930> get_J930() {
        return _J930;
    }

    public java.util.List<_J935> get_J935() {
        return _J935;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDnrc_encer(String dnrc_encer) {
        this.dnrc_encer = dnrc_encer;
    }

    public void setNum_ord(String num_ord) {
        this.num_ord = num_ord;
    }

    public void setNat_livro(String nat_livro) {
        this.nat_livro = nat_livro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd_lin(String qtd_lin) {
        this.qtd_lin = qtd_lin;
    }

    public void setDt_ini_escr(String dt_ini_escr) {
        this.dt_ini_escr = dt_ini_escr;
    }

    public void setDt_fin_escr(String dt_fin_escr) {
        this.dt_fin_escr = dt_fin_escr;
    }

    public void set_J930(java.util.List<_J930> _J930) {
        this._J930 = _J930;
    }

    public void set_J935(java.util.List<_J935> _J935) {
        this._J935 = _J935;
    }

}
