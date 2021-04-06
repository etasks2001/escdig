
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_bico",
    "nr_interv",
    "mot_interv",
    "nom_interv",
    "cnpj_interv",
    "cpf_interv",
    "val_fecha",
    "val_abert",
    "vol_aferi",
    "vol_vendas"
})
public class _1320 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_bico;
    @FieldDetail(number = 3)
    private String nr_interv;
    @FieldDetail(number = 4)
    private String mot_interv;
    @FieldDetail(number = 5)
    private String nom_interv;
    @FieldDetail(number = 6)
    private String cnpj_interv;
    @FieldDetail(number = 7)
    private String cpf_interv;
    @FieldDetail(number = 8)
    private String val_fecha;
    @FieldDetail(number = 9)
    private String val_abert;
    @FieldDetail(number = 10)
    private String vol_aferi;
    @FieldDetail(number = 11)
    private String vol_vendas;

    public String getReg() {
        return reg;
    }

    public String getNum_bico() {
        return num_bico;
    }

    public String getNr_interv() {
        return nr_interv;
    }

    public String getMot_interv() {
        return mot_interv;
    }

    public String getNom_interv() {
        return nom_interv;
    }

    public String getCnpj_interv() {
        return cnpj_interv;
    }

    public String getCpf_interv() {
        return cpf_interv;
    }

    public String getVal_fecha() {
        return val_fecha;
    }

    public String getVal_abert() {
        return val_abert;
    }

    public String getVol_aferi() {
        return vol_aferi;
    }

    public String getVol_vendas() {
        return vol_vendas;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_bico(String num_bico) {
        this.num_bico = num_bico;
    }

    public void setNr_interv(String nr_interv) {
        this.nr_interv = nr_interv;
    }

    public void setMot_interv(String mot_interv) {
        this.mot_interv = mot_interv;
    }

    public void setNom_interv(String nom_interv) {
        this.nom_interv = nom_interv;
    }

    public void setCnpj_interv(String cnpj_interv) {
        this.cnpj_interv = cnpj_interv;
    }

    public void setCpf_interv(String cpf_interv) {
        this.cpf_interv = cpf_interv;
    }

    public void setVal_fecha(String val_fecha) {
        this.val_fecha = val_fecha;
    }

    public void setVal_abert(String val_abert) {
        this.val_abert = val_abert;
    }

    public void setVol_aferi(String vol_aferi) {
        this.vol_aferi = vol_aferi;
    }

    public void setVol_vendas(String vol_vendas) {
        this.vol_vendas = vol_vendas;
    }

}
