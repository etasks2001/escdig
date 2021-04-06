package com.xsaturncont.facade.efd.layout10.blocoH;

import static com.xsaturncont.facade.efd.UtilEFD.DT_INV;
import static com.xsaturncont.facade.efd.UtilEFD.MOT_INV;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_EFD_H005;
import static com.xsaturncont.facade.efd.UtilEFD.VL_INV;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._H005;

public class CreateH005 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateH005(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_H005> get() throws SQLException {
		List<_H005> list = new ArrayList<_H005>();

		CallableStatement cs = connection.prepareCall(SQL_EFD_H005);
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);

		ResultSet rs = cs.executeQuery();

		while (rs.next()) {

			String reg = rs.getString(REG);
			String dt_inv = rs.getString(DT_INV);
			String vl_inv = rs.getString(VL_INV).replace('.', ',');
			String mot_inv = rs.getString(MOT_INV);

			_H005 _H005 = new _H005();

			_H005.setReg(reg);
			_H005.setDt_inv(dt_inv);
			_H005.setVl_inv(vl_inv);
			_H005.setMot_inv(mot_inv);

			_H005.set_H010(new CreateH010(connection, dataInicial, dataFinal).get());

			list.add(_H005);
		}

		close(cs, rs);
		return list;
	}
}