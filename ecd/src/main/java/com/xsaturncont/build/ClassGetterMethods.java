package com.xsaturncont.build;

import static com.sun.codemodel.JMod.PUBLIC;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;

public class ClassGetterMethods implements BuilderClass {

	@Override
	public void build(JDefinedClass definedClass) {
		Collection<JFieldVar> values = definedClass.fields().values();
		for (JFieldVar field : values) {

			JMethod method = definedClass.method(PUBLIC, field.type(), GET + StringUtils.capitalize(field.name()));

			JBlock body = method.body();
			body._return(field);
		}
	}
}