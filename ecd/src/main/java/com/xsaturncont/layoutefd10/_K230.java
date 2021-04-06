
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini_op",
    "dt_fin_op",
    "cod_doc_op",
    "cod_item",
    "qtd_enc",
    "_K235"
})
public class _K230 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_ini_op;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fin_op;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_doc_op;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String qtd_enc;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private List<_K235> _K235;

    public String getReg() {
        return reg;
    }

    public String getDt_ini_op() {
        return dt_ini_op;
    }

    public String getDt_fin_op() {
        return dt_fin_op;
    }

    public String getCod_doc_op() {
        return cod_doc_op;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd_enc() {
        return qtd_enc;
    }

    public List<_K235> get_K235() {
        return _K235;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_ini_op(String dt_ini_op) {
        this.dt_ini_op = dt_ini_op;
    }

    public void setDt_fin_op(String dt_fin_op) {
        this.dt_fin_op = dt_fin_op;
    }

    public void setCod_doc_op(String cod_doc_op) {
        this.cod_doc_op = cod_doc_op;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd_enc(String qtd_enc) {
        this.qtd_enc = qtd_enc;
    }

    public void set_K235(List<_K235> _K235) {
        this._K235 = _K235;
    }

}
