
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_bc_issqn",
    "aliq_issqn",
    "vl_issqn"
})
public class _C172 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String vl_bc_issqn;
    @FieldDetail(number = 3)
    private String aliq_issqn;
    @FieldDetail(number = 4)
    private String vl_issqn;

    public String getReg() {
        return reg;
    }

    public String getVl_bc_issqn() {
        return vl_bc_issqn;
    }

    public String getAliq_issqn() {
        return aliq_issqn;
    }

    public String getVl_issqn() {
        return vl_issqn;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_bc_issqn(String vl_bc_issqn) {
        this.vl_bc_issqn = vl_bc_issqn;
    }

    public void setAliq_issqn(String aliq_issqn) {
        this.aliq_issqn = aliq_issqn;
    }

    public void setVl_issqn(String vl_issqn) {
        this.vl_issqn = vl_issqn;
    }

}
