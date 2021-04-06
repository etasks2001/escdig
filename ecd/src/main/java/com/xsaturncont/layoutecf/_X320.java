
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_ord",
    "tip_imp",
    "desc_imp",
    "tot_oper",
    "cod_ncm",
    "qtde",
    "uni_med",
    "tip_met",
    "vl_par",
    "vl_prat",
    "vl_aj",
    "vl_jur",
    "vl_jur_min",
    "vl_jur_max",
    "cod_cnc",
    "tip_moeda",
    "_X330"
})
public class _X320 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String num_ord;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String tip_imp;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String desc_imp;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String tot_oper;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cod_ncm;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String qtde;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String uni_med;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String tip_met;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String vl_par;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_prat;
    @com.xsaturncont.annotation.FieldDetail(number = 12, required = true)
    private String vl_aj;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_jur;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_jur_min;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_jur_max;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String cod_cnc;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private String tip_moeda;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private List<_X330> _X330;

    public String getReg() {
        return reg;
    }

    public String getNum_ord() {
        return num_ord;
    }

    public String getTip_imp() {
        return tip_imp;
    }

    public String getDesc_imp() {
        return desc_imp;
    }

    public String getTot_oper() {
        return tot_oper;
    }

    public String getCod_ncm() {
        return cod_ncm;
    }

    public String getQtde() {
        return qtde;
    }

    public String getUni_med() {
        return uni_med;
    }

    public String getTip_met() {
        return tip_met;
    }

    public String getVl_par() {
        return vl_par;
    }

    public String getVl_prat() {
        return vl_prat;
    }

    public String getVl_aj() {
        return vl_aj;
    }

    public String getVl_jur() {
        return vl_jur;
    }

    public String getVl_jur_min() {
        return vl_jur_min;
    }

    public String getVl_jur_max() {
        return vl_jur_max;
    }

    public String getCod_cnc() {
        return cod_cnc;
    }

    public String getTip_moeda() {
        return tip_moeda;
    }

    public List<_X330> get_X330() {
        return _X330;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_ord(String num_ord) {
        this.num_ord = num_ord;
    }

    public void setTip_imp(String tip_imp) {
        this.tip_imp = tip_imp;
    }

    public void setDesc_imp(String desc_imp) {
        this.desc_imp = desc_imp;
    }

    public void setTot_oper(String tot_oper) {
        this.tot_oper = tot_oper;
    }

    public void setCod_ncm(String cod_ncm) {
        this.cod_ncm = cod_ncm;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public void setUni_med(String uni_med) {
        this.uni_med = uni_med;
    }

    public void setTip_met(String tip_met) {
        this.tip_met = tip_met;
    }

    public void setVl_par(String vl_par) {
        this.vl_par = vl_par;
    }

    public void setVl_prat(String vl_prat) {
        this.vl_prat = vl_prat;
    }

    public void setVl_aj(String vl_aj) {
        this.vl_aj = vl_aj;
    }

    public void setVl_jur(String vl_jur) {
        this.vl_jur = vl_jur;
    }

    public void setVl_jur_min(String vl_jur_min) {
        this.vl_jur_min = vl_jur_min;
    }

    public void setVl_jur_max(String vl_jur_max) {
        this.vl_jur_max = vl_jur_max;
    }

    public void setCod_cnc(String cod_cnc) {
        this.cod_cnc = cod_cnc;
    }

    public void setTip_moeda(String tip_moeda) {
        this.tip_moeda = tip_moeda;
    }

    public void set_X330(List<_X330> _X330) {
        this._X330 = _X330;
    }

}
