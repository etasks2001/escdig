
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "rend_pass_prop",
    "rend_pass_prop_real",
    "rend_total",
    "rend_total_real",
    "rend_ativ_prop",
    "rend_ativ_prop_real",
    "percentual"
})
public class _X355 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String rend_pass_prop;
    @FieldDetail(number = 3)
    private String rend_pass_prop_real;
    @FieldDetail(number = 4)
    private String rend_total;
    @FieldDetail(number = 5)
    private String rend_total_real;
    @FieldDetail(number = 6)
    private String rend_ativ_prop;
    @FieldDetail(number = 7)
    private String rend_ativ_prop_real;
    @FieldDetail(number = 8)
    private String percentual;

    public String getReg() {
        return reg;
    }

    public String getRend_pass_prop() {
        return rend_pass_prop;
    }

    public String getRend_pass_prop_real() {
        return rend_pass_prop_real;
    }

    public String getRend_total() {
        return rend_total;
    }

    public String getRend_total_real() {
        return rend_total_real;
    }

    public String getRend_ativ_prop() {
        return rend_ativ_prop;
    }

    public String getRend_ativ_prop_real() {
        return rend_ativ_prop_real;
    }

    public String getPercentual() {
        return percentual;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRend_pass_prop(String rend_pass_prop) {
        this.rend_pass_prop = rend_pass_prop;
    }

    public void setRend_pass_prop_real(String rend_pass_prop_real) {
        this.rend_pass_prop_real = rend_pass_prop_real;
    }

    public void setRend_total(String rend_total) {
        this.rend_total = rend_total;
    }

    public void setRend_total_real(String rend_total_real) {
        this.rend_total_real = rend_total_real;
    }

    public void setRend_ativ_prop(String rend_ativ_prop) {
        this.rend_ativ_prop = rend_ativ_prop;
    }

    public void setRend_ativ_prop_real(String rend_ativ_prop_real) {
        this.rend_ativ_prop_real = rend_ativ_prop_real;
    }

    public void setPercentual(String percentual) {
        this.percentual = percentual;
    }

}
