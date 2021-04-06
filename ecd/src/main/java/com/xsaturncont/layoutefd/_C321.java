
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item",
    "qtd",
    "unid",
    "vl_item",
    "vl_desc",
    "vl_bc_icms",
    "vl_icms",
    "vl_pis",
    "vl_cofins"
})
public class _C321 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_item;
    @FieldDetail(number = 3)
    private String qtd;
    @FieldDetail(number = 4)
    private String unid;
    @FieldDetail(number = 5)
    private String vl_item;
    @FieldDetail(number = 6)
    private String vl_desc;
    @FieldDetail(number = 7)
    private String vl_bc_icms;
    @FieldDetail(number = 8)
    private String vl_icms;
    @FieldDetail(number = 9)
    private String vl_pis;
    @FieldDetail(number = 10)
    private String vl_cofins;

    public String getReg() {
        return reg;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd() {
        return qtd;
    }

    public String getUnid() {
        return unid;
    }

    public String getVl_item() {
        return vl_item;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

}
