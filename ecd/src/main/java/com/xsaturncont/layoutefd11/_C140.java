
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_emit",
    "ind_tit",
    "desc_tit",
    "num_tit",
    "qtd_parc",
    "vl_tit",
    "_C141"
})
public class _C140 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_emit;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String ind_tit;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String desc_tit;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String num_tit;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String qtd_parc;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String vl_tit;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private List<_C141> _C141;

    public String getReg() {
        return reg;
    }

    public String getInd_emit() {
        return ind_emit;
    }

    public String getInd_tit() {
        return ind_tit;
    }

    public String getDesc_tit() {
        return desc_tit;
    }

    public String getNum_tit() {
        return num_tit;
    }

    public String getQtd_parc() {
        return qtd_parc;
    }

    public String getVl_tit() {
        return vl_tit;
    }

    public List<_C141> get_C141() {
        return _C141;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

    public void setInd_tit(String ind_tit) {
        this.ind_tit = ind_tit;
    }

    public void setDesc_tit(String desc_tit) {
        this.desc_tit = desc_tit;
    }

    public void setNum_tit(String num_tit) {
        this.num_tit = num_tit;
    }

    public void setQtd_parc(String qtd_parc) {
        this.qtd_parc = qtd_parc;
    }

    public void setVl_tit(String vl_tit) {
        this.vl_tit = vl_tit;
    }

    public void set_C141(List<_C141> _C141) {
        this._C141 = _C141;
    }

}
