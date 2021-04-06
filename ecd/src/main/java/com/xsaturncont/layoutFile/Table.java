package com.xsaturncont.layoutFile;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.xsaturncont.model.Field;

public class Table {

	private List<Field> fields = new ArrayList<Field>();

	private String name;

	public Table(HSSFSheet sheet, Schema<HSSFSheet, Field> schema) {
		this.name = sheet.getSheetName();
		this.fields = schema.getFields(sheet);
	}

	public List<Field> getFields() {
		return fields;
	}

	public String getName() {
		return name;
	}
}