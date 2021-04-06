
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "base_calc",
    "per_incen_finor",
    "vl_liq_incen_finor",
    "per_incen_finam",
    "vl_liq_incen_finam",
    "vl_subtotal",
    "per_incen_funres",
    "vl_liq_incen_funres",
    "vl_total"
})
public class _N615 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String base_calc;
    @FieldDetail(number = 3, required = true)
    private String per_incen_finor;
    @FieldDetail(number = 4, required = true)
    private String vl_liq_incen_finor;
    @FieldDetail(number = 5, required = true)
    private String per_incen_finam;
    @FieldDetail(number = 6, required = true)
    private String vl_liq_incen_finam;
    @FieldDetail(number = 7, required = true)
    private String vl_subtotal;
    @FieldDetail(number = 8, required = true)
    private String per_incen_funres;
    @FieldDetail(number = 9, required = true)
    private String vl_liq_incen_funres;
    @FieldDetail(number = 10, required = true)
    private String vl_total;

    public String getReg() {
        return reg;
    }

    public String getBase_calc() {
        return base_calc;
    }

    public String getPer_incen_finor() {
        return per_incen_finor;
    }

    public String getVl_liq_incen_finor() {
        return vl_liq_incen_finor;
    }

    public String getPer_incen_finam() {
        return per_incen_finam;
    }

    public String getVl_liq_incen_finam() {
        return vl_liq_incen_finam;
    }

    public String getVl_subtotal() {
        return vl_subtotal;
    }

    public String getPer_incen_funres() {
        return per_incen_funres;
    }

    public String getVl_liq_incen_funres() {
        return vl_liq_incen_funres;
    }

    public String getVl_total() {
        return vl_total;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setBase_calc(String base_calc) {
        this.base_calc = base_calc;
    }

    public void setPer_incen_finor(String per_incen_finor) {
        this.per_incen_finor = per_incen_finor;
    }

    public void setVl_liq_incen_finor(String vl_liq_incen_finor) {
        this.vl_liq_incen_finor = vl_liq_incen_finor;
    }

    public void setPer_incen_finam(String per_incen_finam) {
        this.per_incen_finam = per_incen_finam;
    }

    public void setVl_liq_incen_finam(String vl_liq_incen_finam) {
        this.vl_liq_incen_finam = vl_liq_incen_finam;
    }

    public void setVl_subtotal(String vl_subtotal) {
        this.vl_subtotal = vl_subtotal;
    }

    public void setPer_incen_funres(String per_incen_funres) {
        this.per_incen_funres = per_incen_funres;
    }

    public void setVl_liq_incen_funres(String vl_liq_incen_funres) {
        this.vl_liq_incen_funres = vl_liq_incen_funres;
    }

    public void setVl_total(String vl_total) {
        this.vl_total = vl_total;
    }

}
