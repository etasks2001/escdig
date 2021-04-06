
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_J050",
    "_J100"
})
public class _J001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private java.util.List<_J050> _J050;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_J100> _J100;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public java.util.List<_J050> get_J050() {
        return _J050;
    }

    public java.util.List<_J100> get_J100() {
        return _J100;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_J050(java.util.List<_J050> _J050) {
        this._J050 = _J050;
    }

    public void set_J100(java.util.List<_J100> _J100) {
        this._J100 = _J100;
    }

}
