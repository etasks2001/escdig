
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dt_mov",
    "cod_item_ori",
    "cod_item_dest",
    "qtd"
})
public class _K220 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String dt_mov;
    @FieldDetail(number = 3)
    private String cod_item_ori;
    @FieldDetail(number = 4)
    private String cod_item_dest;
    @FieldDetail(number = 5)
    private String qtd;

    public String getReg() {
        return reg;
    }

    public String getDt_mov() {
        return dt_mov;
    }

    public String getCod_item_ori() {
        return cod_item_ori;
    }

    public String getCod_item_dest() {
        return cod_item_dest;
    }

    public String getQtd() {
        return qtd;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDt_mov(String dt_mov) {
        this.dt_mov = dt_mov;
    }

    public void setCod_item_ori(String cod_item_ori) {
        this.cod_item_ori = cod_item_ori;
    }

    public void setCod_item_dest(String cod_item_dest) {
        this.cod_item_dest = cod_item_dest;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

}
