
package com.xsaturncont.layout5ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_K030",
    "_K200"
})
public class _K001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private _K030 _K030;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private List<_K200> _K200;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public _K030 get_K030() {
        return _K030;
    }

    public List<_K200> get_K200() {
        return _K200;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_K030(_K030 _K030) {
        this._K030 = _K030;
    }

    public void set_K200(List<_K200> _K200) {
        this._K200 = _K200;
    }

}
