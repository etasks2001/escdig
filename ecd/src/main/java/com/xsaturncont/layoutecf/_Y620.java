
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_evento",
    "ind_relac",
    "pais",
    "cnpj",
    "nom_emp",
    "valor_reais",
    "valor_estr",
    "perc_cap_tot",
    "perc_cap_vot",
    "res_eq_pat",
    "data_aquis",
    "ind_proc_cart",
    "num_proc_cart",
    "nome_cart",
    "ind_proc_rfb",
    "num_proc_rfb"
})
public class _Y620 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String dt_evento;
    @FieldDetail(number = 3, required = true)
    private String ind_relac;
    @FieldDetail(number = 4, required = true)
    private String pais;
    @FieldDetail(number = 5)
    private String cnpj;
    @FieldDetail(number = 6, required = true)
    private String nom_emp;
    @FieldDetail(number = 7, required = true)
    private String valor_reais;
    @FieldDetail(number = 8, required = true)
    private String valor_estr;
    @FieldDetail(number = 9, required = true)
    private String perc_cap_tot;
    @FieldDetail(number = 10, required = true)
    private String perc_cap_vot;
    @FieldDetail(number = 11)
    private String res_eq_pat;
    @FieldDetail(number = 12, required = true)
    private String data_aquis;
    @FieldDetail(number = 13, required = true)
    private String ind_proc_cart;
    @FieldDetail(number = 14)
    private String num_proc_cart;
    @FieldDetail(number = 15)
    private String nome_cart;
    @FieldDetail(number = 16, required = true)
    private String ind_proc_rfb;
    @FieldDetail(number = 17)
    private String num_proc_rfb;

    public String getReg() {
        return reg;
    }

    public String getDt_evento() {
        return dt_evento;
    }

    public String getInd_relac() {
        return ind_relac;
    }

    public String getPais() {
        return pais;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public String getValor_reais() {
        return valor_reais;
    }

    public String getValor_estr() {
        return valor_estr;
    }

    public String getPerc_cap_tot() {
        return perc_cap_tot;
    }

    public String getPerc_cap_vot() {
        return perc_cap_vot;
    }

    public String getRes_eq_pat() {
        return res_eq_pat;
    }

    public String getData_aquis() {
        return data_aquis;
    }

    public String getInd_proc_cart() {
        return ind_proc_cart;
    }

    public String getNum_proc_cart() {
        return num_proc_cart;
    }

    public String getNome_cart() {
        return nome_cart;
    }

    public String getInd_proc_rfb() {
        return ind_proc_rfb;
    }

    public String getNum_proc_rfb() {
        return num_proc_rfb;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_evento(String dt_evento) {
        this.dt_evento = dt_evento;
    }

    public void setInd_relac(String ind_relac) {
        this.ind_relac = ind_relac;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public void setValor_reais(String valor_reais) {
        this.valor_reais = valor_reais;
    }

    public void setValor_estr(String valor_estr) {
        this.valor_estr = valor_estr;
    }

    public void setPerc_cap_tot(String perc_cap_tot) {
        this.perc_cap_tot = perc_cap_tot;
    }

    public void setPerc_cap_vot(String perc_cap_vot) {
        this.perc_cap_vot = perc_cap_vot;
    }

    public void setRes_eq_pat(String res_eq_pat) {
        this.res_eq_pat = res_eq_pat;
    }

    public void setData_aquis(String data_aquis) {
        this.data_aquis = data_aquis;
    }

    public void setInd_proc_cart(String ind_proc_cart) {
        this.ind_proc_cart = ind_proc_cart;
    }

    public void setNum_proc_cart(String num_proc_cart) {
        this.num_proc_cart = num_proc_cart;
    }

    public void setNome_cart(String nome_cart) {
        this.nome_cart = nome_cart;
    }

    public void setInd_proc_rfb(String ind_proc_rfb) {
        this.ind_proc_rfb = ind_proc_rfb;
    }

    public void setNum_proc_rfb(String num_proc_rfb) {
        this.num_proc_rfb = num_proc_rfb;
    }

}
