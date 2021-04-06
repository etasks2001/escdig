
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj",
    "nom_emp",
    "perc_pat_liq"
})
public class _Y660 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj;
    @FieldDetail(number = 3, required = true)
    private String nom_emp;
    @FieldDetail(number = 4)
    private String perc_pat_liq;

    public String getReg() {
        return reg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public String getPerc_pat_liq() {
        return perc_pat_liq;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public void setPerc_pat_liq(String perc_pat_liq) {
        this.perc_pat_liq = perc_pat_liq;
    }

}
