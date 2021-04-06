
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_doc",
    "nro_de",
    "dt_de",
    "nat_exp",
    "nro_re",
    "dt_re",
    "chc_emb",
    "dt_chc",
    "dt_avb",
    "tp_chc",
    "pais",
    "_1105"
})
public class _1100 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String nro_de;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String dt_de;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String nat_exp;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String nro_re;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String dt_re;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String chc_emb;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String dt_chc;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String dt_avb;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String tp_chc;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String pais;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private List<_1105> _1105;

    public String getReg() {
        return reg;
    }

    public String getInd_doc() {
        return ind_doc;
    }

    public String getNro_de() {
        return nro_de;
    }

    public String getDt_de() {
        return dt_de;
    }

    public String getNat_exp() {
        return nat_exp;
    }

    public String getNro_re() {
        return nro_re;
    }

    public String getDt_re() {
        return dt_re;
    }

    public String getChc_emb() {
        return chc_emb;
    }

    public String getDt_chc() {
        return dt_chc;
    }

    public String getDt_avb() {
        return dt_avb;
    }

    public String getTp_chc() {
        return tp_chc;
    }

    public String getPais() {
        return pais;
    }

    public List<_1105> get_1105() {
        return _1105;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_doc(String ind_doc) {
        this.ind_doc = ind_doc;
    }

    public void setNro_de(String nro_de) {
        this.nro_de = nro_de;
    }

    public void setDt_de(String dt_de) {
        this.dt_de = dt_de;
    }

    public void setNat_exp(String nat_exp) {
        this.nat_exp = nat_exp;
    }

    public void setNro_re(String nro_re) {
        this.nro_re = nro_re;
    }

    public void setDt_re(String dt_re) {
        this.dt_re = dt_re;
    }

    public void setChc_emb(String chc_emb) {
        this.chc_emb = chc_emb;
    }

    public void setDt_chc(String dt_chc) {
        this.dt_chc = dt_chc;
    }

    public void setDt_avb(String dt_avb) {
        this.dt_avb = dt_avb;
    }

    public void setTp_chc(String tp_chc) {
        this.tp_chc = tp_chc;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void set_1105(List<_1105> _1105) {
        this._1105 = _1105;
    }

}
