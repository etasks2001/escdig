package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD.formatDDMMYY;
import static com.xsaturncont.facade.efd.UtilEFD.xE200;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._E200;

public class CreateE200 {

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private String uf;

	public CreateE200(Timestamp dataInicial, Timestamp dataFinal, String uf) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.uf = uf;
	}

	public List<_E200> get() {
		List<_E200> list = new ArrayList<_E200>();

		String reg = xE200;
		String uf = this.uf;
		String dt_ini = formatDDMMYY(dataInicial);
		String dt_fin = formatDDMMYY(dataFinal);

		_E200 _E200 = new _E200();

		_E200.setReg(reg);
		_E200.setUf(uf);
		_E200.setDt_ini(dt_ini);
		_E200.setDt_fin(dt_fin);

		_E200.set_E210(new CreateE210().get());

		list.add(_E200);

		return list;
	}
}