package com.xsaturncont.facade.efd.layout10.blocoD;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.CFOP;
import static com.xsaturncont.facade.efd.UtilEFD.COD_OBS;
import static com.xsaturncont.facade.efd.UtilEFD.CST_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_D190_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_OPR;
import static com.xsaturncont.facade.efd.UtilEFD.VL_RED_BC;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._D190;

public class CreateD190 {

	private Connection connection;

	private String num_doc;

	public CreateD190(Connection connection, String num_doc) {
		this.connection = connection;
		this.num_doc = num_doc;
	}

	public List<_D190> get() throws SQLException {
		List<_D190> list = new ArrayList<_D190>();
		CallableStatement cs = connection.prepareCall(SQL_D190_ENTRADA);
		cs.setString(1, num_doc);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String cst_icms = rs.getString(CST_ICMS);
			String cfop = rs.getString(CFOP);
			String aliq_icms = rs.getString(ALIQ_ICMS).replace('.', ',');
			String vl_opr = rs.getString(VL_OPR).replace('.', ',');
			String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
			String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
			String vl_red_bc = rs.getString(VL_RED_BC).replace('.', ',');
			String cod_obs = rs.getString(COD_OBS);

			_D190 _D190 = new _D190();

			_D190.setReg(reg);
			_D190.setCst_icms(cst_icms);
			_D190.setCfop(cfop);
			_D190.setAliq_icms(aliq_icms);
			_D190.setVl_opr(vl_opr);
			_D190.setVl_bc_icms(vl_bc_icms);
			_D190.setVl_icms(vl_icms);
			_D190.setVl_red_bc(vl_red_bc);
			_D190.setCod_obs(cod_obs);

			list.add(_D190);
		}

		close(cs, rs);
		return list;
	}
}