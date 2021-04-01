package ecd.model;

import java.util.ArrayList;
import java.util.List;

public class ContasEmpresa {

    private int codigoempresa;
    private int ano;
    private List<ContaEmpresa> contas;

    public ContasEmpresa(final int codigoempresa, final int ano, final List<ContaEmpresa> contas) {
	this.codigoempresa = codigoempresa;
	this.ano = ano;

	this.contas = new ArrayList<ContaEmpresa>(contas);
    }

    public int getCodigoEmpresa() {
	return codigoempresa;
    }

    public int getAno() {
	return ano;
    }

    public List<ContaEmpresa> getContas() {
	return new ArrayList<ContaEmpresa>(contas);
    }
}
