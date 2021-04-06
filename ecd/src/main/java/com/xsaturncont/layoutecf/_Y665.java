
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_cta",
    "cod_ccus",
    "vl_saldo_soc",
    "ind_vl_saldo_soc",
    "vl_saldo_fis",
    "ind_vl_saldo_fis",
    "dif_saldos",
    "ind_dif_saldos",
    "met_contr",
    "cod_subcont",
    "cod_ccus_sub"
})
public class _Y665 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_cta;
    @FieldDetail(number = 3)
    private String cod_ccus;
    @FieldDetail(number = 4, required = true)
    private String vl_saldo_soc;
    @FieldDetail(number = 5, required = true)
    private String ind_vl_saldo_soc;
    @FieldDetail(number = 6, required = true)
    private String vl_saldo_fis;
    @FieldDetail(number = 7, required = true)
    private String ind_vl_saldo_fis;
    @FieldDetail(number = 8, required = true)
    private String dif_saldos;
    @FieldDetail(number = 9, required = true)
    private String ind_dif_saldos;
    @FieldDetail(number = 10, required = true)
    private String met_contr;
    @FieldDetail(number = 11)
    private String cod_subcont;
    @FieldDetail(number = 12)
    private String cod_ccus_sub;

    public String getReg() {
        return reg;
    }

    public String getCod_cta() {
        return cod_cta;
    }

    public String getCod_ccus() {
        return cod_ccus;
    }

    public String getVl_saldo_soc() {
        return vl_saldo_soc;
    }

    public String getInd_vl_saldo_soc() {
        return ind_vl_saldo_soc;
    }

    public String getVl_saldo_fis() {
        return vl_saldo_fis;
    }

    public String getInd_vl_saldo_fis() {
        return ind_vl_saldo_fis;
    }

    public String getDif_saldos() {
        return dif_saldos;
    }

    public String getInd_dif_saldos() {
        return ind_dif_saldos;
    }

    public String getMet_contr() {
        return met_contr;
    }

    public String getCod_subcont() {
        return cod_subcont;
    }

    public String getCod_ccus_sub() {
        return cod_ccus_sub;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    public void setVl_saldo_soc(String vl_saldo_soc) {
        this.vl_saldo_soc = vl_saldo_soc;
    }

    public void setInd_vl_saldo_soc(String ind_vl_saldo_soc) {
        this.ind_vl_saldo_soc = ind_vl_saldo_soc;
    }

    public void setVl_saldo_fis(String vl_saldo_fis) {
        this.vl_saldo_fis = vl_saldo_fis;
    }

    public void setInd_vl_saldo_fis(String ind_vl_saldo_fis) {
        this.ind_vl_saldo_fis = ind_vl_saldo_fis;
    }

    public void setDif_saldos(String dif_saldos) {
        this.dif_saldos = dif_saldos;
    }

    public void setInd_dif_saldos(String ind_dif_saldos) {
        this.ind_dif_saldos = ind_dif_saldos;
    }

    public void setMet_contr(String met_contr) {
        this.met_contr = met_contr;
    }

    public void setCod_subcont(String cod_subcont) {
        this.cod_subcont = cod_subcont;
    }

    public void setCod_ccus_sub(String cod_ccus_sub) {
        this.cod_ccus_sub = cod_ccus_sub;
    }

}
