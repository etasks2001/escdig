
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_inv",
    "vl_inv",
    "mot_inv",
    "_H010"
})
public class _H005 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_inv;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String vl_inv;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String mot_inv;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private List<_H010> _H010;

    public String getReg() {
        return reg;
    }

    public String getDt_inv() {
        return dt_inv;
    }

    public String getVl_inv() {
        return vl_inv;
    }

    public String getMot_inv() {
        return mot_inv;
    }

    public List<_H010> get_H010() {
        return _H010;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_inv(String dt_inv) {
        this.dt_inv = dt_inv;
    }

    public void setVl_inv(String vl_inv) {
        this.vl_inv = vl_inv;
    }

    public void setMot_inv(String mot_inv) {
        this.mot_inv = mot_inv;
    }

    public void set_H010(List<_H010> _H010) {
        this._H010 = _H010;
    }

}
