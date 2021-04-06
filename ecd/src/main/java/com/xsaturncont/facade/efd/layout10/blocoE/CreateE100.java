package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD.formatDDMMYY;
import static com.xsaturncont.facade.efd.UtilEFD.xE100;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._E100;

public class CreateE100 {

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateE100(Timestamp dataInicial, Timestamp dataFinal) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_E100> get() {
		List<_E100> list = new ArrayList<_E100>();

		String reg = xE100;
		String dt_ini = formatDDMMYY(dataInicial);
		String dt_fin = formatDDMMYY(dataFinal);

		_E100 _E100 = new _E100();

		_E100.setReg(reg);
		_E100.setDt_ini(dt_ini);
		_E100.setDt_fin(dt_fin);

		_E100.set_E110(new CreateE110().get());

		list.add(_E100);

		return list;
	}
}