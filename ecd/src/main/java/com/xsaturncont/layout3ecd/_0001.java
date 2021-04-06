
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_0007",
    "_0020",
    "_0035",
    "_0150"
})
public class _0001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private java.util.List<_0007> _0007;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_0020> _0020;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_0035> _0035;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_0150> _0150;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public java.util.List<_0007> get_0007() {
        return _0007;
    }

    public java.util.List<_0020> get_0020() {
        return _0020;
    }

    public java.util.List<_0035> get_0035() {
        return _0035;
    }

    public java.util.List<_0150> get_0150() {
        return _0150;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_0007(java.util.List<_0007> _0007) {
        this._0007 = _0007;
    }

    public void set_0020(java.util.List<_0020> _0020) {
        this._0020 = _0020;
    }

    public void set_0035(java.util.List<_0035> _0035) {
        this._0035 = _0035;
    }

    public void set_0150(java.util.List<_0150> _0150) {
        this._0150 = _0150;
    }

}
