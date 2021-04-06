
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "nr_sat",
    "dt_doc",
    "doc_ini",
    "doc_fim",
    "_C890"
})
public class _C860 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String nr_sat;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String doc_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String doc_fim;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private List<_C890> _C890;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getNr_sat() {
        return nr_sat;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getDoc_ini() {
        return doc_ini;
    }

    public String getDoc_fim() {
        return doc_fim;
    }

    public List<_C890> get_C890() {
        return _C890;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setNr_sat(String nr_sat) {
        this.nr_sat = nr_sat;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setDoc_ini(String doc_ini) {
        this.doc_ini = doc_ini;
    }

    public void setDoc_fim(String doc_fim) {
        this.doc_fim = doc_fim;
    }

    public void set_C890(List<_C890> _C890) {
        this._C890 = _C890;
    }

}
