package com.xsaturncont.facade.efd;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.xsaturncont.facade.efd.layout10.FacadeLayout10;

public class Main {

	private static final String DD_MM_YYYY = "dd/MM/yyyy";

	public static void main(String[] args) throws Exception {
		SourceEFD source = new SourceEFD();
		Connection connection = source.getConnection();

		String dInicial = "01/07/2016";
		String dFinal = "31/07/2016";

		Timestamp dataInicial = new Timestamp(new SimpleDateFormat(DD_MM_YYYY).parse(dInicial).getTime());
		Timestamp dataFinal = new Timestamp(new SimpleDateFormat(DD_MM_YYYY).parse(dFinal).getTime());

		boolean comInventario = false;

		FacadeLayout10 facade = new FacadeLayout10(connection, dataInicial, dataFinal, comInventario);
		facade.build();
		connection.close();
	}
}