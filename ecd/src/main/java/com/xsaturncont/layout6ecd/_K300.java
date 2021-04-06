
package com.xsaturncont.layout6ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "val_ag",
    "ind_val_ag",
    "val_el",
    "ind_val_el",
    "val_cs",
    "ind_val_cs",
    "_K310"
})
public class _K300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String val_ag;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String ind_val_ag;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String val_el;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String ind_val_el;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String val_cs;
    @com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
    private String ind_val_cs;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private List<_K310> _K310;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getVal_ag() {
        return val_ag;
    }

    public String getInd_val_ag() {
        return ind_val_ag;
    }

    public String getVal_el() {
        return val_el;
    }

    public String getInd_val_el() {
        return ind_val_el;
    }

    public String getVal_cs() {
        return val_cs;
    }

    public String getInd_val_cs() {
        return ind_val_cs;
    }

    public List<_K310> get_K310() {
        return _K310;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setVal_ag(String val_ag) {
        this.val_ag = val_ag;
    }

    public void setInd_val_ag(String ind_val_ag) {
        this.ind_val_ag = ind_val_ag;
    }

    public void setVal_el(String val_el) {
        this.val_el = val_el;
    }

    public void setInd_val_el(String ind_val_el) {
        this.ind_val_el = ind_val_el;
    }

    public void setVal_cs(String val_cs) {
        this.val_cs = val_cs;
    }

    public void setInd_val_cs(String ind_val_cs) {
        this.ind_val_cs = ind_val_cs;
    }

    public void set_K310(List<_K310> _K310) {
        this._K310 = _K310;
    }

}
