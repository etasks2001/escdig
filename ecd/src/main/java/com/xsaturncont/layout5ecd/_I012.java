
package com.xsaturncont.layout5ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "num_ord",
    "nat_livr",
    "tipo",
    "cod_hash_aux",
    "_I015"
})
public class _I012 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String num_ord;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String nat_livr;
    @com.xsaturncont.annotation.FieldDetail(number = 4, required = true)
    private String tipo;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cod_hash_aux;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_I015> _I015;

    public String getReg() {
        return reg;
    }

    public String getNum_ord() {
        return num_ord;
    }

    public String getNat_livr() {
        return nat_livr;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCod_hash_aux() {
        return cod_hash_aux;
    }

    public List<_I015> get_I015() {
        return _I015;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setNum_ord(String num_ord) {
        this.num_ord = num_ord;
    }

    public void setNat_livr(String nat_livr) {
        this.nat_livr = nat_livr;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCod_hash_aux(String cod_hash_aux) {
        this.cod_hash_aux = cod_hash_aux;
    }

    public void set_I015(List<_I015> _I015) {
        this._I015 = _I015;
    }

}
