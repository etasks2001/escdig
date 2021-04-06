package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.xC001;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.xsaturncont.layoutefd10._C001;

public class CreateC001 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateC001(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public _C001 get() throws SQLException {
		_C001 _C001 = new _C001();
		_C001.setReg(xC001);
		_C001.setInd_mov(BLOCO_SEM_DADOS_INFORMADOS);

		_C001.set_C100(new CreateC100(connection, dataInicial, dataFinal).get());
		// _C001.set_C300(new CreateC300().get());
		// _C001.set_C350(new CreateC350().get());
		// _C001.set_C400(new CreateC400().get());
		// _C001.set_C495(new CreateC495().get());
		_C001.set_C500(new CreateC500(connection, dataInicial, dataFinal).get());
		// _C001.set_C600(new CreateC600().get());
		// _C001.set_C700(new CreateC700().get());
		// _C001.set_C800(new CreateC800().get());
		// _C001.set_C860(new CreateC860().get());

		return _C001;
	}
}