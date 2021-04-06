
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_item_comp",
    "qtd_comp",
    "perda"
})
public class _0210 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String cod_item_comp;
    @FieldDetail(number = 3)
    private String qtd_comp;
    @FieldDetail(number = 4)
    private String perda;

    public String getReg() {
        return reg;
    }

    public String getCod_item_comp() {
        return cod_item_comp;
    }

    public String getQtd_comp() {
        return qtd_comp;
    }

    public String getPerda() {
        return perda;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_item_comp(String cod_item_comp) {
        this.cod_item_comp = cod_item_comp;
    }

    public void setQtd_comp(String qtd_comp) {
        this.qtd_comp = qtd_comp;
    }

    public void setPerda(String perda) {
        this.perda = perda;
    }

}
