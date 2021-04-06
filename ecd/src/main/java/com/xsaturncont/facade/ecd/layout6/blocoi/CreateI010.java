package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import com.xsaturncont.facade.SourceEcd;
import com.xsaturncont.layout6ecd._I010;

public class CreateI010 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateI010(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _I010 get() throws SQLException, ParseException, IOException, NoSuchAlgorithmException {
		_I010 _I010 = new _I010();
		_I010.setReg("I010");

		if (this.codigoEmpresa.equals("1") || this.codigoEmpresa.equals("2")) {
			_I010.setInd_esc("G");
		} else {
			_I010.setInd_esc("G");
		}
		_I010.setCod_ver_lc("8.00");
		_I010.set_I012(null);
		// if (this.codigoEmpresa.equals("1") || this.codigoEmpresa.equals("2"))
		// {
		// _I010.set_I012(new CreateI012(this.codigoEmpresa).get());
		// }
		Connection connEcd = null;
		try {
			connEcd = new SourceEcd().getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		_I010.set_I030(new CreateI030(this.connection, codigoEmpresa).get());
		_I010.set_I050(new CreateI050(this.connection, connEcd, codigoEmpresa).get());
		_I010.set_I150(new CreateI150(this.connection, codigoEmpresa).get());
		_I010.set_I200(new CreateI200(this.connection, codigoEmpresa).get());
		_I010.set_I350(new CreateI350(_I010.get_I200()).get());

		connEcd.close();
		return _I010;
	}
}