
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "nm_campo",
    "desc_campo",
    "tipo_campo",
    "tam_campo",
    "dec_campo",
    "col_campo"
})
public class _I510 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String nm_campo;
    @FieldDetail(number = 3, required = true)
    private String desc_campo;
    @FieldDetail(number = 4, required = true)
    private String tipo_campo;
    @FieldDetail(number = 5, required = true)
    private String tam_campo;
    @FieldDetail(number = 6)
    private String dec_campo;
    @FieldDetail(number = 7, required = true)
    private String col_campo;

    public String getReg() {
        return reg;
    }

    public String getNm_campo() {
        return nm_campo;
    }

    public String getDesc_campo() {
        return desc_campo;
    }

    public String getTipo_campo() {
        return tipo_campo;
    }

    public String getTam_campo() {
        return tam_campo;
    }

    public String getDec_campo() {
        return dec_campo;
    }

    public String getCol_campo() {
        return col_campo;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNm_campo(String nm_campo) {
        this.nm_campo = nm_campo;
    }

    public void setDesc_campo(String desc_campo) {
        this.desc_campo = desc_campo;
    }

    public void setTipo_campo(String tipo_campo) {
        this.tipo_campo = tipo_campo;
    }

    public void setTam_campo(String tam_campo) {
        this.tam_campo = tam_campo;
    }

    public void setDec_campo(String dec_campo) {
        this.dec_campo = dec_campo;
    }

    public void setCol_campo(String col_campo) {
        this.col_campo = col_campo;
    }

}
