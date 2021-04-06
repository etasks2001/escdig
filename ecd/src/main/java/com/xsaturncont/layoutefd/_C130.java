
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_serv_nt",
    "vl_bc_issqn",
    "vl_issqn",
    "vl_bc_irrf",
    "vl_irrf",
    "vl_bc_prev",
    "vl_prev"
})
public class _C130 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String vl_serv_nt;
    @FieldDetail(number = 3)
    private String vl_bc_issqn;
    @FieldDetail(number = 4)
    private String vl_issqn;
    @FieldDetail(number = 5)
    private String vl_bc_irrf;
    @FieldDetail(number = 6)
    private String vl_irrf;
    @FieldDetail(number = 7)
    private String vl_bc_prev;
    @FieldDetail(number = 8)
    private String vl_prev;

    public String getReg() {
        return reg;
    }

    public String getVl_serv_nt() {
        return vl_serv_nt;
    }

    public String getVl_bc_issqn() {
        return vl_bc_issqn;
    }

    public String getVl_issqn() {
        return vl_issqn;
    }

    public String getVl_bc_irrf() {
        return vl_bc_irrf;
    }

    public String getVl_irrf() {
        return vl_irrf;
    }

    public String getVl_bc_prev() {
        return vl_bc_prev;
    }

    public String getVl_prev() {
        return vl_prev;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_serv_nt(String vl_serv_nt) {
        this.vl_serv_nt = vl_serv_nt;
    }

    public void setVl_bc_issqn(String vl_bc_issqn) {
        this.vl_bc_issqn = vl_bc_issqn;
    }

    public void setVl_issqn(String vl_issqn) {
        this.vl_issqn = vl_issqn;
    }

    public void setVl_bc_irrf(String vl_bc_irrf) {
        this.vl_bc_irrf = vl_bc_irrf;
    }

    public void setVl_irrf(String vl_irrf) {
        this.vl_irrf = vl_irrf;
    }

    public void setVl_bc_prev(String vl_bc_prev) {
        this.vl_bc_prev = vl_bc_prev;
    }

    public void setVl_prev(String vl_prev) {
        this.vl_prev = vl_prev;
    }

}
