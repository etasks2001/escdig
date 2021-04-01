package ecd.dados.ecd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ecd.model.DRELinha;
import ecd.source.SourceEcd;

public class DREEmpresaLinha {

    private static final String sql = "select sk,ano,codigoempresa,nu_ordem,cod_agl,ind_cod_agl,nivel_agl,cod_agl_sup,descr_cod_agl,vl_cta_ini,ind_dc_cta_ini,vl_cta_fin,ind_dc_cta_fin,ind_grp_dre from J150 where codigoempresa = ? and ano = ? order by nu_ordem";

    public List<DRELinha> get(final int codigoempresa_, int ano_) throws IOException {
	try {

	    SourceEcd source = new SourceEcd();
	    Connection connection = source.getConnection();

	    PreparedStatement ps = connection.prepareStatement(sql);
	    ps.setInt(1, codigoempresa_);
	    ps.setInt(2, ano_);

	    ResultSet rs = ps.executeQuery();
	    List<DRELinha> list = new ArrayList<DRELinha>();

	    while (rs.next()) {

		int sk = rs.getInt("sk");
		int ano = rs.getInt("ano");
		int codigoempresa = rs.getInt("codigoempresa");
		int nu_ordem = rs.getInt("nu_ordem");
		String cod_agl = rs.getString("cod_agl");
		String ind_cod_agl = rs.getString("ind_cod_agl");
		int nivel_agl = rs.getInt("nivel_agl");
		String cod_agl_sup = rs.getString("cod_agl_sup");
		String descr_cod_agl = rs.getString("descr_cod_agl");
		double vl_cta_ini = rs.getDouble("vl_cta_ini");
		String ind_dc_cta_ini = rs.getString("ind_dc_cta_ini");
		double vl_cta_fin = rs.getDouble("vl_cta_fin");
		String ind_dc_cta_fin = rs.getString("ind_dc_cta_fin");
		String ind_grp_dre = rs.getString("ind_grp_dre");

		DRELinha balanco = new DRELinha(sk, ano, codigoempresa, nu_ordem, cod_agl, ind_cod_agl, nivel_agl, cod_agl_sup, descr_cod_agl, vl_cta_ini, ind_dc_cta_ini, vl_cta_fin, ind_dc_cta_fin,
			ind_grp_dre);

		list.add(balanco);
	    }

	    rs.close();
	    ps.close();

	    connection.close();

	    return new ArrayList<DRELinha>(list);
	} catch (Exception e) {
	    throw new IOException(e);
	}
    }

}
