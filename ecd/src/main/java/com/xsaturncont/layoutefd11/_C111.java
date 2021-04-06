
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_proc",
    "ind_proc"
})
public class _C111 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_proc;
    @FieldDetail(number = 3)
    private String ind_proc;

    public String getReg() {
        return reg;
    }

    public String getNum_proc() {
        return num_proc;
    }

    public String getInd_proc() {
        return ind_proc;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_proc(String num_proc) {
        this.num_proc = num_proc;
    }

    public void setInd_proc(String ind_proc) {
        this.ind_proc = ind_proc;
    }

}
