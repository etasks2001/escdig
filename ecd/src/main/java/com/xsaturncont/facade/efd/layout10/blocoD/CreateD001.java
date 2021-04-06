package com.xsaturncont.facade.efd.layout10.blocoD;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.xD001;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.xsaturncont.layoutefd10._D001;

public class CreateD001 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateD001(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public _D001 get() throws SQLException {
		_D001 _D001 = new _D001();

		_D001.setReg(xD001);
		_D001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		_D001.set_D100(new CreateD100(connection, dataInicial, dataFinal).get());
		// _D001.set_D300(new CreateD300().get());
		// _D001.set_D350(new CreateD350().get());
		// _D001.set_D400(new CreateD400().get());
		_D001.set_D500(new CreateD500(connection, dataInicial, dataFinal).get());
		// _D001.set_D600(new CreateD600().get());
		// _D001.set_D695(new CreateD695().get());

		return _D001;
	}
}