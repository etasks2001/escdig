
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_mod",
    "ecf_mod",
    "ecf_fab",
    "ecf_cx",
    "_C405"
})
public class _C400 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String ecf_mod;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String ecf_fab;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String ecf_cx;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_C405> _C405;

    public String getReg() {
        return reg;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public String getEcf_mod() {
        return ecf_mod;
    }

    public String getEcf_fab() {
        return ecf_fab;
    }

    public String getEcf_cx() {
        return ecf_cx;
    }

    public List<_C405> get_C405() {
        return _C405;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public void setEcf_mod(String ecf_mod) {
        this.ecf_mod = ecf_mod;
    }

    public void setEcf_fab(String ecf_fab) {
        this.ecf_fab = ecf_fab;
    }

    public void setEcf_cx(String ecf_cx) {
        this.ecf_cx = ecf_cx;
    }

    public void set_C405(List<_C405> _C405) {
        this._C405 = _C405;
    }

}
