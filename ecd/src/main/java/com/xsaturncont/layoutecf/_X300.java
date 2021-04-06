
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_ordem",
    "tip_exp",
    "desc_exp",
    "tot_oper",
    "cod_ncm",
    "qtde",
    "uni_med",
    "ind_oper",
    "tip_met",
    "vl_par",
    "vl_prat",
    "vl_aj",
    "vl_jur",
    "vl_jur_min",
    "vl_jur_max",
    "cod_cnc",
    "tip_moeda",
    "_X310"
})
public class _X300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String num_ordem;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String tip_exp;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String desc_exp;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String tot_oper;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cod_ncm;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String qtde;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String uni_med;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String ind_oper;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String tip_met;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String vl_par;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String vl_prat;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_aj;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_jur;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_jur_min;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String vl_jur_max;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private String cod_cnc;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private String tip_moeda;
    @com.xsaturncont.annotation.FieldDetail(number = 19)
    private List<_X310> _X310;

    public String getReg() {
        return reg;
    }

    public String getNum_ordem() {
        return num_ordem;
    }

    public String getTip_exp() {
        return tip_exp;
    }

    public String getDesc_exp() {
        return desc_exp;
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

    public String getInd_oper() {
        return ind_oper;
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

    public List<_X310> get_X310() {
        return _X310;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_ordem(String num_ordem) {
        this.num_ordem = num_ordem;
    }

    public void setTip_exp(String tip_exp) {
        this.tip_exp = tip_exp;
    }

    public void setDesc_exp(String desc_exp) {
        this.desc_exp = desc_exp;
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

    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
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

    public void set_X310(List<_X310> _X310) {
        this._X310 = _X310;
    }

}
