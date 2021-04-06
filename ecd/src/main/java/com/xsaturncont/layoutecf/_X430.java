
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "pais",
    "vl_serv_assist",
    "vl_serv_sem_assist",
    "vl_serv_sem_assist_ext",
    "vl_juro",
    "vl_demais_juros",
    "vl_divid"
})
public class _X430 {

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
    private String vl_juro;
    @FieldDetail(number = 7)
    private String vl_demais_juros;
    @FieldDetail(number = 8)
    private String vl_divid;

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

    public String getVl_juro() {
        return vl_juro;
    }

    public String getVl_demais_juros() {
        return vl_demais_juros;
    }

    public String getVl_divid() {
        return vl_divid;
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

    public void setVl_juro(String vl_juro) {
        this.vl_juro = vl_juro;
    }

    public void setVl_demais_juros(String vl_demais_juros) {
        this.vl_demais_juros = vl_demais_juros;
    }

    public void setVl_divid(String vl_divid) {
        this.vl_divid = vl_divid;
    }

}
