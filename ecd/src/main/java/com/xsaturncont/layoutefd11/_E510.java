
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cfop",
    "cst_ipi",
    "vl_cont_ipi",
    "vl_bc_ipi",
    "vl_ipi"
})
public class _E510 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cfop;
    @FieldDetail(number = 3)
    private String cst_ipi;
    @FieldDetail(number = 4)
    private String vl_cont_ipi;
    @FieldDetail(number = 5)
    private String vl_bc_ipi;
    @FieldDetail(number = 6)
    private String vl_ipi;

    public String getReg() {
        return reg;
    }

    public String getCfop() {
        return cfop;
    }

    public String getCst_ipi() {
        return cst_ipi;
    }

    public String getVl_cont_ipi() {
        return vl_cont_ipi;
    }

    public String getVl_bc_ipi() {
        return vl_bc_ipi;
    }

    public String getVl_ipi() {
        return vl_ipi;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public void setCst_ipi(String cst_ipi) {
        this.cst_ipi = cst_ipi;
    }

    public void setVl_cont_ipi(String vl_cont_ipi) {
        this.vl_cont_ipi = vl_cont_ipi;
    }

    public void setVl_bc_ipi(String vl_bc_ipi) {
        this.vl_bc_ipi = vl_bc_ipi;
    }

    public void setVl_ipi(String vl_ipi) {
        this.vl_ipi = vl_ipi;
    }

}
