
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cpf",
    "nome",
    "qualif",
    "vl_rem_trab",
    "vl_dem_rend",
    "vl_ir_ret"
})
public class _Y612 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String cpf;
    @FieldDetail(number = 3, required = true)
    private String nome;
    @FieldDetail(number = 4, required = true)
    private String qualif;
    @FieldDetail(number = 5)
    private String vl_rem_trab;
    @FieldDetail(number = 6)
    private String vl_dem_rend;
    @FieldDetail(number = 7)
    private String vl_ir_ret;

    public String getReg() {
        return reg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getQualif() {
        return qualif;
    }

    public String getVl_rem_trab() {
        return vl_rem_trab;
    }

    public String getVl_dem_rend() {
        return vl_dem_rend;
    }

    public String getVl_ir_ret() {
        return vl_ir_ret;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQualif(String qualif) {
        this.qualif = qualif;
    }

    public void setVl_rem_trab(String vl_rem_trab) {
        this.vl_rem_trab = vl_rem_trab;
    }

    public void setVl_dem_rend(String vl_dem_rend) {
        this.vl_dem_rend = vl_dem_rend;
    }

    public void setVl_ir_ret(String vl_ir_ret) {
        this.vl_ir_ret = vl_ir_ret;
    }

}
