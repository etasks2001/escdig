
package com.xsaturncont.layoutefd10;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_veic_oper",
    "cnpj",
    "uf",
    "chassi_veic"
})
public class _C175 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String ind_veic_oper;
    @FieldDetail(number = 3)
    private String cnpj;
    @FieldDetail(number = 4)
    private String uf;
    @FieldDetail(number = 5)
    private String chassi_veic;

    public String getReg() {
        return reg;
    }

    public String getInd_veic_oper() {
        return ind_veic_oper;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getUf() {
        return uf;
    }

    public String getChassi_veic() {
        return chassi_veic;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_veic_oper(String ind_veic_oper) {
        this.ind_veic_oper = ind_veic_oper;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setChassi_veic(String chassi_veic) {
        this.chassi_veic = chassi_veic;
    }

}
