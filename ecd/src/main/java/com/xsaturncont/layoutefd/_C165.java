
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "veic_id",
    "cod_aut",
    "nr_passe",
    "hora",
    "temper",
    "qtd_vol",
    "peso_brt",
    "peso_liq",
    "nom_mot",
    "cpf",
    "uf_id"
})
public class _C165 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part;
    @FieldDetail(number = 3)
    private String veic_id;
    @FieldDetail(number = 4)
    private String cod_aut;
    @FieldDetail(number = 5)
    private String nr_passe;
    @FieldDetail(number = 6)
    private String hora;
    @FieldDetail(number = 7)
    private String temper;
    @FieldDetail(number = 8)
    private String qtd_vol;
    @FieldDetail(number = 9)
    private String peso_brt;
    @FieldDetail(number = 10)
    private String peso_liq;
    @FieldDetail(number = 11)
    private String nom_mot;
    @FieldDetail(number = 12)
    private String cpf;
    @FieldDetail(number = 13)
    private String uf_id;

    public String getReg() {
        return reg;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getVeic_id() {
        return veic_id;
    }

    public String getCod_aut() {
        return cod_aut;
    }

    public String getNr_passe() {
        return nr_passe;
    }

    public String getHora() {
        return hora;
    }

    public String getTemper() {
        return temper;
    }

    public String getQtd_vol() {
        return qtd_vol;
    }

    public String getPeso_brt() {
        return peso_brt;
    }

    public String getPeso_liq() {
        return peso_liq;
    }

    public String getNom_mot() {
        return nom_mot;
    }

    public String getCpf() {
        return cpf;
    }

    public String getUf_id() {
        return uf_id;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setVeic_id(String veic_id) {
        this.veic_id = veic_id;
    }

    public void setCod_aut(String cod_aut) {
        this.cod_aut = cod_aut;
    }

    public void setNr_passe(String nr_passe) {
        this.nr_passe = nr_passe;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public void setQtd_vol(String qtd_vol) {
        this.qtd_vol = qtd_vol;
    }

    public void setPeso_brt(String peso_brt) {
        this.peso_brt = peso_brt;
    }

    public void setPeso_liq(String peso_liq) {
        this.peso_liq = peso_liq;
    }

    public void setNom_mot(String nom_mot) {
        this.nom_mot = nom_mot;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setUf_id(String uf_id) {
        this.uf_id = uf_id;
    }

}
