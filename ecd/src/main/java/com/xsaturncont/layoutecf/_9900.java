
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "reg_blc",
    "qtd_reg_blc",
    "versao",
    "id_tab_din"
})
public class _9900 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String reg_blc;
    @FieldDetail(number = 3, required = true)
    private String qtd_reg_blc;
    @FieldDetail(number = 4)
    private String versao;
    @FieldDetail(number = 5)
    private String id_tab_din;

    public String getReg() {
        return reg;
    }

    public String getReg_blc() {
        return reg_blc;
    }

    public String getQtd_reg_blc() {
        return qtd_reg_blc;
    }

    public String getVersao() {
        return versao;
    }

    public String getId_tab_din() {
        return id_tab_din;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setReg_blc(String reg_blc) {
        this.reg_blc = reg_blc;
    }

    public void setQtd_reg_blc(String qtd_reg_blc) {
        this.qtd_reg_blc = qtd_reg_blc;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setId_tab_din(String id_tab_din) {
        this.id_tab_din = id_tab_din;
    }

}
