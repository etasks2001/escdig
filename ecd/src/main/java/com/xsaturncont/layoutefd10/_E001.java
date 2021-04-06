
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_mov",
    "_E100",
    "_E200",
    "_E300",
    "_E500"
})
public class _E001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private java.util.List<_E100> _E100;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_E200> _E200;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_E300> _E300;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_E500> _E500;

    public String getReg() {
        return reg;
    }

    public String getInd_mov() {
        return ind_mov;
    }

    public java.util.List<_E100> get_E100() {
        return _E100;
    }

    public java.util.List<_E200> get_E200() {
        return _E200;
    }

    public java.util.List<_E300> get_E300() {
        return _E300;
    }

    public java.util.List<_E500> get_E500() {
        return _E500;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    public void set_E100(java.util.List<_E100> _E100) {
        this._E100 = _E100;
    }

    public void set_E200(java.util.List<_E200> _E200) {
        this._E200 = _E200;
    }

    public void set_E300(java.util.List<_E300> _E300) {
        this._E300 = _E300;
    }

    public void set_E500(java.util.List<_E500> _E500) {
        this._E500 = _E500;
    }

}
