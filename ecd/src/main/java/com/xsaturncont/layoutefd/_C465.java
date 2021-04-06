
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "chv_cfe",
    "num_ccf"
})
public class _C465 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String chv_cfe;
    @FieldDetail(number = 3)
    private String num_ccf;

    public String getReg() {
        return reg;
    }

    public String getChv_cfe() {
        return chv_cfe;
    }

    public String getNum_ccf() {
        return num_ccf;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setChv_cfe(String chv_cfe) {
        this.chv_cfe = chv_cfe;
    }

    public void setNum_ccf(String num_ccf) {
        this.num_ccf = num_ccf;
    }

}
