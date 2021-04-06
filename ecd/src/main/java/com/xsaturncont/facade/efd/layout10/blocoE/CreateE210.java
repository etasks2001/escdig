package com.xsaturncont.facade.efd.layout10.blocoE;

import static com.xsaturncont.facade.efd.UtilEFD.COM_OPERACOES_DE_ST;
import static com.xsaturncont.facade.efd.UtilEFD._0;
import static com.xsaturncont.facade.efd.UtilEFD.xE210;

import com.xsaturncont.layoutefd10._E210;

public class CreateE210 {

	public _E210 get() {
		String reg = xE210;
		String ind_mov_st = COM_OPERACOES_DE_ST;
		String vl_sld_cred_ant_st = _0;
		String vl_devol_st = _0;// neste
		String vl_ressarc_st = _0;
		String vl_out_cred_st = _0;
		String vl_aj_creditos_st = _0;
		String vl_retençao_st = _0;// neste
		String vl_out_deb_st = _0;
		String vl_aj_debitos_st = _0;
		String vl_sld_dev_ant_st = _0;
		String vl_deduções_st = _0;
		String vl_icms_recol_st = _0;
		String vl_sld_cred_st_transportar = _0;
		String deb_esp_st = _0;

		_E210 _E210 = new _E210();
		_E210.setReg(reg);
		_E210.setInd_mov_st(ind_mov_st);
		_E210.setVl_sld_cred_ant_st(vl_sld_cred_ant_st);
		_E210.setVl_devol_st(vl_devol_st);
		_E210.setVl_ressarc_st(vl_ressarc_st);
		_E210.setVl_out_cred_st(vl_out_cred_st);
		_E210.setVl_aj_creditos_st(vl_aj_creditos_st);
		_E210.setVl_retençao_st(vl_retençao_st);
		_E210.setVl_out_deb_st(vl_out_deb_st);
		_E210.setVl_aj_debitos_st(vl_aj_debitos_st);
		_E210.setVl_sld_dev_ant_st(vl_sld_dev_ant_st);
		_E210.setVl_deduções_st(vl_deduções_st);
		_E210.setVl_icms_recol_st(vl_icms_recol_st);
		_E210.setVl_sld_cred_st_transportar(vl_sld_cred_st_transportar);
		_E210.setDeb_esp_st(deb_esp_st);

		// _E210.set_E220(new CreateE220().get());
		// _E210.set_E250(new CreateE250().get());

		return _E210;
	}
}
