package com.xsaturncont.facade.ecd.layout3.blocoi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.xsaturncont.layout3ecd._I030;
import com.xsaturncont.util.Util;

public class CreateI030 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateI030(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _I030 get() throws SQLException {
		PreparedStatement ps = connection.prepareStatement("select nome,nire,cnpj,cidade,datasecao from empresa where codigo = " + codigoEmpresa);
		ResultSet rs = ps.executeQuery();
		rs.next();

		Date date = rs.getDate("datasecao");
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		String dt_arq = dateFormat.format(date);

		_I030 _I030 = new _I030();
		_I030.setReg("I030");
		_I030.setDnrc_abert("TERMO DE ABERTURA");
		_I030.setNum_ord(Util.getNumeroDeOrderm(this.codigoEmpresa));
		_I030.setNat_livr(Util.normalizeString("ESCRITURAÇÃO CONTÁBIL DIGITAL DO LIVRO DIÁRIO GERAL"));
		_I030.setQtd_lin(null);
		_I030.setNome(Util.normalizeString(rs.getString("nome")));
		_I030.setNire(rs.getString("nire"));
		_I030.setCnpj(rs.getString("cnpj"));
		_I030.setDt_arq(dt_arq);
		_I030.setDt_arq_conv(null);
		_I030.setDesc_mun(Util.normalizeString(rs.getString("cidade")));
		_I030.setDt_ex_social("31122015");

		ps.close();
		rs.close();
		return _I030;
	}
}