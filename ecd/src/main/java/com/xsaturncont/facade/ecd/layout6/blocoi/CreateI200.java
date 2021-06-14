package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.xsaturncont.layout6ecd._I200;
import com.xsaturncont.util.Util;

public class CreateI200 {

    private Connection connection;

    private String codigoEmpresa;

    public CreateI200(Connection connection, String codigoEmpresa) {
	this.connection = connection;
	this.codigoEmpresa = codigoEmpresa;
    }

    public List<_I200> get() throws SQLException {

	int num_lcto = 1;

	List<_I200> list = new ArrayList<_I200>();
	for (int mes = 1; mes <= 12; mes++) {
	    PreparedStatement ps = connection.prepareStatement("select d.conta, d.dia, d.lote, d.documento, d.valor, d.natureza, d.historico from diario d where d.codigoempresa = "
		    + this.codigoEmpresa + " and d.ano = 20 and d.mes = " + mes + " order by d.dia, d.lote, d.documento, d.valor");

	    ResultSet rs = ps.executeQuery();
	    Map<Integer, List<I250Aux>> mapI250 = new CreateI250AuxMes().getI250Aux(rs);
	    ps.close();
	    rs.close();

	    Integer[] arrayDias = Util.getArray(mapI250);

	    for (Integer dia : arrayDias) {
		Map<Integer, List<I250Aux>> partidasPorDocumento = new CreateI250AuxDia().getPartidasPorDocumento(mapI250.get(dia));
		Integer[] arrayDocumentos = Util.getArray(partidasPorDocumento);

		for (Integer documento : arrayDocumentos) {
		    List<I250Aux> partidas = partidasPorDocumento.get(documento);

		    String vl_lcto = new CreateI200SomarLancamento().getSomar(partidas);

		    _I200 _I200 = new _I200();
		    CreateI250 createI250 = new CreateI250(partidas);

		    _I200.setReg("I200");
		    _I200.setNum_lcto("" + num_lcto);
		    _I200.setDt_lcto(Util.getCreateDate(2020, mes - 1, dia));
		    _I200.setVl_lcto(vl_lcto.replace('.', ','));

		    _I200.set_I250(createI250.get());
		    _I200.setInd_lcto((createI250.isEncerramento() ? "E" : "N"));

		    list.add(_I200);
		    num_lcto++;
		}
	    }
	}
	return list;
    }
}