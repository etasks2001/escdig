package com.xsaturncont.facade.ecd.layout4.bloco0;

import java.sql.Connection;
import java.sql.SQLException;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout4ecd._0001;
import com.xsaturncont.layout4ecd._0007;

public class Create0001 {

	private Connection connection;

	private String codigoEmpresa;

	public Create0001(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _0001 get() throws SQLException {
		BuilderBlockList<_0007> builder0007 = new BuilderBlockList<_0007>();
		builder0007.add(new Create0007(this.connection, codigoEmpresa).get());

		_0001 _0001 = new _0001();
		_0001.setReg("0001");
		_0001.setInd_dad("0");
		_0001.set_0007(builder0007.getList());

		return _0001;
	}
}