package com.xsaturncont.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuilderBlockList<T> {
	private List<T> list = new ArrayList<T>();

	public void add(T record) {
		list.add(record);
	}

	public List<T> getList() {
		return Collections.unmodifiableList(list);
	}
}
