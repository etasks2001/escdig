
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "cod_sit",
    "num_doc",
    "dt_doc",
    "vl_doc",
    "vl_pis",
    "vl_cofins",
    "cpf_cnpj",
    "nom_adq",
    "_C465",
    "_C470"
})
public class _C460 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_sit;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String cpf_cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String nom_adq;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private _C465 _C465;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private List<_C470> _C470;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getCod_sit() {
        return cod_sit;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getNom_adq() {
        return nom_adq;
    }

    public _C465 get_C465() {
        return _C465;
    }

    public List<_C470> get_C470() {
        return _C470;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setNom_adq(String nom_adq) {
        this.nom_adq = nom_adq;
    }

    public void set_C465(_C465 _C465) {
        this._C465 = _C465;
    }

    public void set_C470(List<_C470> _C470) {
        this._C470 = _C470;
    }

}
