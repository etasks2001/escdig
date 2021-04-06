
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "mes",
    "_Y681"
})
public class _Y680 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String mes;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_Y681> _Y681;

    public String getReg() {
        return reg;
    }

    public String getMes() {
        return mes;
    }

    public List<_Y681> get_Y681() {
        return _Y681;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void set_Y681(List<_Y681> _Y681) {
        this._Y681 = _Y681;
    }

}
