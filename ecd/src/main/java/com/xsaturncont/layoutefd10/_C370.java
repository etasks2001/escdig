
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_item",
    "cod_item",
    "qtd",
    "unid",
    "vl_item",
    "vl_desc"
})
public class _C370 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_item;
    @FieldDetail(number = 3)
    private String cod_item;
    @FieldDetail(number = 4)
    private String qtd;
    @FieldDetail(number = 5)
    private String unid;
    @FieldDetail(number = 6)
    private String vl_item;
    @FieldDetail(number = 7)
    private String vl_desc;

    public String getReg() {
        return reg;
    }

    public String getNum_item() {
        return num_item;
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

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_item(String num_item) {
        this.num_item = num_item;
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

}
