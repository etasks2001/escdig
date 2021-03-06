package com.xsaturncont.facade.ecd.layout3.blocoj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xsaturncont.layout3ecd._J900;
import com.xsaturncont.util.Util;

public class CreateJ900 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateJ900(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _J900 get() throws SQLException {

		PreparedStatement ps = connection.prepareStatement("select nome from empresa where codigo = " + codigoEmpresa);
		ResultSet rs = ps.executeQuery();
		rs.next();

		_J900 _J900 = new _J900();

		_J900.setReg("J900");
		_J900.setDnrc_encer("TERMO DE ENCERRAMENTO");
		_J900.setNum_ord(Util.getNumeroDeOrderm(this.codigoEmpresa));
		_J900.setNat_livro(Util.normalizeString("ESCRITURA??O CONT?BIL DIGITAL DO LIVRO DI?RIO GERAL"));
		_J900.setNome(Util.normalizeString(rs.getString("nome")));
		_J900.setQtd_lin("100");
		_J900.setDt_ini_escr("01012014");
		_J900.setDt_fin_escr("31122014");
		_J900.set_J930(new CreateJ930(this.connection, codigoEmpresa).get());
		ps.close();
		rs.close();
		return _J900;
	}
}