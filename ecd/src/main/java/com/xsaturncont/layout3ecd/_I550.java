
package com.xsaturncont.layout3ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "rz_cont",
    "_I555"
})
public class _I550 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String rz_cont;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_I555> _I555;

    public String getReg() {
        return reg;
    }

    public String getRz_cont() {
        return rz_cont;
    }

    public List<_I555> get_I555() {
        return _I555;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setRz_cont(String rz_cont) {
        this.rz_cont = rz_cont;
    }

    public void set_I555(List<_I555> _I555) {
        this._I555 = _I555;
    }

}
