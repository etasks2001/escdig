package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD._0;
import static com.xsaturncont.facade.efd.UtilEFD.xE110;

import com.xsaturncont.layoutefd10._E110;

public class CreateE110 {

	public _E110 get() {

		String reg = xE110;
		String vl_tot_debitos = _0;// neste
		String vl_aj_debitos = _0;
		String vl_tot_aj_debitos = _0;
		String vl_estornos_cred = _0;
		String vl_tot_creditos = _0;// neste
		String vl_aj_creditos = _0;
		String vl_tot_aj_creditos = _0;
		String vl_estornos_deb = _0;
		String vl_sld_credor_ant = _0;
		String vl_sld_apurado = _0;
		String vl_tot_ded = _0;
		String vl_icms_recolher = _0;
		String vl_sld_credor_transportar = _0;
		String deb_esp = _0;

		_E110 _E110 = new _E110();

		_E110.setReg(reg);
		_E110.setVl_tot_debitos(vl_tot_debitos);
		_E110.setVl_aj_debitos(vl_aj_debitos);
		_E110.setVl_tot_aj_debitos(vl_tot_aj_debitos);
		_E110.setVl_estornos_cred(vl_estornos_cred);
		_E110.setVl_tot_creditos(vl_tot_creditos);
		_E110.setVl_aj_creditos(vl_aj_creditos);
		_E110.setVl_tot_aj_creditos(vl_tot_aj_creditos);
		_E110.setVl_estornos_deb(vl_estornos_deb);
		_E110.setVl_sld_credor_ant(vl_sld_credor_ant);
		_E110.setVl_sld_apurado(vl_sld_apurado);
		_E110.setVl_tot_ded(vl_tot_ded);
		_E110.setVl_icms_recolher(vl_icms_recolher);
		_E110.setVl_sld_credor_transportar(vl_sld_credor_transportar);
		_E110.setDeb_esp(deb_esp);

		// _E110.set_E111(new CreateE111().get());
		// _E110.set_E115(new CreateE115().get());
		// _E110.set_E116(new CreateE116().get());

		return _E110;
	}
}