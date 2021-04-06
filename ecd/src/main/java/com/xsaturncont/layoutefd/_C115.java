
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_carga",
    "cnpj_col",
    "ie_col",
    "cpf_col",
    "cod_mun_col",
    "cnpj_entg",
    "ie_entg",
    "cpf_entg",
    "cod_mun_entg"
})
public class _C115 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_carga;
    @FieldDetail(number = 3)
    private String cnpj_col;
    @FieldDetail(number = 4)
    private String ie_col;
    @FieldDetail(number = 5)
    private String cpf_col;
    @FieldDetail(number = 6)
    private String cod_mun_col;
    @FieldDetail(number = 7)
    private String cnpj_entg;
    @FieldDetail(number = 8)
    private String ie_entg;
    @FieldDetail(number = 9)
    private String cpf_entg;
    @FieldDetail(number = 10)
    private String cod_mun_entg;

    public String getReg() {
        return reg;
    }

    public String getInd_carga() {
        return ind_carga;
    }

    public String getCnpj_col() {
        return cnpj_col;
    }

    public String getIe_col() {
        return ie_col;
    }

    public String getCpf_col() {
        return cpf_col;
    }

    public String getCod_mun_col() {
        return cod_mun_col;
    }

    public String getCnpj_entg() {
        return cnpj_entg;
    }

    public String getIe_entg() {
        return ie_entg;
    }

    public String getCpf_entg() {
        return cpf_entg;
    }

    public String getCod_mun_entg() {
        return cod_mun_entg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_carga(String ind_carga) {
        this.ind_carga = ind_carga;
    }

    public void setCnpj_col(String cnpj_col) {
        this.cnpj_col = cnpj_col;
    }

    public void setIe_col(String ie_col) {
        this.ie_col = ie_col;
    }

    public void setCpf_col(String cpf_col) {
        this.cpf_col = cpf_col;
    }

    public void setCod_mun_col(String cod_mun_col) {
        this.cod_mun_col = cod_mun_col;
    }

    public void setCnpj_entg(String cnpj_entg) {
        this.cnpj_entg = cnpj_entg;
    }

    public void setIe_entg(String ie_entg) {
        this.ie_entg = ie_entg;
    }

    public void setCpf_entg(String cpf_entg) {
        this.cpf_entg = cpf_entg;
    }

    public void setCod_mun_entg(String cod_mun_entg) {
        this.cod_mun_entg = cod_mun_entg;
    }

}
