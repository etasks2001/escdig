
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_fcp_uf_dest",
    "vl_icms_uf_dest",
    "vl_icms_uf_rem"
})
public class _C101 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String vl_fcp_uf_dest;
    @FieldDetail(number = 3)
    private String vl_icms_uf_dest;
    @FieldDetail(number = 4)
    private String vl_icms_uf_rem;

    public String getReg() {
        return reg;
    }

    public String getVl_fcp_uf_dest() {
        return vl_fcp_uf_dest;
    }

    public String getVl_icms_uf_dest() {
        return vl_icms_uf_dest;
    }

    public String getVl_icms_uf_rem() {
        return vl_icms_uf_rem;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_fcp_uf_dest(String vl_fcp_uf_dest) {
        this.vl_fcp_uf_dest = vl_fcp_uf_dest;
    }

    public void setVl_icms_uf_dest(String vl_icms_uf_dest) {
        this.vl_icms_uf_dest = vl_icms_uf_dest;
    }

    public void setVl_icms_uf_rem(String vl_icms_uf_rem) {
        this.vl_icms_uf_rem = vl_icms_uf_rem;
    }

}
