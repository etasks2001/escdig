
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta_b",
    "vl_cta",
    "ind_vl_cta"
})
public class _M305 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta_b;
    @FieldDetail(number = 3, required = true)
    private String vl_cta;
    @FieldDetail(number = 4, required = true)
    private String ind_vl_cta;

    public String getReg() {
        return reg;
    }

    public String getCod_cta_b() {
        return cod_cta_b;
    }

    public String getVl_cta() {
        return vl_cta;
    }

    public String getInd_vl_cta() {
        return ind_vl_cta;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta_b(String cod_cta_b) {
        this.cod_cta_b = cod_cta_b;
    }

    public void setVl_cta(String vl_cta) {
        this.vl_cta = vl_cta;
    }

    public void setInd_vl_cta(String ind_vl_cta) {
        this.ind_vl_cta = ind_vl_cta;
    }

}
