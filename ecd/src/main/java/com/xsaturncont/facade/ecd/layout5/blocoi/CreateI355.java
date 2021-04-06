package com.xsaturncont.facade.ecd.layout5.blocoi;

import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layout5ecd._I250;
import com.xsaturncont.layout5ecd._I355;

public class CreateI355 {

	private List<_I250> listI250;

	public CreateI355(List<_I250> listI250) {
		this.listI250 = listI250;
	}

	public List<_I355> get() {
		List<_I355> list = new ArrayList<_I355>();
		// System.out.println("----------------------------------------------------------------------------");
		for (_I250 _I250 : listI250) {
			String cod_cta = _I250.getCod_cta();
			if (cod_cta.startsWith("3") || cod_cta.startsWith("4")) {
				// System.out.println(cod_cta + ";" + _I250.getVl_dc());

				_I355 _I355 = new _I355();
				_I355.setReg("I355");
				_I355.setCod_cta(cod_cta);
				_I355.setCod_ccus(null);
				_I355.setVl_cta(_I250.getVl_dc());
				_I355.setInd_dc((_I250.getInd_dc().equals("D") ? "C" : "D"));
				list.add(_I355);
			}
		}
		// System.out.println("----------------------------------------------------------------------------");
		return list;
	}
}