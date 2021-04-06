
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "res_per",
    "res_per_real",
    "luc_disp",
    "luc_disp_real"
})
public class _X352 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String res_per;
    @FieldDetail(number = 3)
    private String res_per_real;
    @FieldDetail(number = 4)
    private String luc_disp;
    @FieldDetail(number = 5)
    private String luc_disp_real;

    public String getReg() {
        return reg;
    }

    public String getRes_per() {
        return res_per;
    }

    public String getRes_per_real() {
        return res_per_real;
    }

    public String getLuc_disp() {
        return luc_disp;
    }

    public String getLuc_disp_real() {
        return luc_disp_real;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRes_per(String res_per) {
        this.res_per = res_per;
    }

    public void setRes_per_real(String res_per_real) {
        this.res_per_real = res_per_real;
    }

    public void setLuc_disp(String luc_disp) {
        this.luc_disp = luc_disp;
    }

    public void setLuc_disp_real(String luc_disp_real) {
        this.luc_disp_real = luc_disp_real;
    }

}
