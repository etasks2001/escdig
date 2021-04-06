
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_ent_ref",
    "cod_inscr"
})
public class _0007 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_ent_ref;
    @FieldDetail(number = 3)
    private String cod_inscr;

    public String getReg() {
        return reg;
    }

    public String getCod_ent_ref() {
        return cod_ent_ref;
    }

    public String getCod_inscr() {
        return cod_inscr;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_ent_ref(String cod_ent_ref) {
        this.cod_ent_ref = cod_ent_ref;
    }

    public void setCod_inscr(String cod_inscr) {
        this.cod_inscr = cod_inscr;
    }

}
