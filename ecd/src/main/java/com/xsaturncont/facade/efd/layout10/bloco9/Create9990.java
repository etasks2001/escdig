package com.xsaturncont.facade.efd.layout10.bloco9;

import static com.xsaturncont.facade.efd.UtilEFD.x9990;

import com.xsaturncont.layoutefd10._9990;

public class Create9990 {

	private int qtd_lin_9;

	public Create9990(int qtd_lin_9) {
		this.qtd_lin_9 = qtd_lin_9;
	}

	public _9990 get() {
		_9990 _9990 = new _9990();

		_9990.setReg(x9990);
		_9990.setQtd_lin_9(Integer.toString(qtd_lin_9));

		return _9990;
	}
}