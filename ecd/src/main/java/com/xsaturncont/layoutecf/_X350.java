
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "rec_liq",
    "custos",
    "luc_bruto",
    "rec_auferidas",
    "rec_outras_oper",
    "desp_brasil",
    "desp_oper",
    "luc_oper",
    "rec_partic",
    "rec_outras",
    "desp_outras",
    "luc_liq_ant_ir",
    "imp_dev",
    "luc_liq",
    "luc_arb_ant_imp",
    "imp_dev_arb",
    "luc_arb_per_apur"
})
public class _X350 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String rec_liq;
    @FieldDetail(number = 3)
    private String custos;
    @FieldDetail(number = 4)
    private String luc_bruto;
    @FieldDetail(number = 5)
    private String rec_auferidas;
    @FieldDetail(number = 6)
    private String rec_outras_oper;
    @FieldDetail(number = 7)
    private String desp_brasil;
    @FieldDetail(number = 8)
    private String desp_oper;
    @FieldDetail(number = 9)
    private String luc_oper;
    @FieldDetail(number = 10)
    private String rec_partic;
    @FieldDetail(number = 11)
    private String rec_outras;
    @FieldDetail(number = 12)
    private String desp_outras;
    @FieldDetail(number = 13)
    private String luc_liq_ant_ir;
    @FieldDetail(number = 14)
    private String imp_dev;
    @FieldDetail(number = 15)
    private String luc_liq;
    @FieldDetail(number = 16, required = true)
    private String luc_arb_ant_imp;
    @FieldDetail(number = 17, required = true)
    private String imp_dev_arb;
    @FieldDetail(number = 18, required = true)
    private String luc_arb_per_apur;

    public String getReg() {
        return reg;
    }

    public String getRec_liq() {
        return rec_liq;
    }

    public String getCustos() {
        return custos;
    }

    public String getLuc_bruto() {
        return luc_bruto;
    }

    public String getRec_auferidas() {
        return rec_auferidas;
    }

    public String getRec_outras_oper() {
        return rec_outras_oper;
    }

    public String getDesp_brasil() {
        return desp_brasil;
    }

    public String getDesp_oper() {
        return desp_oper;
    }

    public String getLuc_oper() {
        return luc_oper;
    }

    public String getRec_partic() {
        return rec_partic;
    }

    public String getRec_outras() {
        return rec_outras;
    }

    public String getDesp_outras() {
        return desp_outras;
    }

    public String getLuc_liq_ant_ir() {
        return luc_liq_ant_ir;
    }

    public String getImp_dev() {
        return imp_dev;
    }

    public String getLuc_liq() {
        return luc_liq;
    }

    public String getLuc_arb_ant_imp() {
        return luc_arb_ant_imp;
    }

    public String getImp_dev_arb() {
        return imp_dev_arb;
    }

    public String getLuc_arb_per_apur() {
        return luc_arb_per_apur;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRec_liq(String rec_liq) {
        this.rec_liq = rec_liq;
    }

    public void setCustos(String custos) {
        this.custos = custos;
    }

    public void setLuc_bruto(String luc_bruto) {
        this.luc_bruto = luc_bruto;
    }

    public void setRec_auferidas(String rec_auferidas) {
        this.rec_auferidas = rec_auferidas;
    }

    public void setRec_outras_oper(String rec_outras_oper) {
        this.rec_outras_oper = rec_outras_oper;
    }

    public void setDesp_brasil(String desp_brasil) {
        this.desp_brasil = desp_brasil;
    }

    public void setDesp_oper(String desp_oper) {
        this.desp_oper = desp_oper;
    }

    public void setLuc_oper(String luc_oper) {
        this.luc_oper = luc_oper;
    }

    public void setRec_partic(String rec_partic) {
        this.rec_partic = rec_partic;
    }

    public void setRec_outras(String rec_outras) {
        this.rec_outras = rec_outras;
    }

    public void setDesp_outras(String desp_outras) {
        this.desp_outras = desp_outras;
    }

    public void setLuc_liq_ant_ir(String luc_liq_ant_ir) {
        this.luc_liq_ant_ir = luc_liq_ant_ir;
    }

    public void setImp_dev(String imp_dev) {
        this.imp_dev = imp_dev;
    }

    public void setLuc_liq(String luc_liq) {
        this.luc_liq = luc_liq;
    }

    public void setLuc_arb_ant_imp(String luc_arb_ant_imp) {
        this.luc_arb_ant_imp = luc_arb_ant_imp;
    }

    public void setImp_dev_arb(String imp_dev_arb) {
        this.imp_dev_arb = imp_dev_arb;
    }

    public void setLuc_arb_per_apur(String luc_arb_per_apur) {
        this.luc_arb_per_apur = luc_arb_per_apur;
    }

}
