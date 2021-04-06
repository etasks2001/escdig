package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.BAIRRO;
import static com.xsaturncont.facade.efd.UtilEFD.CEP;
import static com.xsaturncont.facade.efd.UtilEFD.CNPJ;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MUN;
import static com.xsaturncont.facade.efd.UtilEFD.COMPL;
import static com.xsaturncont.facade.efd.UtilEFD.CPF;
import static com.xsaturncont.facade.efd.UtilEFD.CRC;
import static com.xsaturncont.facade.efd.UtilEFD.EMAIL;
import static com.xsaturncont.facade.efd.UtilEFD.END;
import static com.xsaturncont.facade.efd.UtilEFD.FAX;
import static com.xsaturncont.facade.efd.UtilEFD.FONE;
import static com.xsaturncont.facade.efd.UtilEFD.NOME;
import static com.xsaturncont.facade.efd.UtilEFD.NUM;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0100;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xsaturncont.layoutefd10._0100;

public class Create0100 {

	private Connection connection;

	public Create0100(Connection connection) {
		this.connection = connection;
	}

	public _0100 get() throws SQLException {
		CallableStatement cs = connection.prepareCall(SQL_0100);
		ResultSet rs = cs.executeQuery();
		rs.next();

		String reg = rs.getString(REG);
		String nome = rs.getString(NOME);
		String cpf = rs.getString(CPF);
		String crc = rs.getString(CRC);
		String cnpj = rs.getString(CNPJ);
		String cep = rs.getString(CEP);
		String end = rs.getString(END);
		String num = rs.getString(NUM);
		String compl = rs.getString(COMPL);
		String bairro = rs.getString(BAIRRO);
		String fone = rs.getString(FONE);
		String fax = rs.getString(FAX);
		String email = rs.getString(EMAIL);
		String cod_mun = rs.getString(COD_MUN);

		_0100 _0100 = new _0100();

		_0100.setReg(reg);
		_0100.setNome(nome);
		_0100.setCpf(cpf);
		_0100.setCrc(crc);
		_0100.setCnpj(cnpj);
		_0100.setCep(cep);
		_0100.setEnd(end);
		_0100.setNum(num);
		_0100.setCompl(compl);
		_0100.setBairro(bairro);
		_0100.setFone(fone);
		_0100.setFax(fax);
		_0100.setEmail(email);
		_0100.setCod_mun(cod_mun);

		close(cs, rs);
		return _0100;
	}
}