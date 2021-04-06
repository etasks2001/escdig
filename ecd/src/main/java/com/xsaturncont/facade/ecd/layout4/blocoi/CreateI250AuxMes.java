package com.xsaturncont.facade.ecd.layout4.blocoi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateI250AuxMes {
	public Map<Integer, List<I250Aux>> getI250Aux(ResultSet rs) throws SQLException {
		Map<Integer, List<I250Aux>> map = new HashMap<Integer, List<I250Aux>>();
		List<I250Aux> list = null;
		while (rs.next()) {
			String conta = rs.getString("conta");
			Integer dia = Integer.parseInt(rs.getString("dia"));
			String lote = rs.getString("lote");
			String documento = rs.getString("documento");
			String valor = rs.getString("valor");
			String natureza = rs.getString("natureza");
			String historico = rs.getString("historico");

			boolean contemDia = map.containsKey(dia);
			if (contemDia) {
				list = map.get(dia);
			} else {
				list = new ArrayList<I250Aux>();
				map.put(dia, list);
			}
			list.add(new I250Aux(conta, "" + dia, lote, documento, valor, natureza, historico));
		}
		return map;
	}
}