
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "nome",
    "cpf",
    "crc",
    "cnpj",
    "cep",
    "end",
    "num",
    "compl",
    "bairro",
    "fone",
    "fax",
    "email",
    "cod_mun"
})
public class _0100 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String nome;
    @FieldDetail(number = 3)
    private String cpf;
    @FieldDetail(number = 4)
    private String crc;
    @FieldDetail(number = 5)
    private String cnpj;
    @FieldDetail(number = 6)
    private String cep;
    @FieldDetail(number = 7)
    private String end;
    @FieldDetail(number = 8)
    private String num;
    @FieldDetail(number = 9)
    private String compl;
    @FieldDetail(number = 10)
    private String bairro;
    @FieldDetail(number = 11)
    private String fone;
    @FieldDetail(number = 12)
    private String fax;
    @FieldDetail(number = 13)
    private String email;
    @FieldDetail(number = 14)
    private String cod_mun;

    public String getReg() {
        return reg;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCrc() {
        return crc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCep() {
        return cep;
    }

    public String getEnd() {
        return end;
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

    public String getFone() {
        return fone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getCod_mun() {
        return cod_mun;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEnd(String end) {
        this.end = end;
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

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

}
