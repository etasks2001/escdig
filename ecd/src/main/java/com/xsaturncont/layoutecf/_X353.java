
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "res_neg_util",
    "res_neg_util_real",
    "saldo_res_neg_nao_util",
    "saldo_res_neg_nao_util_real"
})
public class _X353 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String res_neg_util;
    @FieldDetail(number = 3)
    private String res_neg_util_real;
    @FieldDetail(number = 4)
    private String saldo_res_neg_nao_util;
    @FieldDetail(number = 5)
    private String saldo_res_neg_nao_util_real;

    public String getReg() {
        return reg;
    }

    public String getRes_neg_util() {
        return res_neg_util;
    }

    public String getRes_neg_util_real() {
        return res_neg_util_real;
    }

    public String getSaldo_res_neg_nao_util() {
        return saldo_res_neg_nao_util;
    }

    public String getSaldo_res_neg_nao_util_real() {
        return saldo_res_neg_nao_util_real;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRes_neg_util(String res_neg_util) {
        this.res_neg_util = res_neg_util;
    }

    public void setRes_neg_util_real(String res_neg_util_real) {
        this.res_neg_util_real = res_neg_util_real;
    }

    public void setSaldo_res_neg_nao_util(String saldo_res_neg_nao_util) {
        this.saldo_res_neg_nao_util = saldo_res_neg_nao_util;
    }

    public void setSaldo_res_neg_nao_util_real(String saldo_res_neg_nao_util_real) {
        this.saldo_res_neg_nao_util_real = saldo_res_neg_nao_util_real;
    }

}
