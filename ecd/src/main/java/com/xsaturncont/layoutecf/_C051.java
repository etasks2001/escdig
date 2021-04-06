
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_ent_ref",
    "cod_ccus",
    "cod_cta_ref"
})
public class _C051 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_ent_ref;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String cod_cta_ref;

    public String getReg() {
        return reg;
    }

    public String getCod_ent_ref() {
        return cod_ent_ref;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getCod_cta_ref() {
        return cod_cta_ref;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_ent_ref(String cod_ent_ref) {
        this.cod_ent_ref = cod_ent_ref;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setCod_cta_ref(String cod_cta_ref) {
        this.cod_cta_ref = cod_cta_ref;
    }

}
