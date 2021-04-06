package com.xsaturncont.facade.ecd.layout6.blocoj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout6ecd._J210;
import com.xsaturncont.util.Util;

public class CreateJ210 {

	private String codigoEmpresa;
	private Connection connEcd;

	public CreateJ210(String codigoEmpresa, Connection connEcd) {
		this.codigoEmpresa = codigoEmpresa;
		this.connEcd = connEcd;
	}

	public List<_J210> get() throws IOException {

		BuilderBlockList<_J210> builderBlock = new BuilderBlockList<_J210>();
		DecimalFormat format = new DecimalFormat("0.00");
		PreparedStatement ps;
		try {
			ps = this.connEcd.prepareStatement("select * from J210 where codigoempresa = " + this.codigoEmpresa
					+ " and ano = 19 order by nu_ordem");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				String ind_tip = rs.getString("ind_tip");
				String cod_agl = rs.getString("cod_agl");
				String descr_cod_agl = rs.getString("descr_cod_agl");
				double vl_cta_ini = rs.getDouble("vl_cta_ini");
				String ind_dc_cta_ini = rs.getString("ind_dc_cta_ini");
				double vl_cta_fin = rs.getDouble("vl_cta_fin");
				String ind_dc_cta_fin = rs.getString("ind_dc_cta_fin");
				String notas_exp_ref = "";

				_J210 _J210 = new _J210();

				_J210.setReg("J210");
				_J210.setInd_tip(ind_tip);
				_J210.setCod_agl(cod_agl);
				_J210.setDescr_cod_agl(Util.normalizeString(descr_cod_agl));
				_J210.setVl_cta_ini(format.format(vl_cta_ini));
				_J210.setInd_dc_cta_ini(ind_dc_cta_ini);
				_J210.setVl_cta_fin(format.format(vl_cta_fin));
				_J210.setInd_dc_cta_fin(ind_dc_cta_fin);
				_J210.setNotas_exp_ref(notas_exp_ref);

				_J210.set_J215(new CreateJ215(codigoEmpresa, cod_agl).get());

				builderBlock.add(_J210);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return builderBlock.getList();
	}
}