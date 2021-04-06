package com.xsaturncont.facade.ecd.layout5.blocoj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layout5ecd._J005;

public class CreateJ005 {

	private String codigoEmpresa;

	public CreateJ005(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_J005> get() throws IOException {
		List<_J005> list = new ArrayList<_J005>();

		_J005 _J005 = new _J005();
		_J005.setReg("J005");
		_J005.setDt_ini("01012016");
		_J005.setDt_fin("31122016");
		_J005.setId_dem("1");
		_J005.setCab_dem(null);
		_J005.set_J100(new CreateJ100(this.codigoEmpresa).get());
		_J005.set_J210(new CreateJ210(this.codigoEmpresa).get());
		_J005.set_J150(new CreateJ150(this.codigoEmpresa).get());
		_J005.set_J800(null);
		// if (this.codigoEmpresa.equals("1") || this.codigoEmpresa.equals("2"))
		// {
		// _J005.set_J800(new CreateJ800(this.codigoEmpresa).get());
		// }

		list.add(_J005);
		return list;
	}
}