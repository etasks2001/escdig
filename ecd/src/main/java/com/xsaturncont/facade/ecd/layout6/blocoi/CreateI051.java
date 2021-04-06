package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout6ecd._I051;

public class CreateI051 {

	private HSSFSheet planilha;

	public CreateI051(HSSFSheet planilha) {
		this.planilha = planilha;
	}

	public List<_I051> get(String cod_cta) throws IOException {
		BuilderBlockList<_I051> builderBlock = new BuilderBlockList<_I051>();
		String cod_cta_ref = this.getPCReferenciado(cod_cta);
		if (cod_cta_ref.length() > 0) {
			if (cod_cta_ref.contains("/")) {
				String[] contas = cod_cta_ref.split("/");
				for (String s : contas) {
					builderBlock.add(this.createI051(s));
				}
			} else {
				builderBlock.add(this.createI051(cod_cta_ref));
			}
			return builderBlock.getList();
		}
		return null;
	}

	private _I051 createI051(String conta) {
		// String cod_plan_ref = "2";
		_I051 _I051 = new _I051();
		_I051.setReg("I051");
		// _I051.setCod_plan_ref(cod_plan_ref);
		_I051.setCod_ccus(null);
		_I051.setCod_cta_ref(conta);
		return _I051;
	}

	private String getPCReferenciado(String cod_cta) {
		int lastRow = planilha.getLastRowNum();
		String contaReferencial = "";

		for (int i = 1; i < lastRow; i++) {
			HSSFRow row = planilha.getRow(i);
			HSSFCell cell = row.getCell(1);
			if (cell != null) {
				if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
					String conta = new DecimalFormat("#").format(cell.getNumericCellValue());
					if (conta.equals(cod_cta)) {
						HSSFCell cellContaReferencial = row.getCell(10);
						return cellContaReferencial.getStringCellValue();
					}
				}
			}
		}
		return contaReferencial;
	}
}