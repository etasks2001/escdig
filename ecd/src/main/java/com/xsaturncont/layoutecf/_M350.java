
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
    "_M355",
    "_M360",
    "_M365"
})
public class _M350 {

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
    private java.util.List<_M355> _M355;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_M360> _M360;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private _M365 _M365;

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

    public java.util.List<_M355> get_M355() {
        return _M355;
    }

    public java.util.List<_M360> get_M360() {
        return _M360;
    }

    public _M365 get_M365() {
        return _M365;
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

    public void set_M355(java.util.List<_M355> _M355) {
        this._M355 = _M355;
    }

    public void set_M360(java.util.List<_M360> _M360) {
        this._M360 = _M360;
    }

    public void set_M365(_M365 _M365) {
        this._M365 = _M365;
    }

}
