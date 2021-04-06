package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.COD_NAT;
import static com.xsaturncont.facade.efd.UtilEFD.DESCR_NAT;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0400_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._0400;

public class Create0400 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public Create0400(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_0400> get() throws SQLException {
		List<_0400> list = new ArrayList<_0400>();

		CallableStatement cs = connection.prepareCall(SQL_0400_ENTRADA);
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String cod_nat = rs.getString(COD_NAT);
			String descr_nat = rs.getString(DESCR_NAT);

			_0400 _0400 = new _0400();

			_0400.setReg(reg);
			_0400.setCod_nat(cod_nat);
			_0400.setDescr_nat(descr_nat);

			list.add(_0400);
		}
		close(cs, rs);
		return list;
	}

}