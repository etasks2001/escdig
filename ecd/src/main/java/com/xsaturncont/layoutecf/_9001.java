
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_9100",
    "_9900"
})
public class _9001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_9100> _9100;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private _9900 _9900;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public List<_9100> get_9100() {
        return _9100;
    }

    public _9900 get_9900() {
        return _9900;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_9100(List<_9100> _9100) {
        this._9100 = _9100;
    }

    public void set_9900(_9900 _9900) {
        this._9900 = _9900;
    }

}
