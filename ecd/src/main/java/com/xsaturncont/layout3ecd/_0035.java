
package com.xsaturncont.layout3ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_scp",
    "nome_scp"
})
public class _0035 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cod_scp;
    @FieldDetail(number = 3)
    private String nome_scp;

    public String getReg() {
        return reg;
    }

    public String getCod_scp() {
        return cod_scp;
    }

    public String getNome_scp() {
        return nome_scp;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_scp(String cod_scp) {
        this.cod_scp = cod_scp;
    }

    public void setNome_scp(String nome_scp) {
        this.nome_scp = nome_scp;
    }

}
