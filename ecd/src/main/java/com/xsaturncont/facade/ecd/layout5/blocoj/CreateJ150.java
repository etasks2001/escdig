package com.xsaturncont.facade.ecd.layout5.blocoj;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout5ecd._J150;
import com.xsaturncont.util.Util;

public class CreateJ150 {

	private String codigoEmpresa;

	public CreateJ150(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_J150> get() throws IOException {
		FileInputStream fis = new FileInputStream(Util.getPlanilha(this.codigoEmpresa));
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet planilha = Util.getPlanilha("DRE", workbook);

		int lastRowNum = planilha.getLastRowNum() + 1;

		BuilderBlockList<_J150> builderBlock = new BuilderBlockList<_J150>();

		for (int i = 0; i < lastRowNum; i++) {
			HSSFRow row = planilha.getRow(i);

			if (row != null) {
				HSSFCell cell = row.getCell(0);
				if (cell != null) {

					String nivel_agl = new DecimalFormat("#").format(cell.getNumericCellValue());

					cell = row.getCell(1);
					String cod_agl = cell.getStringCellValue();

					cell = row.getCell(2);
					String descr_cod_agl = cell.getStringCellValue();

					cell = row.getCell(3);
					double value = cell.getNumericCellValue();
					String vl_cta = new DecimalFormat("0.00").format((value < 0 ? value * -1 : value));
					System.out.println(vl_cta);

					cell = row.getCell(4);
					String ind_vl = cell.getStringCellValue();

					cell = row.getCell(5);
					value = cell.getNumericCellValue();
					String vl_cta_ult_dre = new DecimalFormat("#.00").format((value < 0 ? value * -1 : value));

					cell = row.getCell(6);
					String ind_vl_ult_dre = cell.getStringCellValue();

					_J150 _J150 = new _J150();
					_J150.setReg("J150");
					_J150.setCod_agl(cod_agl);
					_J150.setNivel_agl(nivel_agl);
					_J150.setDescr_cod_agl(Util.normalizeString(descr_cod_agl));
					_J150.setVl_cta(vl_cta);
					_J150.setInd_vl(ind_vl);
					_J150.setVl_cta_ult_dre(vl_cta_ult_dre);
					_J150.setInd_vl_ult_dre(ind_vl_ult_dre);

					builderBlock.add(_J150);
				}
			}
		}
		return builderBlock.getList();
	}
}