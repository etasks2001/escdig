
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "cod_mod",
    "ser",
    "sub",
    "num_doc",
    "dt_doc",
    "cod_item",
    "vl_aj_item",
    "chv_doce"
})
public class _E113 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part;
    @FieldDetail(number = 3)
    private String cod_mod;
    @FieldDetail(number = 4)
    private String ser;
    @FieldDetail(number = 5)
    private String sub;
    @FieldDetail(number = 6)
    private String num_doc;
    @FieldDetail(number = 7)
    private String dt_doc;
    @FieldDetail(number = 8)
    private String cod_item;
    @FieldDetail(number = 9)
    private String vl_aj_item;
    @FieldDetail(number = 10)
    private String chv_doce;

    public String getReg() {
        return reg;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getSer() {
        return ser;
    }

    public String getSub() {
        return sub;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getVl_aj_item() {
        return vl_aj_item;
    }

    public String getChv_doce() {
        return chv_doce;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setVl_aj_item(String vl_aj_item) {
        this.vl_aj_item = vl_aj_item;
    }

    public void setChv_doce(String chv_doce) {
        this.chv_doce = chv_doce;
    }

}
