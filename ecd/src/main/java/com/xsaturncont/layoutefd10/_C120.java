
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_doc_imp",
    "num_docimp",
    "pis_imp",
    "cofinsimp",
    "num_acdraw"
})
public class _C120 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_doc_imp;
    @FieldDetail(number = 3)
    private String num_docimp;
    @FieldDetail(number = 4)
    private String pis_imp;
    @FieldDetail(number = 5)
    private String cofinsimp;
    @FieldDetail(number = 6)
    private String num_acdraw;

    public String getReg() {
        return reg;
    }

    public String getCod_doc_imp() {
        return cod_doc_imp;
    }

    public String getNum_docimp() {
        return num_docimp;
    }

    public String getPis_imp() {
        return pis_imp;
    }

    public String getCofinsimp() {
        return cofinsimp;
    }

    public String getNum_acdraw() {
        return num_acdraw;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_doc_imp(String cod_doc_imp) {
        this.cod_doc_imp = cod_doc_imp;
    }

    public void setNum_docimp(String num_docimp) {
        this.num_docimp = num_docimp;
    }

    public void setPis_imp(String pis_imp) {
        this.pis_imp = pis_imp;
    }

    public void setCofinsimp(String cofinsimp) {
        this.cofinsimp = cofinsimp;
    }

    public void setNum_acdraw(String num_acdraw) {
        this.num_acdraw = num_acdraw;
    }

}
