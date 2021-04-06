
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ser",
    "sub_ser",
    "num_doc",
    "dt_doc",
    "cnpj_cpf",
    "vl_merc",
    "vl_doc",
    "vl_desc",
    "vl_pis",
    "vl_cofins",
    "cod_cta",
    "_C370",
    "_C390"
})
public class _C350 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ser;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String sub_ser;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String num_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cnpj_cpf;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_merc;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String cod_cta;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private java.util.List<_C370> _C370;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private java.util.List<_C390> _C390;

    public String getReg() {
        return reg;
    }

    public String getSer() {
        return ser;
    }

    public String getSub_ser() {
        return sub_ser;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public String getVl_merc() {
        return vl_merc;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public java.util.List<_C370> get_C370() {
        return _C370;
    }

    public java.util.List<_C390> get_C390() {
        return _C390;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public void setSub_ser(String sub_ser) {
        this.sub_ser = sub_ser;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public void setVl_merc(String vl_merc) {
        this.vl_merc = vl_merc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void set_C370(java.util.List<_C370> _C370) {
        this._C370 = _C370;
    }

    public void set_C390(java.util.List<_C390> _C390) {
        this._C390 = _C390;
    }

}
