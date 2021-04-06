
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_lacre",
    "dt_aplicacao"
})
public class _1360 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String num_lacre;
    @FieldDetail(number = 3)
    private String dt_aplicacao;

    public String getReg() {
        return reg;
    }

    public String getNum_lacre() {
        return num_lacre;
    }

    public String getDt_aplicacao() {
        return dt_aplicacao;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_lacre(String num_lacre) {
        this.num_lacre = num_lacre;
    }

    public void setDt_aplicacao(String dt_aplicacao) {
        this.dt_aplicacao = dt_aplicacao;
    }

}
