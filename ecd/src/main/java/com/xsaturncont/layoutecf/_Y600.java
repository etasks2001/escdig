
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_alt_soc",
    "dt_fim_soc",
    "pais",
    "ind_qualif_socio",
    "cpf_cnpj",
    "nom_emp",
    "qualif",
    "perc_cap_tot",
    "perc_cap_vot",
    "cpf_rep_leg",
    "qualif_rep_leg"
})
public class _Y600 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String dt_alt_soc;
    @FieldDetail(number = 3)
    private String dt_fim_soc;
    @FieldDetail(number = 4, required = true)
    private String pais;
    @FieldDetail(number = 5, required = true)
    private String ind_qualif_socio;
    @FieldDetail(number = 6)
    private String cpf_cnpj;
    @FieldDetail(number = 7, required = true)
    private String nom_emp;
    @FieldDetail(number = 8, required = true)
    private String qualif;
    @FieldDetail(number = 9, required = true)
    private String perc_cap_tot;
    @FieldDetail(number = 10, required = true)
    private String perc_cap_vot;
    @FieldDetail(number = 11)
    private String cpf_rep_leg;
    @FieldDetail(number = 12)
    private String qualif_rep_leg;

    public String getReg() {
        return reg;
    }

    public String getDt_alt_soc() {
        return dt_alt_soc;
    }

    public String getDt_fim_soc() {
        return dt_fim_soc;
    }

    public String getPais() {
        return pais;
    }

    public String getInd_qualif_socio() {
        return ind_qualif_socio;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public String getQualif() {
        return qualif;
    }

    public String getPerc_cap_tot() {
        return perc_cap_tot;
    }

    public String getPerc_cap_vot() {
        return perc_cap_vot;
    }

    public String getCpf_rep_leg() {
        return cpf_rep_leg;
    }

    public String getQualif_rep_leg() {
        return qualif_rep_leg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_alt_soc(String dt_alt_soc) {
        this.dt_alt_soc = dt_alt_soc;
    }

    public void setDt_fim_soc(String dt_fim_soc) {
        this.dt_fim_soc = dt_fim_soc;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setInd_qualif_socio(String ind_qualif_socio) {
        this.ind_qualif_socio = ind_qualif_socio;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public void setQualif(String qualif) {
        this.qualif = qualif;
    }

    public void setPerc_cap_tot(String perc_cap_tot) {
        this.perc_cap_tot = perc_cap_tot;
    }

    public void setPerc_cap_vot(String perc_cap_vot) {
        this.perc_cap_vot = perc_cap_vot;
    }

    public void setCpf_rep_leg(String cpf_rep_leg) {
        this.cpf_rep_leg = cpf_rep_leg;
    }

    public void setQualif_rep_leg(String qualif_rep_leg) {
        this.qualif_rep_leg = qualif_rep_leg;
    }

}
