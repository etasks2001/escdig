package com.xsaturncont.facade.efd.layout10;

import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_COM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.BLOCO_SEM_DADOS_INFORMADOS;
import static com.xsaturncont.facade.efd.UtilEFD.RECORDS;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import com.xsaturncont.engine.BuildTextFile;
import com.xsaturncont.engine.CounterFields;
import com.xsaturncont.facade.efd.layout10.bloco0.Create0000;
import com.xsaturncont.facade.efd.layout10.bloco9.Create9900;
import com.xsaturncont.facade.efd.layout10.bloco9.Create9990;
import com.xsaturncont.facade.efd.layout10.bloco9.Create9999;
import com.xsaturncont.layoutefd10._0000;
import com.xsaturncont.layoutefd10._0001;
import com.xsaturncont.layoutefd10._0990;
import com.xsaturncont.layoutefd10._1001;
import com.xsaturncont.layoutefd10._1990;
import com.xsaturncont.layoutefd10._9001;
import com.xsaturncont.layoutefd10._9900;
import com.xsaturncont.layoutefd10._C001;
import com.xsaturncont.layoutefd10._C990;
import com.xsaturncont.layoutefd10._D001;
import com.xsaturncont.layoutefd10._D990;
import com.xsaturncont.layoutefd10._E001;
import com.xsaturncont.layoutefd10._E990;
import com.xsaturncont.layoutefd10._G001;
import com.xsaturncont.layoutefd10._G990;
import com.xsaturncont.layoutefd10._H001;
import com.xsaturncont.layoutefd10._H990;
import com.xsaturncont.layoutefd10._K001;
import com.xsaturncont.layoutefd10._K990;
import com.xsaturncont.layoutefd10._Raiz;

public class FacadeLayout10 {

	private Connection connection;

	private Timestamp dataInicial;

	private Timestamp dataFinal;

	private boolean comInventario;

	public FacadeLayout10(Connection connection, Timestamp dataInicial, Timestamp dataFinal, boolean comInventario) {
		this.connection = connection;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.comInventario = comInventario;
	}

	public void build() throws Exception {

		_Raiz _Raiz = new _Raiz();
		_Raiz.set_0000(new Create0000(connection, dataInicial, dataFinal, comInventario).get());
		_Raiz.set_9999(new Create9999(new ArrayList<_9900>()).get());

		/*---------------------------------------------------------------------------------*/
		/*---------------------------------------------------------------------------------*/
		setTotals(_Raiz);
		/*---------------------------------------------------------------------------------*/
		/*---------------------------------------------------------------------------------*/
		BuildTextFile<_Raiz> buildTextFile = new BuildTextFile<_Raiz>(_Raiz);
		buildTextFile.build();

		// System.out.println(buildTextFile.getStringFields());
		FileOutputStream fout = new FileOutputStream("" + new SimpleDateFormat("MM-yyyy").format(dataInicial) + ".txt", false);
		OutputStreamWriter osw = new OutputStreamWriter(fout, "UTF-8");
		String stringFields = buildTextFile.getStringFields();
		osw.write(stringFields, 0, stringFields.length());
		osw.flush();
		fout.flush();
		fout.close();

	}

	private int getTotalBloco(String bloco, Map<String, Integer> recordTotal) {
		int total = 0;
		for (Entry<String, Integer> e : recordTotal.entrySet()) {
			if (e.getKey().startsWith(bloco)) {
				total += e.getValue();
			}
		}
		return total;
	}

	private void setTotals(_Raiz _Raiz) throws IllegalArgumentException, IllegalAccessException {
		CounterFields<_Raiz> counterFields = new CounterFields<>(_Raiz);
		counterFields.build();

		Map<String, Integer> recordTotal = counterFields.getRecordTotal_EFD();

		int total_0 = getTotalBloco("_0", recordTotal);
		int total_C = getTotalBloco("_C", recordTotal);
		int total_D = getTotalBloco("_D", recordTotal);
		int total_E = getTotalBloco("_E", recordTotal);
		int total_G = getTotalBloco("_G", recordTotal);
		int total_H = getTotalBloco("_H", recordTotal);
		int total_K = getTotalBloco("_K", recordTotal);
		int total_1 = getTotalBloco("_1", recordTotal);

		_0000 _0000 = _Raiz.get_0000();

		_0001 _0001 = _0000.get_0001();
		_C001 _C001 = _0000.get_C001();
		_D001 _D001 = _0000.get_D001();
		_E001 _E001 = _0000.get_E001();
		_G001 _G001 = _0000.get_G001();
		_H001 _H001 = _0000.get_H001();
		_K001 _K001 = _0000.get_K001();
		_1001 _1001 = _0000.get_1001();
		_9001 _9001 = _0000.get_9001();

		_0990 _0990 = _0000.get_0990();
		_C990 _C990 = _0000.get_C990();
		_D990 _D990 = _0000.get_D990();
		_E990 _E990 = _0000.get_E990();
		_G990 _G990 = _0000.get_G990();
		_H990 _H990 = _0000.get_H990();
		_K990 _K990 = _0000.get_K990();
		_1990 _1990 = _0000.get_1990();

		_0001.setInd_mov(total_0 > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_C001.setInd_mov(total_C > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_D001.setInd_mov(total_D > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_E001.setInd_mov(total_E > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_G001.setInd_mov(total_G > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_H001.setInd_mov(total_H > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_K001.setInd_mov(total_K > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);
		_1001.setInd_mov(total_1 > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);

		_0990.setQtd_lin_0("" + total_0);
		_C990.setQtd_lin_c("" + total_C);
		_D990.setQtd_lin_d("" + total_D);
		_E990.setQtd_lin_e("" + total_E);
		_G990.setQtd_lin_g("" + total_G);
		_H990.setQtd_lin_h("" + total_H);
		_K990.setQtd_lin_k("" + total_K);
		_1990.setQtd_lin_1("" + total_1);

		// ================================================================================================
		_9001.set_9900(new Create9900(recordTotal, RECORDS).get());

		int qtd_lin_9 = getTotalBloco("_9", recordTotal) + _9001.get_9900().size();
		_0000.set_9990(new Create9990(qtd_lin_9).get());
		_9001.setInd_mov(qtd_lin_9 > 2 ? BLOCO_COM_DADOS_INFORMADOS : BLOCO_SEM_DADOS_INFORMADOS);

		// int qtd_lin = qtd_lin(_9001.get_9900());
		// _Raiz.set_9999(new Create9999(qtd_lin + 2).get());
		_Raiz.set_9999(new Create9999(_9001.get_9900()).get());

	}
}