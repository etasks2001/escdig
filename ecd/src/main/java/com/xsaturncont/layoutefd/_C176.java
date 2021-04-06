
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod_ult_e",
    "num_doc_ult_e",
    "ser_ult_e",
    "dt_ult_e",
    "cod_part_ult_e",
    "quant_ult_e",
    "vl_unit_ult_e",
    "vl_unit_bc_st"
})
public class _C176 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_mod_ult_e;
    @FieldDetail(number = 3)
    private String num_doc_ult_e;
    @FieldDetail(number = 4)
    private String ser_ult_e;
    @FieldDetail(number = 5)
    private String dt_ult_e;
    @FieldDetail(number = 6)
    private String cod_part_ult_e;
    @FieldDetail(number = 7)
    private String quant_ult_e;
    @FieldDetail(number = 8)
    private String vl_unit_ult_e;
    @FieldDetail(number = 9)
    private String vl_unit_bc_st;

    public String getReg() {
        return reg;
    }

    public String getCod_mod_ult_e() {
        return cod_mod_ult_e;
    }

    public String getNum_doc_ult_e() {
        return num_doc_ult_e;
    }

    public String getSer_ult_e() {
        return ser_ult_e;
    }

    public String getDt_ult_e() {
        return dt_ult_e;
    }

    public String getCod_part_ult_e() {
        return cod_part_ult_e;
    }

    public String getQuant_ult_e() {
        return quant_ult_e;
    }

    public String getVl_unit_ult_e() {
        return vl_unit_ult_e;
    }

    public String getVl_unit_bc_st() {
        return vl_unit_bc_st;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod_ult_e(String cod_mod_ult_e) {
        this.cod_mod_ult_e = cod_mod_ult_e;
    }

    public void setNum_doc_ult_e(String num_doc_ult_e) {
        this.num_doc_ult_e = num_doc_ult_e;
    }

    public void setSer_ult_e(String ser_ult_e) {
        this.ser_ult_e = ser_ult_e;
    }

    public void setDt_ult_e(String dt_ult_e) {
        this.dt_ult_e = dt_ult_e;
    }

    public void setCod_part_ult_e(String cod_part_ult_e) {
        this.cod_part_ult_e = cod_part_ult_e;
    }

    public void setQuant_ult_e(String quant_ult_e) {
        this.quant_ult_e = quant_ult_e;
    }

    public void setVl_unit_ult_e(String vl_unit_ult_e) {
        this.vl_unit_ult_e = vl_unit_ult_e;
    }

    public void setVl_unit_bc_st(String vl_unit_bc_st) {
        this.vl_unit_bc_st = vl_unit_bc_st;
    }

}
