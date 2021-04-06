package com.xsaturncont.facade.ecd.layout5.blocoj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout5ecd._J930;

public class CreateJ930 {

	private Connection connection;

	private String codigoEmpresa;

	public CreateJ930(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_J930> get() throws SQLException {

		PreparedStatement ps = connection.prepareStatement("select resplegal,docresplegal,cargoresplegal,profcontabil,crc from empresa where codigo = "
				+ codigoEmpresa);
		ResultSet rs = ps.executeQuery();

		BuilderBlockList<_J930> list = new BuilderBlockList<_J930>();

		rs.next();
		String ident_nom = rs.getString("resplegal");
		String ident_cpf = rs.getString("docresplegal").replace(".", "").replace("/", "").replace("-", "");
		String ident_qualif = rs.getString("cargoresplegal");

		_J930 _J930 = new _J930();
		_J930.setReg("J930");
		_J930.setIdent_nom(ident_nom);
		_J930.setIdent_cpf_cnpj(ident_cpf);
		_J930.setIdent_qualif(ident_qualif);
		_J930.setCod_assin("205");
		_J930.setInd_crc(null);
		_J930.setEmail(null);
		_J930.setFone(null);
		_J930.setUf_crc(null);
		_J930.setNum_seq_crc(null);
		_J930.setDt_crc(null);
		_J930.setInd_resp_legal("S");

		list.add(_J930);

		_J930 = new _J930();
		_J930.setReg("J930");
		_J930.setIdent_nom("SERGIO ROBERTO BIONDI");
		_J930.setIdent_cpf_cnpj("03018020847");
		_J930.setIdent_qualif("CONTADOR");
		_J930.setCod_assin("900");
		_J930.setInd_crc("1SP135626-O/0");
		_J930.setEmail("biondi@francosuissa.com.br");
		_J930.setFone("11 55497599");
		_J930.setUf_crc("SP");
		_J930.setNum_seq_crc("SP/1986/056209");
		_J930.setDt_crc("24092015");
		_J930.setInd_resp_legal("N");

		list.add(_J930);

		ps.close();
		rs.close();

		return list.getList();
	}
}