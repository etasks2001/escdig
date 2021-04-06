
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "msg_regra",
    "registro",
    "campo",
    "conte\u00fado",
    "valor_esperado"
})
public class _9100 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 3)
    private String msg_regra;
    @FieldDetail(number = 4, required = true)
    private String registro;
    @FieldDetail(number = 5)
    private String campo;
    @FieldDetail(number = 5)
    private String conteúdo;
    @FieldDetail(number = 6)
    private String valor_esperado;

    public String getReg() {
        return reg;
    }

    public String getMsg_regra() {
        return msg_regra;
    }

    public String getRegistro() {
        return registro;
    }

    public String getCampo() {
        return campo;
    }

    public String getConteúdo() {
        return conteúdo;
    }

    public String getValor_esperado() {
        return valor_esperado;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setMsg_regra(String msg_regra) {
        this.msg_regra = msg_regra;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public void setConteúdo(String conteúdo) {
        this.conteúdo = conteúdo;
    }

    public void setValor_esperado(String valor_esperado) {
        this.valor_esperado = valor_esperado;
    }

}
