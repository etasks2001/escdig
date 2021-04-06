package com.xsaturncont.facade.ecd.layout3.blocoi;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout3ecd._I052;

public class CreateI052 {

	private HSSFSheet planilha;

	public CreateI052(HSSFSheet planilha) {
		this.planilha = planilha;
	}

	public List<_I052> get(String cod_cta) {
		int lastRowNum = this.planilha.getLastRowNum();

		for (int i = 9; i < lastRowNum; i++) {
			HSSFRow row = planilha.getRow(i);
			HSSFCell cellConta = row.getCell(2);
			if (cellConta != null) {
				if (cellConta.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
					String conta = new DecimalFormat("#").format(cellConta.getNumericCellValue());
					if (conta.equals(cod_cta)) {

						BuilderBlockList<_I052> builderBlock = new BuilderBlockList<_I052>();
						this.setI052(row, builderBlock, 16);
						this.setI052(row, builderBlock, 15);
						this.setI052(row, builderBlock, 14);
						this.setI052(row, builderBlock, 13);
						this.setI052(row, builderBlock, 12);
						this.setI052(row, builderBlock, 11);
						return builderBlock.getList();
					}
				}
			}

		}
		return null;
	}

	private void setI052(HSSFRow row, BuilderBlockList<_I052> builderBlock, int column) {
		String cellValue = this.getCellValue(row.getCell(column));
		if (cellValue.length() > 0) {
			builderBlock.add(this.createI052(cellValue));
		}
	}

	private String getCellValue(HSSFCell cell) {
		if (cell != null) {
			String value = cell.getStringCellValue();
			if (value.length() > 0) {
				return value;
			}
		}
		return "";
	}

	private _I052 createI052(String codigo) {
		_I052 _I052 = new _I052();
		_I052.setReg("I052");
		_I052.setCod_ccus(null);
		_I052.setCod_agl(codigo);
		return _I052;
	}
}
