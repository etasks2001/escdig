
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "codigo",
    "descricao",
    "tipo_lancamento",
    "ind_relacao",
    "valor",
    "hist_lan_lal",
    "_M305",
    "_M310",
    "_M315"
})
public class _M300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String codigo;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String descricao;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String tipo_lancamento;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String ind_relacao;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String valor;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String hist_lan_lal;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_M305> _M305;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_M310> _M310;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private java.util.List<_M315> _M315;

    public String getReg() {
        return reg;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo_lancamento() {
        return tipo_lancamento;
    }

    public String getInd_relacao() {
        return ind_relacao;
    }

    public String getValor() {
        return valor;
    }

    public String getHist_lan_lal() {
        return hist_lan_lal;
    }

    public java.util.List<_M305> get_M305() {
        return _M305;
    }

    public java.util.List<_M310> get_M310() {
        return _M310;
    }

    public java.util.List<_M315> get_M315() {
        return _M315;
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

    public void setTipo_lancamento(String tipo_lancamento) {
        this.tipo_lancamento = tipo_lancamento;
    }

    public void setInd_relacao(String ind_relacao) {
        this.ind_relacao = ind_relacao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setHist_lan_lal(String hist_lan_lal) {
        this.hist_lan_lal = hist_lan_lal;
    }

    public void set_M305(java.util.List<_M305> _M305) {
        this._M305 = _M305;
    }

    public void set_M310(java.util.List<_M310> _M310) {
        this._M310 = _M310;
    }

    public void set_M315(java.util.List<_M315> _M315) {
        this._M315 = _M315;
    }

}
