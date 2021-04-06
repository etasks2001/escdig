
package com.xsaturncont.layout5ecd;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "evento",
    "dt_evento",
    "_K115"
})
public class _K110 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String evento;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String dt_evento;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private List<_K115> _K115;

    public String getReg() {
        return reg;
    }

    public String getEvento() {
        return evento;
    }

    public String getDt_evento() {
        return dt_evento;
    }

    public List<_K115> get_K115() {
        return _K115;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void setDt_evento(String dt_evento) {
        this.dt_evento = dt_evento;
    }

    public void set_K115(List<_K115> _K115) {
        this._K115 = _K115;
    }

}
