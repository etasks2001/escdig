package com.xsaturncont.build;

import static com.sun.codemodel.JMod.PRIVATE;

import java.util.List;

import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMod;
import com.xsaturncont.model.Field;
import com.xsaturncont.model.TipoDoCampo;

public class ClassFields implements BuilderClass {

	private List<Field> fields;

	public ClassFields(List<Field> fields) {
		this.fields = fields;
	}

	@Override
	public void build(JDefinedClass definedClass) {
		for (Field field : fields) {
			if (field.getTipoDoCampo().equals(TipoDoCampo.CLASS)) {
				JCodeModel codeModel = new JCodeModel();
				JClass ref = codeModel.ref(field.getCampo());

				if (field.isVarios()) {
					JClass arrayListClass = codeModel.ref(List.class);
					JClass arrayListOfRef = arrayListClass.narrow(ref);
					definedClass.field(JMod.PRIVATE, arrayListOfRef, field.getCampo());
				} else {
					definedClass.field(PRIVATE, ref, field.getCampo());
				}
			} else {
				definedClass.field(PRIVATE, String.class, field.getCampo());
			}
		}
	}
}