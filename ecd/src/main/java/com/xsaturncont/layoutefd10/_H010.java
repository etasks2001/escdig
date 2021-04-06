
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item",
    "unid",
    "qtd",
    "vl_unit",
    "vl_item",
    "ind_prop",
    "cod_part",
    "txt_compl",
    "cod_cta",
    "vl_item_ir",
    "_H020"
})
public class _H010 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String unid;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String qtd;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String vl_unit;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_item;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String ind_prop;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String cod_part;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String txt_compl;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_item_ir;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private List<_H020> _H020;

    public String getReg() {
        return reg;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getUnid() {
        return unid;
    }

    public String getQtd() {
        return qtd;
    }

    public String getVl_unit() {
        return vl_unit;
    }

    public String getVl_item() {
        return vl_item;
    }

    public String getInd_prop() {
        return ind_prop;
    }

    public String getCod_part() {
        return cod_part;
    }

    public String getTxt_compl() {
        return txt_compl;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getVl_item_ir() {
        return vl_item_ir;
    }

    public List<_H020> get_H020() {
        return _H020;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void setVl_unit(String vl_unit) {
        this.vl_unit = vl_unit;
    }

    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
    }

    public void setInd_prop(String ind_prop) {
        this.ind_prop = ind_prop;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setVl_item_ir(String vl_item_ir) {
        this.vl_item_ir = vl_item_ir;
    }

    public void set_H020(List<_H020> _H020) {
        this._H020 = _H020;
    }

}
