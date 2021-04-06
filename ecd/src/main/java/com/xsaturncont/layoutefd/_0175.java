
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_alt",
    "nr_campo",
    "cont_ant"
})
public class _0175 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_alt;
    @FieldDetail(number = 3)
    private String nr_campo;
    @FieldDetail(number = 4)
    private String cont_ant;

    public String getReg() {
        return reg;
    }

    public String getDt_alt() {
        return dt_alt;
    }

    public String getNr_campo() {
        return nr_campo;
    }

    public String getCont_ant() {
        return cont_ant;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_alt(String dt_alt) {
        this.dt_alt = dt_alt;
    }

    public void setNr_campo(String nr_campo) {
        this.nr_campo = nr_campo;
    }

    public void setCont_ant(String cont_ant) {
        this.cont_ant = cont_ant;
    }

}
