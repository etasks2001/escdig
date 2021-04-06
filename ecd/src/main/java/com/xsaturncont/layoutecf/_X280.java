
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_ativ",
    "ind_proj",
    "ato_conc",
    "vig_ini",
    "vig_fim"
})
public class _X280 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String ind_ativ;
    @FieldDetail(number = 3, required = true)
    private String ind_proj;
    @FieldDetail(number = 4, required = true)
    private String ato_conc;
    @FieldDetail(number = 5, required = true)
    private String vig_ini;
    @FieldDetail(number = 6, required = true)
    private String vig_fim;

    public String getReg() {
        return reg;
    }

    public String getInd_ativ() {
        return ind_ativ;
    }

    public String getInd_proj() {
        return ind_proj;
    }

    public String getAto_conc() {
        return ato_conc;
    }

    public String getVig_ini() {
        return vig_ini;
    }

    public String getVig_fim() {
        return vig_fim;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_ativ(String ind_ativ) {
        this.ind_ativ = ind_ativ;
    }

    public void setInd_proj(String ind_proj) {
        this.ind_proj = ind_proj;
    }

    public void setAto_conc(String ato_conc) {
        this.ato_conc = ato_conc;
    }

    public void setVig_ini(String vig_ini) {
        this.vig_ini = vig_ini;
    }

    public void setVig_fim(String vig_fim) {
        this.vig_fim = vig_fim;
    }

}
