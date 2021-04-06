package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.IE_ST;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0015;
import static com.xsaturncont.facade.efd.UtilEFD.UF_ST;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._0015;

public class Create0015 {

	private Connection connection;

	public Create0015(Connection connection) {
		this.connection = connection;
	}

	public List<_0015> get() throws SQLException {
		List<_0015> list = new ArrayList<_0015>();

		CallableStatement cs = connection.prepareCall(SQL_0015);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String uf_st = rs.getString(UF_ST);
			String ie_st = rs.getString(IE_ST);

			_0015 _0015 = new _0015();

			_0015.setReg(reg);
			_0015.setUf_st(uf_st);
			_0015.setIe_st(ie_st);

			list.add(_0015);
		}

		close(cs, rs);
		return list;
	}
}