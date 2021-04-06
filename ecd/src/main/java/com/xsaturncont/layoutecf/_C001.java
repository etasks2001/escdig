
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dad",
    "_C040"
})
public class _C001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String ind_dad;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_C040> _C040;

    public String getReg() {
        return reg;
    }

    public String getInd_dad() {
        return ind_dad;
    }

    public List<_C040> get_C040() {
        return _C040;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    public void set_C040(List<_C040> _C040) {
        this._C040 = _C040;
    }

}
