package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.CNPJ;
import static com.xsaturncont.facade.efd.UtilEFD.COD_FIN;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MUN;
import static com.xsaturncont.facade.efd.UtilEFD.COD_VER;
import static com.xsaturncont.facade.efd.UtilEFD.CPF;
import static com.xsaturncont.facade.efd.UtilEFD.DT_FIN;
import static com.xsaturncont.facade.efd.UtilEFD.DT_INI;
import static com.xsaturncont.facade.efd.UtilEFD.IE;
import static com.xsaturncont.facade.efd.UtilEFD.IM;
import static com.xsaturncont.facade.efd.UtilEFD.IND_ATIV;
import static com.xsaturncont.facade.efd.UtilEFD.IND_PERFIL;
import static com.xsaturncont.facade.efd.UtilEFD.NOME;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0000;
import static com.xsaturncont.facade.efd.UtilEFD.SUFRAMA;
import static com.xsaturncont.facade.efd.UtilEFD.UF;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.xsaturncont.facade.efd.layout10.bloco1.Create1001;
import com.xsaturncont.facade.efd.layout10.bloco1.Create1990;
import com.xsaturncont.facade.efd.layout10.bloco9.Create9001;
import com.xsaturncont.facade.efd.layout10.bloco9.Create9990;
import com.xsaturncont.facade.efd.layout10.blocoC.CreateC001;
import com.xsaturncont.facade.efd.layout10.blocoC.CreateC990;
import com.xsaturncont.facade.efd.layout10.blocoD.CreateD001;
import com.xsaturncont.facade.efd.layout10.blocoD.CreateD990;
import com.xsaturncont.facade.efd.layout10.blocoE.CreateE001;
import com.xsaturncont.facade.efd.layout10.blocoE.CreateE990;
import com.xsaturncont.facade.efd.layout10.blocoG.CreateG001;
import com.xsaturncont.facade.efd.layout10.blocoG.CreateG990;
import com.xsaturncont.facade.efd.layout10.blocoH.CreateH001;
import com.xsaturncont.facade.efd.layout10.blocoH.CreateH990;
import com.xsaturncont.facade.efd.layout10.blocok.CreateK001;
import com.xsaturncont.facade.efd.layout10.blocok.CreateK990;
import com.xsaturncont.layoutefd10._0000;

public class Create0000 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private boolean comInventario;

	public Create0000(Connection connection, Timestamp dataInicial, Timestamp dataFinal, boolean comInventario) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.comInventario = comInventario;
	}

	public _0000 get() throws SQLException {
		CallableStatement cs = connection.prepareCall(SQL_0000);
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();
		rs.next();

		String reg = rs.getString(REG);
		String cod_ver = rs.getString(COD_VER);
		String cod_fin = rs.getString(COD_FIN);
		String dt_ini = rs.getString(DT_INI);
		String dt_fin = rs.getString(DT_FIN);
		String nome = rs.getString(NOME);
		String cnpj = rs.getString(CNPJ);
		String cpf = rs.getString(CPF);
		String uf = rs.getString(UF);
		String ie = rs.getString(IE);
		String cod_mun = rs.getString(COD_MUN);
		String im = rs.getString(IM);
		String suframa = rs.getString(SUFRAMA);
		String ind_perfil = rs.getString(IND_PERFIL);
		String ind_ativ = rs.getString(IND_ATIV);

		_0000 _0000 = new _0000();

		_0000.setReg(reg);
		_0000.setCod_ver(cod_ver);
		_0000.setCod_fin(cod_fin);
		_0000.setDt_ini(dt_ini);
		_0000.setDt_fin(dt_fin);
		_0000.setNome(nome);
		_0000.setCnpj(cnpj);
		_0000.setCpf(cpf);
		_0000.setUf(uf);
		_0000.setIe(ie);
		_0000.setCod_mun(cod_mun);
		_0000.setIm(im);
		_0000.setSuframa(suframa);
		_0000.setInd_perfil(ind_perfil);
		_0000.setInd_ativ(ind_ativ);

		_0000.set_0001(new Create0001(connection, dataInicial, dataFinal, comInventario).get());
		_0000.set_0990(new Create0990().get());
		_0000.set_C001(new CreateC001(connection, dataInicial, dataFinal).get());
		_0000.set_C990(new CreateC990().get());
		_0000.set_D001(new CreateD001(connection, dataInicial, dataFinal).get());
		_0000.set_D990(new CreateD990().get());
		_0000.set_E001(new CreateE001(connection, dataInicial, dataFinal, _0000.getUf()).get());
		_0000.set_E990(new CreateE990().get());
		_0000.set_G001(new CreateG001().get());
		_0000.set_G990(new CreateG990().get());
		_0000.set_H001(new CreateH001(connection, dataInicial, dataFinal, comInventario).get());
		_0000.set_H990(new CreateH990().get());
		_0000.set_K001(new CreateK001().get());
		_0000.set_K990(new CreateK990().get());
		_0000.set_1001(new Create1001().get());
		_0000.set_1990(new Create1990().get());
		_0000.set_9001(new Create9001().get());
		_0000.set_9990(new Create9990(0).get());

		close(cs, rs);
		return _0000;
	}
}