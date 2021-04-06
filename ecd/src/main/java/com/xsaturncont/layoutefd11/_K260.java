
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_op_os",
    "cod_item",
    "dt_sa\u00edda",
    "qtd_sa\u00edda",
    "dt_ret",
    "qtd_ret",
    "_K265"
})
public class _K260 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_op_os;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String dt_sa�da;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String qtd_sa�da;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String dt_ret;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String qtd_ret;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private List<_K265> _K265;

    public String getReg() {
        return reg;
    }

    public String getCod_op_os() {
        return cod_op_os;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getDt_sa�da() {
        return dt_sa�da;
    }

    public String getQtd_sa�da() {
        return qtd_sa�da;
    }

    public String getDt_ret() {
        return dt_ret;
    }

    public String getQtd_ret() {
        return qtd_ret;
    }

    public List<_K265> get_K265() {
        return _K265;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_op_os(String cod_op_os) {
        this.cod_op_os = cod_op_os;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setDt_sa�da(String dt_sa�da) {
        this.dt_sa�da = dt_sa�da;
    }

    public void setQtd_sa�da(String qtd_sa�da) {
        this.qtd_sa�da = qtd_sa�da;
    }

    public void setDt_ret(String dt_ret) {
        this.dt_ret = dt_ret;
    }

    public void setQtd_ret(String qtd_ret) {
        this.qtd_ret = qtd_ret;
    }

    public void set_K265(List<_K265> _K265) {
        this._K265 = _K265;
    }

}
