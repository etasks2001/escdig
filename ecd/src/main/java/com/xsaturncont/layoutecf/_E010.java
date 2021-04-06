
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_nat",
    "cod_cta_ref",
    "desc_cta_ref",
    "val_cta_ref",
    "ind_val_cta_ref",
    "_E015"
})
public class _E010 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_nat;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String cod_cta_ref;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String desc_cta_ref;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String val_cta_ref;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String ind_val_cta_ref;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private List<_E015> _E015;

    public String getReg() {
        return reg;
    }

    public String getCod_nat() {
        return cod_nat;
    }

    public String getCod_cta_ref() {
        return cod_cta_ref;
    }

    public String getDesc_cta_ref() {
        return desc_cta_ref;
    }

    public String getVal_cta_ref() {
        return val_cta_ref;
    }

    public String getInd_val_cta_ref() {
        return ind_val_cta_ref;
    }

    public List<_E015> get_E015() {
        return _E015;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
    }

    public void setCod_cta_ref(String cod_cta_ref) {
        this.cod_cta_ref = cod_cta_ref;
    }

    public void setDesc_cta_ref(String desc_cta_ref) {
        this.desc_cta_ref = desc_cta_ref;
    }

    public void setVal_cta_ref(String val_cta_ref) {
        this.val_cta_ref = val_cta_ref;
    }

    public void setInd_val_cta_ref(String ind_val_cta_ref) {
        this.ind_val_cta_ref = ind_val_cta_ref;
    }

    public void set_E015(List<_E015> _E015) {
        this._E015 = _E015;
    }

}
