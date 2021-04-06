
package com.xsaturncont.layout4ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_J005",
    "_J900"
})
public class _J001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_J005> _J005;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private _J900 _J900;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public List<_J005> get_J005() {
        return _J005;
    }

    public _J900 get_J900() {
        return _J900;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_J005(List<_J005> _J005) {
        this._J005 = _J005;
    }

    public void set_J900(_J900 _J900) {
        this._J900 = _J900;
    }

}
