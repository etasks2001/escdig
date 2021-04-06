
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item",
    "qtd_cor_pos",
    "qtd_cor_neg",
    "cod_ins_subst"
})
public class _K275 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_item;
    @FieldDetail(number = 3)
    private String qtd_cor_pos;
    @FieldDetail(number = 4)
    private String qtd_cor_neg;
    @FieldDetail(number = 5)
    private String cod_ins_subst;

    public String getReg() {
        return reg;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd_cor_pos() {
        return qtd_cor_pos;
    }

    public String getQtd_cor_neg() {
        return qtd_cor_neg;
    }

    public String getCod_ins_subst() {
        return cod_ins_subst;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd_cor_pos(String qtd_cor_pos) {
        this.qtd_cor_pos = qtd_cor_pos;
    }

    public void setQtd_cor_neg(String qtd_cor_neg) {
        this.qtd_cor_neg = qtd_cor_neg;
    }

    public void setCod_ins_subst(String cod_ins_subst) {
        this.cod_ins_subst = cod_ins_subst;
    }

}
