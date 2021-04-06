
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "lote_med",
    "qtd_item",
    "dt_fab",
    "dt_val",
    "ind_med",
    "tp_prod",
    "vl_tab_max"
})
public class _C173 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String lote_med;
    @FieldDetail(number = 3)
    private String qtd_item;
    @FieldDetail(number = 4)
    private String dt_fab;
    @FieldDetail(number = 5)
    private String dt_val;
    @FieldDetail(number = 6)
    private String ind_med;
    @FieldDetail(number = 7)
    private String tp_prod;
    @FieldDetail(number = 8)
    private String vl_tab_max;

    public String getReg() {
        return reg;
    }

    public String getLote_med() {
        return lote_med;
    }

    public String getQtd_item() {
        return qtd_item;
    }

    public String getDt_fab() {
        return dt_fab;
    }

    public String getDt_val() {
        return dt_val;
    }

    public String getInd_med() {
        return ind_med;
    }

    public String getTp_prod() {
        return tp_prod;
    }

    public String getVl_tab_max() {
        return vl_tab_max;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setLote_med(String lote_med) {
        this.lote_med = lote_med;
    }

    public void setQtd_item(String qtd_item) {
        this.qtd_item = qtd_item;
    }

    public void setDt_fab(String dt_fab) {
        this.dt_fab = dt_fab;
    }

    public void setDt_val(String dt_val) {
        this.dt_val = dt_val;
    }

    public void setInd_med(String ind_med) {
        this.ind_med = ind_med;
    }

    public void setTp_prod(String tp_prod) {
        this.tp_prod = tp_prod;
    }

    public void setVl_tab_max(String vl_tab_max) {
        this.vl_tab_max = vl_tab_max;
    }

}
