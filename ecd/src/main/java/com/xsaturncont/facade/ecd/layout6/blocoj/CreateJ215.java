package com.xsaturncont.facade.ecd.layout6.blocoj;

import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.layout6ecd._J215;

public class CreateJ215 {

	private String codigoEmpresa;
	private String cod_agl;

	public CreateJ215(String codigoEmpresa, String cod_agl) {
		this.codigoEmpresa = codigoEmpresa;
		this.cod_agl = cod_agl;
	}

	public List<_J215> get() {
		List<_J215> list = null;

		if (codigoEmpresa.equals("1")) {
			list = new ArrayList<_J215>();
			if (cod_agl.equals("DMPL.2.4.03")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.03");
				e.setDesc_fat("PREJUIZO DO PERIODO");
				e.setVl_fat_cont("173488,34");
				e.setInd_dc_fat("D");
				list.add(e);
			} else if (cod_agl.equals("DMPL.2.4.05")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.05");
				e.setDesc_fat("PREJUIZO DO PERIODO");
				e.setVl_fat_cont("1059897,98");
				e.setInd_dc_fat("D");
				list.add(e);
			}

		} else if (codigoEmpresa.equals("2")) {
			list = new ArrayList<_J215>();
			if (cod_agl.equals("DMPL.2.4.05")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.05");
				e.setDesc_fat("LUCRO DO PERIODO");
				e.setVl_fat_cont("177670,40");
				e.setInd_dc_fat("C");
				list.add(e);
			} else if (cod_agl.equals("DMPL.2.4.05.04")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.05.04");
				e.setDesc_fat("PREJUIZO DO PERIODO");
				e.setVl_fat_cont("277598,40");
				e.setInd_dc_fat("D");
				list.add(e);
			}
		} else if (codigoEmpresa.equals("3")) {
			list = new ArrayList<_J215>();
			if (cod_agl.equals("DMPL.2.4.03")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.03");
				e.setDesc_fat("LUCRO DO PERIODO");
				e.setVl_fat_cont("9170,72");
				e.setInd_dc_fat("D");
				list.add(e);
			} else if (cod_agl.equals("DMPL.2.4.05")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.05");
				e.setDesc_fat("PREJUIZO DO PERIODO");
				e.setVl_fat_cont("19324,52");
				e.setInd_dc_fat("C");
				list.add(e);
			}
		} else if (codigoEmpresa.equals("4")) {
			list = new ArrayList<_J215>();
			if (cod_agl.equals("DMPL.2.4.04")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.04");
				e.setDesc_fat("LUCRO DO PERIODO");
				e.setVl_fat_cont("333000,00");
				e.setInd_dc_fat("C");
				list.add(e);
			} else if (cod_agl.equals("DMPL.2.4.03")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.03");
				e.setDesc_fat("PREJUIZO DO PERIODO");
				e.setVl_fat_cont("18643,38");
				e.setInd_dc_fat("C");
				list.add(e);
			} else if (cod_agl.equals("DMPL.2.4.05")) {
				_J215 e = new _J215();
				e.setReg("J215");
				e.setCod_hist_fat("DMPL.2.4.05");
				e.setDesc_fat("PREJUIZO DO PERIODO");
				e.setVl_fat_cont("557848,25");
				e.setInd_dc_fat("C");
				list.add(e);
			}
		}

		return list;
	}
}