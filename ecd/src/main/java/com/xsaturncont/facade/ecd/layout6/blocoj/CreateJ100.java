package com.xsaturncont.facade.ecd.layout6.blocoj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout6ecd._J100;
import com.xsaturncont.util.Util;

public class CreateJ100 {

    private String codigoEmpresa;
    private Connection connEcd;

    public CreateJ100(String codigoEmpresa, Connection connEcd) {
	this.codigoEmpresa = codigoEmpresa;
	this.connEcd = connEcd;
    }

    public List<_J100> get() throws IOException {
	BuilderBlockList<_J100> builderBlock = new BuilderBlockList<_J100>();

	PreparedStatement ps = null;
	DecimalFormat formatDouble = new DecimalFormat("0.00");
	try {
	    ps = connEcd.prepareStatement("select * from J100 where codigoempresa = " + this.codigoEmpresa + " and ano = 20 order by  nu_ordem ");
	    ResultSet rs = ps.executeQuery();

	    while (rs.next()) {

		String cod_agl = rs.getString("cod_agl");
		String ind_cod_agl = rs.getString("ind_cod_agl");
		String nivel_agl = rs.getString("nivel_agl");
		String cod_agl_sup = rs.getString("cod_agl_sup");
		String ind_grp_bal = rs.getString("ind_grp_bal");
		String descr_cod_agl = rs.getString("descr_cod_agl");
		double vl_cta_ini = rs.getDouble("vl_cta_ini");
		String ind_dc_bal_ini = rs.getString("ind_dc_cta_ini");
		double vl_cta_fin = rs.getDouble("vl_cta_fin");
		String ind_dc_cta_fin = rs.getString("ind_dc_cta_fin");
		String nota_exp_ref = "";

		_J100 _J100 = new _J100();

		_J100.setReg("J100");
		_J100.setCod_agl(cod_agl);
		_J100.setInd_cod_agl(ind_cod_agl);
		_J100.setNivel_agl(nivel_agl);
		_J100.setCod_agl_sup(cod_agl_sup);
		_J100.setInd_grp_bal(ind_grp_bal);
		_J100.setDescr_cod_agl(Util.normalizeString(descr_cod_agl));
		_J100.setVl_cta_ini(formatDouble.format(vl_cta_ini));
		_J100.setInd_dc_cta_ini(ind_dc_bal_ini);
		_J100.setVl_cta_fin(formatDouble.format(vl_cta_fin));
		_J100.setInd_dc_cta_fin(ind_dc_cta_fin);
		_J100.setNota_exp_ref(nota_exp_ref);

		builderBlock.add(_J100);

	    }
	    rs.close();
	    ps.close();

	} catch (SQLException e) {
	    e.printStackTrace();
	}

	return builderBlock.getList();
    }
}
