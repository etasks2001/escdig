
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_sld_fin",
    "ind_vl_sld_fin",
    "_K356"
})
public class _K355 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_ccus;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String vl_sld_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String ind_vl_sld_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_K356> _K356;

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

    public List<_K356> get_K356() {
        return _K356;
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

    public void set_K356(List<_K356> _K356) {
        this._K356 = _K356;
    }

}
