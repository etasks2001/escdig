
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cl_enq",
    "vl_unid",
    "quant_pad"
})
public class _C178 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cl_enq;
    @FieldDetail(number = 3)
    private String vl_unid;
    @FieldDetail(number = 4)
    private String quant_pad;

    public String getReg() {
        return reg;
    }

    public String getCl_enq() {
        return cl_enq;
    }

    public String getVl_unid() {
        return vl_unid;
    }

    public String getQuant_pad() {
        return quant_pad;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCl_enq(String cl_enq) {
        this.cl_enq = cl_enq;
    }

    public void setVl_unid(String vl_unid) {
        this.vl_unid = vl_unid;
    }

    public void setQuant_pad(String quant_pad) {
        this.quant_pad = quant_pad;
    }

}
