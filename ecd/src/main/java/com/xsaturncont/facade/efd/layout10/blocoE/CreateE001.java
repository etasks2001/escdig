package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_COM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.xE001;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.xsaturncont.layoutefd10._E001;

public class CreateE001 {

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private Connection connection;

	private String uf;

	public CreateE001(Connection connection, Timestamp dataInicial, Timestamp dataFinal, String uf) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.uf = uf;
	}

	public _E001 get() throws SQLException {
		_E001 _E001 = new _E001();

		_E001.setReg(xE001);
		_E001.setInd_mov(BLOCO_COM_DADOS_INFORMADOS);

		_E001.set_E100(new CreateE100(dataInicial, dataFinal).get());
		_E001.set_E200(new CreateE200(dataInicial, dataFinal, uf).get());
		_E001.set_E300(new CreateE300(dataInicial, dataFinal).get());
		_E001.set_E500(new CreateE500(connection, dataInicial, dataFinal).get());

		return _E001;
	}
}