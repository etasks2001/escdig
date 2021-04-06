
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item",
    "dt_fech",
    "estq_abert",
    "vol_entr",
    "vol_disp",
    "vol_saidas",
    "estq_escr",
    "val_aj_perda",
    "val_aj_ganho",
    "fech_fisico",
    "_1310"
})
public class _1300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fech;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String estq_abert;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String vol_entr;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vol_disp;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vol_saidas;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String estq_escr;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String val_aj_perda;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String val_aj_ganho;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String fech_fisico;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private List<_1310> _1310;

    public String getReg() {
        return reg;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getDt_fech() {
        return dt_fech;
    }

    public String getEstq_abert() {
        return estq_abert;
    }

    public String getVol_entr() {
        return vol_entr;
    }

    public String getVol_disp() {
        return vol_disp;
    }

    public String getVol_saidas() {
        return vol_saidas;
    }

    public String getEstq_escr() {
        return estq_escr;
    }

    public String getVal_aj_perda() {
        return val_aj_perda;
    }

    public String getVal_aj_ganho() {
        return val_aj_ganho;
    }

    public String getFech_fisico() {
        return fech_fisico;
    }

    public List<_1310> get_1310() {
        return _1310;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setDt_fech(String dt_fech) {
        this.dt_fech = dt_fech;
    }

    public void setEstq_abert(String estq_abert) {
        this.estq_abert = estq_abert;
    }

    public void setVol_entr(String vol_entr) {
        this.vol_entr = vol_entr;
    }

    public void setVol_disp(String vol_disp) {
        this.vol_disp = vol_disp;
    }

    public void setVol_saidas(String vol_saidas) {
        this.vol_saidas = vol_saidas;
    }

    public void setEstq_escr(String estq_escr) {
        this.estq_escr = estq_escr;
    }

    public void setVal_aj_perda(String val_aj_perda) {
        this.val_aj_perda = val_aj_perda;
    }

    public void setVal_aj_ganho(String val_aj_ganho) {
        this.val_aj_ganho = val_aj_ganho;
    }

    public void setFech_fisico(String fech_fisico) {
        this.fech_fisico = fech_fisico;
    }

    public void set_1310(List<_1310> _1310) {
        this._1310 = _1310;
    }

}
