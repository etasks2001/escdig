
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj",
    "qte_quot",
    "qte_quota",
    "patr_fin_per",
    "dat_abert",
    "dat_encer"
})
public class _Y630 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj;
    @FieldDetail(number = 3, required = true)
    private String qte_quot;
    @FieldDetail(number = 4, required = true)
    private String qte_quota;
    @FieldDetail(number = 5, required = true)
    private String patr_fin_per;
    @FieldDetail(number = 6, required = true)
    private String dat_abert;
    @FieldDetail(number = 7)
    private String dat_encer;

    public String getReg() {
        return reg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getQte_quot() {
        return qte_quot;
    }

    public String getQte_quota() {
        return qte_quota;
    }

    public String getPatr_fin_per() {
        return patr_fin_per;
    }

    public String getDat_abert() {
        return dat_abert;
    }

    public String getDat_encer() {
        return dat_encer;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setQte_quot(String qte_quot) {
        this.qte_quot = qte_quot;
    }

    public void setQte_quota(String qte_quota) {
        this.qte_quota = qte_quota;
    }

    public void setPatr_fin_per(String patr_fin_per) {
        this.patr_fin_per = patr_fin_per;
    }

    public void setDat_abert(String dat_abert) {
        this.dat_abert = dat_abert;
    }

    public void setDat_encer(String dat_encer) {
        this.dat_encer = dat_encer;
    }

}
