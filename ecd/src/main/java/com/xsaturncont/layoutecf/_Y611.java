
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "pais",
    "ind_pf_pj",
    "cpf_cnpj",
    "nom_emp",
    "qualif",
    "vl_rem_trab",
    "vl_luc_div",
    "vl_jur_cap",
    "vl_dem_rend",
    "vl_ir_ret"
})
public class _Y611 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String pais;
    @FieldDetail(number = 3, required = true)
    private String ind_pf_pj;
    @FieldDetail(number = 4)
    private String cpf_cnpj;
    @FieldDetail(number = 5, required = true)
    private String nom_emp;
    @FieldDetail(number = 6, required = true)
    private String qualif;
    @FieldDetail(number = 7)
    private String vl_rem_trab;
    @FieldDetail(number = 8)
    private String vl_luc_div;
    @FieldDetail(number = 9)
    private String vl_jur_cap;
    @FieldDetail(number = 10)
    private String vl_dem_rend;
    @FieldDetail(number = 11)
    private String vl_ir_ret;

    public String getReg() {
        return reg;
    }

    public String getPais() {
        return pais;
    }

    public String getInd_pf_pj() {
        return ind_pf_pj;
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

    public String getVl_rem_trab() {
        return vl_rem_trab;
    }

    public String getVl_luc_div() {
        return vl_luc_div;
    }

    public String getVl_jur_cap() {
        return vl_jur_cap;
    }

    public String getVl_dem_rend() {
        return vl_dem_rend;
    }

    public String getVl_ir_ret() {
        return vl_ir_ret;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setInd_pf_pj(String ind_pf_pj) {
        this.ind_pf_pj = ind_pf_pj;
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

    public void setVl_rem_trab(String vl_rem_trab) {
        this.vl_rem_trab = vl_rem_trab;
    }

    public void setVl_luc_div(String vl_luc_div) {
        this.vl_luc_div = vl_luc_div;
    }

    public void setVl_jur_cap(String vl_jur_cap) {
        this.vl_jur_cap = vl_jur_cap;
    }

    public void setVl_dem_rend(String vl_dem_rend) {
        this.vl_dem_rend = vl_dem_rend;
    }

    public void setVl_ir_ret(String vl_ir_ret) {
        this.vl_ir_ret = vl_ir_ret;
    }

}
