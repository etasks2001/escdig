
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mun_orig",
    "cod_mun_dest",
    "veic_id",
    "uf_id"
})
public class _D120 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mun_orig;
    @FieldDetail(number = 3)
    private String cod_mun_dest;
    @FieldDetail(number = 4)
    private String veic_id;
    @FieldDetail(number = 5)
    private String uf_id;

    public String getReg() {
        return reg;
    }

    public String getCod_mun_orig() {
        return cod_mun_orig;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public String getVeic_id() {
        return veic_id;
    }

    public String getUf_id() {
        return uf_id;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mun_orig(String cod_mun_orig) {
        this.cod_mun_orig = cod_mun_orig;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    public void setVeic_id(String veic_id) {
        this.veic_id = veic_id;
    }

    public void setUf_id(String uf_id) {
        this.uf_id = uf_id;
    }

}
