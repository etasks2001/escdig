package com.xsaturncont.facade.efd.layout10.blocoD;

import static com.xsaturncont.facade.efd.UtilEFD.CHV_CTE;
import static com.xsaturncont.facade.efd.UtilEFD.CHV_CTE_REF;
import static com.xsaturncont.facade.efd.UtilEFD.COD_CTA;
import static com.xsaturncont.facade.efd.UtilEFD.COD_INF;
import static com.xsaturncont.facade.efd.UtilEFD.COD_MOD;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.COD_SIT;
import static com.xsaturncont.facade.efd.UtilEFD.DT_A_P;
import static com.xsaturncont.facade.efd.UtilEFD.DT_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.IND_EMIT;
import static com.xsaturncont.facade.efd.UtilEFD.IND_FRT;
import static com.xsaturncont.facade.efd.UtilEFD.IND_OPER;
import static com.xsaturncont.facade.efd.UtilEFD.NUM_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SER;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_D100_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SUB;
import static com.xsaturncont.facade.efd.UtilEFD.TP_CT_E;
import static com.xsaturncont.facade.efd.UtilEFD.VL_BC_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DESC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_DOC;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.VL_NT;
import static com.xsaturncont.facade.efd.UtilEFD.VL_SERV;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._D100;

public class CreateD100 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateD100(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_D100> get() throws SQLException {
		CallableStatement cs = connection.prepareCall(SQL_D100_ENTRADA);
		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);
		ResultSet rs = cs.executeQuery();

		List<_D100> list = new ArrayList<_D100>();
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
			String chv_cte = rs.getString(CHV_CTE);
			String dt_doc = rs.getString(DT_DOC);
			String dt_a_p = rs.getString(DT_A_P);
			String tp_ct_e = rs.getString(TP_CT_E);
			String chv_cte_ref = rs.getString(CHV_CTE_REF);
			String vl_doc = rs.getString(VL_DOC).replace('.', ',');
			String vl_desc = rs.getString(VL_DESC).replace('.', ',');
			String ind_frt = rs.getString(IND_FRT);
			String vl_serv = rs.getString(VL_SERV).replace('.', ',');
			String vl_bc_icms = rs.getString(VL_BC_ICMS).replace('.', ',');
			String vl_icms = rs.getString(VL_ICMS).replace('.', ',');
			String vl_nt = rs.getString(VL_NT).replace('.', ',');
			String cod_inf = rs.getString(COD_INF);
			String cod_cta = rs.getString(COD_CTA);

			_D100 _D100 = new _D100();

			_D100.setReg(reg);
			_D100.setInd_oper(ind_oper);
			_D100.setInd_emit(ind_emit);
			_D100.setCod_part(cod_part);
			_D100.setCod_mod(cod_mod);
			_D100.setCod_sit(cod_sit);
			_D100.setSer(ser);
			_D100.setSub(sub);
			_D100.setNum_doc(num_doc);
			_D100.setChv_cte(chv_cte);
			_D100.setDt_doc(dt_doc);
			_D100.setDt_a_p(dt_a_p);
			_D100.setTp_ct_e(tp_ct_e);
			_D100.setChv_cte_ref(chv_cte_ref);
			_D100.setVl_doc(vl_doc);
			_D100.setVl_desc(vl_desc);
			_D100.setInd_frt(ind_frt);
			_D100.setVl_serv(vl_serv);
			_D100.setVl_bc_icms(vl_bc_icms);
			_D100.setVl_icms(vl_icms);
			_D100.setVl_nt(vl_nt);
			_D100.setCod_inf(cod_inf);
			_D100.setCod_cta(cod_cta);

			// _D100.set_D101(new CreateD101().get());
			// _D100.set_D110(new CreateD110().get());
			// _D100.set_D130(new CreateD130().get());
			// _D100.set_D140(new CreateD140().get());
			// _D100.set_D150(new CreateD150().get());
			// _D100.set_D160(new CreateD160().get());
			// _D100.set_D170(new CreateD170().get());
			// _D100.set_D180(new CreateD180().get());
			_D100.set_D190(new CreateD190(connection, _D100.getNum_doc()).get());
			// _D100.set_D195(new CreateD195().get());

			list.add(_D100);
		}

		close(cs, rs);
		return list;
	}
}