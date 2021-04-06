
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta_ref",
    "vl_sld_fin",
    "ind_vl_sld_fin"
})
public class _K356 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta_ref;
    @FieldDetail(number = 3, required = true)
    private String vl_sld_fin;
    @FieldDetail(number = 4, required = true)
    private String ind_vl_sld_fin;

    public String getReg() {
        return reg;
    }

    public String getCod_cta_ref() {
        return cod_cta_ref;
    }

    public String getVl_sld_fin() {
        return vl_sld_fin;
    }

    public String getInd_vl_sld_fin() {
        return ind_vl_sld_fin;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta_ref(String cod_cta_ref) {
        this.cod_cta_ref = cod_cta_ref;
    }

    public void setVl_sld_fin(String vl_sld_fin) {
        this.vl_sld_fin = vl_sld_fin;
    }

    public void setInd_vl_sld_fin(String ind_vl_sld_fin) {
        this.ind_vl_sld_fin = ind_vl_sld_fin;
    }

}
