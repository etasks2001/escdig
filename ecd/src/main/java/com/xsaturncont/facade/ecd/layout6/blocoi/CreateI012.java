package com.xsaturncont.facade.ecd.layout6.blocoi;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.xsaturncont.engine.BuilderBlockList;
import com.xsaturncont.layout6ecd._I012;
import com.xsaturncont.util.Util;

public class CreateI012 {

	private String codigoEmpresa;

	public CreateI012(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public List<_I012> get() throws NoSuchAlgorithmException, IOException {

		// MessageDigest complete = MessageDigest.getInstance("SHA-1");
		//
		// String hash = DigestUtils.sha1Hex(FileUtils.readFileToByteArray(new
		// File(Util.getLivroAuxiliar(this.codigoEmpresa))));
		BuilderBlockList<_I012> builderBlock = new BuilderBlockList<_I012>();
		_I012 _I012 = new _I012();
		_I012.setReg("I012");
		_I012.setNum_ord(Util.getNumeroDeOrderm(this.codigoEmpresa));
		_I012.setNat_livr("LIVRO REGISTRO DE DUPLICATAS");
		_I012.setTipo("0");
		_I012.setCod_hash_aux(null);

		_I012.set_I015(new CreateI015().get());

		builderBlock.add(_I012);

		return builderBlock.getList();
	}

}
