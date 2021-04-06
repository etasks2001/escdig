
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "tam_fonte"
})
public class _I500 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String tam_fonte;

    public String getReg() {
        return reg;
    }

    public String getTam_fonte() {
        return tam_fonte;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setTam_fonte(String tam_fonte) {
        this.tam_fonte = tam_fonte;
    }

}
