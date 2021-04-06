package com.xsaturncont.build;

import java.util.Collection;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;

public class ClassConstructor implements BuilderClass {

	@Override
	public void build(JDefinedClass definedClass) {
		JMethod constructor = definedClass.constructor(JMod.PUBLIC);

		Collection<JFieldVar> values = definedClass.fields().values();

		for (JFieldVar field : values) {
			String name = field.name();

			constructor.param(field.type(), name);
			JBlock body = constructor.body();
			body.assign(JExpr._this().ref(name), JExpr.ref(name));
		}
	}
}