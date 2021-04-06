package com.xsaturncont.facade.ecd.layout4.blocoj;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout4ecd._J210;
import com.xsaturncont.util.Util;

public class CreateJ210 {

	private String codigoEmpresa;

	public CreateJ210(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_J210> get() throws IOException {
		FileInputStream fis = new FileInputStream(Util.getPlanilha(this.codigoEmpresa));
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet planilha = Util.getPlanilha("DMPL", workbook);

		int lastRowNum = planilha.getLastRowNum();

		BuilderBlockList<_J210> builderBlock = new BuilderBlockList<_J210>();
		for (int i = 0; i <= lastRowNum; i++) {
			HSSFRow row = planilha.getRow(i);
			if (row != null) {

				HSSFCell cell = row.getCell(0);
				String cod_agl = cell.getStringCellValue();

				cell = row.getCell(1);
				String descr_cod_agl = cell.getStringCellValue();

				cell = row.getCell(2);
				Double vl_cta = cell.getNumericCellValue();
				String ind_dc_cta = (vl_cta < 0 ? "C" : "D");

				cell = row.getCell(3);
				Double vl_cta_ini = cell.getNumericCellValue();
				String ind_dc_cta_ini = (vl_cta_ini < 0 ? "C" : "D");

				_J210 _J210 = new _J210();
				_J210.setReg("J210");
				_J210.setInd_tip("1");
				_J210.setCod_agl(cod_agl);
				_J210.setDescr_cod_agl(Util.normalizeString(descr_cod_agl));
				_J210.setVl_cta(new DecimalFormat("#").format((vl_cta < 0 ? vl_cta * -1 : vl_cta)));
				_J210.setInd_dc_cta(ind_dc_cta);
				_J210.setVl_cta_ini(new DecimalFormat("#").format((vl_cta_ini < 0 ? vl_cta_ini * -1 : vl_cta_ini)));
				_J210.setInd_dc_cta_ini(ind_dc_cta_ini);

				builderBlock.add(_J210);
			}
		}

		workbook.close();
		return builderBlock.getList();
	}
}