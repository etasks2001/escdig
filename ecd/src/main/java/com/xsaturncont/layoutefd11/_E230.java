
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_da",
    "num_proc",
    "ind_proc",
    "proc",
    "txt_compl"
})
public class _E230 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_da;
    @FieldDetail(number = 3)
    private String num_proc;
    @FieldDetail(number = 4)
    private String ind_proc;
    @FieldDetail(number = 5)
    private String proc;
    @FieldDetail(number = 6)
    private String txt_compl;

    public String getReg() {
        return reg;
    }

    public String getNum_da() {
        return num_da;
    }

    public String getNum_proc() {
        return num_proc;
    }

    public String getInd_proc() {
        return ind_proc;
    }

    public String getProc() {
        return proc;
    }

    public String getTxt_compl() {
        return txt_compl;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_da(String num_da) {
        this.num_da = num_da;
    }

    public void setNum_proc(String num_proc) {
        this.num_proc = num_proc;
    }

    public void setInd_proc(String ind_proc) {
        this.ind_proc = ind_proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

}
