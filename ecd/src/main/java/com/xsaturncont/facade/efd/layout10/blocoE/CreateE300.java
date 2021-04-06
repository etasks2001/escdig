package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD.UFS;
import static com.xsaturncont.facade.efd.UtilEFD.formatDDMMYY;
import static com.xsaturncont.facade.efd.UtilEFD.xE300;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._E300;

public class CreateE300 {

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateE300(Timestamp dataInicial, Timestamp dataFinal) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_E300> get() {
		List<_E300> list = new ArrayList<_E300>();

		for (String uf : UFS) {
			createE300(list, uf);
		}

		return list;
	}

	private void createE300(List<_E300> list, String uf) {
		_E300 _E300 = new _E300();

		String reg = xE300;
		String dt_ini = formatDDMMYY(dataInicial);
		String dt_fin = formatDDMMYY(dataFinal);

		_E300.setReg(reg);
		_E300.setUf(uf);
		_E300.setDt_ini(dt_ini);
		_E300.setDt_fin(dt_fin);

		_E300.set_E310(new CreateE310().get());

		list.add(_E300);
	}
}