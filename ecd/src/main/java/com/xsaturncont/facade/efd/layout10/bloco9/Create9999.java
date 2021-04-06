package com.xsaturncont.facade.efd.layout10.bloco9;

import static com.xsaturncont.facade.efd.UtilEFD.x9999;

import java.util.List;

import com.xsaturncont.layoutefd10._9900;
import com.xsaturncont.layoutefd10._9999;

public class Create9999 {

	private List<_9900> list9900;

	public Create9999(List<_9900> list9900) {
		this.list9900 = list9900;
	}

	public _9999 get() {
		int qtd_lin = getQtd_lin(list9900);

		_9999 _9999 = new _9999();

		_9999.setReg(x9999);
		_9999.setQtd_lin(Integer.toString(qtd_lin));

		return _9999;
	}

	private int getQtd_lin(List<_9900> list) {
		int qtd_lin = 0;
		for (_9900 _9900 : list) {
			qtd_lin += Integer.parseInt(_9900.getQtd_reg_blc());
		}
		return qtd_lin;
	}
}