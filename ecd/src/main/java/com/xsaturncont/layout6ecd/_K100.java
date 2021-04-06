
package com.xsaturncont.layout6ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_pais",
    "emp_cod",
    "cnpj",
    "nome",
    "per_part",
    "evento",
    "per_cons",
    "data_ini_emp",
    "data_fin_emp",
    "_K110"
})
public class _K100 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_pais;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String emp_cod;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String nome;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String per_part;
    @com.xsaturncont.annotation.FieldDetail(number = 7, required = true)
    private String evento;
    @com.xsaturncont.annotation.FieldDetail(number = 8, required = true)
    private String per_cons;
    @com.xsaturncont.annotation.FieldDetail(number = 9, required = true)
    private String data_ini_emp;
    @com.xsaturncont.annotation.FieldDetail(number = 10, required = true)
    private String data_fin_emp;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private List<_K110> _K110;

    public String getReg() {
        return reg;
    }

    public String getCod_pais() {
        return cod_pais;
    }

    public String getEmp_cod() {
        return emp_cod;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getPer_part() {
        return per_part;
    }

    public String getEvento() {
        return evento;
    }

    public String getPer_cons() {
        return per_cons;
    }

    public String getData_ini_emp() {
        return data_ini_emp;
    }

    public String getData_fin_emp() {
        return data_fin_emp;
    }

    public List<_K110> get_K110() {
        return _K110;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
    }

    public void setEmp_cod(String emp_cod) {
        this.emp_cod = emp_cod;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPer_part(String per_part) {
        this.per_part = per_part;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void setPer_cons(String per_cons) {
        this.per_cons = per_cons;
    }

    public void setData_ini_emp(String data_ini_emp) {
        this.data_ini_emp = data_ini_emp;
    }

    public void setData_fin_emp(String data_fin_emp) {
        this.data_fin_emp = data_fin_emp;
    }

    public void set_K110(List<_K110> _K110) {
        this._K110 = _K110;
    }

}
