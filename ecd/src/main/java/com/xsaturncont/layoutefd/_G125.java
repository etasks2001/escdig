
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_ind_bem",
    "dt_mov",
    "tipo_mov",
    "vl_imob_icms_op",
    "vl_imob_icms_st",
    "vl_imob_icms_frt",
    "vl_imob_icms_dif",
    "num_parc",
    "vl_parc_pass",
    "_G126",
    "_G130"
})
public class _G125 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_ind_bem;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String tipo_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String vl_imob_icms_op;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String vl_imob_icms_st;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_imob_icms_frt;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String vl_imob_icms_dif;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private String num_parc;
    @com.xsaturncont.annotation.FieldDetail(number = 10)
    private String vl_parc_pass;
    @com.xsaturncont.annotation.FieldDetail(number = 11)
    private java.util.List<_G126> _G126;
    @com.xsaturncont.annotation.FieldDetail(number = 12)
    private java.util.List<_G130> _G130;

    public String getReg() {
        return reg;
    }

    public String getCod_ind_bem() {
        return cod_ind_bem;
    }

    public String getDt_mov() {
        return dt_mov;
    }

    public String getTipo_mov() {
        return tipo_mov;
    }

    public String getVl_imob_icms_op() {
        return vl_imob_icms_op;
    }

    public String getVl_imob_icms_st() {
        return vl_imob_icms_st;
    }

    public String getVl_imob_icms_frt() {
        return vl_imob_icms_frt;
    }

    public String getVl_imob_icms_dif() {
        return vl_imob_icms_dif;
    }

    public String getNum_parc() {
        return num_parc;
    }

    public String getVl_parc_pass() {
        return vl_parc_pass;
    }

    public java.util.List<_G126> get_G126() {
        return _G126;
    }

    public java.util.List<_G130> get_G130() {
        return _G130;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_ind_bem(String cod_ind_bem) {
        this.cod_ind_bem = cod_ind_bem;
    }

    public void setDt_mov(String dt_mov) {
        this.dt_mov = dt_mov;
    }

    public void setTipo_mov(String tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public void setVl_imob_icms_op(String vl_imob_icms_op) {
        this.vl_imob_icms_op = vl_imob_icms_op;
    }

    public void setVl_imob_icms_st(String vl_imob_icms_st) {
        this.vl_imob_icms_st = vl_imob_icms_st;
    }

    public void setVl_imob_icms_frt(String vl_imob_icms_frt) {
        this.vl_imob_icms_frt = vl_imob_icms_frt;
    }

    public void setVl_imob_icms_dif(String vl_imob_icms_dif) {
        this.vl_imob_icms_dif = vl_imob_icms_dif;
    }

    public void setNum_parc(String num_parc) {
        this.num_parc = num_parc;
    }

    public void setVl_parc_pass(String vl_parc_pass) {
        this.vl_parc_pass = vl_parc_pass;
    }

    public void set_G126(java.util.List<_G126> _G126) {
        this._G126 = _G126;
    }

    public void set_G130(java.util.List<_G130> _G130) {
        this._G130 = _G130;
    }

}
