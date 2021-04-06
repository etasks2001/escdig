package com.xsaturncont.facade.ecd.layout4.blocoi;

import com.xsaturncont.util.Util;

public class CreateI050Util {
	public static String getCod_nat(String cod_cta) {
		String cod_nat = "";
		String[] divisao = cod_cta.split("\\.");
		if (divisao[0].equals("1")) {
			cod_nat = "01";
		} else {
			if ((divisao[0].equals("2")) || (divisao[0].equals("2") && divisao[1].equals("1")) || (divisao[0].equals("2") && divisao[1].equals("3"))
					|| (divisao[0].equals("2") && divisao[1].equals("2"))) {
				cod_nat = "02";
			} else {
				if (divisao[0].equals("2") && divisao[1].equals("4")) {
					cod_nat = "03";
				} else {
					if (divisao[0].equals("3") || divisao[0].equals("4") || divisao[0].equals("5")) {
						cod_nat = "04";
					} else {
						if (divisao[0].equals("6")) {
							cod_nat = "09";
						}
					}
				}
			}
		}

		return cod_nat;
	}

	public static String getNivel(String cod_cta) {
		String nivel = "";
		String[] divisao = cod_cta.split("\\.");

		if (divisao[1].equals("0") && divisao[2].equals("00") && divisao[3].equals("00") && divisao[4].equals("0000")) {
			nivel = "1";
		} else {
			if (divisao[2].equals("00") && divisao[3].equals("00") && divisao[4].equals("0000")) {
				nivel = "2";
			} else {
				if (divisao[3].equals("00") && divisao[4].equals("0000")) {
					nivel = "3";
				} else {
					if (divisao[4].equals("0000")) {
						nivel = "4";
					} else {
						nivel = "5";
					}
				}
			}
		}

		return nivel;
	}

	public static String getCod_cta_sup(String cod_cta) {
		String cod_cta_sup = "";
		String[] divisao = cod_cta.split("\\.");

		if (divisao[4].equals("0000")) {
			if (divisao[3].equals("00")) {
				if (divisao[2].equals("00")) {
					if (!divisao[1].equals("0")) {
						cod_cta_sup = divisao[0] + "0" + "00" + "00" + "0000";
					}
				} else {
					cod_cta_sup = divisao[0] + divisao[1] + "00" + "00" + "0000";
				}
			} else {
				cod_cta_sup = divisao[0] + divisao[1] + divisao[2] + "00" + "0000";
			}
		} else {
			cod_cta_sup = divisao[0] + divisao[1] + divisao[2] + divisao[3] + "0000";
		}
		if (cod_cta_sup.length() > 0) {
			cod_cta_sup = Util.formatarConta(cod_cta_sup);
		}
		return cod_cta_sup;
	}
}
