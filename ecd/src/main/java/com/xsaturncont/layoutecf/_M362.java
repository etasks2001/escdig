
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_lcto"
})
public class _M362 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String num_lcto;

    public String getReg() {
        return reg;
    }

    public String getNum_lcto() {
        return num_lcto;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_lcto(String num_lcto) {
        this.num_lcto = num_lcto;
    }

}
