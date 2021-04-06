
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_sa\u00edda",
    "cod_item",
    "qtd",
    "cod_ins_subst"
})
public class _K235 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_sa�da;
    @FieldDetail(number = 3)
    private String cod_item;
    @FieldDetail(number = 4)
    private String qtd;
    @FieldDetail(number = 5)
    private String cod_ins_subst;

    public String getReg() {
        return reg;
    }

    public String getDt_sa�da() {
        return dt_sa�da;
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

    public void setDt_sa�da(String dt_sa�da) {
        this.dt_sa�da = dt_sa�da;
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
