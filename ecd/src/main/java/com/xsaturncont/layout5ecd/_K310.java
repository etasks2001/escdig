
package com.xsaturncont.layout5ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "emp_cod_parte",
    "valor",
    "ind_valor",
    "_K315"
})
public class _K310 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String emp_cod_parte;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String valor;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String ind_valor;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private List<_K315> _K315;

    public String getReg() {
        return reg;
    }

    public String getEmp_cod_parte() {
        return emp_cod_parte;
    }

    public String getValor() {
        return valor;
    }

    public String getInd_valor() {
        return ind_valor;
    }

    public List<_K315> get_K315() {
        return _K315;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setEmp_cod_parte(String emp_cod_parte) {
        this.emp_cod_parte = emp_cod_parte;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setInd_valor(String ind_valor) {
        this.ind_valor = ind_valor;
    }

    public void set_K315(List<_K315> _K315) {
        this._K315 = _K315;
    }

}
