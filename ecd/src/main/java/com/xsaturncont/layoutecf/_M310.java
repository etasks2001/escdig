
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_cta",
    "ind_vl_cta",
    "_M312"
})
public class _M310 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_ccus;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String vl_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String ind_vl_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_M312> _M312;

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

    public List<_M312> get_M312() {
        return _M312;
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

    public void set_M312(List<_M312> _M312) {
        this._M312 = _M312;
    }

}
