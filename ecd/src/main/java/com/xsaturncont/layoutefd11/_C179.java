
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "bc_st_orig_dest",
    "icms_st_rep",
    "icms_st_compl",
    "bc_ret",
    "icms_ret"
})
public class _C179 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String bc_st_orig_dest;
    @FieldDetail(number = 3)
    private String icms_st_rep;
    @FieldDetail(number = 4)
    private String icms_st_compl;
    @FieldDetail(number = 5)
    private String bc_ret;
    @FieldDetail(number = 6)
    private String icms_ret;

    public String getReg() {
        return reg;
    }

    public String getBc_st_orig_dest() {
        return bc_st_orig_dest;
    }

    public String getIcms_st_rep() {
        return icms_st_rep;
    }

    public String getIcms_st_compl() {
        return icms_st_compl;
    }

    public String getBc_ret() {
        return bc_ret;
    }

    public String getIcms_ret() {
        return icms_ret;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setBc_st_orig_dest(String bc_st_orig_dest) {
        this.bc_st_orig_dest = bc_st_orig_dest;
    }

    public void setIcms_st_rep(String icms_st_rep) {
        this.icms_st_rep = icms_st_rep;
    }

    public void setIcms_st_compl(String icms_st_compl) {
        this.icms_st_compl = icms_st_compl;
    }

    public void setBc_ret(String bc_ret) {
        this.bc_ret = bc_ret;
    }

    public void setIcms_ret(String icms_ret) {
        this.icms_ret = icms_ret;
    }

}
