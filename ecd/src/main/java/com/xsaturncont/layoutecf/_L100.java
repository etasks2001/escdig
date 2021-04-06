
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "codigo",
    "descricao",
    "tipo",
    "nivel",
    "cod_nat",
    "cod_cta_sup",
    "val_cta_ref_ini",
    "ind_val_cta_ref_ini",
    "val_cta_ref_fin",
    "ind_val_cta_ref_fin"
})
public class _L100 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String codigo;
    @FieldDetail(number = 3)
    private String descricao;
    @FieldDetail(number = 4, required = true)
    private String tipo;
    @FieldDetail(number = 5)
    private String nivel;
    @FieldDetail(number = 6)
    private String cod_nat;
    @FieldDetail(number = 7)
    private String cod_cta_sup;
    @FieldDetail(number = 8, required = true)
    private String val_cta_ref_ini;
    @FieldDetail(number = 9, required = true)
    private String ind_val_cta_ref_ini;
    @FieldDetail(number = 10, required = true)
    private String val_cta_ref_fin;
    @FieldDetail(number = 11, required = true)
    private String ind_val_cta_ref_fin;

    public String getReg() {
        return reg;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public String getCod_nat() {
        return cod_nat;
    }

    public String getCod_cta_sup() {
        return cod_cta_sup;
    }

    public String getVal_cta_ref_ini() {
        return val_cta_ref_ini;
    }

    public String getInd_val_cta_ref_ini() {
        return ind_val_cta_ref_ini;
    }

    public String getVal_cta_ref_fin() {
        return val_cta_ref_fin;
    }

    public String getInd_val_cta_ref_fin() {
        return ind_val_cta_ref_fin;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
    }

    public void setCod_cta_sup(String cod_cta_sup) {
        this.cod_cta_sup = cod_cta_sup;
    }

    public void setVal_cta_ref_ini(String val_cta_ref_ini) {
        this.val_cta_ref_ini = val_cta_ref_ini;
    }

    public void setInd_val_cta_ref_ini(String ind_val_cta_ref_ini) {
        this.ind_val_cta_ref_ini = ind_val_cta_ref_ini;
    }

    public void setVal_cta_ref_fin(String val_cta_ref_fin) {
        this.val_cta_ref_fin = val_cta_ref_fin;
    }

    public void setInd_val_cta_ref_fin(String ind_val_cta_ref_fin) {
        this.ind_val_cta_ref_fin = ind_val_cta_ref_fin;
    }

}
