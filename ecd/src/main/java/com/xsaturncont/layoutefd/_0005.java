
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "fantasia",
    "cep",
    "end",
    "num",
    "compl",
    "bairro",
    "fone",
    "fax",
    "email"
})
public class _0005 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String fantasia;
    @FieldDetail(number = 3)
    private String cep;
    @FieldDetail(number = 4)
    private String end;
    @FieldDetail(number = 5)
    private String num;
    @FieldDetail(number = 6)
    private String compl;
    @FieldDetail(number = 7)
    private String bairro;
    @FieldDetail(number = 8)
    private String fone;
    @FieldDetail(number = 9)
    private String fax;
    @FieldDetail(number = 10)
    private String email;

    public String getReg() {
        return reg;
    }

    public String getFantasia() {
        return fantasia;
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

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
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

}
