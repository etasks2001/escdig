
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "cod_sit",
    "num_cfe",
    "dt_doc",
    "vl_cfe",
    "vl_pis",
    "vl_cofins",
    "cnpj_cpf",
    "nr_sat",
    "chv_cfe",
    "vl_desc",
    "vl_merc",
    "vl_out_da",
    "vl_icms",
    "vl_pis_st",
    "vl_cofins_st",
    "_C850"
})
public class _C800 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_sit;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String num_cfe;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String dt_doc;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_cfe;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_pis;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_cofins;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String cnpj_cpf;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String nr_sat;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private String chv_cfe;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private String vl_desc;
    @com.xsaturncont.annotation.FieldDetail(number = 13)
    private String vl_merc;
    @com.xsaturncont.annotation.FieldDetail(number = 14)
    private String vl_out_da;
    @com.xsaturncont.annotation.FieldDetail(number = 15)
    private String vl_icms;
    @com.xsaturncont.annotation.FieldDetail(number = 16)
    private String vl_pis_st;
    @com.xsaturncont.annotation.FieldDetail(number = 17)
    private String vl_cofins_st;
    @com.xsaturncont.annotation.FieldDetail(number = 18)
    private List<_C850> _C850;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getCod_sit() {
        return cod_sit;
    }

    public String getNum_cfe() {
        return num_cfe;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public String getVl_cfe() {
        return vl_cfe;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public String getNr_sat() {
        return nr_sat;
    }

    public String getChv_cfe() {
        return chv_cfe;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public String getVl_merc() {
        return vl_merc;
    }

    public String getVl_out_da() {
        return vl_out_da;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public String getVl_pis_st() {
        return vl_pis_st;
    }

    public String getVl_cofins_st() {
        return vl_cofins_st;
    }

    public List<_C850> get_C850() {
        return _C850;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    public void setNum_cfe(String num_cfe) {
        this.num_cfe = num_cfe;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public void setVl_cfe(String vl_cfe) {
        this.vl_cfe = vl_cfe;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public void setNr_sat(String nr_sat) {
        this.nr_sat = nr_sat;
    }

    public void setChv_cfe(String chv_cfe) {
        this.chv_cfe = chv_cfe;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public void setVl_merc(String vl_merc) {
        this.vl_merc = vl_merc;
    }

    public void setVl_out_da(String vl_out_da) {
        this.vl_out_da = vl_out_da;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public void setVl_pis_st(String vl_pis_st) {
        this.vl_pis_st = vl_pis_st;
    }

    public void setVl_cofins_st(String vl_cofins_st) {
        this.vl_cofins_st = vl_cofins_st;
    }

    public void set_C850(List<_C850> _C850) {
        this._C850 = _C850;
    }

}
