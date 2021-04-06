
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta_b",
    "cod_tributo",
    "val_lan_lalb_pb",
    "ind_val_lan_lalb_pb",
    "cod_cta_b_ctp",
    "hist_lan_lalb",
    "ind_lan_ant",
    "_M415"
})
public class _M410 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_cta_b;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String cod_tributo;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String val_lan_lalb_pb;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String ind_val_lan_lalb_pb;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cod_cta_b_ctp;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String hist_lan_lalb;
    @com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
    private String ind_lan_ant;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private List<_M415> _M415;

    public String getReg() {
        return reg;
    }

    public String getCod_cta_b() {
        return cod_cta_b;
    }

    public String getCod_tributo() {
        return cod_tributo;
    }

    public String getVal_lan_lalb_pb() {
        return val_lan_lalb_pb;
    }

    public String getInd_val_lan_lalb_pb() {
        return ind_val_lan_lalb_pb;
    }

    public String getCod_cta_b_ctp() {
        return cod_cta_b_ctp;
    }

    public String getHist_lan_lalb() {
        return hist_lan_lalb;
    }

    public String getInd_lan_ant() {
        return ind_lan_ant;
    }

    public List<_M415> get_M415() {
        return _M415;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta_b(String cod_cta_b) {
        this.cod_cta_b = cod_cta_b;
    }

    public void setCod_tributo(String cod_tributo) {
        this.cod_tributo = cod_tributo;
    }

    public void setVal_lan_lalb_pb(String val_lan_lalb_pb) {
        this.val_lan_lalb_pb = val_lan_lalb_pb;
    }

    public void setInd_val_lan_lalb_pb(String ind_val_lan_lalb_pb) {
        this.ind_val_lan_lalb_pb = ind_val_lan_lalb_pb;
    }

    public void setCod_cta_b_ctp(String cod_cta_b_ctp) {
        this.cod_cta_b_ctp = cod_cta_b_ctp;
    }

    public void setHist_lan_lalb(String hist_lan_lalb) {
        this.hist_lan_lalb = hist_lan_lalb;
    }

    public void setInd_lan_ant(String ind_lan_ant) {
        this.ind_lan_ant = ind_lan_ant;
    }

    public void set_M415(List<_M415> _M415) {
        this._M415 = _M415;
    }

}
