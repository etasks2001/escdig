package com.xsaturncont.layoutFile;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

public class UtilLayout {
	public static String getString(HSSFRow row, int column) {

		HSSFCell cell = row.getCell(column);

		if (cell == null) {
			return "";
		}
		return cell.getStringCellValue();
	}

	public static Double getDouble(HSSFRow row, int column) {
		return row.getCell(column).getNumericCellValue();
	}

}
