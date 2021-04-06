package com.xsaturncont.build;

import com.sun.codemodel.JDefinedClass;

public interface BuilderClass {
	static final String SET = "set";

	static final String GET = "get";

	void build(JDefinedClass definedClass);
}