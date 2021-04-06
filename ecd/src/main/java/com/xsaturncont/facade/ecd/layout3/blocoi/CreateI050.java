package com.xsaturncont.facade.ecd.layout3.blocoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout3ecd._I050;
import com.xsaturncont.util.Util;

public class CreateI050 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateI050(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_I050> get() throws SQLException, IOException {

		BuilderBlockList<_I050> builderI050 = new BuilderBlockList<_I050>();

		PreparedStatement ps = connection.prepareStatement("select conta, tipoconta,descricao from planoconta where codigoempresa = " + this.codigoEmpresa
				+ " and ano = 14 and conta not in(\'9999999999\',\'2404000000\',\'4201010001\',\'2105140001\',\'3202010000\',\'3202010001\',\'3202010002\') and conta not like '13%' order by conta");

		ResultSet rs = ps.executeQuery();

		FileInputStream fis = new FileInputStream(Util.getPlanilha(this.codigoEmpresa));
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet planilha = Util.getPlanilha("pc", workbook);
		CreateI051 createI051 = new CreateI051(planilha);
		CreateI052 createI052 = new CreateI052(planilha);
		while (rs.next()) {
			String cod_cta = rs.getString("conta");
			String cta = rs.getString("descricao");
			cta = Util.normalizeString(cta.replace("DIVERSOS", "").replace("DIVERSAS", ""));
			cod_cta = Util.formatarConta(cod_cta);
			String cod_cta_sup = CreateI050Util.getCod_cta_sup(cod_cta);
			if (this.codigoEmpresa.equals("3")) {
				if (cod_cta_sup.equals("1.2.03.01.0000")) {
					cod_cta_sup = "1.2.03.00.0000";
				}
			}

			_I050 _I050 = new _I050();
			_I050.setReg("I050");
			_I050.setDt_alt("01012014");
			_I050.setCod_nat(CreateI050Util.getCod_nat(cod_cta));
			_I050.setInd_cta(rs.getString("tipoconta"));
			_I050.setNivel(CreateI050Util.getNivel(cod_cta));
			_I050.setCod_cta(cod_cta);
			_I050.setCod_cta_sup(cod_cta_sup);
			_I050.setCta(cta);

			if (_I050.getInd_cta().equals("A")) {
				_I050.set_I051(createI051.get(cod_cta.replace(".", "")));
				_I050.set_I052(createI052.get(cod_cta.replace(".", "")));
			}

			builderI050.add(_I050);
		}
		ps.close();
		rs.close();
		workbook.close();

		return builderI050.getList();
	}
}