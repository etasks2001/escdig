
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_doc_canc"
})
public class _D411 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_doc_canc;

    public String getReg() {
        return reg;
    }

    public String getNum_doc_canc() {
        return num_doc_canc;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_doc_canc(String num_doc_canc) {
        this.num_doc_canc = num_doc_canc;
    }

}
