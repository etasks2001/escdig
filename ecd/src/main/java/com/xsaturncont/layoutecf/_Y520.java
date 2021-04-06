
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "tip_ext",
    "pais",
    "forma",
    "nat_oper",
    "vl_periodo"
})
public class _Y520 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String tip_ext;
    @FieldDetail(number = 3, required = true)
    private String pais;
    @FieldDetail(number = 4, required = true)
    private String forma;
    @FieldDetail(number = 5, required = true)
    private String nat_oper;
    @FieldDetail(number = 6, required = true)
    private String vl_periodo;

    public String getReg() {
        return reg;
    }

    public String getTip_ext() {
        return tip_ext;
    }

    public String getPais() {
        return pais;
    }

    public String getForma() {
        return forma;
    }

    public String getNat_oper() {
        return nat_oper;
    }

    public String getVl_periodo() {
        return vl_periodo;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setTip_ext(String tip_ext) {
        this.tip_ext = tip_ext;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setNat_oper(String nat_oper) {
        this.nat_oper = nat_oper;
    }

    public void setVl_periodo(String vl_periodo) {
        this.vl_periodo = vl_periodo;
    }

}
