package com.xsaturncont.facade.ecd.layout5.blocoi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateI250AuxDia {
	public Map<Integer, List<I250Aux>> getPartidasPorDocumento(List<I250Aux> listI250Aux) {
		Map<Integer, List<I250Aux>> map = new HashMap<Integer, List<I250Aux>>();
		List<I250Aux> list = null;
		for (I250Aux i250Aux : listI250Aux) {
			Integer documento = Integer.parseInt(i250Aux.getDocumento());
			boolean contemDocumento = map.containsKey(documento);

			if (contemDocumento) {
				list = map.get(documento);
			} else {
				list = new ArrayList<I250Aux>();
				map.put(documento, list);
			}
			list.add(i250Aux);
		}
		return map;
	}
}