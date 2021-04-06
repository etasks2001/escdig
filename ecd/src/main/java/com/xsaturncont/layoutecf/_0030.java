
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_nat",
    "cnae_fiscal",
    "endereco",
    "num",
    "compl",
    "bairro",
    "uf",
    "cod_mun",
    "cep",
    "num_tel",
    "email"
})
public class _0030 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_nat;
    @FieldDetail(number = 3, required = true)
    private String cnae_fiscal;
    @FieldDetail(number = 4, required = true)
    private String endereco;
    @FieldDetail(number = 5, required = true)
    private String num;
    @FieldDetail(number = 6)
    private String compl;
    @FieldDetail(number = 7, required = true)
    private String bairro;
    @FieldDetail(number = 8, required = true)
    private String uf;
    @FieldDetail(number = 9, required = true)
    private String cod_mun;
    @FieldDetail(number = 10, required = true)
    private String cep;
    @FieldDetail(number = 11)
    private String num_tel;
    @FieldDetail(number = 12, required = true)
    private String email;

    public String getReg() {
        return reg;
    }

    public String getCod_nat() {
        return cod_nat;
    }

    public String getCnae_fiscal() {
        return cnae_fiscal;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNum() {
        return num;
    }

    public String getCompl() {
        return compl;
    }

    public String getBairro() {
        return bairro;
    }

    public String getUf() {
        return uf;
    }

    public String getCod_mun() {
        return cod_mun;
    }

    public String getCep() {
        return cep;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public String getEmail() {
        return email;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
    }

    public void setCnae_fiscal(String cnae_fiscal) {
        this.cnae_fiscal = cnae_fiscal;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
