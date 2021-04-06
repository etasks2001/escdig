package com.xsaturncont.facade.ecd.layout4.blocoi;

import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layout4ecd._I250;
import com.xsaturncont.util.Util;

public class CreateI250 {

	private boolean encerramento = false;

	private List<I250Aux> partidas;

	public CreateI250(List<I250Aux> partidas) {
		this.partidas = partidas;
	}

	public List<_I250> get() {
		List<_I250> list = new ArrayList<_I250>();
		for (I250Aux aux : this.partidas) {
			_I250 _I250 = new _I250();
			if (aux.getConta().startsWith("6")) {
				encerramento = true;
			}
			_I250.setReg("I250");
			_I250.setCod_cta(Util.formatarConta(aux.getConta()));
			_I250.setCod_ccus(null);
			_I250.setVl_dc(aux.getValor().replace('.', ','));
			_I250.setInd_dc(aux.getNatureza());
			_I250.setNum_arq("LOTE: " + aux.getLote() + " - " + "DOCUMENTO: " + aux.getDocumento());
			_I250.setCod_hist_pad(null);
			_I250.setHist(Util.normalizeString(aux.getHistorico()));
			_I250.setCod_part(null);

			list.add(_I250);
		}
		return list;
	}

	public boolean isEncerramento() {
		return encerramento;
	}
}