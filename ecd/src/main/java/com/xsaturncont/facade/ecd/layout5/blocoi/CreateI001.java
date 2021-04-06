package com.xsaturncont.facade.ecd.layout5.blocoi;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import com.xsaturncont.layout5ecd._I001;

public class CreateI001 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateI001(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _I001 get() throws SQLException, ParseException, IOException, NoSuchAlgorithmException {
		_I001 _I001 = new _I001();
		_I001.setReg("I001");
		_I001.setInd_dad("0");

		_I001.set_I010(new CreateI010(this.connection, codigoEmpresa).get());

		return _I001;
	}
}