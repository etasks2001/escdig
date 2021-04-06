package com.xsaturncont.facade.ecd.layout4.blocoj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.xsaturncont.layout4ecd._J001;

public class CreateJ001 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateJ001(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _J001 get() throws SQLException, IOException {
		_J001 _J001 = new _J001();
		_J001.setReg("J001");
		_J001.setInd_dad("0");
		_J001.set_J005(new CreateJ005(this.codigoEmpresa).get());
		_J001.set_J900(new CreateJ900(this.connection, codigoEmpresa).get());
		return _J001;
	}
}