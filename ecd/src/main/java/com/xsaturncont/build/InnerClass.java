package com.xsaturncont.build;

import java.util.ArrayList;
import java.util.List;

import com.xsaturncont.model.Block;
import com.xsaturncont.model.Field;
import com.xsaturncont.model.TipoDoCampo;

public class InnerClass {
	public List<Field> getInnerClass(int startWith, String table, List<Block> blocos) {
		List<Field> list = new ArrayList<Field>();

		int start = getStart(table, blocos);
		int nivel = blocos.get(start).getNivel();

		for (int i = start + 1; i < blocos.size(); i++) {
			Block block = blocos.get(i);
			if (nivel == block.getNivel()) {
				break;
			} else if ((nivel + 1) == block.getNivel()) {
				list.add(new Field(startWith, '_' + block.getRegistro(), "", TipoDoCampo.CLASS, 0, 0, "", false, block.getOcorrencia().equals("V")));
				startWith++;
			}
		}
		return list;
	}

	private int getStart(String table, List<Block> blocos) {
		for (int i = 0; i < blocos.size(); i++) {
			if (blocos.get(i).getRegistro().equals(table)) {
				return i;
			}
		}
		return -1;
	}
}