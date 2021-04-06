
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_ini_os",
    "dt_fin_os",
    "cod_doc_os",
    "cod_item_ori",
    "qtd_ori",
    "_K215"
})
public class _K210 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String dt_ini_os;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_fin_os;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cod_doc_os;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_item_ori;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String qtd_ori;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private List<_K215> _K215;

    public String getReg() {
        return reg;
    }

    public String getDt_ini_os() {
        return dt_ini_os;
    }

    public String getDt_fin_os() {
        return dt_fin_os;
    }

    public String getCod_doc_os() {
        return cod_doc_os;
    }

    public String getCod_item_ori() {
        return cod_item_ori;
    }

    public String getQtd_ori() {
        return qtd_ori;
    }

    public List<_K215> get_K215() {
        return _K215;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_ini_os(String dt_ini_os) {
        this.dt_ini_os = dt_ini_os;
    }

    public void setDt_fin_os(String dt_fin_os) {
        this.dt_fin_os = dt_fin_os;
    }

    public void setCod_doc_os(String cod_doc_os) {
        this.cod_doc_os = cod_doc_os;
    }

    public void setCod_item_ori(String cod_item_ori) {
        this.cod_item_ori = cod_item_ori;
    }

    public void setQtd_ori(String qtd_ori) {
        this.qtd_ori = qtd_ori;
    }

    public void set_K215(List<_K215> _K215) {
        this._K215 = _K215;
    }

}
