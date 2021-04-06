package com.xsaturncont.facade.efd.layout10.bloco1;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_COM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.x1001;

import com.xsaturncont.layoutefd10._1001;

public class Create1001 {

	public _1001 get() {
		_1001 _1001 = new _1001();

		_1001.setReg(x1001);
		_1001.setInd_mov(BLOCO_COM_DADOS_INFORMADOS);
		_1001.set_1010(new Create1010().get());

		return _1001;
	}
}