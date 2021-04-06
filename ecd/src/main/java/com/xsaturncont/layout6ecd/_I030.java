
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "dnrc_abert",
    "num_ord",
    "nat_livr",
    "qtd_lin",
    "nome",
    "nire",
    "cnpj",
    "dt_arq",
    "dt_arq_conv",
    "desc_mun",
    "dt_ex_social"
})
public class _I030 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String dnrc_abert;
    @FieldDetail(number = 3, required = true)
    private String num_ord;
    @FieldDetail(number = 4, required = true)
    private String nat_livr;
    @FieldDetail(number = 5, required = true)
    private String qtd_lin;
    @FieldDetail(number = 6, required = true)
    private String nome;
    @FieldDetail(number = 7)
    private String nire;
    @FieldDetail(number = 8, required = true)
    private String cnpj;
    @FieldDetail(number = 9)
    private String dt_arq;
    @FieldDetail(number = 10)
    private String dt_arq_conv;
    @FieldDetail(number = 11)
    private String desc_mun;
    @FieldDetail(number = 12, required = true)
    private String dt_ex_social;

    public String getReg() {
        return reg;
    }

    public String getDnrc_abert() {
        return dnrc_abert;
    }

    public String getNum_ord() {
        return num_ord;
    }

    public String getNat_livr() {
        return nat_livr;
    }

    public String getQtd_lin() {
        return qtd_lin;
    }

    public String getNome() {
        return nome;
    }

    public String getNire() {
        return nire;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getDt_arq() {
        return dt_arq;
    }

    public String getDt_arq_conv() {
        return dt_arq_conv;
    }

    public String getDesc_mun() {
        return desc_mun;
    }

    public String getDt_ex_social() {
        return dt_ex_social;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setDnrc_abert(String dnrc_abert) {
        this.dnrc_abert = dnrc_abert;
    }

    public void setNum_ord(String num_ord) {
        this.num_ord = num_ord;
    }

    public void setNat_livr(String nat_livr) {
        this.nat_livr = nat_livr;
    }

    public void setQtd_lin(String qtd_lin) {
        this.qtd_lin = qtd_lin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDt_arq(String dt_arq) {
        this.dt_arq = dt_arq;
    }

    public void setDt_arq_conv(String dt_arq_conv) {
        this.dt_arq_conv = dt_arq_conv;
    }

    public void setDesc_mun(String desc_mun) {
        this.desc_mun = desc_mun;
    }

    public void setDt_ex_social(String dt_ex_social) {
        this.dt_ex_social = dt_ex_social;
    }

}
