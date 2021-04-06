package com.xsaturncont.facade.ecd.layout6.bloco0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xsaturncont.layout6ecd._0007;

public class Create0007 {

	private Connection connection;

	private String codigoEmpresa;

	public Create0007(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _0007 get() throws SQLException {
		PreparedStatement ps = connection.prepareStatement("select ie from empresa where codigo = " + codigoEmpresa);
		ResultSet rs = ps.executeQuery();
		rs.next();

		_0007 _0007 = new _0007();

		_0007.setReg("0007");
		_0007.setCod_ent_ref("SP");
		_0007.setCod_inscr(rs.getString("ie"));

		ps.close();
		rs.close();
		return _0007;
	}
}