package com.xsaturncont.build;

import java.io.File;
import java.io.IOException;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;

public class CreateClass {

	private JDefinedClass definedClass;

	private JCodeModel codeModel;

	public CreateClass(String _package, String name) throws JClassAlreadyExistsException {
		codeModel = new JCodeModel();
		definedClass = codeModel._class(_package + '.' + name);
	}

	public boolean build(String sourceFolder) throws JClassAlreadyExistsException, IOException {
		codeModel.build(new File(sourceFolder));
		return true;
	}

	public JDefinedClass getDefinedClass() {
		return definedClass;
	}
}