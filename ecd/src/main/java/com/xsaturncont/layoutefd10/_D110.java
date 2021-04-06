
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_item",
    "cod_item",
    "vl_serv",
    "vl_out",
    "_D120"
})
public class _D110 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String num_item;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String vl_serv;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String vl_out;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_D120> _D120;

    public String getReg() {
        return reg;
    }

    public String getNum_item() {
        return num_item;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getVl_serv() {
        return vl_serv;
    }

    public String getVl_out() {
        return vl_out;
    }

    public List<_D120> get_D120() {
        return _D120;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_item(String num_item) {
        this.num_item = num_item;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    public void setVl_out(String vl_out) {
        this.vl_out = vl_out;
    }

    public void set_D120(List<_D120> _D120) {
        this._D120 = _D120;
    }

}
