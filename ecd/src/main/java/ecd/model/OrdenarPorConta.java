package ecd.model;

import java.util.Comparator;

public class OrdenarPorConta implements Comparator<ContaEmpresa> {

    @Override
    public int compare(ContaEmpresa a, ContaEmpresa b) {
	return a.getConta().compareTo(b.getConta());
    }

}
