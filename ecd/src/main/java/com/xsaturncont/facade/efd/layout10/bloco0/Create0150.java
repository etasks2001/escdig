package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.BAIRRO;
import static com.xsaturncont.facade.efd.UtilEFD.CNPJ;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MUN;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PAIS;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.COMPL;
import static com.xsaturncont.facade.efd.UtilEFD.CPF;
import static com.xsaturncont.facade.efd.UtilEFD.END;
import static com.xsaturncont.facade.efd.UtilEFD.IE;
import static com.xsaturncont.facade.efd.UtilEFD.NOME;
import static com.xsaturncont.facade.efd.UtilEFD.NUM;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0150_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0150_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.SUFRAMA;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._0150;

public class Create0150 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public Create0150(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_0150> get() throws SQLException {
		List<_0150> list = new ArrayList<_0150>();

		CallableStatement csEntrada = connection.prepareCall(SQL_0150_ENTRADA);
		csEntrada.setTimestamp(1, dataInicial);
		csEntrada.setTimestamp(2, dataFinal);
		ResultSet rsEntrada = csEntrada.executeQuery();

		set0150(list, rsEntrada);

		close(csEntrada, rsEntrada);
		// ============================================================================================================
		CallableStatement csSaida = connection.prepareCall(SQL_0150_SAIDA);
		csSaida.setTimestamp(1, dataInicial);
		csSaida.setTimestamp(2, dataFinal);
		ResultSet rsSaida = csSaida.executeQuery();

		set0150(list, rsSaida);

		close(csSaida, rsSaida);
		return list;
	}

	private void set0150(List<_0150> list, ResultSet rs) throws SQLException {
		while (rs.next()) {
			String reg = rs.getString(REG);
			String cod_part = rs.getString(COD_PART);
			String nome = rs.getString(NOME).trim();
			String cod_pais = rs.getString(COD_PAIS);
			String cnpj = rs.getString(CNPJ);
			String cpf = rs.getString(CPF);
			String ie = rs.getString(IE);
			String cod_mun = rs.getString(COD_MUN);
			String suframa = rs.getString(SUFRAMA);
			String end = rs.getString(END).trim();
			String num = rs.getString(NUM).trim();
			String compl = rs.getString(COMPL).trim();
			String bairro = rs.getString(BAIRRO);

			if (bairro != null) {
				bairro = bairro.trim();
			}

			_0150 _0150 = new _0150();

			_0150.setReg(reg);
			_0150.setCod_part(cod_part);
			_0150.setNome(nome);
			_0150.setCod_pais(cod_pais);
			_0150.setCnpj(cnpj);
			_0150.setCpf(cpf);
			_0150.setIe(ie);
			_0150.setCod_mun(cod_mun);
			_0150.setSuframa(suframa);
			_0150.setEnd(end);
			_0150.setNum(num);
			_0150.setCompl(compl);
			_0150.setBairro(bairro);

			// _0150.set_0175(null);

			list.add(_0150);
		}
	}
}