package com.xsaturncont.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Util {

    public static String formatarConta(String cod_cta) {
	StringBuilder sb = new StringBuilder();
	sb.append(cod_cta.substring(0, 1)).append('.');
	sb.append(cod_cta.substring(1, 2)).append('.');
	sb.append(cod_cta.substring(2, 4)).append('.');
	sb.append(cod_cta.substring(4, 6)).append('.');
	sb.append(cod_cta.substring(6, 10));

	return sb.toString();
    }

    public static Calendar getUltimoDiaDosMes(Calendar dataInicial) throws ParseException {
	Calendar calendar = Calendar.getInstance();

	calendar.set(dataInicial.get(Calendar.YEAR), dataInicial.get(Calendar.MONTH), 1);

	calendar.add(Calendar.MONTH, 1);
	calendar.set(Calendar.DAY_OF_MONTH, 1);
	calendar.add(Calendar.DATE, -1);

	return calendar;
    }

    public static double soma(Double valor1, Double valor2) {
	BigDecimal v1 = new BigDecimal("" + valor1);
	BigDecimal v2 = new BigDecimal("" + valor2);

	BigDecimal total = v1.add(v2);
	return total.doubleValue();
    }

    public static String getCreateDate(int ano, int mes, int dia) {
	Calendar calendar = Calendar.getInstance();
	calendar.set(ano, mes, dia);
	return new SimpleDateFormat("ddMMyyyy").format(calendar.getTime());
    }

    public static Integer[] getArray(Map<?, ?> map) {
	Set<?> keys = map.keySet();
	Integer[] array = keys.toArray(new Integer[keys.size()]);
	Arrays.sort(array);
	return array;
    }

    public static boolean isList(Field field) {
	return field.getType().equals(List.class);
    }

    public static boolean isString(Field field) {
	return field.getType().equals(String.class);
    }

    public static boolean ultimoCampo(int i, String[] fieldsOrder, Class<? extends Object> clazz) throws NoSuchFieldException, SecurityException {
	boolean ultimo = true;
	if (i < fieldsOrder.length - 1) {
	    ultimo = !isString(clazz.getDeclaredField(fieldsOrder[i + 1]));
	}
	return ultimo;
    }

    public static boolean isNull(Object object) {
	return object == null;

    }

    private static final String REPLACEMENT = "";

    private static final String P_ASCII = "[^\\p{ASCII}]";

    public static String normalizeString(String string) {
	String f = (String) string;
	if (!Normalizer.isNormalized(string, Form.NFD)) {
	    String temp = Normalizer.normalize(string, Form.NFD);
	    f = temp.replaceAll(P_ASCII, REPLACEMENT);
	}
	return f.replace('º', '.').replace('ç', 'c').replace('´', '\'').replaceAll("[\n\r]", "").trim();
    }

    public static String getPlanilha(String codigoEmpresa) {
	String path = "C:/ECD/";
	if (codigoEmpresa.equals("1")) {
	    return path + "PlanoreferencialFSI2019.xls";
	} else if (codigoEmpresa.equals("2")) {
	    return path + "PlanoreferencialMLI19.xls";
	} else if (codigoEmpresa.equals("3")) {
	    return path + "PlanoreferencialEII201819.xls";
	}
	return path + "PlanoreferenciaTSD1819.xls";
    }

    public static String getLivroAuxiliar(String codigoEmpresa) {
	String path = "c:/plano de conta/";
	if (codigoEmpresa.equals("1")) {
	    return path + "FSLB.rtf";
	} else if (codigoEmpresa.equals("2")) {
	    return path + "MLLB.rtf";
	}
	return "";
    }

    public static HSSFSheet getPlanilha(String nomePlanilha, HSSFWorkbook workbook) throws IOException {
	HSSFSheet planilha = workbook.getSheet(nomePlanilha);
	return planilha;
    }

    public static String getInscricaoMunicipal(String codigoEmpresa) {
	if (codigoEmpresa.equals("1")) {
	    return "12111210";
	} else if (codigoEmpresa.equals("2")) {
	    return "85368768";
	} else if (codigoEmpresa.equals("3")) {
	    return "94388997";
	} else if (codigoEmpresa.equals("4")) {
	    return "41063198";
	} else {
	    return "";
	}

    }

    public static String getNumeroDeOrderm(String codigoEmpresa) {
	if (codigoEmpresa.equals("1")) {
	    return "044";
	} else if (codigoEmpresa.equals("2")) {
	    return "036";
	} else if (codigoEmpresa.equals("3")) {
	    return "034";
	} else if (codigoEmpresa.equals("4")) {
	    return "12";
	} else {
	    return "01";
	}
    }

    public static String getNomeArquivo(String codigoEmpresa, String ano) {
	if (codigoEmpresa.equals("1")) {
	    return "c:/ecd-FS " + ano + ".txt";
	} else if (codigoEmpresa.equals("2")) {
	    return "c:/ecd-ML " + ano + ".txt";
	} else if (codigoEmpresa.equals("3")) {
	    return "c:/ecd-Euro " + ano + ".txt";
	} else if (codigoEmpresa.equals("4")) {
	    return "c:/ecd-TSD " + ano + ".txt";
	} else {
	    return "c:/ecd-DJC " + ano + ".txt";
	}
    }
}