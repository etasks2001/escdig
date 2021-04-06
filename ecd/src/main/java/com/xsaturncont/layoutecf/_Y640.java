
package com.xsaturncont.layoutecf;

import java.util.List;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "cnpj",
    "cond_decl",
    "vl_cons",
    "cnpj_lid",
    "vl_decl",
    "_Y650"
})
public class _Y640 {

    @com.xsaturncont.annotation.FieldDetail(number = 1, required = true)
    private String reg;
    @com.xsaturncont.annotation.FieldDetail(number = 2, required = true)
    private String cnpj;
    @com.xsaturncont.annotation.FieldDetail(number = 3, required = true)
    private String cond_decl;
    @com.xsaturncont.annotation.FieldDetail(number = 4)
    private String vl_cons;
    @com.xsaturncont.annotation.FieldDetail(number = 5, required = true)
    private String cnpj_lid;
    @com.xsaturncont.annotation.FieldDetail(number = 6, required = true)
    private String vl_decl;
    @com.xsaturncont.annotation.FieldDetail(number = 7)
    private List<_Y650> _Y650;

    public String getReg() {
        return reg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCond_decl() {
        return cond_decl;
    }

    public String getVl_cons() {
        return vl_cons;
    }

    public String getCnpj_lid() {
        return cnpj_lid;
    }

    public String getVl_decl() {
        return vl_decl;
    }

    public List<_Y650> get_Y650() {
        return _Y650;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCond_decl(String cond_decl) {
        this.cond_decl = cond_decl;
    }

    public void setVl_cons(String vl_cons) {
        this.vl_cons = vl_cons;
    }

    public void setCnpj_lid(String cnpj_lid) {
        this.cnpj_lid = cnpj_lid;
    }

    public void setVl_decl(String vl_decl) {
        this.vl_decl = vl_decl;
    }

    public void set_Y650(List<_Y650> _Y650) {
        this._Y650 = _Y650;
    }

}
