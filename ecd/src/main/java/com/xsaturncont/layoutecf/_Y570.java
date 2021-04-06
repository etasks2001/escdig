
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj_fon",
    "nom_emp",
    "ind_org_pub",
    "cod_rec",
    "vl_rend",
    "ir_ret",
    "csll_ret"
})
public class _Y570 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj_fon;
    @FieldDetail(number = 3, required = true)
    private String nom_emp;
    @FieldDetail(number = 4, required = true)
    private String ind_org_pub;
    @FieldDetail(number = 5, required = true)
    private String cod_rec;
    @FieldDetail(number = 6, required = true)
    private String vl_rend;
    @FieldDetail(number = 7)
    private String ir_ret;
    @FieldDetail(number = 8)
    private String csll_ret;

    public String getReg() {
        return reg;
    }

    public String getCnpj_fon() {
        return cnpj_fon;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public String getInd_org_pub() {
        return ind_org_pub;
    }

    public String getCod_rec() {
        return cod_rec;
    }

    public String getVl_rend() {
        return vl_rend;
    }

    public String getIr_ret() {
        return ir_ret;
    }

    public String getCsll_ret() {
        return csll_ret;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj_fon(String cnpj_fon) {
        this.cnpj_fon = cnpj_fon;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public void setInd_org_pub(String ind_org_pub) {
        this.ind_org_pub = ind_org_pub;
    }

    public void setCod_rec(String cod_rec) {
        this.cod_rec = cod_rec;
    }

    public void setVl_rend(String vl_rend) {
        this.vl_rend = vl_rend;
    }

    public void setIr_ret(String ir_ret) {
        this.ir_ret = ir_ret;
    }

    public void setCsll_ret(String csll_ret) {
        this.csll_ret = csll_ret;
    }

}
