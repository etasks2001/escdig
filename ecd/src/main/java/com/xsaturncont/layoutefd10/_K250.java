
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_prod",
    "cod_item",
    "qtd",
    "_K255"
})
public class _K250 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_prod;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String qtd;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private List<_K255> _K255;

    public String getReg() {
        return reg;
    }

    public String getDt_prod() {
        return dt_prod;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd() {
        return qtd;
    }

    public List<_K255> get_K255() {
        return _K255;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_prod(String dt_prod) {
        this.dt_prod = dt_prod;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public void set_K255(List<_K255> _K255) {
        this._K255 = _K255;
    }

}
