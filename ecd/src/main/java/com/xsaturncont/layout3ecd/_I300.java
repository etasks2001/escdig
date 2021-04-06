
package com.xsaturncont.layout3ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_bcte",
    "_I310"
})
public class _I300 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String dt_bcte;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_I310> _I310;

    public String getReg() {
        return reg;
    }

    public String getDt_bcte() {
        return dt_bcte;
    }

    public List<_I310> get_I310() {
        return _I310;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_bcte(String dt_bcte) {
        this.dt_bcte = dt_bcte;
    }

    public void set_I310(List<_I310> _I310) {
        this._I310 = _I310;
    }

}
