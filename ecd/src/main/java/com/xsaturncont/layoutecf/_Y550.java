
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj_exp",
    "cod_ncm",
    "vl_venda"
})
public class _Y550 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cnpj_exp;
    @FieldDetail(number = 3, required = true)
    private String cod_ncm;
    @FieldDetail(number = 4, required = true)
    private String vl_venda;

    public String getReg() {
        return reg;
    }

    public String getCnpj_exp() {
        return cnpj_exp;
    }

    public String getCod_ncm() {
        return cod_ncm;
    }

    public String getVl_venda() {
        return vl_venda;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj_exp(String cnpj_exp) {
        this.cnpj_exp = cnpj_exp;
    }

    public void setCod_ncm(String cod_ncm) {
        this.cod_ncm = cod_ncm;
    }

    public void setVl_venda(String vl_venda) {
        this.vl_venda = vl_venda;
    }

}
