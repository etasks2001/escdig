package com.xsaturncont.facade.ecd.layout5.bloco9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout5ecd._9900;

public class Create9900 {

	private Map<String, Integer> recordTotal;

	public Create9900(Map<String, Integer> recordTotal) {
		this.recordTotal = recordTotal;
	}

	public List<_9900> get() {
		Set<String> keySet = this.recordTotal.keySet();
		String[] keys = keySet.toArray(new String[keySet.size()]);
		Arrays.sort(keys);

		BuilderBlockList<_9900> builderList = new BuilderBlockList<_9900>();

		for (String key : keys) {
			if (!key.startsWith("_9")) {
				Integer total = this.recordTotal.get(key);
				_9900 _9900 = new _9900();
				_9900.setReg("9900");
				_9900.setReg_blc(key.replace("_", ""));
				_9900.setQtd_reg_blc("" + total);

				builderList.add(_9900);
			}
		}

		for (String key : keys) {
			if (key.startsWith("_9")) {
				Integer total = this.recordTotal.get(key);
				_9900 _9900 = new _9900();
				_9900.setReg("9900");
				_9900.setReg_blc(key.replace("_", ""));
				_9900.setQtd_reg_blc("" + total);

				builderList.add(_9900);
			}
		}

		List<_9900> list = builderList.getList();
		return list;
	}
}