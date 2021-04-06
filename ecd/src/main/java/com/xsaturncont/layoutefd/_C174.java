
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_arm",
    "num_arm",
    "descr_compl"
})
public class _C174 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_arm;
    @FieldDetail(number = 3)
    private String num_arm;
    @FieldDetail(number = 4)
    private String descr_compl;

    public String getReg() {
        return reg;
    }

    public String getInd_arm() {
        return ind_arm;
    }

    public String getNum_arm() {
        return num_arm;
    }

    public String getDescr_compl() {
        return descr_compl;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_arm(String ind_arm) {
        this.ind_arm = ind_arm;
    }

    public void setNum_arm(String num_arm) {
        this.num_arm = num_arm;
    }

    public void setDescr_compl(String descr_compl) {
        this.descr_compl = descr_compl;
    }

}
