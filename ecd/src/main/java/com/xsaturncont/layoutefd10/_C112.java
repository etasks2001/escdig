
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_da",
    "uf",
    "num_da",
    "cod_aut",
    "vl_da",
    "dt_vcto",
    "dt_pgto"
})
public class _C112 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_da;
    @FieldDetail(number = 3)
    private String uf;
    @FieldDetail(number = 4)
    private String num_da;
    @FieldDetail(number = 5)
    private String cod_aut;
    @FieldDetail(number = 6)
    private String vl_da;
    @FieldDetail(number = 7)
    private String dt_vcto;
    @FieldDetail(number = 8)
    private String dt_pgto;

    public String getReg() {
        return reg;
    }

    public String getCod_da() {
        return cod_da;
    }

    public String getUf() {
        return uf;
    }

    public String getNum_da() {
        return num_da;
    }

    public String getCod_aut() {
        return cod_aut;
    }

    public String getVl_da() {
        return vl_da;
    }

    public String getDt_vcto() {
        return dt_vcto;
    }

    public String getDt_pgto() {
        return dt_pgto;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_da(String cod_da) {
        this.cod_da = cod_da;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setNum_da(String num_da) {
        this.num_da = num_da;
    }

    public void setCod_aut(String cod_aut) {
        this.cod_aut = cod_aut;
    }

    public void setVl_da(String vl_da) {
        this.vl_da = vl_da;
    }

    public void setDt_vcto(String dt_vcto) {
        this.dt_vcto = dt_vcto;
    }

    public void setDt_pgto(String dt_pgto) {
        this.dt_pgto = dt_pgto;
    }

}
