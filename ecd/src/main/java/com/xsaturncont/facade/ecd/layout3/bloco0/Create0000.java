package com.xsaturncont.facade.ecd.layout3.bloco0;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import com.xsaturncont.facade.ecd.layout3.bloco9.Create9001;
import com.xsaturncont.facade.ecd.layout3.bloco9.Create9990;
import com.xsaturncont.facade.ecd.layout3.blocoi.CreateI001;
import com.xsaturncont.facade.ecd.layout3.blocoi.CreateI990;
import com.xsaturncont.facade.ecd.layout3.blocoj.CreateJ001;
import com.xsaturncont.facade.ecd.layout3.blocoj.CreateJ990;
import com.xsaturncont.layout3ecd._0000;
import com.xsaturncont.util.Util;

public class Create0000 {

	private Connection connection;

	private String codigoEmpresa;

	public Create0000(Connection connection, String codigoEmpresa) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
	}

	public _0000 get() throws SQLException, ParseException, IOException, NoSuchAlgorithmException {
		PreparedStatement ps = connection.prepareStatement("select nome,cnpj,uf,ie from empresa where codigo = " + codigoEmpresa);
		ResultSet rs = ps.executeQuery();
		rs.next();

		_0000 _0000 = new _0000();
		_0000.setReg("0000");
		_0000.setLecd("LECD");
		_0000.setDt_ini("01012015");
		_0000.setDt_fin("31122015");
		_0000.setNome(Util.normalizeString(rs.getString("nome")));
		_0000.setCnpj(rs.getString("cnpj"));
		_0000.setUf(rs.getString("uf"));
		_0000.setIe(rs.getString("ie"));
		_0000.setCod_mun("3550308");
		_0000.setIm(Util.getInscricaoMunicipal(this.codigoEmpresa));
		_0000.setInd_sit_esp(null);
		_0000.setInd_sit_ini_per("0");
		_0000.setInd_nire("1");
		_0000.setInd_fin_esc("0");
		_0000.setCod_hash_sub(null);
		_0000.setNire_subst(null);
		_0000.setInd_grande_porte("0");
		_0000.setTip_ecd("0");
		_0000.setCod_scp(null);

		_0000.set_0001(new Create0001(this.connection, codigoEmpresa).get());
		_0000.set_0990(new Create0990().get());
		_0000.set_I001(new CreateI001(this.connection, codigoEmpresa).get());
		_0000.set_I990(new CreateI990().get());
		_0000.set_J001(new CreateJ001(this.connection, codigoEmpresa).get());
		_0000.set_J990(new CreateJ990().get());
		_0000.set_9001(new Create9001().get());
		_0000.set_9990(new Create9990().get());
		ps.close();
		rs.close();
		return _0000;
	}
}