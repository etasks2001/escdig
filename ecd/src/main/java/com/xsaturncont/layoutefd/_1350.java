
package com.xsaturncont.layoutefd;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "serie",
    "fabricante",
    "modelo",
    "tipo_medicao",
    "_1360",
    "_1370"
})
public class _1350 {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private String serie;
    @com.xsaturncont.annotation.FieldDetail(number = 3)
    private String fabricante;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String modelo;
    @com.xsaturncont.annotation.FieldDetail(number = 5)
    private String tipo_medicao;
    @com.xsaturncont.annotation.FieldDetail(number = 6)
    private java.util.List<_1360> _1360;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private java.util.List<_1370> _1370;

    public String getReg() {
        return reg;
    }

    public String getSerie() {
        return serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo_medicao() {
        return tipo_medicao;
    }

    public java.util.List<_1360> get_1360() {
        return _1360;
    }

    public java.util.List<_1370> get_1370() {
        return _1370;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo_medicao(String tipo_medicao) {
        this.tipo_medicao = tipo_medicao;
    }

    public void set_1360(java.util.List<_1360> _1360) {
        this._1360 = _1360;
    }

    public void set_1370(java.util.List<_1370> _1370) {
        this._1370 = _1370;
    }

}
