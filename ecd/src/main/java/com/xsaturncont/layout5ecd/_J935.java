
package com.xsaturncont.layout5ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "nome_auditor",
    "cod_cvm_auditor"
})
public class _J935 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String nome_auditor;
    @FieldDetail(number = 3, required = true)
    private String cod_cvm_auditor;

    public String getReg() {
        return reg;
    }

    public String getNome_auditor() {
        return nome_auditor;
    }

    public String getCod_cvm_auditor() {
        return cod_cvm_auditor;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNome_auditor(String nome_auditor) {
        this.nome_auditor = nome_auditor;
    }

    public void setCod_cvm_auditor(String cod_cvm_auditor) {
        this.cod_cvm_auditor = cod_cvm_auditor;
    }

}
