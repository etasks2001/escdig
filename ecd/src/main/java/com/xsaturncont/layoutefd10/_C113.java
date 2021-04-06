
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_oper",
    "ind_emit",
    "cod_part",
    "cod_mod",
    "ser",
    "sub",
    "num_doc",
    "dt_doc",
    "chv_doce"
})
public class _C113 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_oper;
    @FieldDetail(number = 3)
    private String ind_emit;
    @FieldDetail(number = 4)
    private String cod_part;
    @FieldDetail(number = 5)
    private String cod_mod;
    @FieldDetail(number = 6)
    private String ser;
    @FieldDetail(number = 7)
    private String sub;
    @FieldDetail(number = 8)
    private String num_doc;
    @FieldDetail(number = 9)
    private String dt_doc;
    @FieldDetail(number = 10)
    private String chv_doce;

    public String getReg() {
        return reg;
    }

    public String getInd_oper() {
        return ind_oper;
    }

    public String getInd_emit() {
        return ind_emit;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getSer() {
        return ser;
    }

    public String getSub() {
        return sub;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getChv_doce() {
        return chv_doce;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setChv_doce(String chv_doce) {
        this.chv_doce = chv_doce;
    }

}
