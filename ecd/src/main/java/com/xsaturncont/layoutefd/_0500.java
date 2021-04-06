
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_alt",
    "cod_nat_cc",
    "ind_cta",
    "n\u00edvel",
    "cod_cta",
    "nome_cta"
})
public class _0500 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_alt;
    @FieldDetail(number = 3)
    private String cod_nat_cc;
    @FieldDetail(number = 4)
    private String ind_cta;
    @FieldDetail(number = 5)
    private String nível;
    @FieldDetail(number = 6)
    private String cod_cta;
    @FieldDetail(number = 7)
    private String nome_cta;

    public String getReg() {
        return reg;
    }

    public String getDt_alt() {
        return dt_alt;
    }

    public String getCod_nat_cc() {
        return cod_nat_cc;
    }

    public String getInd_cta() {
        return ind_cta;
    }

    public String getNível() {
        return nível;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getNome_cta() {
        return nome_cta;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_alt(String dt_alt) {
        this.dt_alt = dt_alt;
    }

    public void setCod_nat_cc(String cod_nat_cc) {
        this.cod_nat_cc = cod_nat_cc;
    }

    public void setInd_cta(String ind_cta) {
        this.ind_cta = ind_cta;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setNome_cta(String nome_cta) {
        this.nome_cta = nome_cta;
    }

}
