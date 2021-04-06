package com.xsaturncont.facade.ecd.layout4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;
import java.util.Map.Entry;

import com.xsaturncont.engine.BuildTextFile;
import com.xsaturncont.engine.CounterFields;
import com.xsaturncont.facade.ecd.layout4.bloco0.Create0000;
import com.xsaturncont.facade.ecd.layout4.bloco9.Create9900;
import com.xsaturncont.facade.ecd.layout4.bloco9.Create9999;
import com.xsaturncont.layout4ecd._9001;
import com.xsaturncont.layout4ecd._Raiz;
import com.xsaturncont.util.Util;

public class FacadeLayout4 {

	private Connection connection;

	private String codigoEmpresa;

	private String ano;

	public FacadeLayout4(Connection connection, String codigoEmpresa, String ano) {
		this.connection = connection;
		this.codigoEmpresa = codigoEmpresa;
		this.ano = ano;
	}

	public void build() throws SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ParseException, IOException, NoSuchAlgorithmException {

		_Raiz _Raiz = new _Raiz();
		_Raiz.set_0000(new Create0000(connection, codigoEmpresa).get());
		_Raiz.set_9999(new Create9999().get());

		/*---------------------------------------------------------------------------------*/
		/*------------------------------------------------------------------------------*/
		CounterFields<_Raiz> counterFields = new CounterFields<>(_Raiz);
		counterFields.build();
		// System.out.println(counterFields.toString());

		_9001 _9001 = _Raiz.get_0000().get_9001();
		Map<String, Integer> recordTotal = counterFields.getRecordTotal();
		_9001.set_9900(new Create9900(recordTotal).get());

		_Raiz.get_0000().get_0990().setQtd_lin_0(getTotalBloco("_0", recordTotal));
		_Raiz.get_0000().get_I990().setQtd_lin_i(getTotalBloco("_I", recordTotal));
		_Raiz.get_0000().get_J990().setQtd_lin_j(getTotalBloco("_J", recordTotal));
		_Raiz.get_0000().get_9990().setQtd_lin_9(getTotalBloco("_9", recordTotal));

		String totalLinhas = getTotalBloco("_", recordTotal);
		_Raiz.get_9999().setQtd_lin(totalLinhas);
		_Raiz.get_0000().get_I001().get_I010().get_I030().setQtd_lin(totalLinhas);
		_Raiz.get_0000().get_J001().get_J900().setQtd_lin(totalLinhas);

		/*--------------------------------------------------------*/
		/*--------------------------------------------------------*/

		BuildTextFile<_Raiz> buildTextFile = new BuildTextFile<_Raiz>(_Raiz);
		buildTextFile.build();

		// System.out.println(buildTextFile.getStringFields());
		FileOutputStream fout = new FileOutputStream(Util.getNomeArquivo(this.codigoEmpresa, ano), false);
		OutputStreamWriter osw = new OutputStreamWriter(fout, "UTF-8");
		String stringFields = buildTextFile.getStringFields();
		osw.write(stringFields, 0, stringFields.length());
		osw.flush();
		fout.flush();
		fout.close();
	}

	private String getTotalBloco(String bloco, Map<String, Integer> recordTotal) {
		int total = 0;
		for (Entry<String, Integer> e : recordTotal.entrySet()) {
			if (e.getKey().startsWith(bloco)) {
				total += e.getValue();
			}
		}
		return "" + total;
	}
}