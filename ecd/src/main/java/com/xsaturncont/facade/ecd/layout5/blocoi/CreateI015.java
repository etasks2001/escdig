package com.xsaturncont.facade.ecd.layout5.blocoi;

import java.util.List;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout5ecd._I015;

public class CreateI015 {

	public List<_I015> get() {
		BuilderBlockList<_I015> builderBlock = new BuilderBlockList<_I015>();

		builderBlock.add(this.createI015("1.1.02.01.0001"));
		builderBlock.add(this.createI015("4.1.01.01.0001"));

		return builderBlock.getList();
	}

	private _I015 createI015(String cod_cta_res) {
		_I015 _I015 = new _I015();
		_I015.setReg("I015");
		_I015.setCod_cta_res(cod_cta_res);
		return _I015;

	}
}
