
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ident_nom",
    "ident_cpf_cnpj",
    "ident_qualif",
    "ind_crc",
    "email",
    "fone"
})
public class _0930 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String ident_nom;
    @FieldDetail(number = 3, required = true)
    private String ident_cpf_cnpj;
    @FieldDetail(number = 4, required = true)
    private String ident_qualif;
    @FieldDetail(number = 5)
    private String ind_crc;
    @FieldDetail(number = 6, required = true)
    private String email;
    @FieldDetail(number = 7, required = true)
    private String fone;

    public String getReg() {
        return reg;
    }

    public String getIdent_nom() {
        return ident_nom;
    }

    public String getIdent_cpf_cnpj() {
        return ident_cpf_cnpj;
    }

    public String getIdent_qualif() {
        return ident_qualif;
    }

    public String getInd_crc() {
        return ind_crc;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setIdent_nom(String ident_nom) {
        this.ident_nom = ident_nom;
    }

    public void setIdent_cpf_cnpj(String ident_cpf_cnpj) {
        this.ident_cpf_cnpj = ident_cpf_cnpj;
    }

    public void setIdent_qualif(String ident_qualif) {
        this.ident_qualif = ident_qualif;
    }

    public void setInd_crc(String ind_crc) {
        this.ind_crc = ind_crc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}
