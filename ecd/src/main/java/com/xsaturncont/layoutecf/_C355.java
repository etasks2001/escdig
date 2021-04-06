
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_cta",
    "ind_vl_cta",
    "linha_ecd"
})
public class _C355 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4)
    private String vl_cta;
    @FieldDetail(number = 5, required = true)
    private String ind_vl_cta;
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

    public String getVl_cta() {
        return vl_cta;
    }

    public String getInd_vl_cta() {
        return ind_vl_cta;
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

    public void setVl_cta(String vl_cta) {
        this.vl_cta = vl_cta;
    }

    public void setInd_vl_cta(String ind_vl_cta) {
        this.ind_vl_cta = ind_vl_cta;
    }

    public void setLinha_ecd(String linha_ecd) {
        this.linha_ecd = linha_ecd;
    }

}
