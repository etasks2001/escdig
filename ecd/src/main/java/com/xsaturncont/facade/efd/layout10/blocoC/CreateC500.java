package com.xsaturncont.facade.efd.layout10.blocoC;

import static com.xsaturncont.facade.efd.UtilEFD.COD_CONS;
import static com.xsaturncont.facade.efd.UtilEFD.COD_GRUPO_TENSAO;
import static com.xsaturncont.facade.efd.UtilEFD.COD_INF;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MOD;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.COD_SIT;
import static com.xsaturncont.facade.efd.UtilEFD.DT_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.DT_E_S;
import static com.xsaturncont.facade.efd.UtilEFD.IND_EMIT;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER;
import static com.xsaturncont.facade.efd.UtilEFD.NUM_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SER;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_C500_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SUB;
import static com.xsaturncont.facade.efd.UtilEFD.TP_LIGACAO;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_FORN;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS_ST;
import static com.xsaturncont.facade.efd.UtilEFD.VL_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_SERV_NT;
import static com.xsaturncont.facade.efd.UtilEFD.VL_TERC;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._C500;

public class CreateC500 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateC500(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_C500> get() throws SQLException {
		List<_C500> list = new ArrayList<_C500>();
		CallableStatement cs = connection.prepareCall(SQL_C500_ENTRADA);
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			setC500(rs, list);
		}
		close(cs, rs);
		return list;
	}

	private void setC500(ResultSet rs, List<_C500> list) throws SQLException {
		String reg = rs.getString(REG);
		String ind_oper = rs.getString(IND_OPER);
		String ind_emit = rs.getString(IND_EMIT);
		String cod_part = rs.getString(COD_PART);
		String cod_mod = rs.getString(COD_MOD);
		String cod_sit = rs.getString(COD_SIT);
		String ser = rs.getString(SER);
		String sub = rs.getString(SUB);
		String cod_cons = rs.getString(COD_CONS);
		String num_doc = rs.getString(NUM_DOC);
		String dt_doc = rs.getString(DT_DOC);
		String dt_e_s = rs.getString(DT_E_S);
		String vl_doc = rs.getString(VL_DOC).replace('.', ',');
		String vl_desc = rs.getString(VL_DESC).replace('.', ',');
		String vl_forn = rs.getString(VL_FORN).replace('.', ',');
		String vl_serv_nt = rs.getString(VL_SERV_NT).replace('.', ',');
		String vl_terc = rs.getString(VL_TERC).replace('.', ',');
		String vl_da = rs.getString(VL_DA).replace('.', ',');
		String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
		String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
		String vl_bc_icms_st = rs.getString(VL_BC_ICMS_ST).replace('.', ',');
		String vl_icms_st = rs.getString(VL_ICMS_ST).replace('.', ',');
		String cod_inf = rs.getString(COD_INF);
		String vl_pis = rs.getString(VL_PIS).replace('.', ',');
		String vl_cofins = rs.getString(VL_COFINS).replace('.', ',');
		String tp_ligacao = rs.getString(TP_LIGACAO);
		String cod_grupo_tensao = rs.getString(COD_GRUPO_TENSAO);

		_C500 _C500 = new _C500();

		_C500.setReg(reg);
		_C500.setInd_oper(ind_oper);
		_C500.setInd_emit(ind_emit);
		_C500.setCod_part(cod_part);
		_C500.setCod_mod(cod_mod);
		_C500.setCod_sit(cod_sit);
		_C500.setSer(ser);
		_C500.setSub(sub);
		_C500.setCod_cons(cod_cons);
		_C500.setNum_doc(num_doc);
		_C500.setDt_doc(dt_doc);
		_C500.setDt_e_s(dt_e_s);
		_C500.setVl_doc(vl_doc);
		_C500.setVl_desc(vl_desc);
		_C500.setVl_forn(vl_forn);
		_C500.setVl_serv_nt(vl_serv_nt);
		_C500.setVl_terc(vl_terc);
		_C500.setVl_da(vl_da);
		_C500.setVl_bc_icms(vl_bc_icms);
		_C500.setVl_icms(vl_icms);
		_C500.setVl_bc_icms_st(vl_bc_icms_st);
		_C500.setVl_icms_st(vl_icms_st);
		_C500.setCod_inf(cod_inf);
		_C500.setVl_pis(vl_pis);
		_C500.setVl_cofins(vl_cofins);
		_C500.setTp_ligacao(tp_ligacao);
		_C500.setCod_grupo_tensao(cod_grupo_tensao);

		// _C500.set_C510(new CreateC510(connection, dataInicial,
		// dataFinal).get());
		_C500.set_C590(new CreateC590(connection, _C500.getNum_doc()).get());

		list.add(_C500);
	}
}