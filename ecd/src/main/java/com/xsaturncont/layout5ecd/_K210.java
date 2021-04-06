
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_emp",
    "cod_cta_emp"
})
public class _K210 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_emp;
    @FieldDetail(number = 3, required = true)
    private String cod_cta_emp;

    public String getReg() {
        return reg;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public String getCod_cta_emp() {
        return cod_cta_emp;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public void setCod_cta_emp(String cod_cta_emp) {
        this.cod_cta_emp = cod_cta_emp;
    }

}
