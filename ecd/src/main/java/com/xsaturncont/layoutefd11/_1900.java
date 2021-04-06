
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_apur_icms",
    "descr_compl_out_apur",
    "_1910"
})
public class _1900 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_apur_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String descr_compl_out_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private List<_1910> _1910;

    public String getReg() {
        return reg;
    }

    public String getInd_apur_icms() {
        return ind_apur_icms;
    }

    public String getDescr_compl_out_apur() {
        return descr_compl_out_apur;
    }

    public List<_1910> get_1910() {
        return _1910;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_apur_icms(String ind_apur_icms) {
        this.ind_apur_icms = ind_apur_icms;
    }

    public void setDescr_compl_out_apur(String descr_compl_out_apur) {
        this.descr_compl_out_apur = descr_compl_out_apur;
    }

    public void set_1910(List<_1910> _1910) {
        this._1910 = _1910;
    }

}
