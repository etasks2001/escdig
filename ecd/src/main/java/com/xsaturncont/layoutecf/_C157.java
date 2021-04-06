
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_sld_fin",
    "ind_vl_sld_fin",
    "linha_ecd"
})
public class _C157 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String vl_sld_fin;
    @FieldDetail(number = 5)
    private String ind_vl_sld_fin;
    @FieldDetail(number = 6, required = true)
    private String linha_ecd;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getVl_sld_fin() {
        return vl_sld_fin;
    }

    public String getInd_vl_sld_fin() {
        return ind_vl_sld_fin;
    }

    public String getLinha_ecd() {
        return linha_ecd;
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

    public void setVl_sld_fin(String vl_sld_fin) {
        this.vl_sld_fin = vl_sld_fin;
    }

    public void setInd_vl_sld_fin(String ind_vl_sld_fin) {
        this.ind_vl_sld_fin = ind_vl_sld_fin;
    }

    public void setLinha_ecd(String linha_ecd) {
        this.linha_ecd = linha_ecd;
    }

}
