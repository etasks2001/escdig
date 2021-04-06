
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cod_tot_par",
    "vlr_acum_tot",
    "nr_tot",
    "descr_nr_tot",
    "_C425"
})
public class _C420 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String cod_tot_par;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String vlr_acum_tot;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String nr_tot;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String descr_nr_tot;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private List<_C425> _C425;

    public String getReg() {
        return reg;
    }

    public String getCod_tot_par() {
        return cod_tot_par;
    }

    public String getVlr_acum_tot() {
        return vlr_acum_tot;
    }

    public String getNr_tot() {
        return nr_tot;
    }

    public String getDescr_nr_tot() {
        return descr_nr_tot;
    }

    public List<_C425> get_C425() {
        return _C425;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCod_tot_par(String cod_tot_par) {
        this.cod_tot_par = cod_tot_par;
    }

    public void setVlr_acum_tot(String vlr_acum_tot) {
        this.vlr_acum_tot = vlr_acum_tot;
    }

    public void setNr_tot(String nr_tot) {
        this.nr_tot = nr_tot;
    }

    public void setDescr_nr_tot(String descr_nr_tot) {
        this.descr_nr_tot = descr_nr_tot;
    }

    public void set_C425(List<_C425> _C425) {
        this._C425 = _C425;
    }

}
