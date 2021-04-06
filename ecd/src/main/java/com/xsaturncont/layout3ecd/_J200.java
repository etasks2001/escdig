
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_hist_fat",
    "desc_fat"
})
public class _J200 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_hist_fat;
    @FieldDetail(number = 3, required = true)
    private String desc_fat;

    public String getReg() {
        return reg;
    }

    public String getCod_hist_fat() {
        return cod_hist_fat;
    }

    public String getDesc_fat() {
        return desc_fat;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_hist_fat(String cod_hist_fat) {
        this.cod_hist_fat = cod_hist_fat;
    }

    public void setDesc_fat(String desc_fat) {
        this.desc_fat = desc_fat;
    }

}
