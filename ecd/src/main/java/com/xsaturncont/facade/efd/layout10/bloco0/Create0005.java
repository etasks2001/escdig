package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.BAIRRO;
import static com.xsaturncont.facade.efd.UtilEFD.CEP;
import static com.xsaturncont.facade.efd.UtilEFD.COMPL;
import static com.xsaturncont.facade.efd.UtilEFD.EMAIL;
import static com.xsaturncont.facade.efd.UtilEFD.END;
import static com.xsaturncont.facade.efd.UtilEFD.FANTASIA;
import static com.xsaturncont.facade.efd.UtilEFD.FAX_;
import static com.xsaturncont.facade.efd.UtilEFD.FONE;
import static com.xsaturncont.facade.efd.UtilEFD.NUM;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0005;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xsaturncont.layoutefd10._0005;

public class Create0005 {

	private Connection connection;

	public Create0005(Connection connection) {
		this.connection = connection;
	}

	public _0005 get() throws SQLException {
		CallableStatement cs = connection.prepareCall(SQL_0005);
		ResultSet rs = cs.executeQuery();
		rs.next();

		String reg = rs.getString(REG);
		String fantasia = rs.getString(FANTASIA);
		String cep = rs.getString(CEP);
		String end = rs.getString(END);
		String num = rs.getString(NUM);
		String compl = rs.getString(COMPL);
		String bairro = rs.getString(BAIRRO);
		String fone = rs.getString(FONE);
		String fax = rs.getString(FAX_);
		String email = rs.getString(EMAIL);

		_0005 _0005 = new _0005();

		_0005.setReg(reg);
		_0005.setFantasia(fantasia);
		_0005.setCep(cep);
		_0005.setEnd(end);
		_0005.setNum(num);
		_0005.setCompl(compl);
		_0005.setBairro(bairro);
		_0005.setFone(fone);
		_0005.setFax(fax);
		_0005.setEmail(email);

		close(cs, rs);
		return _0005;
	}
}