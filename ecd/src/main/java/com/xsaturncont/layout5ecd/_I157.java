
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_sld_ini",
    "ind_dc_ini"
})
public class _I157 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String vl_sld_ini;
    @FieldDetail(number = 5)
    private String ind_dc_ini;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getVl_sld_ini() {
        return vl_sld_ini;
    }

    public String getInd_dc_ini() {
        return ind_dc_ini;
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

    public void setVl_sld_ini(String vl_sld_ini) {
        this.vl_sld_ini = vl_sld_ini;
    }

    public void setInd_dc_ini(String ind_dc_ini) {
        this.ind_dc_ini = ind_dc_ini;
    }

}
