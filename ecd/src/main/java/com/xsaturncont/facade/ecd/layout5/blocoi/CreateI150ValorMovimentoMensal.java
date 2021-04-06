package com.xsaturncont.facade.ecd.layout5.blocoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.xsaturncont.util.Util;

public class CreateI150ValorMovimentoMensal {
	public Map<String, Double[]> getValorMovimentoMensal(Connection connection, String codigoEmpresa) throws SQLException {
		Map<String, Double[]> valorMovimentoMensal = new HashMap<String, Double[]>();
		PreparedStatement ps = connection
				.prepareStatement("select conta,[1],[2],[3],[4],[5],[6],[7],[8],[9],[10],[11],[12] from ( select d.conta, d.mes, case d.natureza when \'C\' then (d.valor * -1) else d.valor end total from diario d where d.codigoempresa = "
						+ codigoEmpresa + " and d.ano = 16) as valormes pivot ( sum(total) for mes in([1],[2],[3],[4],[5],[6],[7],[8],[9],[10],[11],[12])) as valoresmes order by conta");
		ResultSet rs = ps.executeQuery();

		Double[] valorMovimento;
		while (rs.next()) {
			valorMovimento = new Double[] { 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d };
			String conta = Util.formatarConta(rs.getString(1));
			for (int i = 1; i <= 12; i++) {
				String valorMes = rs.getString("" + i);
				if (valorMes != null) {
					Double valor = Double.parseDouble(valorMes);
					valorMovimento[i - 1] = valor;
				}
			}
			valorMovimentoMensal.put(conta, valorMovimento);
		}
		ps.close();
		rs.close();
		return valorMovimentoMensal;
	}
}