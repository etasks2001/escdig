
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_mov",
    "_H005"
})
public class _H001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_H005> _H005;

    public String getReg() {
        return reg;
    }

    public String getInd_mov() {
        return ind_mov;
    }

    public List<_H005> get_H005() {
        return _H005;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    public void set_H005(List<_H005> _H005) {
        this._H005 = _H005;
    }

}
