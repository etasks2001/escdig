
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
    "valor",
    "ind_valor"
})
public class _P150 {

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
    @FieldDetail(number = 7, required = true)
    private String valor;
    @FieldDetail(number = 9, required = true)
    private String ind_valor;

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

    public String getValor() {
        return valor;
    }

    public String getInd_valor() {
        return ind_valor;
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

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setInd_valor(String ind_valor) {
        this.ind_valor = ind_valor;
    }

}
