package com.xsaturncont.facade.ecd.layout3.blocoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.xsaturncont.util.Util;

public class CreateI150SaldoInicial {
	public Map<String, Double> getSaldoInicial(Connection connection, String codigoEmpresa) throws SQLException {
		Map<String, Double> saldoInicialMensal = new HashMap<String, Double>();

		PreparedStatement ps = connection.prepareStatement("select pl.conta conta, pl.valorabertura saldoinicial from planoconta pl where pl.codigoempresa = " + codigoEmpresa
				+ " and pl.ano = 14 and pl.tipoconta = \'A\' order by pl.conta");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String conta = rs.getString("conta");
			if (conta.length() == 10) {
				conta = Util.formatarConta(conta);
				String si = rs.getString("saldoinicial");
				Double saldoInicial = Double.valueOf(si);
				saldoInicialMensal.put(conta, saldoInicial);
			}
		}
		ps.close();
		rs.close();
		return saldoInicialMensal;
	}
}