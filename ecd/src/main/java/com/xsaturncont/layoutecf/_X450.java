
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "pais",
    "vl_serv_assist",
    "vl_serv_sem_assist",
    "vl_serv_sem_assist_ext",
    "vl_juro_pf",
    "vl_juro_pj",
    "vl_demais_juros",
    "vl_divid_pf",
    "vl_divid_pj"
})
public class _X450 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String pais;
    @FieldDetail(number = 3)
    private String vl_serv_assist;
    @FieldDetail(number = 4)
    private String vl_serv_sem_assist;
    @FieldDetail(number = 5)
    private String vl_serv_sem_assist_ext;
    @FieldDetail(number = 6)
    private String vl_juro_pf;
    @FieldDetail(number = 7)
    private String vl_juro_pj;
    @FieldDetail(number = 8)
    private String vl_demais_juros;
    @FieldDetail(number = 9)
    private String vl_divid_pf;
    @FieldDetail(number = 10)
    private String vl_divid_pj;

    public String getReg() {
        return reg;
    }

    public String getPais() {
        return pais;
    }

    public String getVl_serv_assist() {
        return vl_serv_assist;
    }

    public String getVl_serv_sem_assist() {
        return vl_serv_sem_assist;
    }

    public String getVl_serv_sem_assist_ext() {
        return vl_serv_sem_assist_ext;
    }

    public String getVl_juro_pf() {
        return vl_juro_pf;
    }

    public String getVl_juro_pj() {
        return vl_juro_pj;
    }

    public String getVl_demais_juros() {
        return vl_demais_juros;
    }

    public String getVl_divid_pf() {
        return vl_divid_pf;
    }

    public String getVl_divid_pj() {
        return vl_divid_pj;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setVl_serv_assist(String vl_serv_assist) {
        this.vl_serv_assist = vl_serv_assist;
    }

    public void setVl_serv_sem_assist(String vl_serv_sem_assist) {
        this.vl_serv_sem_assist = vl_serv_sem_assist;
    }

    public void setVl_serv_sem_assist_ext(String vl_serv_sem_assist_ext) {
        this.vl_serv_sem_assist_ext = vl_serv_sem_assist_ext;
    }

    public void setVl_juro_pf(String vl_juro_pf) {
        this.vl_juro_pf = vl_juro_pf;
    }

    public void setVl_juro_pj(String vl_juro_pj) {
        this.vl_juro_pj = vl_juro_pj;
    }

    public void setVl_demais_juros(String vl_demais_juros) {
        this.vl_demais_juros = vl_demais_juros;
    }

    public void setVl_divid_pf(String vl_divid_pf) {
        this.vl_divid_pf = vl_divid_pf;
    }

    public void setVl_divid_pj(String vl_divid_pj) {
        this.vl_divid_pj = vl_divid_pj;
    }

}
