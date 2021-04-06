
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "tipo_doc",
    "desc_rtf",
    "hash_rtf",
    "arq_rtf",
    "ind_fim_rtf"
})
public class _J800 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String tipo_doc;
    @FieldDetail(number = 3)
    private String desc_rtf;
    @FieldDetail(number = 4)
    private String hash_rtf;
    @FieldDetail(number = 5, required = true)
    private String arq_rtf;
    @FieldDetail(number = 6, required = true)
    private String ind_fim_rtf;

    public String getReg() {
        return reg;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public String getDesc_rtf() {
        return desc_rtf;
    }

    public String getHash_rtf() {
        return hash_rtf;
    }

    public String getArq_rtf() {
        return arq_rtf;
    }

    public String getInd_fim_rtf() {
        return ind_fim_rtf;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public void setDesc_rtf(String desc_rtf) {
        this.desc_rtf = desc_rtf;
    }

    public void setHash_rtf(String hash_rtf) {
        this.hash_rtf = hash_rtf;
    }

    public void setArq_rtf(String arq_rtf) {
        this.arq_rtf = arq_rtf;
    }

    public void setInd_fim_rtf(String ind_fim_rtf) {
        this.ind_fim_rtf = ind_fim_rtf;
    }

}
