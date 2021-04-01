package ecd.dados.ecd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ecd.model.ContaEcd;
import ecd.source.SourceEcd;

public class ContasEmpresaEcd {

    private static final String sql = "select sk, cod_nat, nivel, cod_cta, cod_cta_sup, cod_cta_ref, cod_agl from I050 where codigoempresa = %d and ano = %d order by cod_cta";

    public List<ContaEcd> getContas(final int codigoempresa_, int ano_) throws IOException {
	try {

	    SourceEcd source = new SourceEcd();
	    Connection connection = source.getConnection();

	    PreparedStatement ps = connection.prepareStatement(String.format(sql, codigoempresa_, ano_).toString());

	    ResultSet rs = ps.executeQuery();
	    List<ContaEcd> conta = new ArrayList<ContaEcd>();

	    while (rs.next()) {
		int sk = rs.getInt("sk");
		String cod_nat = rs.getString("cod_nat");
		String nivel = rs.getString("nivel");
		String cod_cta = rs.getString("cod_cta");
		String cod_cta_sup = rs.getString("cod_cta_sup");
		String cod_cta_ref = rs.getString("cod_cta_ref");
		String cod_agl = rs.getString("cod_agl");

		conta.add(new ContaEcd(sk, cod_nat, nivel, cod_cta, cod_cta_sup, cod_cta_ref, cod_agl));
	    }

	    rs.close();
	    ps.close();

	    connection.close();

	    return new ArrayList<ContaEcd>(conta);
	} catch (Exception e) {
	    throw new IOException(e);
	}
    }
}
