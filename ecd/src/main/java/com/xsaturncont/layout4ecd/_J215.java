
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_hist_fat",
    "vl_fat_cont",
    "ind_dc_fat"
})
public class _J215 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_hist_fat;
    @FieldDetail(number = 3, required = true)
    private String vl_fat_cont;
    @FieldDetail(number = 4, required = true)
    private String ind_dc_fat;

    public String getReg() {
        return reg;
    }

    public String getCod_hist_fat() {
        return cod_hist_fat;
    }

    public String getVl_fat_cont() {
        return vl_fat_cont;
    }

    public String getInd_dc_fat() {
        return ind_dc_fat;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_hist_fat(String cod_hist_fat) {
        this.cod_hist_fat = cod_hist_fat;
    }

    public void setVl_fat_cont(String vl_fat_cont) {
        this.vl_fat_cont = vl_fat_cont;
    }

    public void setInd_dc_fat(String ind_dc_fat) {
        this.ind_dc_fat = ind_dc_fat;
    }

}
