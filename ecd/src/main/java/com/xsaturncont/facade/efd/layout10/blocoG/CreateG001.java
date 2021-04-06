package com.xsaturncont.facade.efd.layout10.blocoG;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.xG001;

import com.xsaturncont.layoutefd10._G001;

public class CreateG001 {

	public _G001 get() {
		_G001 _G001 = new _G001();

		_G001.setReg(xG001);
		_G001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		return _G001;
	}
}