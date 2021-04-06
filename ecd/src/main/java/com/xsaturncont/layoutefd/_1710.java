
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_doc_ini",
    "num_doc_fin"
})
public class _1710 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_doc_ini;
    @FieldDetail(number = 3)
    private String num_doc_fin;

    public String getReg() {
        return reg;
    }

    public String getNum_doc_ini() {
        return num_doc_ini;
    }

    public String getNum_doc_fin() {
        return num_doc_fin;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_doc_ini(String num_doc_ini) {
        this.num_doc_ini = num_doc_ini;
    }

    public void setNum_doc_fin(String num_doc_fin) {
        this.num_doc_fin = num_doc_fin;
    }

}
