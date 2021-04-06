package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.xsaturncont.layout6ecd._I155;
import com.xsaturncont.util.Util;

public class CreateI155 {

	private Connection connection;

	private String codigoEmpresa;

	private String mes;

	private Map<String, Double[]> saldosIniciais;

	public CreateI155(Connection connection, String codigoEmpresa, String mes, Map<String, Double[]> saldosIniciais) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
		this.mes = mes;
		this.saldosIniciais = saldosIniciais;
	}

	public List<_I155> get() throws SQLException {
		List<_I155> list = new ArrayList<_I155>();

		PreparedStatement ps = connection.prepareStatement(
				"select d.conta, sum(case d.natureza when 'D' then d.valor else 0 end) D, sum(case d.natureza when 'C' then d.valor else 0 end) C from diario d where d.codigoempresa = "
						+ this.codigoEmpresa + " and d.ano = 19 and d.mes = " + mes
						+ " group by d.conta order by conta");

		ResultSet rs = ps.executeQuery();

		List<String> contasComMovimento = new ArrayList<String>();

		while (rs.next()) {
			String conta = Util.formatarConta(rs.getString("conta"));
			contasComMovimento.add(conta);

			Double[] si = this.saldosIniciais.get(conta);

			/*---------------------------------------------------------------------*/
			/* Saldo Inicial */
			CreateI155IndicadorValor indicadorValor = new CreateI155IndicadorValor(si[Integer.parseInt(mes) - 1]);
			String vl_sld_ini = indicadorValor.getValor();
			String ind_dc_ini = indicadorValor.getIndicador();
			/*---------------------------------------------------------------------*/
			/* Saldo Final */
			// double saldoFinal = si[Integer.parseInt(mes)];
			indicadorValor = new CreateI155IndicadorValor(si[Integer.parseInt(mes)]);
			String vl_sld_fin = indicadorValor.getValor();
			String ind_dc_fin = indicadorValor.getIndicador();

			_I155 _I155 = new _I155();
			_I155.setReg("I155");
			_I155.setCod_cta(conta);
			_I155.setCod_ccus(null);
			_I155.setVl_sld_ini(vl_sld_ini.replace('.', ','));
			_I155.setInd_dc_ini(ind_dc_ini);
			_I155.setVl_deb(rs.getString("D").replace('.', ','));
			_I155.setVl_cred(rs.getString("C").replace('.', ','));
			_I155.setVl_sld_fin(vl_sld_fin.replace('.', ','));
			_I155.setInd_dc_fin(ind_dc_fin);

			list.add(_I155);
		}
		ps.close();
		rs.close();
		/* incluir contas sem movimento */

		for (Entry<String, Double[]> entry : this.saldosIniciais.entrySet()) {
			Double[] si = entry.getValue();
			String conta = entry.getKey();
			// if (conta.equals("2.1.01.01.0027")) {
			// System.out.println("fds");
			// }
			int index = Collections.binarySearch(contasComMovimento, conta);
			if (index < 0) {
				Double saldoInicial = si[Integer.parseInt(mes) - 1];
				Double saldoFinal = si[Integer.parseInt(mes)];
				if (saldoInicial != 0.0 || saldoFinal != 0.0) {

					/*---------------------------------------------------------------------*/
					/* Saldo Inicial */
					CreateI155IndicadorValor indicadorValor = new CreateI155IndicadorValor(saldoInicial);
					String vl_sld_ini = indicadorValor.getValor();
					String ind_dc_ini = indicadorValor.getIndicador();
					/*---------------------------------------------------------------------*/
					/* Saldo Final */
					// double saldoFinal = si[Integer.parseInt(mes)];
					indicadorValor = new CreateI155IndicadorValor(saldoFinal);
					String vl_sld_fin = indicadorValor.getValor();
					String ind_dc_fin = indicadorValor.getIndicador();
					// System.out.println(conta + " - Saldo Inicial: " +
					// vl_sld_ini + " - " + ind_dc_ini);
					// System.out.println(conta + " - Saldo Final: " +
					// vl_sld_fin + " - " + ind_dc_fin);

					/*---------------------------------------------------------------------*/

					_I155 _I155 = new _I155();
					_I155.setReg("I155");
					_I155.setCod_cta(conta);
					_I155.setCod_ccus(null);
					_I155.setVl_sld_ini(vl_sld_ini.replace('.', ','));
					_I155.setInd_dc_ini(ind_dc_ini);
					_I155.setVl_deb("0");
					_I155.setVl_cred("0");
					_I155.setVl_sld_fin(vl_sld_fin.replace('.', ','));
					_I155.setInd_dc_fin(ind_dc_fin);

					list.add(_I155);
				}
			}
		}
		return list;
	}
}