
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_mov",
    "_D100",
    "_D300",
    "_D350",
    "_D400",
    "_D500",
    "_D600",
    "_D695"
})
public class _D001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private java.util.List<_D100> _D100;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_D300> _D300;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_D350> _D350;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_D400> _D400;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_D500> _D500;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_D600> _D600;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_D695> _D695;

    public String getReg() {
        return reg;
    }

    public String getInd_mov() {
        return ind_mov;
    }

    public java.util.List<_D100> get_D100() {
        return _D100;
    }

    public java.util.List<_D300> get_D300() {
        return _D300;
    }

    public java.util.List<_D350> get_D350() {
        return _D350;
    }

    public java.util.List<_D400> get_D400() {
        return _D400;
    }

    public java.util.List<_D500> get_D500() {
        return _D500;
    }

    public java.util.List<_D600> get_D600() {
        return _D600;
    }

    public java.util.List<_D695> get_D695() {
        return _D695;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    public void set_D100(java.util.List<_D100> _D100) {
        this._D100 = _D100;
    }

    public void set_D300(java.util.List<_D300> _D300) {
        this._D300 = _D300;
    }

    public void set_D350(java.util.List<_D350> _D350) {
        this._D350 = _D350;
    }

    public void set_D400(java.util.List<_D400> _D400) {
        this._D400 = _D400;
    }

    public void set_D500(java.util.List<_D500> _D500) {
        this._D500 = _D500;
    }

    public void set_D600(java.util.List<_D600> _D600) {
        this._D600 = _D600;
    }

    public void set_D695(java.util.List<_D695> _D695) {
        this._D695 = _D695;
    }

}
