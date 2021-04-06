
package com.xsaturncont.layout4ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_dec",
    "cnpj",
    "uf",
    "ie",
    "cod_mun",
    "im",
    "nire"
})
public class _0020 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String ind_dec;
    @FieldDetail(number = 3, required = true)
    private String cnpj;
    @FieldDetail(number = 4, required = true)
    private String uf;
    @FieldDetail(number = 5)
    private String ie;
    @FieldDetail(number = 6)
    private String cod_mun;
    @FieldDetail(number = 7)
    private String im;
    @FieldDetail(number = 8)
    private String nire;

    public String getReg() {
        return reg;
    }

    public String getInd_dec() {
        return ind_dec;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getUf() {
        return uf;
    }

    public String getIe() {
        return ie;
    }

    public String getCod_mun() {
        return cod_mun;
    }

    public String getIm() {
        return im;
    }

    public String getNire() {
        return nire;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_dec(String ind_dec) {
        this.ind_dec = ind_dec;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

}
