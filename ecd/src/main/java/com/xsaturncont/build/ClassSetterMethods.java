package com.xsaturncont.build;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;

import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;

public class ClassSetterMethods implements BuilderClass {

	@Override
	public void build(JDefinedClass definedClass) {
		Collection<JFieldVar> values = definedClass.fields().values();
		for (JFieldVar field : values) {
			JMethod method = definedClass.method(JMod.PUBLIC, Void.TYPE, SET + StringUtils.capitalize(field.name()));

			method.param(field.type(), field.name());
			method.body().assign(JExpr._this().ref(field.name()), JExpr.ref(field.name()));
		}
	}
}