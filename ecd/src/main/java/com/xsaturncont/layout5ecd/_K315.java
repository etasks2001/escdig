
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "emp_cod_contra",
    "cod_contra",
    "valor",
    "ind_valor"
})
public class _K315 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String emp_cod_contra;
    @FieldDetail(number = 3, required = true)
    private String cod_contra;
    @FieldDetail(number = 4, required = true)
    private String valor;
    @FieldDetail(number = 5, required = true)
    private String ind_valor;

    public String getReg() {
        return reg;
    }

    public String getEmp_cod_contra() {
        return emp_cod_contra;
    }

    public String getCod_contra() {
        return cod_contra;
    }

    public String getValor() {
        return valor;
    }

    public String getInd_valor() {
        return ind_valor;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setEmp_cod_contra(String emp_cod_contra) {
        this.emp_cod_contra = emp_cod_contra;
    }

    public void setCod_contra(String cod_contra) {
        this.cod_contra = cod_contra;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setInd_valor(String ind_valor) {
        this.ind_valor = ind_valor;
    }

}
