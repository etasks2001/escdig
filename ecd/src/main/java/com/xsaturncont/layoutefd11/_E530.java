
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_aj",
    "vl_aj",
    "cod_aj",
    "ind_doc",
    "num_doc",
    "descr_aj"
})
public class _E530 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_aj;
    @FieldDetail(number = 3)
    private String vl_aj;
    @FieldDetail(number = 4)
    private String cod_aj;
    @FieldDetail(number = 5)
    private String ind_doc;
    @FieldDetail(number = 6)
    private String num_doc;
    @FieldDetail(number = 7)
    private String descr_aj;

    public String getReg() {
        return reg;
    }

    public String getInd_aj() {
        return ind_aj;
    }

    public String getVl_aj() {
        return vl_aj;
    }

    public String getCod_aj() {
        return cod_aj;
    }

    public String getInd_doc() {
        return ind_doc;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDescr_aj() {
        return descr_aj;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_aj(String ind_aj) {
        this.ind_aj = ind_aj;
    }

    public void setVl_aj(String vl_aj) {
        this.vl_aj = vl_aj;
    }

    public void setCod_aj(String cod_aj) {
        this.cod_aj = cod_aj;
    }

    public void setInd_doc(String ind_doc) {
        this.ind_doc = ind_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDescr_aj(String descr_aj) {
        this.descr_aj = descr_aj;
    }

}
