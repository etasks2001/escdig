
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_idt",
    "cod_cnt_corr",
    "nat_sub_cnt"
})
public class _J053 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_idt;
    @FieldDetail(number = 3, required = true)
    private String cod_cnt_corr;
    @FieldDetail(number = 4, required = true)
    private String nat_sub_cnt;

    public String getReg() {
        return reg;
    }

    public String getCod_idt() {
        return cod_idt;
    }

    public String getCod_cnt_corr() {
        return cod_cnt_corr;
    }

    public String getNat_sub_cnt() {
        return nat_sub_cnt;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_idt(String cod_idt) {
        this.cod_idt = cod_idt;
    }

    public void setCod_cnt_corr(String cod_cnt_corr) {
        this.cod_cnt_corr = cod_cnt_corr;
    }

    public void setNat_sub_cnt(String nat_sub_cnt) {
        this.nat_sub_cnt = nat_sub_cnt;
    }

}
