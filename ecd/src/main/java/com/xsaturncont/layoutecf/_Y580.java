
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj",
    "tip_benef",
    "form_doa",
    "vl_doa"
})
public class _Y580 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj;
    @FieldDetail(number = 3, required = true)
    private String tip_benef;
    @FieldDetail(number = 4, required = true)
    private String form_doa;
    @FieldDetail(number = 5, required = true)
    private String vl_doa;

    public String getReg() {
        return reg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTip_benef() {
        return tip_benef;
    }

    public String getForm_doa() {
        return form_doa;
    }

    public String getVl_doa() {
        return vl_doa;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTip_benef(String tip_benef) {
        this.tip_benef = tip_benef;
    }

    public void setForm_doa(String form_doa) {
        this.form_doa = form_doa;
    }

    public void setVl_doa(String vl_doa) {
        this.vl_doa = vl_doa;
    }

}
