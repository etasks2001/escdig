package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ST;
import static com.xsaturncont.facade.efd.UtilEFD.CFOP;
import static com.xsaturncont.facade.efd.UtilEFD.COD_CLASS;
import static com.xsaturncont.facade.efd.UtilEFD.COD_CTA;
import static com.xsaturncont.facade.efd.UtilEFD.COD_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.CST_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.IND_REC;
import static com.xsaturncont.facade.efd.UtilEFD.NUM_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.QTD;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.UNID;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.VL_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._C510;

public class CreateC510 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateC510(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_C510> get() throws SQLException {
		List<_C510> list = new ArrayList<_C510>();
		CallableStatement cs = connection.prepareCall("fda");
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String num_item = rs.getString(NUM_ITEM);
			String cod_item = rs.getString(COD_ITEM);
			String cod_class = rs.getString(COD_CLASS);
			String qtd = rs.getString(QTD);
			String unid = rs.getString(UNID);
			String vl_item = rs.getString(VL_ITEM);
			String vl_desc = rs.getString(VL_DESC);
			String cst_icms = rs.getString(CST_ICMS);
			String cfop = rs.getString(CFOP);
			String vl_bc_icms = rs.getString(VL_BC_ICMS);
			String aliq_icms = rs.getString(ALIQ_ICMS);
			String vl_icms = rs.getString(VL_ICMS);
			String vl_bc_icms_st = rs.getString(VL_BC_ICMS_ST);
			String aliq_st = rs.getString(ALIQ_ST);
			String vl_icms_st = rs.getString(VL_ICMS_ST);
			String ind_rec = rs.getString(IND_REC);
			String cod_part = rs.getString(COD_PART);
			String vl_pis = rs.getString(VL_PIS);
			String vl_cofins = rs.getString(VL_COFINS);
			String cod_cta = rs.getString(COD_CTA);

			_C510 _C510 = new _C510();

			_C510.setReg(reg);
			_C510.setNum_item(num_item);
			_C510.setCod_item(cod_item);
			_C510.setCod_class(cod_class);
			_C510.setQtd(qtd);
			_C510.setUnid(unid);
			_C510.setVl_item(vl_item);
			_C510.setVl_desc(vl_desc);
			_C510.setCst_icms(cst_icms);
			_C510.setCfop(cfop);
			_C510.setVl_bc_icms(vl_bc_icms);
			_C510.setAliq_icms(aliq_icms);
			_C510.setVl_icms(vl_icms);
			_C510.setVl_bc_icms_st(vl_bc_icms_st);
			_C510.setAliq_st(aliq_st);
			_C510.setVl_icms_st(vl_icms_st);
			_C510.setInd_rec(ind_rec);
			_C510.setCod_part(cod_part);
			_C510.setVl_pis(vl_pis);
			_C510.setVl_cofins(vl_cofins);
			_C510.setCod_cta(cod_cta);

			list.add(_C510);
		}
		close(cs, rs);
		return list;
	}
}