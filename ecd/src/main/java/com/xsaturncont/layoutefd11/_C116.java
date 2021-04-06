
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "nr_sat",
    "chv_cfe",
    "num_cfe",
    "dt_doc"
})
public class _C116 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mod;
    @FieldDetail(number = 3)
    private String nr_sat;
    @FieldDetail(number = 4)
    private String chv_cfe;
    @FieldDetail(number = 5)
    private String num_cfe;
    @FieldDetail(number = 6)
    private String dt_doc;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getNr_sat() {
        return nr_sat;
    }

    public String getChv_cfe() {
        return chv_cfe;
    }

    public String getNum_cfe() {
        return num_cfe;
    }

    public String getDt_doc() {
        return dt_doc;
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

    public void setChv_cfe(String chv_cfe) {
        this.chv_cfe = chv_cfe;
    }

    public void setNum_cfe(String num_cfe) {
        this.num_cfe = num_cfe;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

}
