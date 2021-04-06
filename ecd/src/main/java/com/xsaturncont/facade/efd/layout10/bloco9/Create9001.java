package com.xsaturncont.facade.efd.layout10.bloco9;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.x9001;

import com.xsaturncont.layoutefd10._9001;

public class Create9001 {

	public _9001 get() {
		_9001 _9001 = new _9001();

		_9001.setReg(x9001);
		_9001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		return _9001;
	}
}