
package com.xsaturncont.layoutecf;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "pais",
    "ind_home_disp",
    "ind_serv_disp"
})
public class _X410 {

    @FieldDetail(number = 1, required = true)
    private String reg;
    @FieldDetail(number = 2, required = true)
    private String pais;
    @FieldDetail(number = 3, required = true)
    private String ind_home_disp;
    @FieldDetail(number = 4, required = true)
    private String ind_serv_disp;

    public String getReg() {
        return reg;
    }

    public String getPais() {
        return pais;
    }

    public String getInd_home_disp() {
        return ind_home_disp;
    }

    public String getInd_serv_disp() {
        return ind_serv_disp;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setInd_home_disp(String ind_home_disp) {
        this.ind_home_disp = ind_home_disp;
    }

    public void setInd_serv_disp(String ind_serv_disp) {
        this.ind_serv_disp = ind_serv_disp;
    }

}
