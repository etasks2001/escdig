
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "despacho",
    "cnpj_cpf_rem",
    "ie_rem",
    "cod_mun_ori",
    "cnpj_cpf_dest",
    "ie_dest",
    "cod_mun_dest",
    "_D161",
    "_D162"
})
public class _D160 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String despacho;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cnpj_cpf_rem;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String ie_rem;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_mun_ori;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cnpj_cpf_dest;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String ie_dest;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String cod_mun_dest;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private _D161 _D161;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private List<_D162> _D162;

    public String getReg() {
        return reg;
    }

    public String getDespacho() {
        return despacho;
    }

    public String getCnpj_cpf_rem() {
        return cnpj_cpf_rem;
    }

    public String getIe_rem() {
        return ie_rem;
    }

    public String getCod_mun_ori() {
        return cod_mun_ori;
    }

    public String getCnpj_cpf_dest() {
        return cnpj_cpf_dest;
    }

    public String getIe_dest() {
        return ie_dest;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public _D161 get_D161() {
        return _D161;
    }

    public List<_D162> get_D162() {
        return _D162;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public void setCnpj_cpf_rem(String cnpj_cpf_rem) {
        this.cnpj_cpf_rem = cnpj_cpf_rem;
    }

    public void setIe_rem(String ie_rem) {
        this.ie_rem = ie_rem;
    }

    public void setCod_mun_ori(String cod_mun_ori) {
        this.cod_mun_ori = cod_mun_ori;
    }

    public void setCnpj_cpf_dest(String cnpj_cpf_dest) {
        this.cnpj_cpf_dest = cnpj_cpf_dest;
    }

    public void setIe_dest(String ie_dest) {
        this.ie_dest = ie_dest;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    public void set_D161(_D161 _D161) {
        this._D161 = _D161;
    }

    public void set_D162(List<_D162> _D162) {
        this._D162 = _D162;
    }

}
