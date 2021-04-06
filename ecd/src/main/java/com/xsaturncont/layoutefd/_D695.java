
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ser",
    "nro_ord_ini",
    "nro_ord_fin",
    "dt_doc_ini",
    "dt_doc_fin",
    "nom_mest",
    "chv_cod_dig",
    "_D696"
})
public class _D695 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String ser;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String nro_ord_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String nro_ord_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String dt_doc_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String dt_doc_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String nom_mest;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String chv_cod_dig;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private List<_D696> _D696;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getSer() {
        return ser;
    }

    public String getNro_ord_ini() {
        return nro_ord_ini;
    }

    public String getNro_ord_fin() {
        return nro_ord_fin;
    }

    public String getDt_doc_ini() {
        return dt_doc_ini;
    }

    public String getDt_doc_fin() {
        return dt_doc_fin;
    }

    public String getNom_mest() {
        return nom_mest;
    }

    public String getChv_cod_dig() {
        return chv_cod_dig;
    }

    public List<_D696> get_D696() {
        return _D696;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setNro_ord_ini(String nro_ord_ini) {
        this.nro_ord_ini = nro_ord_ini;
    }

    public void setNro_ord_fin(String nro_ord_fin) {
        this.nro_ord_fin = nro_ord_fin;
    }

    public void setDt_doc_ini(String dt_doc_ini) {
        this.dt_doc_ini = dt_doc_ini;
    }

    public void setDt_doc_fin(String dt_doc_fin) {
        this.dt_doc_fin = dt_doc_fin;
    }

    public void setNom_mest(String nom_mest) {
        this.nom_mest = nom_mest;
    }

    public void setChv_cod_dig(String chv_cod_dig) {
        this.chv_cod_dig = chv_cod_dig;
    }

    public void set_D696(List<_D696> _D696) {
        this._D696 = _D696;
    }

}
