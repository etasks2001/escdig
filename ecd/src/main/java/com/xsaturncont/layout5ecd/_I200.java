
package com.xsaturncont.layout5ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_lcto",
    "dt_lcto",
    "vl_lcto",
    "ind_lcto",
    "_I250"
})
public class _I200 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String num_lcto;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_lcto;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String vl_lcto;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String ind_lcto;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_I250> _I250;

    public String getReg() {
        return reg;
    }

    public String getNum_lcto() {
        return num_lcto;
    }

    public String getDt_lcto() {
        return dt_lcto;
    }

    public String getVl_lcto() {
        return vl_lcto;
    }

    public String getInd_lcto() {
        return ind_lcto;
    }

    public List<_I250> get_I250() {
        return _I250;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_lcto(String num_lcto) {
        this.num_lcto = num_lcto;
    }

    public void setDt_lcto(String dt_lcto) {
        this.dt_lcto = dt_lcto;
    }

    public void setVl_lcto(String vl_lcto) {
        this.vl_lcto = vl_lcto;
    }

    public void setInd_lcto(String ind_lcto) {
        this.ind_lcto = ind_lcto;
    }

    public void set_I250(List<_I250> _I250) {
        this._I250 = _I250;
    }

}
