package com.xsaturncont.facade.efd.layout10.blocoD;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.CFOP;
import static com.xsaturncont.facade.efd.UtilEFD.CST_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_D590_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_UF;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_UF;
import static com.xsaturncont.facade.efd.UtilEFD.VL_OPR;
import static com.xsaturncont.facade.efd.UtilEFD.VL_RED_BC;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.facade.efd.UtilEFD;
import com.xsaturncont.layoutefd10._D590;

public class CreateD590 {

	private Connection connection;

	private String num_doc;

	public CreateD590(Connection connection, String num_doc) {
		this.connection = connection;
		this.num_doc = num_doc;
	}

	public List<_D590> get() throws SQLException {
		CallableStatement cs = connection.prepareCall(SQL_D590_ENTRADA);
		cs.setString(1, num_doc);
		ResultSet rs = cs.executeQuery();

		List<_D590> list = new ArrayList<_D590>();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String cst_icms = rs.getString(CST_ICMS);
			String cfop = rs.getString(CFOP);
			String aliq_icms = rs.getString(ALIQ_ICMS).replace('.', ',');
			String vl_opr = rs.getString(VL_OPR).replace('.', ',');
			String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
			String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
			String vl_bc_icms_uf = rs.getString(VL_BC_ICMS_UF).replace('.', ',');
			String vl_icms_uf = rs.getString(VL_ICMS_UF).replace('.', ',');
			String vl_red_bc = rs.getString(VL_RED_BC).replace('.', ',');
			String cod_obs = rs.getString(UtilEFD.COD_OBS);

			_D590 _D590 = new _D590();

			_D590.setReg(reg);
			_D590.setCst_icms(cst_icms);
			_D590.setCfop(cfop);
			_D590.setAliq_icms(aliq_icms);
			_D590.setVl_opr(vl_opr);
			_D590.setVl_bc_icms(vl_bc_icms);
			_D590.setVl_icms(vl_icms);
			_D590.setVl_bc_icms_uf(vl_bc_icms_uf);
			_D590.setVl_icms_uf(vl_icms_uf);
			_D590.setVl_red_bc(vl_red_bc);
			_D590.setCod_obs(cod_obs);

			list.add(_D590);
		}

		close(cs, rs);
		return list;
	}
}