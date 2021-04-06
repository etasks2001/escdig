
package com.xsaturncont.layoutefd11;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_aj_apur",
    "sld_cred",
    "cred_apr",
    "cred_receb",
    "cred_util",
    "sld_cred_fim",
    "_1210"
})
public class _1200 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_aj_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String sld_cred;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String cred_apr;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String cred_receb;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private String cred_util;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private String sld_cred_fim;
    @com.xsaturncont.annotation.FieldDetail(number = 8)
    private List<_1210> _1210;

    public String getReg() {
        return reg;
    }

    public String getCod_aj_apur() {
        return cod_aj_apur;
    }

    public String getSld_cred() {
        return sld_cred;
    }

    public String getCred_apr() {
        return cred_apr;
    }

    public String getCred_receb() {
        return cred_receb;
    }

    public String getCred_util() {
        return cred_util;
    }

    public String getSld_cred_fim() {
        return sld_cred_fim;
    }

    public List<_1210> get_1210() {
        return _1210;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_aj_apur(String cod_aj_apur) {
        this.cod_aj_apur = cod_aj_apur;
    }

    public void setSld_cred(String sld_cred) {
        this.sld_cred = sld_cred;
    }

    public void setCred_apr(String cred_apr) {
        this.cred_apr = cred_apr;
    }

    public void setCred_receb(String cred_receb) {
        this.cred_receb = cred_receb;
    }

    public void setCred_util(String cred_util) {
        this.cred_util = cred_util;
    }

    public void setSld_cred_fim(String sld_cred_fim) {
        this.sld_cred_fim = sld_cred_fim;
    }

    public void set_1210(List<_1210> _1210) {
        this._1210 = _1210;
    }

}
