
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_0010",
    "_0020",
    "_0030",
    "_0035",
    "_0930"
})
public class _0001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private _0010 _0010;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private _0020 _0020;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private _0030 _0030;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_0035> _0035;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_0930> _0930;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public _0010 get_0010() {
        return _0010;
    }

    public _0020 get_0020() {
        return _0020;
    }

    public _0030 get_0030() {
        return _0030;
    }

    public java.util.List<_0035> get_0035() {
        return _0035;
    }

    public java.util.List<_0930> get_0930() {
        return _0930;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_0010(_0010 _0010) {
        this._0010 = _0010;
    }

    public void set_0020(_0020 _0020) {
        this._0020 = _0020;
    }

    public void set_0030(_0030 _0030) {
        this._0030 = _0030;
    }

    public void set_0035(java.util.List<_0035> _0035) {
        this._0035 = _0035;
    }

    public void set_0930(java.util.List<_0930> _0930) {
        this._0930 = _0930;
    }

}
