package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD.CFOP;
import static com.xsaturncont.facade.efd.UtilEFD.CST_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_E510_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_E510_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.VL_CONT_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.VL_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._E510;

public class CreateE510 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateE510(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_E510> get() throws SQLException {
		List<_E510> list = new ArrayList<_E510>();

		CallableStatement csEntrada = connection.prepareCall(SQL_E510_ENTRADA);
		csEntrada.setTimestamp(1, dataInicial);
		csEntrada.setTimestamp(2, dataFinal);
		ResultSet rsEntrada = csEntrada.executeQuery();
		createE510(list, rsEntrada);

		close(csEntrada, rsEntrada);

		CallableStatement csSaida = connection.prepareCall(SQL_E510_SAIDA);
		csSaida.setTimestamp(1, dataInicial);
		csSaida.setTimestamp(2, dataFinal);
		ResultSet rsSaida = csSaida.executeQuery();
		createE510(list, rsSaida);

		close(csSaida, rsSaida);
		return list;
	}

	private void createE510(List<_E510> list, ResultSet rs) throws SQLException {
		while (rs.next()) {
			String reg = rs.getString(REG);
			String cfop = rs.getString(CFOP);
			String cst_ipi = rs.getString(CST_IPI);
			String vl_cont_ipi = rs.getString(VL_CONT_IPI).replace('.', ',');
			String vl_bc_ipi = rs.getString(VL_BC_IPI).replace('.', ',');
			String vl_ipi = rs.getString(VL_IPI).replace('.', ',');

			_E510 _E510 = new _E510();

			_E510.setReg(reg);
			_E510.setCfop(cfop);
			_E510.setCst_ipi(cst_ipi);
			_E510.setVl_cont_ipi(vl_cont_ipi);
			_E510.setVl_bc_ipi(vl_bc_ipi);
			_E510.setVl_ipi(vl_ipi);

			list.add(_E510);
		}
	}
}