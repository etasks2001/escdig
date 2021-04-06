
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_dc",
    "ind_dc",
    "num_arq",
    "cod_hist_pad",
    "hist",
    "cod_part"
})
public class _I250 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String vl_dc;
    @FieldDetail(number = 5, required = true)
    private String ind_dc;
    @FieldDetail(number = 6)
    private String num_arq;
    @FieldDetail(number = 7)
    private String cod_hist_pad;
    @FieldDetail(number = 8)
    private String hist;
    @FieldDetail(number = 9)
    private String cod_part;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getVl_dc() {
        return vl_dc;
    }

    public String getInd_dc() {
        return ind_dc;
    }

    public String getNum_arq() {
        return num_arq;
    }

    public String getCod_hist_pad() {
        return cod_hist_pad;
    }

    public String getHist() {
        return hist;
    }

    public String getCod_part() {
        return cod_part;
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

    public void setVl_dc(String vl_dc) {
        this.vl_dc = vl_dc;
    }

    public void setInd_dc(String ind_dc) {
        this.ind_dc = ind_dc;
    }

    public void setNum_arq(String num_arq) {
        this.num_arq = num_arq;
    }

    public void setCod_hist_pad(String cod_hist_pad) {
        this.cod_hist_pad = cod_hist_pad;
    }

    public void setHist(String hist) {
        this.hist = hist;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

}
