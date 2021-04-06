package com.xsaturncont.engine;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.xsaturncont.util.Util;

public class CounterFields<T> {
	private T raiz;

	private Map<String, Integer> recordTotal = new HashMap<String, Integer>();

	public CounterFields(T raiz) {
		this.raiz = raiz;
	}

	public void build() throws IllegalArgumentException, IllegalAccessException {
		count(this.raiz, this.recordTotal);
	}

	private void count(Object root, Map<String, Integer> recordTotal) throws IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> clazz = root.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String recordName = "";
		for (Field field : fields) {
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
							this.put(recordName, recordTotal, list.size());
							for (Object o : list) {
								this.count(o, recordTotal);
							}
						}
					} else {
						recordName = field.getType().getSimpleName();
						this.put(recordName, recordTotal, 1);
						this.count(obj, recordTotal);
					}
				}
			}
		}
	}

	private void put(String nome, Map<String, Integer> record, int value) {
		boolean containsKey = record.containsKey(nome);
		if (containsKey) {
			Integer total = record.get(nome);
			record.put(nome, total + value);
		} else {
			record.put(nome, value);
		}
	}

	public Map<String, Integer> getRecordTotal() {
		this.recordTotal.put("_9900", this.recordTotal.size() + 1);
		return Collections.unmodifiableMap(this.recordTotal);
	}

	public Map<String, Integer> getRecordTotal_EFD() {
		// this.recordTotal.put("_9900", this.recordTotal.size() + 1);
		return Collections.unmodifiableMap(this.recordTotal);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry<String, Integer> e : this.recordTotal.entrySet()) {
			sb.append(e.getKey()).append(": ").append(e.getValue()).append('\n');
		}

		return sb.toString();
	}
}
