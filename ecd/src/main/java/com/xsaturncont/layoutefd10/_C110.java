
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_inf",
    "txt_compl",
    "_C111",
    "_C112",
    "_C113",
    "_C114",
    "_C115",
    "_C116"
})
public class _C110 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_inf;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String txt_compl;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private java.util.List<_C111> _C111;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private java.util.List<_C112> _C112;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_C113> _C113;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_C114> _C114;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private java.util.List<_C115> _C115;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private java.util.List<_C116> _C116;

    public String getReg() {
        return reg;
    }

    public String getCod_inf() {
        return cod_inf;
    }

    public String getTxt_compl() {
        return txt_compl;
    }

    public java.util.List<_C111> get_C111() {
        return _C111;
    }

    public java.util.List<_C112> get_C112() {
        return _C112;
    }

    public java.util.List<_C113> get_C113() {
        return _C113;
    }

    public java.util.List<_C114> get_C114() {
        return _C114;
    }

    public java.util.List<_C115> get_C115() {
        return _C115;
    }

    public java.util.List<_C116> get_C116() {
        return _C116;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
    }

    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    public void set_C111(java.util.List<_C111> _C111) {
        this._C111 = _C111;
    }

    public void set_C112(java.util.List<_C112> _C112) {
        this._C112 = _C112;
    }

    public void set_C113(java.util.List<_C113> _C113) {
        this._C113 = _C113;
    }

    public void set_C114(java.util.List<_C114> _C114) {
        this._C114 = _C114;
    }

    public void set_C115(java.util.List<_C115> _C115) {
        this._C115 = _C115;
    }

    public void set_C116(java.util.List<_C116> _C116) {
        this._C116 = _C116;
    }

}
