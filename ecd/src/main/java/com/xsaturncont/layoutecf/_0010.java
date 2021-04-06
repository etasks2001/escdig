
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "hash_ecf_anterior",
    "opt_refis",
    "opt_paes",
    "forma_trib",
    "forma_apur",
    "cod_qualif_pj",
    "forma_trib_per",
    "mes_bal_red",
    "tip_esc_pre",
    "tip_ent",
    "forma_apur_i",
    "apur_csll",
    "opt_ext_rtt",
    "dif_fcont"
})
public class _0010 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String hash_ecf_anterior;
    @FieldDetail(number = 3, required = true)
    private String opt_refis;
    @FieldDetail(number = 4, required = true)
    private String opt_paes;
    @FieldDetail(number = 5, required = true)
    private String forma_trib;
    @FieldDetail(number = 6)
    private String forma_apur;
    @FieldDetail(number = 7)
    private String cod_qualif_pj;
    @FieldDetail(number = 8)
    private String forma_trib_per;
    @FieldDetail(number = 9)
    private String mes_bal_red;
    @FieldDetail(number = 10)
    private String tip_esc_pre;
    @FieldDetail(number = 11)
    private String tip_ent;
    @FieldDetail(number = 12)
    private String forma_apur_i;
    @FieldDetail(number = 13)
    private String apur_csll;
    @FieldDetail(number = 14, required = true)
    private String opt_ext_rtt;
    @FieldDetail(number = 15, required = true)
    private String dif_fcont;

    public String getReg() {
        return reg;
    }

    public String getHash_ecf_anterior() {
        return hash_ecf_anterior;
    }

    public String getOpt_refis() {
        return opt_refis;
    }

    public String getOpt_paes() {
        return opt_paes;
    }

    public String getForma_trib() {
        return forma_trib;
    }

    public String getForma_apur() {
        return forma_apur;
    }

    public String getCod_qualif_pj() {
        return cod_qualif_pj;
    }

    public String getForma_trib_per() {
        return forma_trib_per;
    }

    public String getMes_bal_red() {
        return mes_bal_red;
    }

    public String getTip_esc_pre() {
        return tip_esc_pre;
    }

    public String getTip_ent() {
        return tip_ent;
    }

    public String getForma_apur_i() {
        return forma_apur_i;
    }

    public String getApur_csll() {
        return apur_csll;
    }

    public String getOpt_ext_rtt() {
        return opt_ext_rtt;
    }

    public String getDif_fcont() {
        return dif_fcont;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setHash_ecf_anterior(String hash_ecf_anterior) {
        this.hash_ecf_anterior = hash_ecf_anterior;
    }

    public void setOpt_refis(String opt_refis) {
        this.opt_refis = opt_refis;
    }

    public void setOpt_paes(String opt_paes) {
        this.opt_paes = opt_paes;
    }

    public void setForma_trib(String forma_trib) {
        this.forma_trib = forma_trib;
    }

    public void setForma_apur(String forma_apur) {
        this.forma_apur = forma_apur;
    }

    public void setCod_qualif_pj(String cod_qualif_pj) {
        this.cod_qualif_pj = cod_qualif_pj;
    }

    public void setForma_trib_per(String forma_trib_per) {
        this.forma_trib_per = forma_trib_per;
    }

    public void setMes_bal_red(String mes_bal_red) {
        this.mes_bal_red = mes_bal_red;
    }

    public void setTip_esc_pre(String tip_esc_pre) {
        this.tip_esc_pre = tip_esc_pre;
    }

    public void setTip_ent(String tip_ent) {
        this.tip_ent = tip_ent;
    }

    public void setForma_apur_i(String forma_apur_i) {
        this.forma_apur_i = forma_apur_i;
    }

    public void setApur_csll(String apur_csll) {
        this.apur_csll = apur_csll;
    }

    public void setOpt_ext_rtt(String opt_ext_rtt) {
        this.opt_ext_rtt = opt_ext_rtt;
    }

    public void setDif_fcont(String dif_fcont) {
        this.dif_fcont = dif_fcont;
    }

}
