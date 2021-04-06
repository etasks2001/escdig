
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part",
    "veic_id",
    "qtd_vol",
    "peso_brt",
    "peso_liq",
    "uf_id"
})
public class _C160 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part;
    @FieldDetail(number = 3)
    private String veic_id;
    @FieldDetail(number = 4)
    private String qtd_vol;
    @FieldDetail(number = 5)
    private String peso_brt;
    @FieldDetail(number = 6)
    private String peso_liq;
    @FieldDetail(number = 7)
    private String uf_id;

    public String getReg() {
        return reg;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getVeic_id() {
        return veic_id;
    }

    public String getQtd_vol() {
        return qtd_vol;
    }

    public String getPeso_brt() {
        return peso_brt;
    }

    public String getPeso_liq() {
        return peso_liq;
    }

    public String getUf_id() {
        return uf_id;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setVeic_id(String veic_id) {
        this.veic_id = veic_id;
    }

    public void setQtd_vol(String qtd_vol) {
        this.qtd_vol = qtd_vol;
    }

    public void setPeso_brt(String peso_brt) {
        this.peso_brt = peso_brt;
    }

    public void setPeso_liq(String peso_liq) {
        this.peso_liq = peso_liq;
    }

    public void setUf_id(String uf_id) {
        this.uf_id = uf_id;
    }

}
