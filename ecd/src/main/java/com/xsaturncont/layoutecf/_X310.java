
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "nome",
    "pais",
    "vl_oper",
    "cond_pes"
})
public class _X310 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String nome;
    @FieldDetail(number = 3, required = true)
    private String pais;
    @FieldDetail(number = 4, required = true)
    private String vl_oper;
    @FieldDetail(number = 5, required = true)
    private String cond_pes;

    public String getReg() {
        return reg;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getVl_oper() {
        return vl_oper;
    }

    public String getCond_pes() {
        return cond_pes;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setVl_oper(String vl_oper) {
        this.vl_oper = vl_oper;
    }

    public void setCond_pes(String cond_pes) {
        this.cond_pes = cond_pes;
    }

}
