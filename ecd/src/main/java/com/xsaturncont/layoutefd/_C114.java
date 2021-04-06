
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ecf_fab",
    "ecf_cx",
    "num_doc",
    "dt_doc"
})
public class _C114 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mod;
    @FieldDetail(number = 3)
    private String ecf_fab;
    @FieldDetail(number = 4)
    private String ecf_cx;
    @FieldDetail(number = 5)
    private String num_doc;
    @FieldDetail(number = 6)
    private String dt_doc;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getEcf_fab() {
        return ecf_fab;
    }

    public String getEcf_cx() {
        return ecf_cx;
    }

    public String getNum_doc() {
        return num_doc;
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

    public void setEcf_fab(String ecf_fab) {
        this.ecf_fab = ecf_fab;
    }

    public void setEcf_cx(String ecf_cx) {
        this.ecf_cx = ecf_cx;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

}
