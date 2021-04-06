package com.xsaturncont.layoutFile;

import static com.xsaturncont.layoutFile.UtilLayout.getDouble;
import static com.xsaturncont.layoutFile.UtilLayout.getString;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.xsaturncont.model.Block;

public class SchemaECDBlock implements Schema<HSSFSheet, Block> {

	private static final int _A = 0;

	private static final int _C = 2;

	private static final int _D = 3;

	private static final int _E = 4;

	@Override
	public List<Block> getFields(HSSFSheet sheet) {
		List<Block> blocks = new ArrayList<Block>();
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(sheet.getSheetName());
		for (int i = 1; i <= lastRowNum; i++) {
			System.out.println(i);
			Block block = getFieldInfo(sheet, i);
			blocks.add(block);
		}
		return blocks;
	}

	private Block getFieldInfo(HSSFSheet sheet, int i) {
		HSSFRow row = sheet.getRow(i);

		String bloco = getString(row, _A);
		String registro = getString(row, _C);
		Double nivel = getDouble(row, _D);
		String ocorrencia = getString(row, _E);
		System.out.println(registro);

		return new Block(bloco, registro, nivel.intValue(), ocorrencia);
	}
}