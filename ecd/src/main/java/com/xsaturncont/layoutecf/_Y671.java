
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "vl_aq_maq",
    "vl_doa_crianca",
    "vl_doa_idoso",
    "vl_aq_imobilizado",
    "vl_bx_imobilizado",
    "vl_inc_ini",
    "vl_inc_fin",
    "vl_csll_deprec_ini",
    "vl_oc_sem_iof",
    "vl_folha_aliq_red",
    "vl_aliq_red",
    "ind_alter_capital",
    "ind_bcn_csll"
})
public class _Y671 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String vl_aq_maq;
    @FieldDetail(number = 3)
    private String vl_doa_crianca;
    @FieldDetail(number = 4)
    private String vl_doa_idoso;
    @FieldDetail(number = 5)
    private String vl_aq_imobilizado;
    @FieldDetail(number = 6)
    private String vl_bx_imobilizado;
    @FieldDetail(number = 7)
    private String vl_inc_ini;
    @FieldDetail(number = 8)
    private String vl_inc_fin;
    @FieldDetail(number = 9)
    private String vl_csll_deprec_ini;
    @FieldDetail(number = 10)
    private String vl_oc_sem_iof;
    @FieldDetail(number = 11)
    private String vl_folha_aliq_red;
    @FieldDetail(number = 12)
    private String vl_aliq_red;
    @FieldDetail(number = 13)
    private String ind_alter_capital;
    @FieldDetail(number = 14)
    private String ind_bcn_csll;

    public String getReg() {
        return reg;
    }

    public String getVl_aq_maq() {
        return vl_aq_maq;
    }

    public String getVl_doa_crianca() {
        return vl_doa_crianca;
    }

    public String getVl_doa_idoso() {
        return vl_doa_idoso;
    }

    public String getVl_aq_imobilizado() {
        return vl_aq_imobilizado;
    }

    public String getVl_bx_imobilizado() {
        return vl_bx_imobilizado;
    }

    public String getVl_inc_ini() {
        return vl_inc_ini;
    }

    public String getVl_inc_fin() {
        return vl_inc_fin;
    }

    public String getVl_csll_deprec_ini() {
        return vl_csll_deprec_ini;
    }

    public String getVl_oc_sem_iof() {
        return vl_oc_sem_iof;
    }

    public String getVl_folha_aliq_red() {
        return vl_folha_aliq_red;
    }

    public String getVl_aliq_red() {
        return vl_aliq_red;
    }

    public String getInd_alter_capital() {
        return ind_alter_capital;
    }

    public String getInd_bcn_csll() {
        return ind_bcn_csll;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setVl_aq_maq(String vl_aq_maq) {
        this.vl_aq_maq = vl_aq_maq;
    }

    public void setVl_doa_crianca(String vl_doa_crianca) {
        this.vl_doa_crianca = vl_doa_crianca;
    }

    public void setVl_doa_idoso(String vl_doa_idoso) {
        this.vl_doa_idoso = vl_doa_idoso;
    }

    public void setVl_aq_imobilizado(String vl_aq_imobilizado) {
        this.vl_aq_imobilizado = vl_aq_imobilizado;
    }

    public void setVl_bx_imobilizado(String vl_bx_imobilizado) {
        this.vl_bx_imobilizado = vl_bx_imobilizado;
    }

    public void setVl_inc_ini(String vl_inc_ini) {
        this.vl_inc_ini = vl_inc_ini;
    }

    public void setVl_inc_fin(String vl_inc_fin) {
        this.vl_inc_fin = vl_inc_fin;
    }

    public void setVl_csll_deprec_ini(String vl_csll_deprec_ini) {
        this.vl_csll_deprec_ini = vl_csll_deprec_ini;
    }

    public void setVl_oc_sem_iof(String vl_oc_sem_iof) {
        this.vl_oc_sem_iof = vl_oc_sem_iof;
    }

    public void setVl_folha_aliq_red(String vl_folha_aliq_red) {
        this.vl_folha_aliq_red = vl_folha_aliq_red;
    }

    public void setVl_aliq_red(String vl_aliq_red) {
        this.vl_aliq_red = vl_aliq_red;
    }

    public void setInd_alter_capital(String ind_alter_capital) {
        this.ind_alter_capital = ind_alter_capital;
    }

    public void setInd_bcn_csll(String ind_bcn_csll) {
        this.ind_bcn_csll = ind_bcn_csll;
    }

}
