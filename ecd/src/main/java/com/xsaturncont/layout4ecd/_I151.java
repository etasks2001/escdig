
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "assin_dig"
})
public class _I151 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String assin_dig;

    public String getReg() {
        return reg;
    }

    public String getAssin_dig() {
        return assin_dig;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setAssin_dig(String assin_dig) {
        this.assin_dig = assin_dig;
    }

}
