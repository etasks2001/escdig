package com.xsaturncont.facade.ecd.layout5.blocoi;

import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layout5ecd._I200;
import com.xsaturncont.layout5ecd._I350;
import com.xsaturncont.layout5ecd._I355;

public class CreateI350 {

	private List<_I200> listI200;

	public CreateI350(List<_I200> listI200) {
		this.listI200 = listI200;
	}

	public List<_I350> get() {
		List<_I350> list = new ArrayList<_I350>();
		for (_I200 _I200 : this.listI200) {
			if (_I200.getInd_lcto().equals("E")) {
				_I350 _I350 = new _I350();
				_I350.setReg("I350");
				_I350.setDt_res(_I200.getDt_lcto());

				List<_I355> _I355 = new CreateI355(_I200.get_I250()).get();
				if (_I355.size() > 0) {
					_I350.set_I355(_I355);
					list.add(_I350);
				}
			}
		}
		System.out.println("i350:" + list.size());
		return list;
	}
}