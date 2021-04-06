
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part_consg",
    "cod_part_red",
    "cod_mun_orig",
    "cod_mun_dest",
    "otm",
    "ind_nat_frt",
    "vl_liq_frt",
    "vl_gris",
    "vl_pdg",
    "vl_out",
    "vl_frt",
    "veic_id",
    "uf_id"
})
public class _D170 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part_consg;
    @FieldDetail(number = 3)
    private String cod_part_red;
    @FieldDetail(number = 4)
    private String cod_mun_orig;
    @FieldDetail(number = 5)
    private String cod_mun_dest;
    @FieldDetail(number = 6)
    private String otm;
    @FieldDetail(number = 7)
    private String ind_nat_frt;
    @FieldDetail(number = 8)
    private String vl_liq_frt;
    @FieldDetail(number = 9)
    private String vl_gris;
    @FieldDetail(number = 10)
    private String vl_pdg;
    @FieldDetail(number = 11)
    private String vl_out;
    @FieldDetail(number = 12)
    private String vl_frt;
    @FieldDetail(number = 13)
    private String veic_id;
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

    public String getCod_mun_orig() {
        return cod_mun_orig;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public String getOtm() {
        return otm;
    }

    public String getInd_nat_frt() {
        return ind_nat_frt;
    }

    public String getVl_liq_frt() {
        return vl_liq_frt;
    }

    public String getVl_gris() {
        return vl_gris;
    }

    public String getVl_pdg() {
        return vl_pdg;
    }

    public String getVl_out() {
        return vl_out;
    }

    public String getVl_frt() {
        return vl_frt;
    }

    public String getVeic_id() {
        return veic_id;
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

    public void setCod_mun_orig(String cod_mun_orig) {
        this.cod_mun_orig = cod_mun_orig;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    public void setOtm(String otm) {
        this.otm = otm;
    }

    public void setInd_nat_frt(String ind_nat_frt) {
        this.ind_nat_frt = ind_nat_frt;
    }

    public void setVl_liq_frt(String vl_liq_frt) {
        this.vl_liq_frt = vl_liq_frt;
    }

    public void setVl_gris(String vl_gris) {
        this.vl_gris = vl_gris;
    }

    public void setVl_pdg(String vl_pdg) {
        this.vl_pdg = vl_pdg;
    }

    public void setVl_out(String vl_out) {
        this.vl_out = vl_out;
    }

    public void setVl_frt(String vl_frt) {
        this.vl_frt = vl_frt;
    }

    public void setVeic_id(String veic_id) {
        this.veic_id = veic_id;
    }

    public void setUf_id(String uf_id) {
        this.uf_id = uf_id;
    }

}
