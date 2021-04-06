package com.xsaturncont.facade.efd.layout10.blocoD;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
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
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_UF;
import static com.xsaturncont.facade.efd.UtilEFD.VL_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_UF;
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

import com.xsaturncont.layoutefd10._D510;

public class CreateD510 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateD510(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_D510> get() throws SQLException {
		CallableStatement cs = connection.prepareCall("");
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();

		List<_D510> list = new ArrayList<_D510>();

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
			String vl_bc_icms_uf = rs.getString(VL_BC_ICMS_UF);
			String vl_icms_uf = rs.getString(VL_ICMS_UF);
			String ind_rec = rs.getString(IND_REC);
			String cod_part = rs.getString(COD_PART);
			String vl_pis = rs.getString(VL_PIS);
			String vl_cofins = rs.getString(VL_COFINS);
			String cod_cta = rs.getString(COD_CTA);

			_D510 _D510 = new _D510();
			_D510.setReg(reg);
			_D510.setNum_item(num_item);
			_D510.setCod_item(cod_item);
			_D510.setCod_class(cod_class);
			_D510.setQtd(qtd);
			_D510.setUnid(unid);
			_D510.setVl_item(vl_item);
			_D510.setVl_desc(vl_desc);
			_D510.setCst_icms(cst_icms);
			_D510.setCfop(cfop);
			_D510.setVl_bc_icms(vl_bc_icms);
			_D510.setAliq_icms(aliq_icms);
			_D510.setVl_icms(vl_icms);
			_D510.setVl_bc_icms_uf(vl_bc_icms_uf);
			_D510.setVl_icms_uf(vl_icms_uf);
			_D510.setInd_rec(ind_rec);
			_D510.setCod_part(cod_part);
			_D510.setVl_pis(vl_pis);
			_D510.setVl_cofins(vl_cofins);
			_D510.setCod_cta(cod_cta);

			list.add(_D510);
		}
		close(cs, rs);
		return list;
	}
}