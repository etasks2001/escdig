
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "tip_roy",
    "pais",
    "vl_expl_dir_sw",
    "vl_expl_dir_aut",
    "vl_expl_marca",
    "vl_expl_pat",
    "vl_expl_know",
    "vl_expl_franq",
    "vl_expl_int"
})
public class _X420 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String tip_roy;
    @FieldDetail(number = 3, required = true)
    private String pais;
    @FieldDetail(number = 4)
    private String vl_expl_dir_sw;
    @FieldDetail(number = 5)
    private String vl_expl_dir_aut;
    @FieldDetail(number = 6)
    private String vl_expl_marca;
    @FieldDetail(number = 7)
    private String vl_expl_pat;
    @FieldDetail(number = 8)
    private String vl_expl_know;
    @FieldDetail(number = 9)
    private String vl_expl_franq;
    @FieldDetail(number = 10)
    private String vl_expl_int;

    public String getReg() {
        return reg;
    }

    public String getTip_roy() {
        return tip_roy;
    }

    public String getPais() {
        return pais;
    }

    public String getVl_expl_dir_sw() {
        return vl_expl_dir_sw;
    }

    public String getVl_expl_dir_aut() {
        return vl_expl_dir_aut;
    }

    public String getVl_expl_marca() {
        return vl_expl_marca;
    }

    public String getVl_expl_pat() {
        return vl_expl_pat;
    }

    public String getVl_expl_know() {
        return vl_expl_know;
    }

    public String getVl_expl_franq() {
        return vl_expl_franq;
    }

    public String getVl_expl_int() {
        return vl_expl_int;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setTip_roy(String tip_roy) {
        this.tip_roy = tip_roy;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setVl_expl_dir_sw(String vl_expl_dir_sw) {
        this.vl_expl_dir_sw = vl_expl_dir_sw;
    }

    public void setVl_expl_dir_aut(String vl_expl_dir_aut) {
        this.vl_expl_dir_aut = vl_expl_dir_aut;
    }

    public void setVl_expl_marca(String vl_expl_marca) {
        this.vl_expl_marca = vl_expl_marca;
    }

    public void setVl_expl_pat(String vl_expl_pat) {
        this.vl_expl_pat = vl_expl_pat;
    }

    public void setVl_expl_know(String vl_expl_know) {
        this.vl_expl_know = vl_expl_know;
    }

    public void setVl_expl_franq(String vl_expl_franq) {
        this.vl_expl_franq = vl_expl_franq;
    }

    public void setVl_expl_int(String vl_expl_int) {
        this.vl_expl_int = vl_expl_int;
    }

}
