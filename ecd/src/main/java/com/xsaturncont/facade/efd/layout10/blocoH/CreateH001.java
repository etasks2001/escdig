package com.xsaturncont.facade.efd.layout10.blocoH;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_COM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.xH001;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.xsaturncont.layoutefd10._H001;

public class CreateH001 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private boolean comInventario;

	public CreateH001(Connection connection, Timestamp dataInicial, Timestamp dataFinal, boolean comInventario) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.comInventario = comInventario;
	}

	public _H001 get() throws SQLException {
		if (comInventario) {
			return comInventario();
		} else {
			return semInventario();
		}

	}

	private _H001 comInventario() throws SQLException {
		_H001 _H001 = new _H001();

		_H001.setReg(xH001);
		_H001.setInd_mov(BLOCO_COM_DADOS_INFORMADOS);

		_H001.set_H005(new CreateH005(connection, dataInicial, dataFinal).get());

		return _H001;
	}

	private _H001 semInventario() {
		_H001 _H001 = new _H001();

		_H001.setReg(xH001);
		_H001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		return _H001;
	}
}