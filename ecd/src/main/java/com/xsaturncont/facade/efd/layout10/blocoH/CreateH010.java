package com.xsaturncont.facade.efd.layout10.blocoH;

import static com.xsaturncont.facade.efd.UtilEFD.COD_CTA;
import static com.xsaturncont.facade.efd.UtilEFD.COD_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.COD_PART;
import static com.xsaturncont.facade.efd.UtilEFD.IND_PROP;
import static com.xsaturncont.facade.efd.UtilEFD.QTD;
import static com.xsaturncont.facade.efd.UtilEFD.REG;
import static com.xsaturncont.facade.efd.UtilEFD.SQL_H010;
import static com.xsaturncont.facade.efd.UtilEFD.TXT_COMPL;
import static com.xsaturncont.facade.efd.UtilEFD.UNID;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ITEM;
import static com.xsaturncont.facade.efd.UtilEFD.VL_ITEM_IR;
import static com.xsaturncont.facade.efd.UtilEFD.VL_UNIT;
import static com.xsaturncont.facade.efd.UtilEFD.close;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layoutefd10._H010;

public class CreateH010 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	public CreateH010(Connection connection, Timestamp dataInicial, Timestamp dataFinal) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public List<_H010> get() throws SQLException {
		List<_H010> list = new ArrayList<_H010>();

		CallableStatement cs = connection.prepareCall(SQL_H010);

		cs.setTimestamp(1, dataInicial);
		cs.setTimestamp(2, dataFinal);

		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			String reg = rs.getString(REG);
			String cod_item = rs.getString(COD_ITEM);
			String unid = rs.getString(UNID);
			String qtd = rs.getString(QTD);
			String vl_unit = rs.getString(VL_UNIT).replace('.', ',');
			String vl_item = rs.getString(VL_ITEM).replace('.', ',');
			String ind_prop = rs.getString(IND_PROP);
			String cod_part = rs.getString(COD_PART);
			String txt_compl = rs.getString(TXT_COMPL);
			String cod_cta = rs.getString(COD_CTA);
			String vl_item_ir = rs.getString(VL_ITEM_IR);

			_H010 _H010 = new _H010();

			_H010.setReg(reg);
			_H010.setCod_item(cod_item);
			_H010.setUnid(unid);
			_H010.setQtd(qtd);
			_H010.setVl_unit(vl_unit);
			_H010.setVl_item(vl_item);
			_H010.setInd_prop(ind_prop);
			_H010.setCod_part(cod_part);
			_H010.setTxt_compl(txt_compl);
			_H010.setCod_cta(cod_cta);
			_H010.setVl_item_ir(vl_item_ir);

			list.add(_H010);

		}
		close(cs, rs);
		return list;
	}
}