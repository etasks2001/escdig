
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ident_nom",
    "ident_cpf_cnpj",
    "ident_qualif",
    "cod_assin",
    "ind_crc",
    "email",
    "fone",
    "uf_crc",
    "num_seq_crc",
    "dt_crc",
    "ind_resp_legal"
})
public class _J930 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String ident_nom;
    @FieldDetail(number = 3, required = true)
    private String ident_cpf_cnpj;
    @FieldDetail(number = 4, required = true)
    private String ident_qualif;
    @FieldDetail(number = 5, required = true)
    private String cod_assin;
    @FieldDetail(number = 6)
    private String ind_crc;
    @FieldDetail(number = 7)
    private String email;
    @FieldDetail(number = 8)
    private String fone;
    @FieldDetail(number = 9)
    private String uf_crc;
    @FieldDetail(number = 10)
    private String num_seq_crc;
    @FieldDetail(number = 11)
    private String dt_crc;
    @FieldDetail(number = 12, required = true)
    private String ind_resp_legal;

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

    public String getCod_assin() {
        return cod_assin;
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

    public String getUf_crc() {
        return uf_crc;
    }

    public String getNum_seq_crc() {
        return num_seq_crc;
    }

    public String getDt_crc() {
        return dt_crc;
    }

    public String getInd_resp_legal() {
        return ind_resp_legal;
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

    public void setCod_assin(String cod_assin) {
        this.cod_assin = cod_assin;
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

    public void setUf_crc(String uf_crc) {
        this.uf_crc = uf_crc;
    }

    public void setNum_seq_crc(String num_seq_crc) {
        this.num_seq_crc = num_seq_crc;
    }

    public void setDt_crc(String dt_crc) {
        this.dt_crc = dt_crc;
    }

    public void setInd_resp_legal(String ind_resp_legal) {
        this.ind_resp_legal = ind_resp_legal;
    }

}
