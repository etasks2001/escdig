
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_obs",
    "txt_compl",
    "_D197"
})
public class _D195 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_obs;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String txt_compl;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private List<_D197> _D197;

    public String getReg() {
        return reg;
    }

    public String getCod_obs() {
        return cod_obs;
    }

    public String getTxt_compl() {
        return txt_compl;
    }

    public List<_D197> get_D197() {
        return _D197;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    public void set_D197(List<_D197> _D197) {
        this._D197 = _D197;
    }

}
