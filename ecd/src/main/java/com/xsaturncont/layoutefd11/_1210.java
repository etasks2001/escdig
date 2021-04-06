
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "tipo_util",
    "nr_doc",
    "vl_cred_util",
    "chv_doce"
})
public class _1210 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String tipo_util;
    @FieldDetail(number = 3)
    private String nr_doc;
    @FieldDetail(number = 4)
    private String vl_cred_util;
    @FieldDetail(number = 5)
    private String chv_doce;

    public String getReg() {
        return reg;
    }

    public String getTipo_util() {
        return tipo_util;
    }

    public String getNr_doc() {
        return nr_doc;
    }

    public String getVl_cred_util() {
        return vl_cred_util;
    }

    public String getChv_doce() {
        return chv_doce;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setTipo_util(String tipo_util) {
        this.tipo_util = tipo_util;
    }

    public void setNr_doc(String nr_doc) {
        this.nr_doc = nr_doc;
    }

    public void setVl_cred_util(String vl_cred_util) {
        this.vl_cred_util = vl_cred_util;
    }

    public void setChv_doce(String chv_doce) {
        this.chv_doce = chv_doce;
    }

}
