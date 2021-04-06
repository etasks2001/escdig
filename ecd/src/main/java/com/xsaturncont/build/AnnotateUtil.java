package com.xsaturncont.build;

import java.util.List;
import java.util.Map;

import com.sun.codemodel.JAnnotationArrayMember;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.xsaturncont.annotation.FieldDetail;
import com.xsaturncont.annotation.RecordDetail;
import com.xsaturncont.model.Field;

public class AnnotateUtil {
	private static final String FIELDS_ORDER = "fieldsOrder";

	private static final String VALUE = "|";

	private static final String FIELD_SEPARATOR = "fieldSeparator";

	private static final String REQUIRED = "required";

	private static final String NUM = "number";

	public static void annotateClass(JDefinedClass definedClass, List<Field> fields) {
		JAnnotationUse fieldsOrder = definedClass.annotate(RecordDetail.class);
		fieldsOrder.param(FIELD_SEPARATOR, VALUE);
		JAnnotationArrayMember list = fieldsOrder.paramArray(FIELDS_ORDER);
		for (Field field : fields) {
			list.param(field.getCampo());
		}
	}

	public static void annotateFields(JDefinedClass definedClass, List<Field> fields) {
		Map<String, JFieldVar> fieldsMap = definedClass.fields();
		for (Field field : fields) {
			JFieldVar jFieldVar = fieldsMap.get(field.getCampo());
			JAnnotationUse annotation = jFieldVar.annotate(FieldDetail.class);
			annotation.param(NUM, field.getNumero());

			if (field.isObrigatorio()) {
				annotation.param(REQUIRED, field.isObrigatorio());
			}
		}
	}
}