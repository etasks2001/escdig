
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj",
    "cod_ncm",
    "vl_compra",
    "vl_exp"
})
public class _Y560 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj;
    @FieldDetail(number = 3, required = true)
    private String cod_ncm;
    @FieldDetail(number = 4)
    private String vl_compra;
    @FieldDetail(number = 5)
    private String vl_exp;

    public String getReg() {
        return reg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCod_ncm() {
        return cod_ncm;
    }

    public String getVl_compra() {
        return vl_compra;
    }

    public String getVl_exp() {
        return vl_exp;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCod_ncm(String cod_ncm) {
        this.cod_ncm = cod_ncm;
    }

    public void setVl_compra(String vl_compra) {
        this.vl_compra = vl_compra;
    }

    public void setVl_exp(String vl_exp) {
        this.vl_exp = vl_exp;
    }

}
