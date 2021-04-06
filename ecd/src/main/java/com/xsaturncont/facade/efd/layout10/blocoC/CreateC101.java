package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C101_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C101_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_FCP_UF_DEST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_UF_DEST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_UF_REM;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xsaturncont.layoutefd10._C101;

public class CreateC101 {

	private Connection connection;

	private String num_doc;

	private String ind_oper;

	public CreateC101(Connection connection, String num_doc, String ind_oper) {
		this.connection = connection;
		this.num_doc = num_doc;
		this.ind_oper = ind_oper;
	}

	public _C101 get() throws SQLException {
		CallableStatement cs = null;
		String sql = null;

		if (ind_oper.equals(IND_OPER_ENTRADA)) {
			sql = SQL_C101_ENTRADA;
		} else if (ind_oper.equals(IND_OPER_SAIDA)) {
			sql = SQL_C101_SAIDA;
		}

		cs = connection.prepareCall(sql);

		cs.setString(1, num_doc);

		ResultSet rs = cs.executeQuery();

		_C101 _C101 = create101(rs);

		close(cs, rs);
		return _C101;
	}

	private _C101 create101(ResultSet rs) throws SQLException {
		_C101 _C101 = null;

		if (rs.next()) {
			_C101 = new _C101();

			String reg = rs.getString(REG);
			String vl_fcp_uf_dest = rs.getString(VL_FCP_UF_DEST).replace('.', ',');
			String vl_icms_uf_dest = rs.getString(VL_ICMS_UF_DEST).replace('.', ',');
			String vl_icms_uf_rem = rs.getString(VL_ICMS_UF_REM).replace('.', ',');

			_C101.setReg(reg);
			_C101.setVl_fcp_uf_dest(vl_fcp_uf_dest);
			_C101.setVl_icms_uf_dest(vl_icms_uf_dest);
			_C101.setVl_icms_uf_rem(vl_icms_uf_rem);
		}
		return _C101;
	}
}