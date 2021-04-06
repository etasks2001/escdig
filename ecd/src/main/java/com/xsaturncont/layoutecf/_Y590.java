
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "tip_ativo",
    "pais",
    "discriminacao",
    "vl_ant",
    "vl_atual"
})
public class _Y590 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String tip_ativo;
    @FieldDetail(number = 3, required = true)
    private String pais;
    @FieldDetail(number = 4, required = true)
    private String discriminacao;
    @FieldDetail(number = 5, required = true)
    private String vl_ant;
    @FieldDetail(number = 6, required = true)
    private String vl_atual;

    public String getReg() {
        return reg;
    }

    public String getTip_ativo() {
        return tip_ativo;
    }

    public String getPais() {
        return pais;
    }

    public String getDiscriminacao() {
        return discriminacao;
    }

    public String getVl_ant() {
        return vl_ant;
    }

    public String getVl_atual() {
        return vl_atual;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setTip_ativo(String tip_ativo) {
        this.tip_ativo = tip_ativo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDiscriminacao(String discriminacao) {
        this.discriminacao = discriminacao;
    }

    public void setVl_ant(String vl_ant) {
        this.vl_ant = vl_ant;
    }

    public void setVl_atual(String vl_atual) {
        this.vl_atual = vl_atual;
    }

}
