package com.xsaturncont.facade.efd.layout10.blocok;

import static com.xsaturncont.facade.efd.UtilEFD.EMPTY_STRING;
import static com.xsaturncont.facade.efd.UtilEFD.xK990;

import com.xsaturncont.layoutefd10._K990;

public class CreateK990 {

	public _K990 get() {
		_K990 _K990 = new _K990();

		_K990.setReg(xK990);
		_K990.setQtd_lin_k(EMPTY_STRING);

		return _K990;
	}
}