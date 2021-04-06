
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_serv",
    "dt_ini_serv",
    "dt_fin_serv",
    "per_fiscal",
    "cod_area",
    "terminal"
})
public class _D530 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_serv;
    @FieldDetail(number = 3)
    private String dt_ini_serv;
    @FieldDetail(number = 4)
    private String dt_fin_serv;
    @FieldDetail(number = 5)
    private String per_fiscal;
    @FieldDetail(number = 6)
    private String cod_area;
    @FieldDetail(number = 7)
    private String terminal;

    public String getReg() {
        return reg;
    }

    public String getInd_serv() {
        return ind_serv;
    }

    public String getDt_ini_serv() {
        return dt_ini_serv;
    }

    public String getDt_fin_serv() {
        return dt_fin_serv;
    }

    public String getPer_fiscal() {
        return per_fiscal;
    }

    public String getCod_area() {
        return cod_area;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_serv(String ind_serv) {
        this.ind_serv = ind_serv;
    }

    public void setDt_ini_serv(String dt_ini_serv) {
        this.dt_ini_serv = dt_ini_serv;
    }

    public void setDt_fin_serv(String dt_fin_serv) {
        this.dt_fin_serv = dt_fin_serv;
    }

    public void setPer_fiscal(String per_fiscal) {
        this.per_fiscal = per_fiscal;
    }

    public void setCod_area(String cod_area) {
        this.cod_area = cod_area;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

}
