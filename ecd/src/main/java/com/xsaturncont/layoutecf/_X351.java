
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "res_inv_per",
    "res_inv_per_real",
    "res_isen_petr_per",
    "res_isen_petr_per_real",
    "res_neg_acum",
    "res_pos_trib",
    "res_pos_trib_real",
    "imp_lucr",
    "imp_lucr_real",
    "imp_pag_rend",
    "imp_pag_rend_real",
    "imp_ret_ext",
    "imp_ret_ext_real",
    "imp_ret_br"
})
public class _X351 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2)
    private String res_inv_per;
    @FieldDetail(number = 3)
    private String res_inv_per_real;
    @FieldDetail(number = 4)
    private String res_isen_petr_per;
    @FieldDetail(number = 5)
    private String res_isen_petr_per_real;
    @FieldDetail(number = 6)
    private String res_neg_acum;
    @FieldDetail(number = 7)
    private String res_pos_trib;
    @FieldDetail(number = 8)
    private String res_pos_trib_real;
    @FieldDetail(number = 9)
    private String imp_lucr;
    @FieldDetail(number = 10)
    private String imp_lucr_real;
    @FieldDetail(number = 11)
    private String imp_pag_rend;
    @FieldDetail(number = 12)
    private String imp_pag_rend_real;
    @FieldDetail(number = 13)
    private String imp_ret_ext;
    @FieldDetail(number = 14)
    private String imp_ret_ext_real;
    @FieldDetail(number = 15)
    private String imp_ret_br;

    public String getReg() {
        return reg;
    }

    public String getRes_inv_per() {
        return res_inv_per;
    }

    public String getRes_inv_per_real() {
        return res_inv_per_real;
    }

    public String getRes_isen_petr_per() {
        return res_isen_petr_per;
    }

    public String getRes_isen_petr_per_real() {
        return res_isen_petr_per_real;
    }

    public String getRes_neg_acum() {
        return res_neg_acum;
    }

    public String getRes_pos_trib() {
        return res_pos_trib;
    }

    public String getRes_pos_trib_real() {
        return res_pos_trib_real;
    }

    public String getImp_lucr() {
        return imp_lucr;
    }

    public String getImp_lucr_real() {
        return imp_lucr_real;
    }

    public String getImp_pag_rend() {
        return imp_pag_rend;
    }

    public String getImp_pag_rend_real() {
        return imp_pag_rend_real;
    }

    public String getImp_ret_ext() {
        return imp_ret_ext;
    }

    public String getImp_ret_ext_real() {
        return imp_ret_ext_real;
    }

    public String getImp_ret_br() {
        return imp_ret_br;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRes_inv_per(String res_inv_per) {
        this.res_inv_per = res_inv_per;
    }

    public void setRes_inv_per_real(String res_inv_per_real) {
        this.res_inv_per_real = res_inv_per_real;
    }

    public void setRes_isen_petr_per(String res_isen_petr_per) {
        this.res_isen_petr_per = res_isen_petr_per;
    }

    public void setRes_isen_petr_per_real(String res_isen_petr_per_real) {
        this.res_isen_petr_per_real = res_isen_petr_per_real;
    }

    public void setRes_neg_acum(String res_neg_acum) {
        this.res_neg_acum = res_neg_acum;
    }

    public void setRes_pos_trib(String res_pos_trib) {
        this.res_pos_trib = res_pos_trib;
    }

    public void setRes_pos_trib_real(String res_pos_trib_real) {
        this.res_pos_trib_real = res_pos_trib_real;
    }

    public void setImp_lucr(String imp_lucr) {
        this.imp_lucr = imp_lucr;
    }

    public void setImp_lucr_real(String imp_lucr_real) {
        this.imp_lucr_real = imp_lucr_real;
    }

    public void setImp_pag_rend(String imp_pag_rend) {
        this.imp_pag_rend = imp_pag_rend;
    }

    public void setImp_pag_rend_real(String imp_pag_rend_real) {
        this.imp_pag_rend_real = imp_pag_rend_real;
    }

    public void setImp_ret_ext(String imp_ret_ext) {
        this.imp_ret_ext = imp_ret_ext;
    }

    public void setImp_ret_ext_real(String imp_ret_ext_real) {
        this.imp_ret_ext_real = imp_ret_ext_real;
    }

    public void setImp_ret_br(String imp_ret_br) {
        this.imp_ret_br = imp_ret_br;
    }

}
