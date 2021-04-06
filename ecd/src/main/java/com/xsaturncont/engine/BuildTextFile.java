package com.xsaturncont.engine;

import static com.xsaturncont.util.Util.isList;
import static com.xsaturncont.util.Util.isNull;
import static com.xsaturncont.util.Util.isString;
import static com.xsaturncont.util.Util.ultimoCampo;

import java.lang.reflect.Field;
import java.util.List;

import com.xsaturncont.annotation.RecordDetail;

public class BuildTextFile<T> {

	private StringBuilder stringFields;

	private StringBuilder stringStructure;

	private T raiz;

	public BuildTextFile(T raiz) {
		this.raiz = raiz;
		stringFields = new StringBuilder();
		stringStructure = new StringBuilder();
	}

	public void build() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		getFields(raiz, stringFields, stringStructure);
	}

	private void getFields(Object object, StringBuilder stringFields, StringBuilder sbStructure) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> clazz = object.getClass();
		RecordDetail recordDetail = clazz.getAnnotation(RecordDetail.class);
		System.out.println(clazz.getSimpleName());
		sbStructure.append(clazz.getSimpleName());
		String[] fieldsOrder = recordDetail.fieldsOrder();
		String fieldSeparator = recordDetail.fieldSeparator();

		for (int i = 0; i < fieldsOrder.length; i++) {
			String fieldName = fieldsOrder[i];
			Field field = clazz.getDeclaredField(fieldName);
			field.setAccessible(true);

			Object obj = field.get(object);
			if (isString(field)) {
				boolean ultimoCampo = ultimoCampo(i, fieldsOrder, clazz);

				stringFields.append(fieldSeparator);
				stringFields.append((isNull(obj) ? "" : obj));

				if (ultimoCampo) {
					stringFields.append(fieldSeparator);
					stringFields.append("\r\n");
				}
			} else {
				if (!isNull(obj)) {
					if (isList(field)) {
						List<?> list = (List<?>) obj;
						for (Object object2 : list) {
							this.getFields(object2, stringFields, sbStructure);
						}
					} else {
						this.getFields(obj, stringFields, sbStructure);
					}
				}
			}
		}
	}

	public String getStringFields() {
		return stringFields.toString();
	}

	public String getStringStructure() {
		return stringStructure.toString();
	}

}