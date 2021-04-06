
package com.xsaturncont.layout3ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_res",
    "_I355"
})
public class _I350 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_res;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_I355> _I355;

    public String getReg() {
        return reg;
    }

    public String getDt_res() {
        return dt_res;
    }

    public List<_I355> get_I355() {
        return _I355;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_res(String dt_res) {
        this.dt_res = dt_res;
    }

    public void set_I355(List<_I355> _I355) {
        this._I355 = _I355;
    }

}
