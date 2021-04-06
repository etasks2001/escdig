
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "res_neg",
    "res_neg_real",
    "saldo_res_neg"
})
public class _X354 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String res_neg;
    @FieldDetail(number = 3)
    private String res_neg_real;
    @FieldDetail(number = 4)
    private String saldo_res_neg;

    public String getReg() {
        return reg;
    }

    public String getRes_neg() {
        return res_neg;
    }

    public String getRes_neg_real() {
        return res_neg_real;
    }

    public String getSaldo_res_neg() {
        return saldo_res_neg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRes_neg(String res_neg) {
        this.res_neg = res_neg;
    }

    public void setRes_neg_real(String res_neg_real) {
        this.res_neg_real = res_neg_real;
    }

    public void setSaldo_res_neg(String saldo_res_neg) {
        this.saldo_res_neg = saldo_res_neg;
    }

}
