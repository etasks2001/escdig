
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part_consg",
    "cod_part_red",
    "ind_frt_red",
    "cod_mun_orig",
    "cod_mun_dest",
    "veic_id",
    "vl_liq_frt",
    "vl_sec_cat",
    "vl_desp",
    "vl_pedg",
    "vl_out",
    "vl_frt",
    "uf_id"
})
public class _D130 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part_consg;
    @FieldDetail(number = 3)
    private String cod_part_red;
    @FieldDetail(number = 4)
    private String ind_frt_red;
    @FieldDetail(number = 5)
    private String cod_mun_orig;
    @FieldDetail(number = 6)
    private String cod_mun_dest;
    @FieldDetail(number = 7)
    private String veic_id;
    @FieldDetail(number = 8)
    private String vl_liq_frt;
    @FieldDetail(number = 9)
    private String vl_sec_cat;
    @FieldDetail(number = 10)
    private String vl_desp;
    @FieldDetail(number = 11)
    private String vl_pedg;
    @FieldDetail(number = 12)
    private String vl_out;
    @FieldDetail(number = 13)
    private String vl_frt;
    @FieldDetail(number = 14)
    private String uf_id;

    public String getReg() {
        return reg;
    }

    public String getCod_part_consg() {
        return cod_part_consg;
    }

    public String getCod_part_red() {
        return cod_part_red;
    }

    public String getInd_frt_red() {
        return ind_frt_red;
    }

    public String getCod_mun_orig() {
        return cod_mun_orig;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public String getVeic_id() {
        return veic_id;
    }

    public String getVl_liq_frt() {
        return vl_liq_frt;
    }

    public String getVl_sec_cat() {
        return vl_sec_cat;
    }

    public String getVl_desp() {
        return vl_desp;
    }

    public String getVl_pedg() {
        return vl_pedg;
    }

    public String getVl_out() {
        return vl_out;
    }

    public String getVl_frt() {
        return vl_frt;
    }

    public String getUf_id() {
        return uf_id;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part_consg(String cod_part_consg) {
        this.cod_part_consg = cod_part_consg;
    }

    public void setCod_part_red(String cod_part_red) {
        this.cod_part_red = cod_part_red;
    }

    public void setInd_frt_red(String ind_frt_red) {
        this.ind_frt_red = ind_frt_red;
    }

    public void setCod_mun_orig(String cod_mun_orig) {
        this.cod_mun_orig = cod_mun_orig;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    public void setVeic_id(String veic_id) {
        this.veic_id = veic_id;
    }

    public void setVl_liq_frt(String vl_liq_frt) {
        this.vl_liq_frt = vl_liq_frt;
    }

    public void setVl_sec_cat(String vl_sec_cat) {
        this.vl_sec_cat = vl_sec_cat;
    }

    public void setVl_desp(String vl_desp) {
        this.vl_desp = vl_desp;
    }

    public void setVl_pedg(String vl_pedg) {
        this.vl_pedg = vl_pedg;
    }

    public void setVl_out(String vl_out) {
        this.vl_out = vl_out;
    }

    public void setVl_frt(String vl_frt) {
        this.vl_frt = vl_frt;
    }

    public void setUf_id(String uf_id) {
        this.uf_id = uf_id;
    }

}
