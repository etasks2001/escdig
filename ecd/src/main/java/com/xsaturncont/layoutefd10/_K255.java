
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_cons",
    "cod_item",
    "qtd",
    "cod_ins_subst"
})
public class _K255 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_cons;
    @FieldDetail(number = 3)
    private String cod_item;
    @FieldDetail(number = 4)
    private String qtd;
    @FieldDetail(number = 5)
    private String cod_ins_subst;

    public String getReg() {
        return reg;
    }

    public String getDt_cons() {
        return dt_cons;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd() {
        return qtd;
    }

    public String getCod_ins_subst() {
        return cod_ins_subst;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_cons(String dt_cons) {
        this.dt_cons = dt_cons;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void setCod_ins_subst(String cod_ins_subst) {
        this.cod_ins_subst = cod_ins_subst;
    }

}
