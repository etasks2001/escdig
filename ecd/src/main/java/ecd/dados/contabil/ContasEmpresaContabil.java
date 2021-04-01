package ecd.dados.contabil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import ecd.model.ContaEmpresa;
import ecd.source.SourceContabil;
import ecd.util.Util;

public class ContasEmpresaContabil {

    private static final String sql = "select conta, tipoconta, descricao from planoconta where codigoempresa = %d and ano = %d order by conta";

    public Map<String, ContaEmpresa> getContas(final int codigoempresa_, final int ano_) throws IOException {
	try {

	    SourceContabil source = new SourceContabil();
	    Connection connection = source.getConnection();

	    PreparedStatement ps = connection.prepareStatement(String.format(sql, codigoempresa_, ano_).toString());

	    ResultSet rs = ps.executeQuery();
	    Map<String, ContaEmpresa> contasMap = new HashMap<String, ContaEmpresa>();

	    while (rs.next()) {

		String conta = rs.getString("conta");
		String tipoconta = rs.getString("tipoconta");
		String descricao = rs.getString("descricao");

		descricao = Util.normalizeString(descricao);
		contasMap.put(conta, new ContaEmpresa(conta, tipoconta, descricao));

	    }

	    rs.close();
	    ps.close();

	    connection.close();
	    return new HashMap<String, ContaEmpresa>(contasMap);
	} catch (Exception e) {
	    throw new IOException(e);
	}
    }
}
