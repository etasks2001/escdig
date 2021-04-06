package com.xsaturncont.facade.ecd.layout5.blocoj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout5ecd._J800;
import com.xsaturncont.util.Util;

public class CreateJ800 {

	private String codigoEmpresa;

	public CreateJ800(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_J800> get() throws FileNotFoundException, IOException {
		BuilderBlockList<_J800> builderBlock = new BuilderBlockList<_J800>();

		String arq_rtf = IOUtils.toString(new FileReader(Util.getLivroAuxiliar(this.codigoEmpresa)));

		_J800 _J800 = new _J800();
		_J800.setReg("J800");
		_J800.setArq_rtf(arq_rtf);
		_J800.setInd_fim_rtf("J800FIM");

		builderBlock.add(_J800);

		return builderBlock.getList();
	}
}
