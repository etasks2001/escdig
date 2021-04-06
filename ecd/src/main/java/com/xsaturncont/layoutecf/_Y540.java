
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj_estab",
    "vl_rec_estab",
    "cnae"
})
public class _Y540 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj_estab;
    @FieldDetail(number = 3, required = true)
    private String vl_rec_estab;
    @FieldDetail(number = 4, required = true)
    private String cnae;

    public String getReg() {
        return reg;
    }

    public String getCnpj_estab() {
        return cnpj_estab;
    }

    public String getVl_rec_estab() {
        return vl_rec_estab;
    }

    public String getCnae() {
        return cnae;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj_estab(String cnpj_estab) {
        this.cnpj_estab = cnpj_estab;
    }

    public void setVl_rec_estab(String vl_rec_estab) {
        this.vl_rec_estab = vl_rec_estab;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

}
