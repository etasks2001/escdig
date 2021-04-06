
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_E010",
    "_E020",
    "_E030"
})
public class _E001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private java.util.List<_E010> _E010;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_E020> _E020;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_E030> _E030;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public java.util.List<_E010> get_E010() {
        return _E010;
    }

    public java.util.List<_E020> get_E020() {
        return _E020;
    }

    public java.util.List<_E030> get_E030() {
        return _E030;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_E010(java.util.List<_E010> _E010) {
        this._E010 = _E010;
    }

    public void set_E020(java.util.List<_E020> _E020) {
        this._E020 = _E020;
    }

    public void set_E030(java.util.List<_E030> _E030) {
        this._E030 = _E030;
    }

}
