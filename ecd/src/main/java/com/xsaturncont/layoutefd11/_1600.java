
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "tot_credito",
    "tot_debito"
})
public class _1600 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part;
    @FieldDetail(number = 3)
    private String tot_credito;
    @FieldDetail(number = 4)
    private String tot_debito;

    public String getReg() {
        return reg;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getTot_credito() {
        return tot_credito;
    }

    public String getTot_debito() {
        return tot_debito;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setTot_credito(String tot_credito) {
        this.tot_credito = tot_credito;
    }

    public void setTot_debito(String tot_debito) {
        this.tot_debito = tot_debito;
    }

}
