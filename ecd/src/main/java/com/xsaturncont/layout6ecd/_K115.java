
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "emp_cod_part",
    "cond_part",
    "per_evt"
})
public class _K115 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String emp_cod_part;
    @FieldDetail(number = 3, required = true)
    private String cond_part;
    @FieldDetail(number = 4, required = true)
    private String per_evt;

    public String getReg() {
        return reg;
    }

    public String getEmp_cod_part() {
        return emp_cod_part;
    }

    public String getCond_part() {
        return cond_part;
    }

    public String getPer_evt() {
        return per_evt;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setEmp_cod_part(String emp_cod_part) {
        this.emp_cod_part = emp_cod_part;
    }

    public void setCond_part(String cond_part) {
        this.cond_part = cond_part;
    }

    public void setPer_evt(String per_evt) {
        this.per_evt = per_evt;
    }

}
