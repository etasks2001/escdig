package com.xsaturncont.layoutFile;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.xsaturncont.model.Block;
import com.xsaturncont.model.Field;

public class LayoutFile {

	private HSSFWorkbook workbook;

	public LayoutFile(HSSFWorkbook workbook) {
		this.workbook = workbook;
	}

	public List<Block> getBlocos(String sheetName, Schema<HSSFSheet, Block> schema) {
		HSSFSheet sheet = workbook.getSheet(sheetName);
		return schema.getFields(sheet);
	}

	public List<Table> getTables(List<Block> blocks, Schema<HSSFSheet, Field> schema) {
		List<Table> tables = new ArrayList<Table>();
		for (Block block : blocks) {
			String registro = block.getRegistro();

			tables.add(new Table(workbook.getSheet(registro), schema));
		}
		return tables;
	}
}