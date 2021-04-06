
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "serie",
    "num_doc",
    "chv_nfe",
    "dt_doc",
    "cod_item",
    "_1110"
})
public class _1105 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String serie;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String chv_nfe;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private List<_1110> _1110;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getSerie() {
        return serie;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getChv_nfe() {
        return chv_nfe;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getCod_item() {
        return cod_item;
    }

    public List<_1110> get_1110() {
        return _1110;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setChv_nfe(String chv_nfe) {
        this.chv_nfe = chv_nfe;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void set_1110(List<_1110> _1110) {
        this._1110 = _1110;
    }

}
