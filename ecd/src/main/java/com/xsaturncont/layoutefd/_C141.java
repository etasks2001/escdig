
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_parc",
    "dt_vcto",
    "vl_parc"
})
public class _C141 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_parc;
    @FieldDetail(number = 3)
    private String dt_vcto;
    @FieldDetail(number = 4)
    private String vl_parc;

    public String getReg() {
        return reg;
    }

    public String getNum_parc() {
        return num_parc;
    }

    public String getDt_vcto() {
        return dt_vcto;
    }

    public String getVl_parc() {
        return vl_parc;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_parc(String num_parc) {
        this.num_parc = num_parc;
    }

    public void setDt_vcto(String dt_vcto) {
        this.dt_vcto = dt_vcto;
    }

    public void setVl_parc(String vl_parc) {
        this.vl_parc = vl_parc;
    }

}
