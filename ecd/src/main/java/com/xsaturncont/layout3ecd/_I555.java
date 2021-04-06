
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "rz_cont_tot"
})
public class _I555 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String rz_cont_tot;

    public String getReg() {
        return reg;
    }

    public String getRz_cont_tot() {
        return rz_cont_tot;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRz_cont_tot(String rz_cont_tot) {
        this.rz_cont_tot = rz_cont_tot;
    }

}
