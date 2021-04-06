package com.xsaturncont.facade.efd.layout10.blocok;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.xK001;

import com.xsaturncont.layoutefd10._K001;

public class CreateK001 {

	public _K001 get() {
		_K001 _K001 = new _K001();

		_K001.setReg(xK001);
		_K001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		return _K001;
	}
}