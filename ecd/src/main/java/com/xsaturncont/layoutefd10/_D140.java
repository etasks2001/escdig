
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_part_consg",
    "cod_mun_orig",
    "cod_mun_dest",
    "ind_veic",
    "veic_id",
    "ind_nav",
    "viagem",
    "vl_frt_liq",
    "vl_desp_port",
    "vl_desp_car_desc",
    "vl_out",
    "vl_frt_brt",
    "vl_frt_mm"
})
public class _D140 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_part_consg;
    @FieldDetail(number = 3)
    private String cod_mun_orig;
    @FieldDetail(number = 4)
    private String cod_mun_dest;
    @FieldDetail(number = 5)
    private String ind_veic;
    @FieldDetail(number = 6)
    private String veic_id;
    @FieldDetail(number = 7)
    private String ind_nav;
    @FieldDetail(number = 8)
    private String viagem;
    @FieldDetail(number = 9)
    private String vl_frt_liq;
    @FieldDetail(number = 10)
    private String vl_desp_port;
    @FieldDetail(number = 11)
    private String vl_desp_car_desc;
    @FieldDetail(number = 12)
    private String vl_out;
    @FieldDetail(number = 13)
    private String vl_frt_brt;
    @FieldDetail(number = 14)
    private String vl_frt_mm;

    public String getReg() {
        return reg;
    }

    public String getCod_part_consg() {
        return cod_part_consg;
    }

    public String getCod_mun_orig() {
        return cod_mun_orig;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public String getInd_veic() {
        return ind_veic;
    }

    public String getVeic_id() {
        return veic_id;
    }

    public String getInd_nav() {
        return ind_nav;
    }

    public String getViagem() {
        return viagem;
    }

    public String getVl_frt_liq() {
        return vl_frt_liq;
    }

    public String getVl_desp_port() {
        return vl_desp_port;
    }

    public String getVl_desp_car_desc() {
        return vl_desp_car_desc;
    }

    public String getVl_out() {
        return vl_out;
    }

    public String getVl_frt_brt() {
        return vl_frt_brt;
    }

    public String getVl_frt_mm() {
        return vl_frt_mm;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_part_consg(String cod_part_consg) {
        this.cod_part_consg = cod_part_consg;
    }

    public void setCod_mun_orig(String cod_mun_orig) {
        this.cod_mun_orig = cod_mun_orig;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    public void setInd_veic(String ind_veic) {
        this.ind_veic = ind_veic;
    }

    public void setVeic_id(String veic_id) {
        this.veic_id = veic_id;
    }

    public void setInd_nav(String ind_nav) {
        this.ind_nav = ind_nav;
    }

    public void setViagem(String viagem) {
        this.viagem = viagem;
    }

    public void setVl_frt_liq(String vl_frt_liq) {
        this.vl_frt_liq = vl_frt_liq;
    }

    public void setVl_desp_port(String vl_desp_port) {
        this.vl_desp_port = vl_desp_port;
    }

    public void setVl_desp_car_desc(String vl_desp_car_desc) {
        this.vl_desp_car_desc = vl_desp_car_desc;
    }

    public void setVl_out(String vl_out) {
        this.vl_out = vl_out;
    }

    public void setVl_frt_brt(String vl_frt_brt) {
        this.vl_frt_brt = vl_frt_brt;
    }

    public void setVl_frt_mm(String vl_frt_mm) {
        this.vl_frt_mm = vl_frt_mm;
    }

}
