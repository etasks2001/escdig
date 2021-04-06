
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_mov",
    "_9900"
})
public class _9001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_9900> _9900;

    public String getReg() {
        return reg;
    }

    public String getInd_mov() {
        return ind_mov;
    }

    public List<_9900> get_9900() {
        return _9900;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    public void set_9900(List<_9900> _9900) {
        this._9900 = _9900;
    }

}
