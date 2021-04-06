
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_mov",
    "_K100"
})
public class _K001 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_mov;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_K100> _K100;

    public String getReg() {
        return reg;
    }

    public String getInd_mov() {
        return ind_mov;
    }

    public List<_K100> get_K100() {
        return _K100;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    public void set_K100(List<_K100> _K100) {
        this._K100 = _K100;
    }

}
