
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_prod",
    "_1391"
})
public class _1390 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_prod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private List<_1391> _1391;

    public String getReg() {
        return reg;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public List<_1391> get_1391() {
        return _1391;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public void set_1391(List<_1391> _1391) {
        this._1391 = _1391;
    }

}
