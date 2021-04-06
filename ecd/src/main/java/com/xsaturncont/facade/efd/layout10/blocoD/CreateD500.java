package com.xsaturncont.facade.efd.layout10.blocoD;

import static com.xsaturncont.facade.efd.UtilEFD.COD_CTA;
import static com.xsaturncont.facade.efd.UtilEFD.COD_INF;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MOD;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.COD_SIT;
import static com.xsaturncont.facade.efd.UtilEFD.DT_A_P;
import static com.xsaturncont.facade.efd.UtilEFD.DT_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.IND_EMIT;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER;
import static com.xsaturncont.facade.efd.UtilEFD.NUM_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SER;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_D500_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SUB;
import static com.xsaturncont.facade.efd.UtilEFD.TP_ASSINANTE;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_COFINS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DA;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_PIS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_SERV;
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

import com.xsaturncont.layoutefd10._D500;

public class CreateD500 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateD500(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_D500> get() throws SQLException {
		List<_D500> list = new ArrayList<_D500>();
		CallableStatement cs = connection.prepareCall(SQL_D500_ENTRADA);
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {

			String reg = rs.getString(REG);
			String ind_oper = rs.getString(IND_OPER);
			String ind_emit = rs.getString(IND_EMIT);
			String cod_part = rs.getString(COD_PART);
			String cod_mod = rs.getString(COD_MOD);
			String cod_sit = rs.getString(COD_SIT);
			String ser = rs.getString(SER);
			String sub = rs.getString(SUB);
			String num_doc = rs.getString(NUM_DOC);
			String dt_doc = rs.getString(DT_DOC);
			String dt_a_p = rs.getString(DT_A_P);
			String vl_doc = rs.getString(VL_DOC).replace('.', ',');
			String vl_desc = rs.getString(VL_DESC).replace('.', ',');
			String vl_serv = rs.getString(VL_SERV).replace('.', ',');
			String vl_serv_nt = rs.getString(VL_SERV_NT).replace('.', ',');
			String vl_terc = rs.getString(VL_TERC).replace('.', ',');
			String vl_da = rs.getString(VL_DA).replace('.', ',');
			String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
			String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
			String cod_inf = rs.getString(COD_INF);
			String vl_pis = rs.getString(VL_PIS).replace('.', ',');
			String vl_cofins = rs.getString(VL_COFINS).replace('.', ',');
			String cod_cta = rs.getString(COD_CTA);
			String tp_assinante = rs.getString(TP_ASSINANTE);

			_D500 _D500 = new _D500();

			_D500.setReg(reg);
			_D500.setInd_oper(ind_oper);
			_D500.setInd_emit(ind_emit);
			_D500.setCod_part(cod_part);
			_D500.setCod_mod(cod_mod);
			_D500.setCod_sit(cod_sit);
			_D500.setSer(ser);
			_D500.setSub(sub);
			_D500.setNum_doc(num_doc);
			_D500.setDt_doc(dt_doc);
			_D500.setDt_a_p(dt_a_p);
			_D500.setVl_doc(vl_doc);
			_D500.setVl_desc(vl_desc);
			_D500.setVl_serv(vl_serv);
			_D500.setVl_serv_nt(vl_serv_nt);
			_D500.setVl_terc(vl_terc);
			_D500.setVl_da(vl_da);
			_D500.setVl_bc_icms(vl_bc_icms);
			_D500.setVl_icms(vl_icms);
			_D500.setCod_inf(cod_inf);
			_D500.setVl_pis(vl_pis);
			_D500.setVl_cofins(vl_cofins);
			_D500.setCod_cta(cod_cta);
			_D500.setTp_assinante(tp_assinante);

			// _D500.set_D510(new CreateD510(connection, dataInicial,
			// dataFinal).get());
			// _D500.set_D530(new CreateD530().get());
			_D500.set_D590(new CreateD590(connection, _D500.getNum_doc()).get());

			list.add(_D500);

		}

		close(cs, rs);
		return list;
	}
}