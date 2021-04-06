
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_nat",
    "descr_nat"
})
public class _0400 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_nat;
    @FieldDetail(number = 3)
    private String descr_nat;

    public String getReg() {
        return reg;
    }

    public String getCod_nat() {
        return cod_nat;
    }

    public String getDescr_nat() {
        return descr_nat;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
    }

    public void setDescr_nat(String descr_nat) {
        this.descr_nat = descr_nat;
    }

}
