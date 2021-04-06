package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_COFINS_PERC;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_PIS_PERC;
import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ST;
import static com.xsaturncont.facade.efd.UtilEFD.CFOP;
import static com.xsaturncont.facade.efd.UtilEFD.COD_CTA;
import static com.xsaturncont.facade.efd.UtilEFD.COD_ENQ;
import static com.xsaturncont.facade.efd.UtilEFD.COD_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.COD_NAT;
import static com.xsaturncont.facade.efd.UtilEFD.CST_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.CST_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.CST_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.CST_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.DESCR_COMPL;
import static com.xsaturncont.facade.efd.UtilEFD.IND_APUR;
import static com.xsaturncont.facade.efd.UtilEFD.IND_MOV;
import static com.xsaturncont.facade.efd.UtilEFD.NUM_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.QTD;
import static com.xsaturncont.facade.efd.UtilEFD.QUANT_BC_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.QUANT_BC_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C170_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.UNID;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.VL_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._C170;

public class CreateC170 {

	private Connection connection;

	private String num_doc;

	public CreateC170(Connection connection, String num_doc) {
		this.connection = connection;
		this.num_doc = num_doc;
	}

	public List<_C170> get() throws SQLException {
		List<_C170> list = new ArrayList<_C170>();

		CallableStatement cs = connection.prepareCall(SQL_C170_ENTRADA);
		cs.setString(1, num_doc);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String num_item = rs.getString(NUM_ITEM);
			String cod_item = rs.getString(COD_ITEM);
			String descr_compl = rs.getString(DESCR_COMPL);
			String qtd = rs.getString(QTD);
			String unid = rs.getString(UNID);
			String vl_item = rs.getString(VL_ITEM).replace('.', ',');
			String vl_desc = rs.getString(VL_DESC).replace('.', ',');
			String ind_mov = rs.getString(IND_MOV);
			String cst_icms = rs.getString(CST_ICMS);
			String cfop = rs.getString(CFOP);
			String cod_nat = rs.getString(COD_NAT);
			String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
			String aliq_icms = rs.getString(ALIQ_ICMS).replace('.', ',');
			String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
			String vl_bc_icms_st = rs.getString(VL_BC_ICMS_ST).replace('.', ',');
			String aliq_st = rs.getString(ALIQ_ST).replace('.', ',');
			String vl_icms_st = rs.getString(VL_ICMS_ST).replace('.', ',');
			String ind_apur = rs.getString(IND_APUR);
			String cst_ipi = rs.getString(CST_IPI);
			String cod_enq = rs.getString(COD_ENQ);
			String vl_bc_ipi = rs.getString(VL_BC_IPI).replace('.', ',');
			String aliq_ipi = rs.getString(ALIQ_IPI).replace('.', ',');
			String vl_ipi = rs.getString(VL_IPI).replace('.', ',');
			String cst_pis = rs.getString(CST_PIS);
			String vl_bc_pis = rs.getString(VL_BC_PIS).replace('.', ',');
			String aliq_pis_perc = rs.getString(ALIQ_PIS_PERC).replace('.', ',');
			String quant_bc_pis = rs.getString(QUANT_BC_PIS);
			String aliq_pis = rs.getString(ALIQ_PIS).replace('.', ',');
			String vl_pis = rs.getString(VL_PIS).replace('.', ',');
			String cst_cofins = rs.getString(CST_COFINS);
			String vl_bc_cofins = rs.getString(VL_BC_COFINS).replace('.', ',');
			String aliq_cofins_perc = rs.getString(ALIQ_COFINS_PERC).replace('.', ',');
			String quant_bc_cofins = rs.getString(QUANT_BC_COFINS);
			String aliq_cofins = rs.getString(ALIQ_COFINS).replace('.', ',');
			String vl_cofins = rs.getString(VL_COFINS).replace('.', ',');
			String cod_cta = rs.getString(COD_CTA);

			_C170 _C170 = new _C170();

			_C170.setReg(reg);
			_C170.setNum_item(num_item);
			_C170.setCod_item(cod_item);
			_C170.setDescr_compl(descr_compl);
			_C170.setQtd(qtd);
			_C170.setUnid(unid);
			_C170.setVl_item(vl_item);
			_C170.setVl_desc(vl_desc);
			_C170.setInd_mov(ind_mov);
			_C170.setCst_icms(cst_icms);
			_C170.setCfop(cfop);
			_C170.setCod_nat(cod_nat);
			_C170.setVl_bc_icms(vl_bc_icms);
			_C170.setAliq_icms(aliq_icms);
			_C170.setVl_icms(vl_icms);
			_C170.setVl_bc_icms_st(vl_bc_icms_st);
			_C170.setAliq_st(aliq_st);
			_C170.setVl_icms_st(vl_icms_st);
			_C170.setInd_apur(ind_apur);
			_C170.setCst_ipi(cst_ipi);
			_C170.setCod_enq(cod_enq);
			_C170.setVl_bc_ipi(vl_bc_ipi);
			_C170.setAliq_ipi(aliq_ipi);
			_C170.setVl_ipi(vl_ipi);
			_C170.setCst_pis(cst_pis);
			_C170.setVl_bc_pis(vl_bc_pis);
			_C170.setAliq_pis_perc(aliq_pis_perc);
			_C170.setQuant_bc_pis(quant_bc_pis);
			_C170.setAliq_pis(aliq_pis);
			_C170.setVl_pis(vl_pis);
			_C170.setCst_cofins(cst_cofins);
			_C170.setVl_bc_cofins(vl_bc_cofins);
			_C170.setAliq_cofins_perc(aliq_cofins_perc);
			_C170.setQuant_bc_cofins(quant_bc_cofins);
			_C170.setAliq_cofins(aliq_cofins);
			_C170.setVl_cofins(vl_cofins);
			_C170.setCod_cta(cod_cta);

			// _C170.set_C171(new CreateC171().get());
			// _C170.set_C172(new CreateC172().get());
			// _C170.set_C173(new CreateC173().get());
			// _C170.set_C174(new CreateC174().get());
			// _C170.set_C175(new CreateC175().get());
			// _C170.set_C176(new CreateC176().get());
			// _C170.set_C177(new CreateC177().get());
			// _C170.set_C178(new CreateC178().get());
			// _C170.set_C179(new CreateC179().get());

			list.add(_C170);
		}

		close(cs, rs);
		return list;
	}
}