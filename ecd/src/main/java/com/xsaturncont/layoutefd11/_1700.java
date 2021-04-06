
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_disp",
    "cod_mod",
    "ser",
    "sub",
    "num_doc_ini",
    "num_doc_fin",
    "num_aut",
    "_1710"
})
public class _1700 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_disp;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String ser;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String sub;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String num_doc_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String num_doc_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String num_aut;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private List<_1710> _1710;

    public String getReg() {
        return reg;
    }

    public String getCod_disp() {
        return cod_disp;
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

    public String getNum_doc_ini() {
        return num_doc_ini;
    }

    public String getNum_doc_fin() {
        return num_doc_fin;
    }

    public String getNum_aut() {
        return num_aut;
    }

    public List<_1710> get_1710() {
        return _1710;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_disp(String cod_disp) {
        this.cod_disp = cod_disp;
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

    public void setNum_doc_ini(String num_doc_ini) {
        this.num_doc_ini = num_doc_ini;
    }

    public void setNum_doc_fin(String num_doc_fin) {
        this.num_doc_fin = num_doc_fin;
    }

    public void setNum_aut(String num_aut) {
        this.num_aut = num_aut;
    }

    public void set_1710(List<_1710> _1710) {
        this._1710 = _1710;
    }

}
