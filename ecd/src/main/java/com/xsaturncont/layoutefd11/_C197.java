
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_aj",
    "descr_compl_aj",
    "cod_item",
    "vl_bc_icms",
    "aliq_icms",
    "vl_icms",
    "vl_outros"
})
public class _C197 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_aj;
    @FieldDetail(number = 3)
    private String descr_compl_aj;
    @FieldDetail(number = 4)
    private String cod_item;
    @FieldDetail(number = 5)
    private String vl_bc_icms;
    @FieldDetail(number = 6)
    private String aliq_icms;
    @FieldDetail(number = 7)
    private String vl_icms;
    @FieldDetail(number = 8)
    private String vl_outros;

    public String getReg() {
        return reg;
    }

    public String getCod_aj() {
        return cod_aj;
    }

    public String getDescr_compl_aj() {
        return descr_compl_aj;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getAliq_icms() {
        return aliq_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public String getVl_outros() {
        return vl_outros;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_aj(String cod_aj) {
        this.cod_aj = cod_aj;
    }

    public void setDescr_compl_aj(String descr_compl_aj) {
        this.descr_compl_aj = descr_compl_aj;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void setVl_outros(String vl_outros) {
        this.vl_outros = vl_outros;
    }

}
