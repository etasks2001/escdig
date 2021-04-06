package com.xsaturncont.facade.efd;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEFD {
	public static final String _0 = "0";

	public static final String _1 = "1";

	public static final String _x1010 = "1010";

	public static final String ALIQ_COFINS = "aliq_cofins";

	public static final String ALIQ_COFINS_PERC = "aliq_cofins_perc";

	public static final String ALIQ_ICMS = "aliq_icms";

	public static final String ALIQ_IPI = "aliq_ipi";

	public static final String ALIQ_PIS = "aliq_pis";

	public static final String ALIQ_PIS_PERC = "aliq_pis_perc";

	public static final String ALIQ_ST = "aliq_st";

	public static final String BAIRRO = "bairro";

	public static final String BLOCO_COM_DADOS_INFORMADOS = "0";

	public static final String BLOCO_SEM_DADOS_INFORMADOS = "1";

	public static final String CEP = "cep";

	public static final String CEST = "cest";

	public static final String CFOP = "cfop";

	public static final String CHV_CTE = "chv_cte";

	public static final String CHV_CTE_REF = "chv_cte_ref";

	public static final String CHV_NFE = "chv_nfe";

	public static final String CNPJ = "cnpj";

	public static final String COD_ANT_ITEM = "cod_ant_item";

	public static final String COD_BARRA = "cod_barra";

	public static final String COD_CLASS = "cod_class";

	public static final String COD_CONS = "cod_cons";

	public static final String COD_CTA = "cod_cta";

	public static final String COD_ENQ = "cod_enq";

	public static final String COD_FIN = "cod_fin";

	public static final String COD_GEN = "cod_gen";

	public static final String COD_GRUPO_TENSAO = "cod_grupo_tensao";

	public static final String COD_INF = "cod_inf";

	public static final String COD_ITEM = "cod_item";

	public static final String COD_LST = "cod_lst";

	public static final String COD_MOD = "cod_mod";

	public static final String COD_MUN = "cod_mun";

	public static final String COD_NAT = "cod_nat";

	public static final String COD_NCM = "cod_ncm";

	public static final String COD_OBS = "cod_obs";

	public static final String COD_PAIS = "cod_pais";

	public static final String COD_PART = "cod_part";

	public static final String COD_SIT = "cod_sit";

	public static final String COD_VER = "cod_ver";

	public static final String COM_OPERACOES_DE_ST = "1";

	public static final String COMPL = "compl";

	public static final String CPF = "cpf";

	public static final String CRC = "crc";

	public static final String CST_COFINS = "cst_cofins";

	public static final String CST_ICMS = "cst_icms";

	public static final String CST_IPI = "cst_ipi";

	public static final String CST_PIS = "cst_pis";

	public static final String DD_MM_YYYY = "ddMMyyyy";

	public static final SimpleDateFormat DATE_FORMAT_DDMMYYYY = new SimpleDateFormat(DD_MM_YYYY);

	public static final String DESCR = "descr";

	public static final String DESCR_COMPL = "descr_compl";

	public static final String DESCR_ITEM = "descr_item";

	public static final String DESCR_NAT = "descr_nat";

	public static final String DT_A_P = "dt_a_p";

	public static final String DT_DOC = "dt_doc";

	public static final String DT_E_S = "dt_e_s";

	public static final String DT_FIN = "dt_fin";

	public static final String DT_INI = "dt_ini";

	public static final String DT_INV = "dt_inv";

	public static final String EMAIL = "email";

	public static final String EMPTY_STRING = "";

	public static final String END = "end";

	public static final String EX_IPI = "ex_ipi";

	public static final String FANTASIA = "fantasia";

	public static final String FAX = "fax";

	public static final String FAX_ = "fax_";

	public static final String FONE = "fone";

	public static final String IE = "ie";

	public static final String IE_ST = "ie_st";

	public static final String IM = "im";

	public static final String IND_APUR = "ind_apur";

	public static final String IND_ATIV = "ind_ativ";

	public static final String IND_EMIT = "ind_emit";

	public static final String IND_EMIT_TERCEIROS = "1";

	public static final String IND_FRT = "ind_frt";

	public static final String IND_MOV = "ind_mov";

	public static final String IND_OPER = "ind_oper";

	public static final String IND_OPER_ENTRADA = "0";

	public static final String IND_OPER_SAIDA = "1";

	public static final String IND_PERFIL = "ind_perfil";

	public static final String IND_PGTO = "ind_pgto";

	public static final String IND_PROP = "ind_prop";

	public static final String IND_REC = "ind_rec";

	public static final String MOT_INV = "mot_inv";

	public static final String NOME = "nome";

	public static final String NUM = "num";

	public static final String NUM_DOC = "num_doc";

	public static final String NUM_ITEM = "num_item";

	public static final String QTD = "qtd";

	public static final String QUANT_BC_COFINS = "quant_bc_cofins";

	public static final String QUANT_BC_PIS = "quant_bc_pis";

	public static final String[] RECORDS = new String[] { "0000", "0001", "0005", "0015", "0100", "0150", "0175", "0190", "0200", "0205", "0206", "0210", "0220", "0300", "0305", "0400", "0450",
			"0460", "0500", "0600", "0990", "C001", "C100", "C101", "C105", "C110", "C111", "C112", "C113", "C114", "C115", "C116", "C120", "C130", "C140", "C141", "C160", "C165", "C170", "C171",
			"C172", "C173", "C174", "C175", "C176", "C177", "C178", "C179", "C190", "C195", "C197", "C300", "C310", "C320", "C321", "C350", "C370", "C390", "C400", "C405", "C410", "C420", "C425",
			"C460", "C465", "C470", "C490", "C495", "C500", "C510", "C590", "C600", "C601", "C610", "C690", "C700", "C790", "C791", "C800", "C850", "C860", "C890", "C990", "D001", "D100", "D101",
			"D110", "D120", "D130", "D140", "D150", "D160", "D161", "D162", "D170", "D180", "D190", "D195", "D197", "D300", "D301", "D310", "D350", "D355", "D360", "D365", "D370", "D390", "D400",
			"D410", "D411", "D420", "D500", "D510", "D530", "D590", "D600", "D610", "D690", "D695", "D696", "D697", "D990", "E001", "E100", "E110", "E111", "E112", "E113", "E115", "E116", "E200",
			"E210", "E220", "E230", "E240", "E250", "E300", "E310", "E311", "E312", "E313", "E316", "E500", "E510", "E520", "E530", "E990", "G001", "G110", "G125", "G126", "G130", "G140", "G990",
			"H001", "H005", "H010", "H020", "H990", "K001", "K100", "K200", "K210", "K215", "K220", "K230", "K235", "K250", "K255", "K260", "K265", "K270", "K275", "K280", "K990", "1001", "1010",
			"1100", "1105", "1110", "1200", "1210", "1300", "1310", "1320", "1350", "1360", "1370", "1390", "1391", "1400", "1500", "1510", "1600", "1700", "1710", "1800", "1900", "1910", "1920",
			"1921", "1922", "1923", "1925", "1926", "1990", "9001", "9900" };

	public static final String REG = "reg";

	public static final String SEM_OPERACOES_COM_ST = "0";

	public static final String SER = "ser";

	public static final String SQL_0000 = "{call sped_efd_0000 (?,?)}";

	public static final String SQL_0005 = "{call sped_efd_0005}";

	public static final String SQL_0015 = "{call sped_efd_0015}";

	public static final String SQL_0100 = "{call sped_efd_0100}";

	public static final String SQL_0150_ENTRADA = "{call sped_efd_0150_entrada (?, ?)}";

	public static final String SQL_0150_SAIDA = "{call sped_efd_0150_saida (?, ?)}";

	public static final String SQL_0190_ENTRADA = "{call sped_efd_0190_entrada (?, ?)}";

	public static final String SQL_0190_INVENTARIO = "{call sped_efd_0190_inventario (?, ?)}";

	public static final String SQL_0200_ENTRADA = "{call sped_efd_0200_entrada (?, ?)}";

	public static final String SQL_0200_INVENTARIO = "{call sped_efd_0200_inventario (?, ?)}";

	public static final String SQL_0400_ENTRADA = "{call sped_efd_0400_entrada (?, ?)}";

	public static final String SQL_C100_ENTRADA = "{call sped_efd_C100_entrada (?, ?)}";

	public static final String SQL_C100_SAIDA = "{call sped_efd_C100_saida (?, ?)}";

	public static final String SQL_C101_ENTRADA = "{call sped_efd_C101_entrada (?)}";

	public static final String SQL_C101_SAIDA = "{call sped_efd_C101_saida (?)}";

	public static final String SQL_C170_ENTRADA = "{call sped_efd_c170_entrada (?)}";

	public static final String SQL_C190_ENTRADA = "{call sped_efd_C190_entrada (?)}";

	public static final String SQL_C190_SAIDA = "{call sped_efd_C190_saida (?)}";

	public static final String SQL_C500_ENTRADA = "{ call sped_efd_C500_entrada (?, ?)}";

	public static final String SQL_C590_ENTRADA = "{call sped_efd_c590_entrada (?)}";

	public static final String SQL_D100_ENTRADA = "{call sped_efd_D100_entrada (?, ?)}";

	public static final String SQL_D190_ENTRADA = "{call sped_efd_D190_entrada (?)}";

	public static final String SQL_D500_ENTRADA = "{call sped_efd_D500_entrada (?, ?)}";

	public static final String SQL_D590_ENTRADA = "{call sped_efd_D590_entrada (?)}";

	public static final String SQL_E510_ENTRADA = "{call sped_efd_e510_entrada (?, ?) }";

	public static final String SQL_E510_SAIDA = "{call sped_efd_e510_saida (?, ?) }";

	public static final String SQL_EFD_H005 = "{call sped_efd_H005 (?, ?)}";

	public static final String SQL_H010 = "{call sped_efd_H010 (?, ?)}";

	public static final String SUB = "sub";

	public static final String SUFRAMA = "suframa";

	public static final String TIPO_ITEM = "tipo_item";

	public static final String TP_ASSINANTE = "tp_assinante";

	public static final String TP_CT_E = "tp_ct_e";

	public static final String TP_LIGACAO = "tp_ligacao";

	public static final String TXT_COMPL = "txt_compl";

	public static final String UF = "uf";

	public static final String UF_ST = "uf_st";

	public static final String[] UFS = new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC",
			"SE", "SP", "TO" };

	public static final String UNDERSCORE = "_";

	public static final String UNID = "unid";

	public static final String UNID_INV = "unid_inv";

	public static final String VL_ABAT_NT = "vl_abat_nt";

	public static final String VL_BC_COFINS = "vl_bc_cofins";

	public static final String VL_BC_ICMS = "vl_bc_icms";

	public static final String VL_BC_ICMS_ST = "vl_bc_icms_st";

	public static final String VL_BC_ICMS_UF = "vl_bc_icms_uf";

	public static final String VL_BC_IPI = "vl_bc_ipi";

	public static final String VL_BC_PIS = "vl_bc_pis";

	public static final String VL_COFINS = "vl_cofins";

	public static final String VL_COFINS_ST = "vl_cofins_st";

	public static final String VL_CONT_IPI = "vl_cont_ipi";

	public static final String VL_DA = "vl_da";

	public static final String VL_DESC = "vl_desc";

	public static final String VL_DOC = "vl_doc";

	public static final String VL_FCP_UF_DEST = "vl_fcp_uf_dest";

	public static final String VL_FORN = "vl_forn";

	public static final String VL_FRT = "vl_frt";

	public static final String VL_ICMS = "vl_icms";

	public static final String VL_ICMS_ST = "vl_icms_st";

	public static final String VL_ICMS_UF = "vl_icms_uf";

	public static final String VL_ICMS_UF_DEST = "vl_icms_uf_dest";

	public static final String VL_ICMS_UF_REM = "vl_icms_uf_rem";

	public static final String VL_INV = "vl_inv";

	public static final String VL_IPI = "vl_ipi";

	public static final String VL_ITEM = "vl_item";

	public static final String VL_ITEM_IR = "vl_item_ir";

	public static final String VL_MERC = "vl_merc";

	public static final String VL_NT = "vl_nt";

	public static final String VL_OPR = "vl_opr";

	public static final String VL_OUT_DA = "vl_out_da";

	public static final String VL_PIS = "vl_pis";

	public static final String VL_PIS_ST = "vl_pis_st";

	public static final String VL_RED_BC = "vl_red_bc";

	public static final String VL_SEG = "vl_seg";

	public static final String VL_SERV = "vl_serv";

	public static final String VL_SERV_NT = "vl_serv_nt";

	public static final String VL_TERC = "vl_terc";

	public static final String VL_UNIT = "vl_unit";

	public static final String x0001 = "0001";

	public static final String x0990 = "0990";

	public static final String x1001 = "1001";

	public static final String x1990 = "1990";

	public static final String x9001 = "9001";

	public static final String x9900 = "9900";

	public static final String x9990 = "9990";

	public static final String x9999 = "9999";

	public static final String xC001 = "C001";

	public static final String xC990 = "C990";

	public static final String xD001 = "D001";

	public static final String xD990 = "D990";

	public static final String xE001 = "E001";

	public static final String xE100 = "E100";

	public static final String xE110 = "E110";

	public static final String xE200 = "E200";

	public static final String xE210 = "E210";

	public static final String xE300 = "E300";

	public static final String xE310 = "E310";

	public static final String xE500 = "E500";

	public static final String xE510 = "E510";

	public static final String xE520 = "E520";

	public static final String xE990 = "E990";

	public static final String xG001 = "G001";

	public static final String xG990 = "G990";

	public static final String xH001 = "H001";

	public static final String xH990 = "H990";

	public static final String xK001 = "K001";

	public static final String xK990 = "K990";

	public static final String xNAO = "N";

	public static final void close(CallableStatement cs, ResultSet rs) throws SQLException {
		rs.close();
		cs.close();
	}

	public static final String formatDDMMYY(Date date) {
		return DATE_FORMAT_DDMMYYYY.format(date);
	}

	public static final String formatDouble(double number) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		return decimalFormat.format(number).replace(',', '.');

	}

	public static final String formatInt(int number) {
		DecimalFormat decimalFormat = new DecimalFormat("#");
		return decimalFormat.format(number);

	}

}