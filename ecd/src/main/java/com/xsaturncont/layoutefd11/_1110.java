
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "cod_mod",
    "ser",
    "num_doc",
    "dt_doc",
    "chv_nfe",
    "nr_memo",
    "qtd",
    "unid"
})
public class _1110 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part;
    @FieldDetail(number = 3)
    private String cod_mod;
    @FieldDetail(number = 4)
    private String ser;
    @FieldDetail(number = 5)
    private String num_doc;
    @FieldDetail(number = 6)
    private String dt_doc;
    @FieldDetail(number = 7)
    private String chv_nfe;
    @FieldDetail(number = 8)
    private String nr_memo;
    @FieldDetail(number = 9)
    private String qtd;
    @FieldDetail(number = 10)
    private String unid;

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

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getChv_nfe() {
        return chv_nfe;
    }

    public String getNr_memo() {
        return nr_memo;
    }

    public String getQtd() {
        return qtd;
    }

    public String getUnid() {
        return unid;
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

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setChv_nfe(String chv_nfe) {
        this.chv_nfe = chv_nfe;
    }

    public void setNr_memo(String nr_memo) {
        this.nr_memo = nr_memo;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

}
