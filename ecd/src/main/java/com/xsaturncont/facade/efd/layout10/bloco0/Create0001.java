package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.x0001;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.xsaturncont.layoutefd10._0001;

public class Create0001 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private boolean comInventario;

	public Create0001(Connection connection, Timestamp dataInicial, Timestamp dataFinal, boolean comInventario) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.comInventario = comInventario;
	}

	public _0001 get() throws SQLException {
		_0001 _0001 = new _0001();

		_0001.setReg(x0001);
		_0001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		_0001.set_0005(new Create0005(connection).get());
		_0001.set_0015(new Create0015(connection).get());
		_0001.set_0100(new Create0100(connection).get());
		_0001.set_0150(new Create0150(connection, dataInicial, dataFinal).get());
		_0001.set_0190(new Create0190(connection, dataInicial, dataFinal, comInventario).get());
		_0001.set_0200(new Create0200(connection, dataInicial, dataFinal, comInventario).get());
		// _0001.set_0300(new Create0300().get());
		_0001.set_0400(new Create0400(connection, dataInicial, dataFinal).get());
		// _0001.set_0450(new Create0450().get());
		// _0001.set_0460(new Create0460().get());
		// _0001.set_0500(new Create0500().get());
		// _0001.set_0600(new Create0600().get());
		return _0001;
	}
}