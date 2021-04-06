
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_or",
    "vl_or",
    "dt_vcto",
    "cod_rec",
    "num_proc",
    "ind_proc",
    "proc",
    "txt_compl",
    "mes_ref"
})
public class _1926 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_or;
    @FieldDetail(number = 3)
    private String vl_or;
    @FieldDetail(number = 4)
    private String dt_vcto;
    @FieldDetail(number = 5)
    private String cod_rec;
    @FieldDetail(number = 6)
    private String num_proc;
    @FieldDetail(number = 7)
    private String ind_proc;
    @FieldDetail(number = 8)
    private String proc;
    @FieldDetail(number = 9)
    private String txt_compl;
    @FieldDetail(number = 10)
    private String mes_ref;

    public String getReg() {
        return reg;
    }

    public String getCod_or() {
        return cod_or;
    }

    public String getVl_or() {
        return vl_or;
    }

    public String getDt_vcto() {
        return dt_vcto;
    }

    public String getCod_rec() {
        return cod_rec;
    }

    public String getNum_proc() {
        return num_proc;
    }

    public String getInd_proc() {
        return ind_proc;
    }

    public String getProc() {
        return proc;
    }

    public String getTxt_compl() {
        return txt_compl;
    }

    public String getMes_ref() {
        return mes_ref;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_or(String cod_or) {
        this.cod_or = cod_or;
    }

    public void setVl_or(String vl_or) {
        this.vl_or = vl_or;
    }

    public void setDt_vcto(String dt_vcto) {
        this.dt_vcto = dt_vcto;
    }

    public void setCod_rec(String cod_rec) {
        this.cod_rec = cod_rec;
    }

    public void setNum_proc(String num_proc) {
        this.num_proc = num_proc;
    }

    public void setInd_proc(String ind_proc) {
        this.ind_proc = ind_proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    public void setMes_ref(String mes_ref) {
        this.mes_ref = mes_ref;
    }

}
