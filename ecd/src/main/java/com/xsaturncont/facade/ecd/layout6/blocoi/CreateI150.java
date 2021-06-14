package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.xsaturncont.layout6ecd._I150;
import com.xsaturncont.util.Util;

public class CreateI150 {

    private static final String DD_M_MYYYY = "ddMMyyyy";

    private Connection connection;

    private String codigoEmpresa;

    public CreateI150(Connection connection, String codigoEmpresa) {
	this.connection = connection;
	this.codigoEmpresa = codigoEmpresa;
    }

    public List<_I150> get() throws ParseException, SQLException {
	List<_I150> listI150 = new ArrayList<_I150>();
	Map<String, Double[]> valorMovimentoMensal = new CreateI150ValorMovimentoMensal().getValorMovimentoMensal(this.connection, this.codigoEmpresa);
	Map<String, Double> saldoInicial = new CreateI150SaldoInicial().getSaldoInicial(this.connection, this.codigoEmpresa);
	Map<String, Double[]> saldosIniciais = new CreateI150CalcularSaldoMensal().calcularSaldoMensal(saldoInicial, valorMovimentoMensal);

	for (int mes = 0; mes < 12; mes++) {
	    Calendar dataInicial = Calendar.getInstance();
	    dataInicial.set(2020, mes, 1);

	    Calendar dataFinal = Util.getUltimoDiaDosMes(dataInicial);
	    String dt_ini = new SimpleDateFormat(DD_M_MYYYY).format(dataInicial.getTime());
	    String dt_fin = new SimpleDateFormat(DD_M_MYYYY).format(dataFinal.getTime());

	    _I150 _I150 = new _I150();

	    _I150.setReg("I150");
	    _I150.setDt_ini(dt_ini);
	    _I150.setDt_fin(dt_fin);

	    _I150.set_I155(new CreateI155(this.connection, this.codigoEmpresa, "" + (mes + 1), saldosIniciais).get());

	    listI150.add(_I150);

	}
	return listI150;
    }
}