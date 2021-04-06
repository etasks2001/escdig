
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mun_orig",
    "cod_mun_dest",
    "veic_id",
    "viagem",
    "ind_tfa",
    "vl_peso_tx",
    "vl_tx_terr",
    "vl_tx_red",
    "vl_out",
    "vl_tx_adv"
})
public class _D150 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mun_orig;
    @FieldDetail(number = 3)
    private String cod_mun_dest;
    @FieldDetail(number = 4)
    private String veic_id;
    @FieldDetail(number = 5)
    private String viagem;
    @FieldDetail(number = 6)
    private String ind_tfa;
    @FieldDetail(number = 7)
    private String vl_peso_tx;
    @FieldDetail(number = 8)
    private String vl_tx_terr;
    @FieldDetail(number = 9)
    private String vl_tx_red;
    @FieldDetail(number = 10)
    private String vl_out;
    @FieldDetail(number = 11)
    private String vl_tx_adv;

    public String getReg() {
        return reg;
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

    public String getViagem() {
        return viagem;
    }

    public String getInd_tfa() {
        return ind_tfa;
    }

    public String getVl_peso_tx() {
        return vl_peso_tx;
    }

    public String getVl_tx_terr() {
        return vl_tx_terr;
    }

    public String getVl_tx_red() {
        return vl_tx_red;
    }

    public String getVl_out() {
        return vl_out;
    }

    public String getVl_tx_adv() {
        return vl_tx_adv;
    }

    public void setReg(String reg) {
        this.reg = reg;
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

    public void setViagem(String viagem) {
        this.viagem = viagem;
    }

    public void setInd_tfa(String ind_tfa) {
        this.ind_tfa = ind_tfa;
    }

    public void setVl_peso_tx(String vl_peso_tx) {
        this.vl_peso_tx = vl_peso_tx;
    }

    public void setVl_tx_terr(String vl_tx_terr) {
        this.vl_tx_terr = vl_tx_terr;
    }

    public void setVl_tx_red(String vl_tx_red) {
        this.vl_tx_red = vl_tx_red;
    }

    public void setVl_out(String vl_out) {
        this.vl_out = vl_out;
    }

    public void setVl_tx_adv(String vl_tx_adv) {
        this.vl_tx_adv = vl_tx_adv;
    }

}
