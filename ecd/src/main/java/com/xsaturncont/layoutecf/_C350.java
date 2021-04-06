
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_res",
    "_C355"
})
public class _C350 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_res;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_C355> _C355;

    public String getReg() {
        return reg;
    }

    public String getDt_res() {
        return dt_res;
    }

    public List<_C355> get_C355() {
        return _C355;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_res(String dt_res) {
        this.dt_res = dt_res;
    }

    public void set_C355(List<_C355> _C355) {
        this._C355 = _C355;
    }

}
