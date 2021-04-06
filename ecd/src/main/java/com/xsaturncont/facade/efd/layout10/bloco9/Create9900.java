package com.xsaturncont.facade.efd.layout10.bloco9;

import static com.xsaturncont.facade.efd.UtilEFD.UNDERSCORE;
import static com.xsaturncont.facade.efd.UtilEFD._1;
import static com.xsaturncont.facade.efd.UtilEFD.x9900;
import static com.xsaturncont.facade.efd.UtilEFD.x9999;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.xsaturncont.facade.efd.UtilEFD;
import com.xsaturncont.layoutefd10._9900;

public class Create9900 {

	private Map<String, Integer> recordTotal;

	private String[] records;

	public Create9900(Map<String, Integer> recordTotal, String[] records) {
		this.recordTotal = recordTotal;
		this.records = records;
	}

	public List<_9900> get() {

		List<_9900> list = new ArrayList<_9900>();

		for (String record : records) {
			String key = UNDERSCORE.concat(record);

			if (recordTotal.containsKey(key)) {
				String reg_blc = record;
				int qtd_reg_blc = recordTotal.get(key);

				_9900 _9900 = create9900(reg_blc, Integer.toString(qtd_reg_blc));
				list.add(_9900);
			}
		}

		_9900 _9900 = create9900(x9999, _1);
		list.add(_9900);

		_9900 = create9900(UtilEFD.x9990, _1);
		list.add(_9900);

		_9900 = create9900(x9900, Integer.toString((list.size() + 1)));
		list.add(_9900);

		return list;
	}

	private _9900 create9900(String reg_blc, String qtd_reg_blc) {
		_9900 _9900 = new _9900();

		_9900.setReg(x9900);
		_9900.setReg_blc(reg_blc);
		_9900.setQtd_reg_blc(qtd_reg_blc);
		return _9900;
	}
}