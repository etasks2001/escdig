package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.DESCR;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0190_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0190_INVENTARIO;
import static com.xsaturncont.facade.efd.UtilEFD.UNID;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xsaturncont.layoutefd10._0190;

public class Create0190 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private boolean comInventario;

	public Create0190(Connection connection, Timestamp dataInicial, Timestamp dataFinal, boolean comInventario) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.comInventario = comInventario;
	}

	public List<_0190> get() throws SQLException {
		Map<String, _0190> map = new HashMap<String, _0190>();

		if (comInventario) {
			getUnidades(map, SQL_0190_INVENTARIO);
		}
		getUnidades(map, SQL_0190_ENTRADA);

		List<_0190> list = new ArrayList<_0190>(map.values());

		return list;
	}

	private void getUnidades(Map<String, _0190> map, String sql) throws SQLException {
		CallableStatement cs = connection.prepareCall(sql);

		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);

		ResultSet rs = cs.executeQuery();

		create0190(map, rs);
		close(cs, rs);
	}

	private void create0190(Map<String, _0190> map, ResultSet rs) throws SQLException {
		while (rs.next()) {
			String reg = rs.getString(REG);
			String unid = rs.getString(UNID);
			String descr = rs.getString(DESCR);

			boolean containsKey = map.containsKey(unid);

			if (!containsKey) {
				_0190 _0190 = new _0190();

				_0190.setReg(reg);
				_0190.setUnid(unid);
				_0190.setDescr(descr);

				map.put(unid, _0190);
			}
		}
	}
}