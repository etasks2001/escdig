package com.xsaturncont.layoutFile;

import static com.xsaturncont.layoutFile.UtilLayout.getDouble;
import static com.xsaturncont.layoutFile.UtilLayout.getString;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.xsaturncont.model.Field;
import com.xsaturncont.model.TipoDoCampo;

public class SchemaECD implements Schema<HSSFSheet, Field> {

	private static final int _A = 0;

	private static final int _B = 1;

	private static final int _C = 2;

	private static final int _D = 3;

	private static final int _E = 4;

	private static final int _F = 5;

	private static final int _G = 6;

	private static final int _H = 7;

	private Field getFieldInfo(HSSFSheet sheet, int i) {
		HSSFRow row = sheet.getRow(i);
		System.out.println(sheet.getSheetName());
		// if (sheet.getSheetName().equals("9001")) {
		// System.out.println("fjd");
		// }
		Double numero = getDouble(row, _A);
		String campo = getString(row, _B).toLowerCase();
		String descricao = getString(row, _C);
		TipoDoCampo tipoDoCampo = TipoDoCampo.fromValue(getString(row, _D));
		Double tamanho = getDouble(row, _E);
		Double decimal = getDouble(row, _F);
		String valorValido = getString(row, _G);
		String obrigatorioString = getString(row, _H);
		boolean obrigatorio = obrigatorioString.contains("S");

		return new Field(numero.intValue(), campo, descricao, tipoDoCampo, tamanho.intValue(), decimal.intValue(), valorValido, obrigatorio, false);
	}

	@Override
	public List<Field> getFields(HSSFSheet sheet) {
		List<Field> fields = new ArrayList<Field>();
		int lastRowNum = sheet.getLastRowNum();
		for (int i = 1; i <= lastRowNum; i++) {
			Field fieldInfo = getFieldInfo(sheet, i);
			fields.add(fieldInfo);
		}
		return fields;
	}
}