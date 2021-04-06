
package com.xsaturncont.layout6ecd;

import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;

@RecordDetail(fieldSeparator = "|", fieldsOrder = { "reg", "cod_ccus", "cod_cta_ref" })
public class _I051 {

	@FieldDetail(number = 1, required = true)
	private String reg;
	@FieldDetail(number = 2)
	private String cod_ccus;
	@FieldDetail(number = 3, required = true)
	private String cod_cta_ref;

	public String getReg() {
		return reg;
	}

	public String getCod_ccus() {
		return cod_ccus;
	}

	public String getCod_cta_ref() {
		return cod_cta_ref;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public void setCod_ccus(String cod_ccus) {
		this.cod_ccus = cod_ccus;
	}

	public void setCod_cta_ref(String cod_cta_ref) {
		this.cod_cta_ref = cod_cta_ref;
	}

}
