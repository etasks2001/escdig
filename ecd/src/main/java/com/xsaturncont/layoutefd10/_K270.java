
package com.xsaturncont.layoutefd10;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini_ap",
    "dt_fin_ap",
    "cod_op_os",
    "cod_item",
    "qtd_cor_pos",
    "qtd_cor_neg",
    "origem",
    "_K275"
})
public class _K270 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_ini_ap;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fin_ap;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_op_os;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_item;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String qtd_cor_pos;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String qtd_cor_neg;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private String origem;
    @com.xsaturncont.annotation.FieldDetail(number = 9)
    private List<_K275> _K275;

    public String getReg() {
        return reg;
    }

    public String getDt_ini_ap() {
        return dt_ini_ap;
    }

    public String getDt_fin_ap() {
        return dt_fin_ap;
    }

    public String getCod_op_os() {
        return cod_op_os;
    }

    public String getCod_item() {
        return cod_item;
    }

    public String getQtd_cor_pos() {
        return qtd_cor_pos;
    }

    public String getQtd_cor_neg() {
        return qtd_cor_neg;
    }

    public String getOrigem() {
        return origem;
    }

    public List<_K275> get_K275() {
        return _K275;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_ini_ap(String dt_ini_ap) {
        this.dt_ini_ap = dt_ini_ap;
    }

    public void setDt_fin_ap(String dt_fin_ap) {
        this.dt_fin_ap = dt_fin_ap;
    }

    public void setCod_op_os(String cod_op_os) {
        this.cod_op_os = cod_op_os;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public void setQtd_cor_pos(String qtd_cor_pos) {
        this.qtd_cor_pos = qtd_cor_pos;
    }

    public void setQtd_cor_neg(String qtd_cor_neg) {
        this.qtd_cor_neg = qtd_cor_neg;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void set_K275(List<_K275> _K275) {
        this._K275 = _K275;
    }

}
