
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_ind_bem",
    "ident_merc",
    "descr_item",
    "cod_prnc",
    "cod_cta",
    "nr_parc",
    "_0305"
})
public class _0300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_ind_bem;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String ident_merc;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String descr_item;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_prnc;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String nr_parc;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private _0305 _0305;

    public String getReg() {
        return reg;
    }

    public String getCod_ind_bem() {
        return cod_ind_bem;
    }

    public String getIdent_merc() {
        return ident_merc;
    }

    public String getDescr_item() {
        return descr_item;
    }

    public String getCod_prnc() {
        return cod_prnc;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getNr_parc() {
        return nr_parc;
    }

    public _0305 get_0305() {
        return _0305;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_ind_bem(String cod_ind_bem) {
        this.cod_ind_bem = cod_ind_bem;
    }

    public void setIdent_merc(String ident_merc) {
        this.ident_merc = ident_merc;
    }

    public void setDescr_item(String descr_item) {
        this.descr_item = descr_item;
    }

    public void setCod_prnc(String cod_prnc) {
        this.cod_prnc = cod_prnc;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setNr_parc(String nr_parc) {
        this.nr_parc = nr_parc;
    }

    public void set_0305(_0305 _0305) {
        this._0305 = _0305;
    }

}
