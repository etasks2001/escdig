
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_exp",
    "ind_ccrf",
    "ind_comb",
    "ind_usina",
    "ind_va",
    "ind_ee",
    "ind_cart",
    "ind_form",
    "ind_aer"
})
public class _1010 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_exp;
    @FieldDetail(number = 3)
    private String ind_ccrf;
    @FieldDetail(number = 4)
    private String ind_comb;
    @FieldDetail(number = 5)
    private String ind_usina;
    @FieldDetail(number = 6)
    private String ind_va;
    @FieldDetail(number = 7)
    private String ind_ee;
    @FieldDetail(number = 8)
    private String ind_cart;
    @FieldDetail(number = 9)
    private String ind_form;
    @FieldDetail(number = 10)
    private String ind_aer;

    public String getReg() {
        return reg;
    }

    public String getInd_exp() {
        return ind_exp;
    }

    public String getInd_ccrf() {
        return ind_ccrf;
    }

    public String getInd_comb() {
        return ind_comb;
    }

    public String getInd_usina() {
        return ind_usina;
    }

    public String getInd_va() {
        return ind_va;
    }

    public String getInd_ee() {
        return ind_ee;
    }

    public String getInd_cart() {
        return ind_cart;
    }

    public String getInd_form() {
        return ind_form;
    }

    public String getInd_aer() {
        return ind_aer;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_exp(String ind_exp) {
        this.ind_exp = ind_exp;
    }

    public void setInd_ccrf(String ind_ccrf) {
        this.ind_ccrf = ind_ccrf;
    }

    public void setInd_comb(String ind_comb) {
        this.ind_comb = ind_comb;
    }

    public void setInd_usina(String ind_usina) {
        this.ind_usina = ind_usina;
    }

    public void setInd_va(String ind_va) {
        this.ind_va = ind_va;
    }

    public void setInd_ee(String ind_ee) {
        this.ind_ee = ind_ee;
    }

    public void setInd_cart(String ind_cart) {
        this.ind_cart = ind_cart;
    }

    public void setInd_form(String ind_form) {
        this.ind_form = ind_form;
    }

    public void setInd_aer(String ind_aer) {
        this.ind_aer = ind_aer;
    }

}
