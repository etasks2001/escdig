
package com.xsaturncont.layout6ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "nome",
    "cod_pais",
    "cnpj",
    "cpf",
    "nit",
    "uf",
    "ie",
    "ie_st",
    "cod_mun",
    "im",
    "suframa",
    "_0180"
})
public class _0150 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cod_part;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String nome;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String cod_pais;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cpf;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String nit;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String uf;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String ie;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String ie_st;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String cod_mun;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String im;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String suframa;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private List<_0180> _0180;

    public String getReg() {
        return reg;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getNome() {
        return nome;
    }

    public String getCod_pais() {
        return cod_pais;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNit() {
        return nit;
    }

    public String getUf() {
        return uf;
    }

    public String getIe() {
        return ie;
    }

    public String getIe_st() {
        return ie_st;
    }

    public String getCod_mun() {
        return cod_mun;
    }

    public String getIm() {
        return im;
    }

    public String getSuframa() {
        return suframa;
    }

    public List<_0180> get_0180() {
        return _0180;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setIe_st(String ie_st) {
        this.ie_st = ie_st;
    }

    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public void set_0180(List<_0180> _0180) {
        this._0180 = _0180;
    }

}
