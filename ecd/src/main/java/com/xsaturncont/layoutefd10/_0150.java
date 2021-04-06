
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "nome",
    "cod_pais",
    "cnpj",
    "cpf",
    "ie",
    "cod_mun",
    "suframa",
    "end",
    "num",
    "compl",
    "bairro",
    "_0175"
})
public class _0150 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_part;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String nome;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_pais;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cpf;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String ie;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String cod_mun;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String suframa;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String end;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String num;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String compl;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String bairro;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private List<_0175> _0175;

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

    public String getIe() {
        return ie;
    }

    public String getCod_mun() {
        return cod_mun;
    }

    public String getSuframa() {
        return suframa;
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

    public List<_0175> get_0175() {
        return _0175;
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

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
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

    public void set_0175(List<_0175> _0175) {
        this._0175 = _0175;
    }

}
