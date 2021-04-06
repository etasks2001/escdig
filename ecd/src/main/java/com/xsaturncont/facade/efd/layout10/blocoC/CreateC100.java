package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.CHV_NFE;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MOD;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.COD_SIT;
import static com.xsaturncont.facade.efd.UtilEFD.DT_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.DT_E_S;
import static com.xsaturncont.facade.efd.UtilEFD.IND_EMIT;
import static com.xsaturncont.facade.efd.UtilEFD.IND_EMIT_TERCEIROS;
import static com.xsaturncont.facade.efd.UtilEFD.IND_FRT;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER;
import static com.xsaturncont.facade.efd.UtilEFD.IND_PGTO;
import static com.xsaturncont.facade.efd.UtilEFD.NUM_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SER;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C100_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C100_SAIDA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ABAT_NT;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_COFINS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_FRT;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.VL_MERC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_OUT_DA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_PIS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_SEG;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.facade.efd.UtilEFD;
import com.xsaturncont.layoutefd10._C100;

public class CreateC100 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateC100(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_C100> get() throws SQLException {
		List<_C100> list = new ArrayList<_C100>();

		CallableStatement csEntrada = connection.prepareCall(SQL_C100_ENTRADA);
		csEntrada.setTimestamp(1, dataInicial);
		csEntrada.setTimestamp(2, dataFinal);
		ResultSet rsEntrada = csEntrada.executeQuery();

		while (rsEntrada.next()) {
			setC100(rsEntrada, list);
		}
		close(csEntrada, rsEntrada);
		// ===================================================================================================
		CallableStatement csSaida = connection.prepareCall(SQL_C100_SAIDA);
		csSaida.setTimestamp(1, dataInicial);
		csSaida.setTimestamp(2, dataFinal);
		ResultSet rsSaida = csSaida.executeQuery();

		while (rsSaida.next()) {
			setC100(rsSaida, list);
		}
		close(csSaida, rsSaida);
		return list;
	}

	private void setC100(ResultSet rs, List<_C100> list) throws SQLException {
		String reg = rs.getString(REG);
		String ind_oper = rs.getString(IND_OPER);
		String ind_emit = rs.getString(IND_EMIT);
		String cod_part = rs.getString(COD_PART);
		String cod_mod = rs.getString(COD_MOD);
		String cod_sit = rs.getString(COD_SIT);
		String ser = rs.getString(SER);
		String num_doc = rs.getString(NUM_DOC);
		String chv_nfe = rs.getString(CHV_NFE);
		String dt_doc = rs.getString(DT_DOC);
		String dt_e_s = rs.getString(DT_E_S);
		String vl_doc = rs.getString(VL_DOC).replace('.', ',');
		String ind_pgto = rs.getString(IND_PGTO);
		String vl_desc = rs.getString(VL_DESC).replace('.', ',');
		String vl_abat_nt = rs.getString(VL_ABAT_NT).replace('.', ',');
		String vl_merc = rs.getString(VL_MERC).replace('.', ',');
		String ind_frt = rs.getString(IND_FRT);
		String vl_frt = rs.getString(VL_FRT).replace('.', ',');
		String vl_seg = rs.getString(VL_SEG).replace('.', ',');
		String vl_out_da = rs.getString(VL_OUT_DA).replace('.', ',');
		String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
		String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
		String vl_bc_icms_st = rs.getString(VL_BC_ICMS_ST).replace('.', ',');
		String vl_icms_st = rs.getString(VL_ICMS_ST).replace('.', ',');
		String vl_ipi = rs.getString(VL_IPI).replace('.', ',');
		String vl_pis = rs.getString(VL_PIS).replace('.', ',');
		String vl_cofins = rs.getString(UtilEFD.VL_COFINS).replace('.', ',');
		String vl_pis_st = rs.getString(VL_PIS_ST).replace('.', ',');
		String vl_cofins_st = rs.getString(VL_COFINS_ST).replace('.', ',');

		_C100 _C100 = new _C100();

		if (cod_sit.equals("05") || cod_sit.equals("02")) {
			// reg
			// ind_oper = "";
			// ind_emit
			cod_part = "";
			// cod_mod
			// cod_sit
			ser = (cod_sit.equals("05") ? "" : ser);
			// num_doc
			chv_nfe = (cod_sit.equals("05") ? "" : chv_nfe);
			dt_doc = "";
			dt_e_s = "";
			vl_doc = "";
			ind_pgto = "";
			vl_desc = "";
			vl_abat_nt = "";
			vl_merc = "";
			ind_frt = "";
			vl_frt = "";
			vl_seg = "";
			vl_out_da = "";
			vl_bc_icms = "";
			vl_icms = "";
			vl_bc_icms_st = "";
			vl_icms_st = "";
			vl_ipi = "";
			vl_pis = "";
			vl_cofins = "";
			vl_pis_st = "";
			vl_cofins_st = "";
		}

		_C100.setReg(reg);
		_C100.setInd_oper(ind_oper);
		_C100.setInd_emit(ind_emit);
		_C100.setCod_part(cod_part);
		_C100.setCod_mod(cod_mod);
		_C100.setCod_sit(cod_sit);
		_C100.setSer(ser);
		_C100.setNum_doc(num_doc);
		_C100.setChv_nfe(chv_nfe);
		_C100.setDt_doc(dt_doc);
		_C100.setDt_e_s(dt_e_s);
		_C100.setVl_doc(vl_doc);
		_C100.setInd_pgto(ind_pgto);
		_C100.setVl_desc(vl_desc);
		_C100.setVl_abat_nt(vl_abat_nt);
		_C100.setVl_merc(vl_merc);
		_C100.setInd_frt(ind_frt);
		_C100.setVl_frt(vl_frt);
		_C100.setVl_seg(vl_seg);
		_C100.setVl_out_da(vl_out_da);
		_C100.setVl_bc_icms(vl_bc_icms);
		_C100.setVl_icms(vl_icms);
		_C100.setVl_bc_icms_st(vl_bc_icms_st);
		_C100.setVl_icms_st(vl_icms_st);
		_C100.setVl_ipi(vl_ipi);
		_C100.setVl_pis(vl_pis);
		_C100.setVl_cofins(vl_cofins);
		_C100.setVl_pis_st(vl_pis_st);
		_C100.setVl_cofins_st(vl_cofins_st);

		_C100.set_C101(new CreateC101(connection, num_doc, ind_oper).get());
		// _C100.set_C105(new CreateC105().get());
		// _C100.set_C110(new CreateC110().get());
		// _C100.set_C120(new CreateC120().get());
		// _C100.set_C130(new CreateC130().get());
		// _C100.set_C140(new CreateC140().get());
		// _C100.set_C160(new CreateC160().get());
		// _C100.set_C165(new CreateC165().get());

		if (ind_emit.equals(IND_EMIT_TERCEIROS)) {
			_C100.set_C170(new CreateC170(connection, num_doc).get());
		}
		_C100.set_C190(new CreateC190(connection, num_doc, ind_oper).get());

		// _C100.set_C195(new CreateC195().get());

		list.add(_C100);
	}
}