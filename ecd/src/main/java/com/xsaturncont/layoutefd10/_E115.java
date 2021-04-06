
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_inf_adic",
    "vl_inf_adic",
    "descr_compl_aj"
})
public class _E115 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_inf_adic;
    @FieldDetail(number = 3)
    private String vl_inf_adic;
    @FieldDetail(number = 4)
    private String descr_compl_aj;

    public String getReg() {
        return reg;
    }

    public String getCod_inf_adic() {
        return cod_inf_adic;
    }

    public String getVl_inf_adic() {
        return vl_inf_adic;
    }

    public String getDescr_compl_aj() {
        return descr_compl_aj;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_inf_adic(String cod_inf_adic) {
        this.cod_inf_adic = cod_inf_adic;
    }

    public void setVl_inf_adic(String vl_inf_adic) {
        this.vl_inf_adic = vl_inf_adic;
    }

    public void setDescr_compl_aj(String descr_compl_aj) {
        this.descr_compl_aj = descr_compl_aj;
    }

}
