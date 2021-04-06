
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_emit",
    "cod_part",
    "cod_mod",
    "serie",
    "num_doc",
    "chv_nfe_cte",
    "dt_doc",
    "_G140"
})
public class _G130 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_emit;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_part;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String serie;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String chv_nfe_cte;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private List<_G140> _G140;

    public String getReg() {
        return reg;
    }

    public String getInd_emit() {
        return ind_emit;
    }

    public String getCod_part() {
        return cod_part;
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

    public String getChv_nfe_cte() {
        return chv_nfe_cte;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public List<_G140> get_G140() {
        return _G140;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
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

    public void setChv_nfe_cte(String chv_nfe_cte) {
        this.chv_nfe_cte = chv_nfe_cte;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void set_G140(List<_G140> _G140) {
        this._G140 = _G140;
    }

}
