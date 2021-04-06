package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.CFOP;
import static com.xsaturncont.facade.efd.UtilEFD.COD_OBS;
import static com.xsaturncont.facade.efd.UtilEFD.CST_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C190_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C190_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.VL_OPR;
import static com.xsaturncont.facade.efd.UtilEFD.VL_RED_BC;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._C190;

public class CreateC190 {

	private Connection connection;

	private String num_doc;

	private String ind_oper;

	public CreateC190(Connection connection, String num_doc, String ind_oper) {
		this.connection = connection;
		this.num_doc = num_doc;
		this.ind_oper = ind_oper;
	}

	public List<_C190> get() throws SQLException {
		List<_C190> list = new ArrayList<_C190>();

		CallableStatement cs = null;

		if (ind_oper.equals(IND_OPER_ENTRADA)) {
			cs = connection.prepareCall(SQL_C190_ENTRADA);
		} else if (ind_oper.equals(IND_OPER_SAIDA)) {
			cs = connection.prepareCall(SQL_C190_SAIDA);
		}

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
			String vl_bc_icms_st = rs.getString(VL_BC_ICMS_ST).replace('.', ',');
			String vl_icms_st = rs.getString(VL_ICMS_ST).replace('.', ',');
			String vl_red_bc = rs.getString(VL_RED_BC).replace('.', ',');
			String vl_ipi = rs.getString(VL_IPI).replace('.', ',');
			String cod_obs = rs.getString(COD_OBS);

			_C190 _C190 = new _C190();

			_C190.setReg(reg);
			_C190.setCst_icms(cst_icms);
			_C190.setCfop(cfop);
			_C190.setAliq_icms(aliq_icms);
			_C190.setVl_opr(vl_opr);
			_C190.setVl_bc_icms(vl_bc_icms);
			_C190.setVl_icms(vl_icms);
			_C190.setVl_bc_icms_st(vl_bc_icms_st);
			_C190.setVl_icms_st(vl_icms_st);
			_C190.setVl_red_bc(vl_red_bc);
			_C190.setVl_ipi(vl_ipi);
			_C190.setCod_obs(cod_obs);

			list.add(_C190);
		}

		close(cs, rs);
		return list;
	}
}