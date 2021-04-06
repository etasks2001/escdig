
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_mov",
    "_G110"
})
public class _G001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_G110> _G110;

    public String getReg() {
        return reg;
    }

    public String getInd_mov() {
        return ind_mov;
    }

    public List<_G110> get_G110() {
        return _G110;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    public void set_G110(List<_G110> _G110) {
        this._G110 = _G110;
    }

}
