package com.xsaturncont.engine;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.xsaturncont.util.Util;

public class SelectRecords<T> {
	private T raiz;

	public SelectRecords(T raiz) {
		this.raiz = raiz;
	}

	private Set<String> record = new HashSet<String>();

	public void build() throws IllegalArgumentException, IllegalAccessException {
		selectRecord(this.raiz, this.record);
	}

	private void selectRecord(Object root, Set<String> record) throws IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> clazz = root.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String recordName = "";
		for (Field field : fields) {
			recordName = field.getType().getSimpleName();

			field.setAccessible(true);

			if (Util.isString(field)) {

			} else {
				Object obj = field.get(root);

				if (obj != null) {
					if (Util.isList(field)) {
						List<?> list = (List<?>) obj;
						if (list.size() > 0) {
							Object object = list.get(0);
							recordName = object.getClass().getSimpleName();
							record.add(recordName);
							this.selectRecord(object, record);
						}
					} else {
						record.add(recordName);
						this.selectRecord(obj, record);
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String s : record) {
			sb.append("R: ").append(s).append('\n');
		}
		return sb.toString();
	}
}
