package com.xsaturncont.layoutFile;

import java.util.List;

public interface Schema<T, K> {

	public List<K> getFields(T sheet);
}