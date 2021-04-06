package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD._0;
import static com.xsaturncont.facade.efd.UtilEFD.formatDDMMYY;
import static com.xsaturncont.facade.efd.UtilEFD.xE500;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._E500;

public class CreateE500 {

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private Connection connection;

	public CreateE500(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_E500> get() throws SQLException {
		List<_E500> list = new ArrayList<_E500>();

		String reg = xE500;
		String ind_apur = _0;
		String dt_ini = formatDDMMYY(dataInicial);
		String dt_fin = formatDDMMYY(dataFinal);

		_E500 _E500 = new _E500();
		_E500.setReg(reg);
		_E500.setInd_apur(ind_apur);
		_E500.setDt_ini(dt_ini);
		_E500.setDt_fin(dt_fin);

		_E500.set_E510(new CreateE510(connection, dataInicial, dataFinal).get());
		_E500.set_E520(new CreateE520().get());

		list.add(_E500);

		return list;
	}
}