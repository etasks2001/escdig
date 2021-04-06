
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "desc_cta",
    "val_cta",
    "ind_val_cta"
})
public class _E015 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String desc_cta;
    @FieldDetail(number = 5, required = true)
    private String val_cta;
    @FieldDetail(number = 6, required = true)
    private String ind_val_cta;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getDesc_cta() {
        return desc_cta;
    }

    public String getVal_cta() {
        return val_cta;
    }

    public String getInd_val_cta() {
        return ind_val_cta;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setDesc_cta(String desc_cta) {
        this.desc_cta = desc_cta;
    }

    public void setVal_cta(String val_cta) {
        this.val_cta = val_cta;
    }

    public void setInd_val_cta(String ind_val_cta) {
        this.ind_val_cta = ind_val_cta;
    }

}
