
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_carga",
    "cnpj_cpf_col",
    "ie_col",
    "cod_mun_col",
    "cnpj_cpf_entg",
    "ie_entg",
    "cod_mun_entg"
})
public class _D161 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_carga;
    @FieldDetail(number = 3)
    private String cnpj_cpf_col;
    @FieldDetail(number = 4)
    private String ie_col;
    @FieldDetail(number = 5)
    private String cod_mun_col;
    @FieldDetail(number = 6)
    private String cnpj_cpf_entg;
    @FieldDetail(number = 7)
    private String ie_entg;
    @FieldDetail(number = 8)
    private String cod_mun_entg;

    public String getReg() {
        return reg;
    }

    public String getInd_carga() {
        return ind_carga;
    }

    public String getCnpj_cpf_col() {
        return cnpj_cpf_col;
    }

    public String getIe_col() {
        return ie_col;
    }

    public String getCod_mun_col() {
        return cod_mun_col;
    }

    public String getCnpj_cpf_entg() {
        return cnpj_cpf_entg;
    }

    public String getIe_entg() {
        return ie_entg;
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

    public void setCnpj_cpf_col(String cnpj_cpf_col) {
        this.cnpj_cpf_col = cnpj_cpf_col;
    }

    public void setIe_col(String ie_col) {
        this.ie_col = ie_col;
    }

    public void setCod_mun_col(String cod_mun_col) {
        this.cod_mun_col = cod_mun_col;
    }

    public void setCnpj_cpf_entg(String cnpj_cpf_entg) {
        this.cnpj_cpf_entg = cnpj_cpf_entg;
    }

    public void setIe_entg(String ie_entg) {
        this.ie_entg = ie_entg;
    }

    public void setCod_mun_entg(String cod_mun_entg) {
        this.cod_mun_entg = cod_mun_entg;
    }

}
