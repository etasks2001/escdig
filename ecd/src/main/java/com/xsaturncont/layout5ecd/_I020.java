
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "reg_cod",
    "num_ad",
    "campo",
    "descrio",
    "tipo"
})
public class _I020 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String reg_cod;
    @FieldDetail(number = 3, required = true)
    private String num_ad;
    @FieldDetail(number = 4, required = true)
    private String campo;
    @FieldDetail(number = 5)
    private String descrio;
    @FieldDetail(number = 6, required = true)
    private String tipo;

    public String getReg() {
        return reg;
    }

    public String getReg_cod() {
        return reg_cod;
    }

    public String getNum_ad() {
        return num_ad;
    }

    public String getCampo() {
        return campo;
    }

    public String getDescrio() {
        return descrio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setReg_cod(String reg_cod) {
        this.reg_cod = reg_cod;
    }

    public void setNum_ad(String num_ad) {
        this.num_ad = num_ad;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public void setDescrio(String descrio) {
        this.descrio = descrio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
