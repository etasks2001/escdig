
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ser",
    "num_doc",
    "dt_doc",
    "vl_doc",
    "vl_merc",
    "qtd_vol",
    "peso_brt",
    "peso_liq"
})
public class _D162 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mod;
    @FieldDetail(number = 3)
    private String ser;
    @FieldDetail(number = 4)
    private String num_doc;
    @FieldDetail(number = 5)
    private String dt_doc;
    @FieldDetail(number = 6)
    private String vl_doc;
    @FieldDetail(number = 7)
    private String vl_merc;
    @FieldDetail(number = 8)
    private String qtd_vol;
    @FieldDetail(number = 9)
    private String peso_brt;
    @FieldDetail(number = 10)
    private String peso_liq;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getSer() {
        return ser;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_merc() {
        return vl_merc;
    }

    public String getQtd_vol() {
        return qtd_vol;
    }

    public String getPeso_brt() {
        return peso_brt;
    }

    public String getPeso_liq() {
        return peso_liq;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_merc(String vl_merc) {
        this.vl_merc = vl_merc;
    }

    public void setQtd_vol(String qtd_vol) {
        this.qtd_vol = qtd_vol;
    }

    public void setPeso_brt(String peso_brt) {
        this.peso_brt = peso_brt;
    }

    public void setPeso_liq(String peso_liq) {
        this.peso_liq = peso_liq;
    }

}
