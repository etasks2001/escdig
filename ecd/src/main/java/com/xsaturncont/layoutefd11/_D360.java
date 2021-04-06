
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_pis",
    "vl_cofins"
})
public class _D360 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String vl_pis;
    @FieldDetail(number = 3)
    private String vl_cofins;

    public String getReg() {
        return reg;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

}
