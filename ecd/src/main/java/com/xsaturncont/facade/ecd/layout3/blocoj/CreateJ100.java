package com.xsaturncont.facade.ecd.layout3.blocoj;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout3ecd._J100;
import com.xsaturncont.util.Util;

public class CreateJ100 {

	private String codigoEmpresa;

	public CreateJ100(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_J100> get() throws IOException {
		FileInputStream fis = new FileInputStream(Util.getPlanilha(this.codigoEmpresa));
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet planilha = Util.getPlanilha("BP", workbook);
		BuilderBlockList<_J100> builderBlock = new BuilderBlockList<_J100>();

		int lastRowNum = planilha.getLastRowNum() + 1;
		for (int i = 1; i < lastRowNum; i++) {

			HSSFRow row = planilha.getRow(i);
			if (row != null) {
				HSSFCell cell = row.getCell(0);
				String nivel_agl = new DecimalFormat("#").format(cell.getNumericCellValue());

				cell = row.getCell(1);
				String cod_agl = cell.getStringCellValue();

				cell = row.getCell(5);
				String ind_grp_bal = new DecimalFormat("#").format(cell.getNumericCellValue());

				cell = row.getCell(2);
				String descr_cod_agl = cell.getStringCellValue();

				cell = row.getCell(3);
				double valorDaConta = cell.getNumericCellValue();
				String vl_cta = new DecimalFormat("#.##").format((valorDaConta < 0 ? valorDaConta * -1 : valorDaConta));
				String ind_dc_bal = (valorDaConta < 0 ? "C" : "D");

				cell = row.getCell(4);
				double valorDaContaInicial = cell.getNumericCellValue();
				String vl_cta_ini = new DecimalFormat("#.##").format((valorDaContaInicial < 0 ? valorDaContaInicial * -1 : valorDaContaInicial));
				String ind_dc_bal_ini = (valorDaContaInicial < 0 ? "C" : "D");

				_J100 _J100 = new _J100();
				_J100.setReg("J100");
				_J100.setCod_agl(cod_agl);
				_J100.setNivel_agl(nivel_agl);
				_J100.setInd_grp_bal(ind_grp_bal);
				_J100.setDescr_cod_agl(Util.normalizeString(descr_cod_agl));
				_J100.setVl_cta(vl_cta);
				_J100.setInd_dc_bal(ind_dc_bal);
				_J100.setVl_cta_ini(vl_cta_ini);
				_J100.setInd_dc_bal_ini(ind_dc_bal_ini);

				builderBlock.add(_J100);

			}
		}

		return builderBlock.getList();
	}
}
