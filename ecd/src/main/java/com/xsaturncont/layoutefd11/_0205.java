
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "descr_ant_item",
    "dt_ini",
    "dt_fim",
    "cod_ant_item"
})
public class _0205 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String descr_ant_item;
    @FieldDetail(number = 3)
    private String dt_ini;
    @FieldDetail(number = 4)
    private String dt_fim;
    @FieldDetail(number = 5)
    private String cod_ant_item;

    public String getReg() {
        return reg;
    }

    public String getDescr_ant_item() {
        return descr_ant_item;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fim() {
        return dt_fim;
    }

    public String getCod_ant_item() {
        return cod_ant_item;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDescr_ant_item(String descr_ant_item) {
        this.descr_ant_item = descr_ant_item;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fim(String dt_fim) {
        this.dt_fim = dt_fim;
    }

    public void setCod_ant_item(String cod_ant_item) {
        this.cod_ant_item = cod_ant_item;
    }

}
