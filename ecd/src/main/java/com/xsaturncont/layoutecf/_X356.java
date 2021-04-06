
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "perc_part",
    "ativo_total",
    "pat_liquido"
})
public class _X356 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String perc_part;
    @FieldDetail(number = 3)
    private String ativo_total;
    @FieldDetail(number = 4)
    private String pat_liquido;

    public String getReg() {
        return reg;
    }

    public String getPerc_part() {
        return perc_part;
    }

    public String getAtivo_total() {
        return ativo_total;
    }

    public String getPat_liquido() {
        return pat_liquido;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setPerc_part(String perc_part) {
        this.perc_part = perc_part;
    }

    public void setAtivo_total(String ativo_total) {
        this.ativo_total = ativo_total;
    }

    public void setPat_liquido(String pat_liquido) {
        this.pat_liquido = pat_liquido;
    }

}
