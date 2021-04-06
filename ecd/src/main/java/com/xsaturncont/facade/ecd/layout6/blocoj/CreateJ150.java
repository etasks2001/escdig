package com.xsaturncont.facade.ecd.layout6.blocoj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout6ecd._J150;
import com.xsaturncont.util.Util;

public class CreateJ150 {

	private String codigoEmpresa;
	private Connection connEcd;

	public CreateJ150(String codigoEmpresa, Connection connEcd) {
		this.codigoEmpresa = codigoEmpresa;
		this.connEcd = connEcd;
	}

	public List<_J150> get() throws IOException {

		BuilderBlockList<_J150> builderBlock = new BuilderBlockList<_J150>();

		DecimalFormat format = new DecimalFormat("0.00");
		try {
			PreparedStatement ps = this.connEcd.prepareStatement("select * from J150 where codigoempresa = "
					+ this.codigoEmpresa + "  and ano=19 order by nu_ordem ");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String nu_ordem = rs.getString("nu_ordem");
				String cod_agl = rs.getString("cod_agl");
				String ind_cod_agl = rs.getString("ind_cod_agl");
				String nivel_agl = rs.getString("nivel_agl");
				String cod_agl_sup = rs.getString("cod_agl_sup");
				String descr_cod_agl = rs.getString("descr_cod_agl");
				double vl_cta_ini = rs.getDouble("vl_cta_ini");
				String ind_dc_cta_ini = rs.getString("ind_dc_cta_ini");
				double vl_cta_fin = rs.getDouble("vl_cta_fin");
				String ind_dc_cta_fin = rs.getString("ind_dc_cta_fin");
				String ind_grp_dre = rs.getString("ind_grp_dre");
				String nota_exp_ref = "";

				_J150 _J150 = new _J150();

				_J150.setReg("J150");

				_J150.setNu_ordem(nu_ordem);
				_J150.setCod_agl(cod_agl);
				_J150.setInd_cod_agl(ind_cod_agl);
				_J150.setNivel_agl(nivel_agl);
				_J150.setCod_agl_sup(cod_agl_sup);
				_J150.setDescr_cod_agl(Util.normalizeString(descr_cod_agl));
				_J150.setVl_cta_ini(format.format(vl_cta_ini));
				_J150.setInd_dc_cta_ini(ind_dc_cta_ini);
				_J150.setVl_cta_fin(format.format(vl_cta_fin));
				_J150.setInd_dc_cta_fin(ind_dc_cta_fin);
				_J150.setInd_grp_dre(ind_grp_dre);
				_J150.setNota_exp_ref(nota_exp_ref);

				builderBlock.add(_J150);
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return builderBlock.getList();
	}
}