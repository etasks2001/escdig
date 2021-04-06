
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_selo_ipi",
    "qt_selo_ipi"
})
public class _C177 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_selo_ipi;
    @FieldDetail(number = 3)
    private String qt_selo_ipi;

    public String getReg() {
        return reg;
    }

    public String getCod_selo_ipi() {
        return cod_selo_ipi;
    }

    public String getQt_selo_ipi() {
        return qt_selo_ipi;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_selo_ipi(String cod_selo_ipi) {
        this.cod_selo_ipi = cod_selo_ipi;
    }

    public void setQt_selo_ipi(String qt_selo_ipi) {
        this.qt_selo_ipi = qt_selo_ipi;
    }

}
