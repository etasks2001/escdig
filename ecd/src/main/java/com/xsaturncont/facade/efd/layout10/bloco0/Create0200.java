package com.xsaturncont.facade.efd.layout10.bloco0;

import static com.xsaturncont.facade.efd.UtilEFD.ALIQ_ICMS;
import static com.xsaturncont.facade.efd.UtilEFD.COD_ANT_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.COD_BARRA;
import static com.xsaturncont.facade.efd.UtilEFD.COD_GEN;
import static com.xsaturncont.facade.efd.UtilEFD.COD_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.COD_LST;
import static com.xsaturncont.facade.efd.UtilEFD.COD_NCM;
import static com.xsaturncont.facade.efd.UtilEFD.DESCR_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.EX_IPI;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0200_ENTRADA;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_0200_INVENTARIO;
import static com.xsaturncont.facade.efd.UtilEFD.TIPO_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.UNID_INV;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xsaturncont.layoutefd10._0200;

public class Create0200 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private boolean comInventario;

	public Create0200(Connection connection, Timestamp dataInicial, Timestamp dataFinal, boolean comInventario) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.comInventario = comInventario;
	}

	public List<_0200> get() throws SQLException {

		Map<String, _0200> map = new HashMap<String, _0200>();

		if (comInventario) {
			getProduto(map, SQL_0200_INVENTARIO);
		}
		getProduto(map, SQL_0200_ENTRADA);

		List<_0200> list = new ArrayList<_0200>(map.values());

		return list;
	}

	private void getProduto(Map<String, _0200> map, String sql) throws SQLException {
		CallableStatement cs = connection.prepareCall(sql);

		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);

		ResultSet rs = cs.executeQuery();

		create0200(map, rs);

		close(cs, rs);
	}

	private void create0200(Map<String, _0200> map, ResultSet rs) throws SQLException {
		while (rs.next()) {
			String reg = rs.getString(REG);
			String cod_item = rs.getString(COD_ITEM);
			String descr_item = rs.getString(DESCR_ITEM);
			String cod_barra = rs.getString(COD_BARRA);
			String cod_ant_item = rs.getString(COD_ANT_ITEM);
			String unid_inv = rs.getString(UNID_INV);
			String tipo_item = rs.getString(TIPO_ITEM);
			String cod_ncm = rs.getString(COD_NCM);
			String ex_ipi = rs.getString(EX_IPI);
			String cod_gen = rs.getString(COD_GEN);
			String cod_lst = rs.getString(COD_LST);
			String aliq_icms = rs.getString(ALIQ_ICMS);
			// String cest = rs.getString(CEST);

			boolean containsKey = map.containsKey(cod_item);

			if (!containsKey) {
				_0200 _0200 = new _0200();
				_0200.setReg(reg);
				_0200.setCod_item(cod_item);
				_0200.setDescr_item(descr_item);
				_0200.setCod_barra(cod_barra);
				_0200.setCod_ant_item(cod_ant_item);
				_0200.setUnid_inv(unid_inv);
				_0200.setTipo_item(tipo_item);
				_0200.setCod_ncm(cod_ncm);
				_0200.setEx_ipi(ex_ipi);
				_0200.setCod_gen(cod_gen);
				_0200.setCod_lst(cod_lst);
				_0200.setAliq_icms(aliq_icms);
				// _0200.setCest(cest);

				// _0200.set_0205(null);
				// _0200.set_0206(null);
				// _0200.set_0210(null);
				// _0200.set_0220(null);

				map.put(cod_item, _0200);
			}
		}
	}
}