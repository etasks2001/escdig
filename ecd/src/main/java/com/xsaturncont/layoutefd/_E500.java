
package com.xsaturncont.layoutefd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "ind_apur",
    "dt_ini",
    "dt_fin",
    "_E510",
    "_E520"
})
public class _E500 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String ind_apur;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String dt_ini;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String dt_fin;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private List<_E510> _E510;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private _E520 _E520;

    public String getReg() {
        return reg;
    }

    public String getInd_apur() {
        return ind_apur;
    }

    public String getDt_ini() {
        return dt_ini;
    }

    public String getDt_fin() {
        return dt_fin;
    }

    public List<_E510> get_E510() {
        return _E510;
    }

    public _E520 get_E520() {
        return _E520;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setInd_apur(String ind_apur) {
        this.ind_apur = ind_apur;
    }

    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    public void set_E510(List<_E510> _E510) {
        this._E510 = _E510;
    }

    public void set_E520(_E520 _E520) {
        this._E520 = _E520;
    }

}
