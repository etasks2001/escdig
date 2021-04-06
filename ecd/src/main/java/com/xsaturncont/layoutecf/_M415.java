
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_proc",
    "num_proc"
})
public class _M415 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String ind_proc;
    @FieldDetail(number = 3, required = true)
    private String num_proc;

    public String getReg() {
        return reg;
    }

    public String getInd_proc() {
        return ind_proc;
    }

    public String getNum_proc() {
        return num_proc;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_proc(String ind_proc) {
        this.ind_proc = ind_proc;
    }

    public void setNum_proc(String num_proc) {
        this.num_proc = num_proc;
    }

}
