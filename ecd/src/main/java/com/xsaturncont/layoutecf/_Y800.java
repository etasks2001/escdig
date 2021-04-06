
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "arq_rtf",
    "ind_fim_rtf"
})
public class _Y800 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String arq_rtf;
    @FieldDetail(number = 3, required = true)
    private String ind_fim_rtf;

    public String getReg() {
        return reg;
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

    public void setArq_rtf(String arq_rtf) {
        this.arq_rtf = arq_rtf;
    }

    public void setInd_fim_rtf(String ind_fim_rtf) {
        this.ind_fim_rtf = ind_fim_rtf;
    }

}
