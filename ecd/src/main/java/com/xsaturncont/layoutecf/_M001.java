
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_M010",
    "_M030"
})
public class _M001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private java.util.List<_M010> _M010;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_M030> _M030;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public java.util.List<_M010> get_M010() {
        return _M010;
    }

    public java.util.List<_M030> get_M030() {
        return _M030;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_M010(java.util.List<_M010> _M010) {
        this._M010 = _M010;
    }

    public void set_M030(java.util.List<_M030> _M030) {
        this._M030 = _M030;
    }

}
