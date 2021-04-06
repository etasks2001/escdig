
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "reg",
    "unid_conv",
    "fat_conv"
})
public class _0220 {

    @FieldDetail(number = 1)
    private String reg;
    @FieldDetail(number = 2)
    private String unid_conv;
    @FieldDetail(number = 3)
    private String fat_conv;

    public String getReg() {
        return reg;
    }

    public String getUnid_conv() {
        return unid_conv;
    }

    public String getFat_conv() {
        return fat_conv;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setUnid_conv(String unid_conv) {
        this.unid_conv = unid_conv;
    }

    public void setFat_conv(String fat_conv) {
        this.fat_conv = fat_conv;
    }

}
