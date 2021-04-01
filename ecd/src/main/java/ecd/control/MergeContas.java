package ecd.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import ecd.dados.contabil.ContasEmpresaContabil;
import ecd.dados.ecd.ContasEmpresaEcd;
import ecd.model.ContaEcd;
import ecd.model.ContaEmpresa;
import ecd.model.OrdenarPorConta;

public class MergeContas {

    public List<ContaEmpresa> getContas(int empresa, int ano) throws IOException {

	Map<String, ContaEmpresa> contasEmpresa = new ContasEmpresaContabil().getContas(empresa, ano);

	List<ContaEcd> contasEcd = new ContasEmpresaEcd().getContas(empresa, ano);

	for (ContaEcd contaEcd : contasEcd) {
	    String conta = contaEcd.getCod_cta();
	    if (contasEmpresa.containsKey(conta)) {
		ContaEmpresa contaEmpresa = contasEmpresa.get(conta);
		contaEmpresa.setContaEcd(contaEcd);
	    }
	}

	List<ContaEmpresa> lista = new ArrayList<ContaEmpresa>(contasEmpresa.values());

	Collections.sort(lista, new OrdenarPorConta());

	return new ArrayList<ContaEmpresa>(lista);
    }

}
