
package com.xsaturncont.layoutefd11;

import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = {
    "_0000",
    "_9999"
})
public class _Raiz {

    @com.xsaturncont.annotation.FieldDetail(number = 1)
    private _0000 _0000;
    @com.xsaturncont.annotation.FieldDetail(number = 2)
    private _9999 _9999;

    public _0000 get_0000() {
        return _0000;
    }

    public _9999 get_9999() {
        return _9999;
    }

    public void set_0000(_0000 _0000) {
        this._0000 = _0000;
    }

    public void set_9999(_9999 _9999) {
        this._9999 = _9999;
    }

}
