package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout6ecd._I050;
import com.xsaturncont.layout6ecd._I051;
import com.xsaturncont.layout6ecd._I052;
import com.xsaturncont.util.Util;

public class CreateI050 {

	private Connection connection;

	private String codigoEmpresa;

	private Connection connEcd;

	public CreateI050(Connection connection, Connection connEcd, String codigoEmpresa) {
		this.connection = connection;
		this.connEcd = connEcd;
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_I050> get() throws SQLException, IOException {

		BuilderBlockList<_I050> builderI050 = new BuilderBlockList<_I050>();

		PreparedStatement ps = connection
				.prepareStatement("select conta, tipoconta,descricao from planoconta where codigoempresa = "
						+ this.codigoEmpresa + " and ano = 19 order by conta");

		ResultSet rs = ps.executeQuery();

		PreparedStatement psEcd = connEcd.prepareStatement(
				"select * from I050 where codigoempresa = " + this.codigoEmpresa + " and ano = 19 order by cod_cta");
		ResultSet rsEcd = psEcd.executeQuery();
		Map<String, I050Ecd> mapI050Ecd = new HashMap<String, I050Ecd>();
		while (rsEcd.next()) {

			int sk = rsEcd.getInt("sk");
			int ano = rsEcd.getInt("ano");
			int codigoempresa = rsEcd.getInt("codigoempresa");
			String cod_cta = rsEcd.getString("cod_cta");
			String cod_cta_sup = rsEcd.getString("cod_cta_sup");
			String cod_nat = rsEcd.getString("cod_nat");
			String nivel = rsEcd.getString("nivel");
			String cod_cta_ref = rsEcd.getString("cod_cta_ref");
			String cod_agl = rsEcd.getString("cod_agl");

			mapI050Ecd.put(cod_cta,
					new I050Ecd(sk, ano, codigoempresa, cod_cta, cod_cta_sup, cod_nat, nivel, cod_cta_ref, cod_agl));

		}
		rsEcd.close();
		psEcd.close();

//		FileInputStream fis = new FileInputStream(Util.getPlanilha(this.codigoEmpresa));
//		HSSFWorkbook workbook = new HSSFWorkbook(fis);
//		HSSFSheet planilha = Util.getPlanilha("pc", workbook);
//		CreateI051 createI051 = new CreateI051(planilha);
//		CreateI052 createI052 = new CreateI052(planilha);

		while (rs.next()) {
			// cta = Util.normalizeString(cta.replace("DIVERSOS", "").replace("DIVERSAS",
			// ""));
			// System.out.println(cod_cta);
//			if (this.codigoEmpresa.equals("3")) {
//				if (cod_cta_sup.equals("1.2.03.01.0000")) {
//					cod_cta_sup = "1.2.03.00.0000";
//				}
//			}
			// _I050.setCod_nat(CreateI050Util.getCod_nat(cod_cta));
			// _I050.setNivel(CreateI050Util.getNivel(cod_cta));
			// _I050.set_I051(createI051.get(cod_cta.replace(".", "")));
//				_I050.set_I052(createI052.get(cod_cta.replace(".", "")));

			String cod_cta = rs.getString("conta");
			I050Ecd i050Ecd = mapI050Ecd.get(cod_cta);

			String cta = rs.getString("descricao");

			String cod_cta_sup = i050Ecd.getCod_cta_sup();// CreateI050Util.getCod_cta_sup(cod_cta);
			if (cod_cta_sup != null) {
				if (cod_cta_sup.length() > 0) {
					System.out.println(cod_cta_sup);
					cod_cta_sup = Util.formatarConta(cod_cta_sup);
				}
			}

			String nivel = i050Ecd.getNivel();
			String cod_nat = i050Ecd.getCod_nat();

			_I050 _I050 = new _I050();

			_I050.setReg("I050");
			_I050.setDt_alt("01012019");
			_I050.setCod_nat(cod_nat);
			_I050.setInd_cta(rs.getString("tipoconta"));
			_I050.setNivel(nivel);
			_I050.setCod_cta(Util.formatarConta(cod_cta));
			_I050.setCod_cta_sup(cod_cta_sup);
			_I050.setCta(cta);

			String cod_cta_ref = i050Ecd.getCod_cta_ref();
			String cod_agl = i050Ecd.getCod_agl();

			if (_I050.getInd_cta().equals("A")) {
				if (cod_cta_ref != null) {
					_I050.set_I051(createI051(cod_cta_ref.split(";")));
				}
				if (cod_agl != null) {
					_I050.set_I052(createI052(cod_agl.split(";")));

				}

			}

			builderI050.add(_I050);
		}
		ps.close();
		rs.close();
//		workbook.close();

		return builderI050.getList();
	}

	private List<_I052> createI052(String[] cod_agl) {
		List<_I052> list = null;

		if (cod_agl.length > 0 || cod_agl != null) {

			list = new ArrayList<_I052>();

			for (String codAglu : cod_agl) {
				_I052 _I052 = new _I052();

				_I052.setReg("I052");
				_I052.setCod_ccus(null);
				_I052.setCod_agl(codAglu);

				list.add(_I052);
			}
		}

		return list;

	}

	private List<_I051> createI051(String[] cod_cta_ref) {
		List<_I051> list = null;

		if (cod_cta_ref.length > 0 || cod_cta_ref != null) {

			list = new ArrayList<_I051>();

			for (String contaReferencial : cod_cta_ref) {
				_I051 _I051 = new _I051();

				_I051.setReg("I051");
				_I051.setCod_ccus(null);
				_I051.setCod_cta_ref(contaReferencial);

				list.add(_I051);
			}
		}

		return list;
	}

}